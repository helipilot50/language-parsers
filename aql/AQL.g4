/*

    CONNECTION
    	CONNECT <host name> <port> [<timeout>]
    	DISCONNECT
    	
    		<host name> address of a cluster node
    		<port> port for connection - default 3000
    		<timeout> client timeout
    DDL
        CREATE INDEX <index> ON <ns>[.<set>] (<bin>) NUMERIC|STRING
        DROP INDEX <ns>[.<set>] <index>
        REPAIR INDEX <index> ON <ns>[.<set>]
		DROP SET <ns>[.<set>]
		
            <ns> is the namespace for the index.
            <set> is the set name for the index.
            <index> is the name of the index.

        Examples:

            CREATE INDEX idx_foo ON test.demo (foo) NUMERIC
            DROP INDEX test.demo idx_foo
            REPAIR INDEX idx_foo ON test.demo

    DML
        INSERT INTO <ns>[.<set>] (PK, <bins>) VALUES (<key>, <values>)
        DELETE FROM <ns>[.<set>] WHERE PK = <key>
		DELETE FROM <ns>[.<set>] WHERE PK = <key> AND GENERATION = <generation>
		UPDATE <ns>[.<demo>] SET <bin name> = <bin value>, ... WHERE PK = <key>
		UPDATE <ns>[.<demo>] SET TTL = <ttl>, <bin name> = <bin value>, ... WHERE PK = <key> AND GENERATION = <generation>
		OPERATE <operation function>[.<bin name>[,<value>]] ON <ns>[.<set>] WHERE PK = <key> AND GENERATION = <generation>
		
            <ns> is the namespace for the record.
            <set> is the set name for the record.
            <key> is the record's primary key.
            <key> is the record's primary key.
            <bins> is a comma-separated list of bin names.
            <values> is comma-separated list of bin values. Keep it NULL (case insensitive & w/o quotes) to delete the bin
            <bin name> is the name of the bin to be updated
            <bin value> is the value
            <generation> is the expected generation value
            <ttl> is the time to live in seconds
            <operation function> is ADD, PUT, APPEND, PREPEND, GET, TOUCH, HEADER

        Examples:

            INSERT INTO test.demo (PK, foo, bar) VALUES ('key1', 123, 'abc')
            DELETE FROM test.demo WHERE PK = 'key1'
			UPDATE test.demo SET bn2 = 6, bn3 = '22', bn4 = 22 where pk = '6'
			UPDATE test.cats SET bob = 23, sue = 'abc' WHER PK = '1234' AND GENERATION = 98765

    QUERY
        SELECT <bins> FROM <ns>[.<set>]
        SELECT <bins> FROM <ns>[.<set>] WHERE <bin> = <value>
        SELECT <bins> FROM <ns>[.<set>] WHERE <bin> BETWEEN <lower> AND <upper>
        SELECT <bins> FROM <ns>[.<set>] WHERE PK = <key>

            <ns> is the namespace for the records to be queried.
            <set> is the set name for the record to be queried.
            <key> is the record's primary key.
            <bin> is the name of a bin.
            <value> is the value of a bin.
            <bins> can be either a wildcard (*) or a comma-separated list of bin names.
            <lower> is the lower bound for a numeric range query.
            <upper> is the lower bound for a numeric range query.

        Examples:

            SELECT * FROM test.demo
            SELECT * FROM test.demo WHERE PK = 'key1'
            SELECT foo, bar FROM test.demo WHERE PK = 'key1'
            SELECT foo, bar FROM test.demo WHERE foo = 123
            SELECT foo, bar FROM test.demo WHERE foo BETWEEN 0 AND 999

    MANAGE UDFS
        REGISTER MODULE '<filepath>'
        SHOW MODULES
        REMOVE MODULE <module name>
        DROP MODULE <module name>
        DESC MODULE <module name>

            <filepath> is file path to the UDF module(in single quotes).
            <module name> is file name of the UDF module.

        Examples:

            REGISTER MODULE '~/test.lua'
            SHOW MODULES
            DESC MODULE test.lua
            REMOVE MODULE test.lua

    INVOKING UDFS
        EXECUTE <module>.<function>(<args>) ON <ns>[.<set>]
        EXECUTE <module>.<function>(<args>) ON <ns>[.<set>] WHERE PK = <key>
        AGGREGATE <module>.<function>(<args>) ON <ns>[.<set>] WHERE <bin> = <value>
        AGGREGATE <module>.<function>(<args>) ON <ns>[.<set>] WHERE <bin> BETWEEN <lower> AND <upper>

            <module> is UDF module containing the function to invoke.
            <function> is UDF to invoke.
            <args> is a comma-separated list of argument values for the UDF.
            <ns> is the namespace for the records to be queried.
            <set> is the set name for the record to be queried.
            <key> is the record's primary key.
            <bin> is the name of a bin.
            <value> is the value of a bin.
            <lower> is the lower bound for a numeric range query.
            <upper> is the lower bound for a numeric range query.

        Examples:

            EXECUTE myudfs.udf1(2) ON test.demo
            EXECUTE myudfs.udf1(2) ON test.demo WHERE PK = 'key1'
            AGGREGATE myudfs.udf2(2) ON test.demo WHERE foo = 123
            AGGREGATE myudfs.udf2(2) ON test.demo WHERE foo BETWEEN 0 AND 999

    INFO
        SHOW NAMESPACES | SETS | BINS | INDEXES
        SHOW SCANS | QUERIES
        STAT NAMESPACE <ns> | INDEX <ns> <indexname>
        STAT SYSTEM

    JOB MANAGEMENT
        KILL QUERY <transaction_id>
        KILL SCAN <scan_id>

    USER ADMINISTRATION
        CREATE USER <user> PASSWORD <password> ROLE[S] <role1>,<role2>...
            roles: read|read-write|sys-admin|user-admin
        DROP USER <user>
        SET PASSWORD <password> [FOR <user>]
        GRANT ROLE[S] <role1>,<role2>... TO <user>]
        REVOKE ROLE[S] <role1>,<role2>... FROM <user>]
        SHOW USER [<user>]
        SHOW USERS

    SETTINGS
        TIMEOUT                       (time in ms, default: 1000 ms)
        TTL                    (time in ms, default: 0 ms)
        VERBOSE                       (true | false, default false)
        ECHO                          (true | false, default false)
        FAIL_ON_CLUSTER_CHANGE        (true | false, default true, policy applies to scans)
        OUTPUT                        (table | json, default table)
        LUA_USERPATH                  <path>, default : /opt/aerospike/usr/udf/lua

        To get the value of a setting, run:

            aql> GET <setting>

        To set the value of a setting, run:

            aql> SET <setting> <value>

    OTHER
        RUN <filepath>
        HELP
        QUIT|EXIT|Q
*/

grammar AQL;
options {
    language=Java;
}
@header {
package com.aerospike.aql.grammar;
import java.util.Set;
import java.util.HashSet;
}

@members {
public enum VariableDefinition {
	RECORD, 
	RECORD_SET, 
	RESULT_SET, 
	WRITE_POLICY, 
	READ_POLICY,
	QUERY_POLICY,
	SCAN_POLICY,
	INFO_POLICY,
	STMT,
	UDF_FILE,
	REGISTER_TASK,
	INDEX_TASK,
	INFO_STRING,
	ADMIN_POLICY;
}

public Set<VariableDefinition> definitions = new HashSet<VariableDefinition>();
}



/**
A whole qql file
*/
aql 
	:  statements EOF
	;
statements
  : 
  statement* 
  ;
/**
The supported aql statements
*/	
statement 
locals [String source, String nameSpace, String setName]
	: connect //generator exec
	| disconnect //generator exec
	| create //generator exec
	| drop  //generator exec
	| repair
	| grant
	| revoke
	| remove //generator exec
	| insert //generator exec
	| update //generator exec
	| delete //generator exec
	| select //generator exec
	| register //generator exec
	| execute //generator exec
	| aggregate //generator exec
	| operate //generator exec
	| show //generator exec
	| desc //generator exec
	| stat //generator exec
	| set //generator exec
	| get //generator exec
	| run //generator
	| kill //generator 
	| quit //exec
	| help 
	| print //generator 
	;

/**
     CONNECTION
    	CONNECT <host name> <port> [<timeout>]
    	DISCONNECT
    	
    		<host name> address of a cluster node
    		<port> port for connection - default 3000
    		<timeout> client timeout
 
 */
connect
	: CONNECT hostName=STRINGLITERAL port=INTLITERAL (timeout=INTLITERAL)?
	;
	
disconnect
	: DISCONNECT
	;


/**
CREATE INDEX <index> ON <ns>[.<set>] (<bin>) NUMERIC|STRING
*/
create
	: 
	CREATE (INDEX index_name ON nameSet
		'(' binName=bin ')' iType=(NUMERIC | STRING) {definitions.add(VariableDefinition.INDEX_TASK);}
		| USER  user PASSWORD password (ROLE role | ROLES roles*) {definitions.add(VariableDefinition.ADMIN_POLICY);}
		)
	{
  	definitions.add(VariableDefinition.WRITE_POLICY);
	} 
	;
	
	
/**
 * DROP INDEX <ns>[.<set>] <index>
 * DROP MODULE modulename.extension 
 * DROP SET <ns>[.<set>]
 * DROP USER <username>
 */
drop 
	: DROP (
	    INDEX nameSet index_name 
	| MODULE moduleName 
	| SET nameSet 
	| USER user {definitions.add(VariableDefinition.ADMIN_POLICY);}
	)
	;
/**
 * REPAIR INDEX <index> ON <ns>[.<set>]
 */
repair
	: REPAIR INDEX index_name ON nameSet
	;
	
grant
	: GRANT 
		(ROLES roles 
		| ROLE role
		) TO user
		{definitions.add(VariableDefinition.ADMIN_POLICY);}
	;	

revoke
	: REVOKE 
		(ROLES roles
		| ROLE role 
		) FROM user
		{definitions.add(VariableDefinition.ADMIN_POLICY);}
	;
	
	
user
	: IDENTIFIER
	;
	
password
	: IDENTIFIER
	;

roles
	: role (',' role)*
	;
		
role
	: 'read'
	| 'read-write'
	| 'sys-admin'
	| 'user-admin'
	;
	
remove 
  : REMOVE MODULE moduleName 
  ;

operate 
	: OPERATE operateFunction (',' operateFunction)* ON nameSet WHERE primaryKeyPredicate (AND generationPredicate)?
	{
	  	definitions.add(VariableDefinition.WRITE_POLICY);
	  	definitions.add(VariableDefinition.READ_POLICY);
	  	definitions.add(VariableDefinition.RECORD);
	} 
	;
	
/*
DML:
	INSERT INTO namespace[.setname] (PK,binnames,,,) VALUES ('pk',nnn,'xxx',,)
	DELETE FROM namespace[.setname] WHERE PK = 'x'

*/
/**	
INSERT INTO namespace[.setname] (PK,binnames,,,) VALUES ('pk',nnn,'xxx',,)
*/
insert 
	: INSERT INTO nameSet '(' PK (',' binNameList) ')'
		VALUES '(' primaryKey[$statement::nameSpace, $statement::setName] (',' valueList) ')' 
	{
		definitions.add(VariableDefinition.WRITE_POLICY);
	}  	
		
	;
/**
 * UPDATE <name space>[.<set name>] SET <bin name> = <value>, ... WHERE PK = <value> [AND generation = <value>]
 */	
update 
	: UPDATE nameSet SET updateList
		WHERE primaryKeyPredicate (AND generationPredicate)?
	{
		definitions.add(VariableDefinition.WRITE_POLICY);
	}  	
	;
	
updateList
	: (ttlValue | binValue) (',' binValue)*
	;

/**
DELETE FROM namespace[.setname] WHERE PK = 'x'
*/
delete 
	: DELETE FROM nameSet WHERE primaryKeyPredicate (AND generationPredicate)?
	{
	definitions.add(VariableDefinition.WRITE_POLICY);
	}  	
	;
/**
	SELECT *|bin,,,  FROM namespace[.setname]
	SELECT *|bin,,,  FROM namespace[.setname] ORDER BY xxx
	SELECT *|bin,,,  FROM namespace[.setname] WHERE bin = nnn
	SELECT *|bin,,,  FROM namespace[.setname] WHERE bin = 'xxx'
	SELECT *|bin,,,  FROM namespace[.setname] WHERE bin BETWEEN nnn AND mmm
	SELECT *|bin,,,  FROM namespace[.setname] WHERE PK = 'x'
	Note:SELECT...WHERE bin ... needs an INDEX on bin. Use CREATE INDEX first.
*/	
select 
	: SELECT 
	( STAR  
	| binNameList) FROM nameSet where? 
	{
	definitions.add(VariableDefinition.READ_POLICY);
	definitions.add(VariableDefinition.SCAN_POLICY);
	definitions.add(VariableDefinition.RECORD);
	definitions.add(VariableDefinition.STMT);
	}  	
	;
	

where
	: WHERE predicate
	;

	
operateFunction
	: ADD '(' bin ',' value ')'
	| PUT '(' bin ',' value ')'
	| APPEND '(' bin ',' value ')'
	| PREPEND '(' bin ',' value ')'
	| GET ('(' bin ')')?
	| TOUCH
	| HEADER
	;
	
nameSet 
locals [String namespaceName, String setName]
@after{
	$statement::nameSpace = $namespaceName;
	$statement::setName = $setName;
}
	: namespace_name {$namespaceName = $namespace_name.text;}
	('.' set_name {$setName = $set_name.text;})?
	
	;

/*
UDF:
	REGISTER MODULE 'filepath'
	REMOVE MODULE pkgname.extension
	EXECUTE pkgname.funcname(arg1,arg2,,) ON namespace[.setname]
	EXECUTE pkgname.funcname(arg1,arg2,,) ON namespace[.setname] WHERE PK = 'X'
	AGGREGATE pkgname.funcname(arg1,arg2,,) ON namespace[.setname] WHERE bin = nnn
	AGGREGATE pkgname.funcname(arg1,arg2,,) ON namespace[.setname] WHERE bin BETWEEN nnn AND mmm
UDF
*/
// clinfo -v udf-list
// clinfo -v udf-get:filename=<filename> --> Base64 encoded

/**
REGISTER MODULE 'filepath'
*/
register 
	: REGISTER MODULE filepath=filePath
	{
	definitions.add(VariableDefinition.READ_POLICY);
	definitions.add(VariableDefinition.REGISTER_TASK);
	definitions.add(VariableDefinition.UDF_FILE);
	}  	
	;

/**
EXECUTE pkgname.funcname(arg1,arg2,,) ON namespace[.setname]
EXECUTE pkgname.funcname(arg1,arg2,,) ON namespace[.setname] WHERE PK = 'X'	
*/
execute 
	: EXECUTE moduleFunction '(' valueList? ')'
		ON nameSet (where)? 
	{
	definitions.add(VariableDefinition.READ_POLICY);
	}  	
	;

/**
AGGREGATE pkgname.funcname(arg1,arg2,,) ON namespace[.setname] WHERE bin = nnn
AGGREGATE pkgname.funcname(arg1,arg2,,) ON namespace[.setname] WHERE bin BETWEEN nnn AND mmm
*/
aggregate 
	: AGGREGATE moduleFunction ('(' (valueList)? ')')? ON nameSet (where)?
	{
	definitions.add(VariableDefinition.QUERY_POLICY);
	definitions.add(VariableDefinition.RESULT_SET);
	definitions.add(VariableDefinition.STMT);
	}  	
	;

moduleFunction
	: packageName=(IDENTIFIER | LLIST | LMAP) '.' 
		functionName=(IDENTIFIER | ADD
		| SCAN
		| 'find'
		| 'size'
		| 'remove'
		| 'destroy'
		| 'get_config'
		| 'get_capacity'
		| 'put'
		| 'get')
	;
	
binNameList 
	: (TTL|bin) (',' bin)* 
	;
	
valueList 
	:  value (',' value )* 
	;
	
predicate
	: (primaryKeyPredicate | filterPredicate)
	;

primaryKeyPredicate
	: PK EQ primaryKey[$statement::nameSpace, $statement::setName]
	;

generationPredicate
	: 'generation' EQ INTLITERAL
	;	
	
filterPredicate
	: (equalityFilter | rangeFilter)
	{
	definitions.add(VariableDefinition.QUERY_POLICY);
	definitions.add(VariableDefinition.RECORD_SET);
	}  	
	;

equalityFilter 
	: binValue
	;
	
ttlValue
	: TTL EQ integerValue
	;
	
binValue
	: bin EQ value
	;
	
rangeFilter
	: bin BETWEEN low=integerValue AND high=integerValue
	;
		
/*
INFO:
	SHOW MODULES
	SHOW NAMESPACES|SETS|BINS
	SHOW SCANS|QUERIES
	SHOW INDEXES [namespace[.set]]
	DESC INDEX namespace indexname
	DESC MODULE pkgname.extension
	STAT INDEX namespace indexname
	STAT QUERY
	STAT SYSTEM
*/

/**
SHOW MODULES
SHOW NAMESPACES|SETS|BINS
SHOW SCANS|QUERIES
SHOW INDEXES [namespace[.set]]
*/
show 
	: SHOW 
	( INDEXES nameSet? 
	| SCANS
	| NAMESPACES
	| SETS
	| BINS
	| QUERIES
	| MODULES
	| USER user {definitions.add(VariableDefinition.ADMIN_POLICY);}
	| USERS {definitions.add(VariableDefinition.ADMIN_POLICY);}
	)
	{
	definitions.add(VariableDefinition.INFO_POLICY);
	definitions.add(VariableDefinition.INFO_STRING);
	}
	;
	
/**
DESC INDEX namespace indexname
DESC MODULE pkgname.extension
*/
desc 
	: DESC 
		(
		MODULE moduleName 
		| INDEX namespace_name index_name 
		) 
	{
	definitions.add(VariableDefinition.INFO_POLICY);
	definitions.add(VariableDefinition.INFO_STRING);
	}
	;
	
/**
STAT INDEX namespace indexname
STAT QUERY
STAT SYSTEM
*/
stat 
	: STAT
	(INDEX namespace_name index_name 
	|	QUERY 
	|	SYSTEM 
	)
	{
	definitions.add(VariableDefinition.INFO_POLICY);
	definitions.add(VariableDefinition.INFO_STRING);
	}
	;
/*
ADMIN:
	# text_string - comment in script, line skipped.
	

	NOTE: Do not specify value with GET. eg: SET ECHO true, GET ECHO
	Note: These are client side paths for lua files.

	KILL_QUERY transaction_id
	KILL_SCAN scan_id
	RUN 'filename' 	(Each line in the file contains an asql command)
	HELP
	QUIT|EXIT|Q
*/

/*

Settings
  SET|GET VIEW JSON|TABLE [default at startup - TABLE] @@
  SET|GET VERBOSE true|false [default false]
  SET|GET ECHO true|false [default false]
  SET|GET TIMEOUT timeout_ms [default 1000]
  SET|GET RECORD_TTL record_ttl_sec [default 0 - never expire]
  SET|GET LUA_USERPATH 'path' [default /opt/citrusleaf/usr/udf/lua]
  SET|GET LUA_SYSPATH 'path' [default /opt/citrusleaf/sys/udf/lua]

*/
set 
	: SET 
	(TIMEOUT timeOut=INTLITERAL {definitions.add(VariableDefinition.READ_POLICY);definitions.add(VariableDefinition.WRITE_POLICY);}  	
							
	| VERBOSE verboseOn=booleanLiteral 						
	| ECHO echoOn=booleanLiteral 							
	| TTL ttl=INTLITERAL		 						
  	| OUTPUT viewType                             
	| LUA_USER_PATH luaUserPath=STRINGLITERAL	
	| FAIL_ON_CLUSTER_CHANGE
	| PASSWORD password FOR user {definitions.add(VariableDefinition.ADMIN_POLICY);}
	)
	;
get 
	: GET 
	( TIMEOUT  		 
	| VERBOSE 		
	| ECHO			
	| TTL 	
    | OUTPUT         
	| LUA_USER_PATH 
	| FAIL_ON_CLUSTER_CHANGE	
	)
	;

viewType
	: 'json'|'table'|'nosql'|'lua'
	;


/**
RUN 'filename' 	(Each line in the file contains an asql command)
*/
run 
	: RUN STRINGLITERAL 
	;
/**
PRINT text_string
*/
print 
	: PRINT STRINGLITERAL? 
	;

kill 
	:	KILL ( QUERY | SCAN ) INTLITERAL
	;

	
/**
KILL_QUERY transaction_id
*/
kill_query 
	:	KILL_QUERY INTLITERAL 
	;

/**	
KILL_SCAN scan_id
*/
kill_scan 
	:	KILL_SCAN INTLITERAL 
	;

/**
QUIT|EXIT|Q	
*/
quit 
	: QUIT 
	| EXIT
	| 'q'
	;
/**
HELP
*/
help 
	: 'help'
	;

primaryKey [String nameSpace, String setName]
	: key=(STRINGLITERAL | INTLITERAL)
	;
	
package_name
	: IDENTIFIER
	;


index_name
	: IDENTIFIER
	;
	
namespace_name
	: IDENTIFIER
	;
		
set_name
	: setName= IDENTIFIER
	{
		if ($setName.text.length() > 63) notifyErrorListeners("Set name exceeds 63 characters");
	}
	
	;
	
bin
	: binName=IDENTIFIER
	{
		if ($binName.text.length() > 14) notifyErrorListeners("Bin name exceeds 14 characters");
	}
	;
	
value //Generate
	: integerValue | textValue
	;
textValue //Generate
	: STRINGLITERAL
	;
integerValue //Generate
	: INTLITERAL
	;
booleanLiteral
		: TRUE
		| FALSE
		;
moduleName
  : IDENTIFIER '.' ('lua'|'so')
  ;

filePath
  : STRINGLITERAL
//  : '/'? IDENTIFIER ('/' IDENTIFIER)* ('.' IDENTIFIER)?
//  | '\\'? IDENTIFIER ('\\' IDENTIFIER)* ('.' IDENTIFIER)?
  ;
  
 
TRUE
	: 'true'
	;
FALSE
	: 'false'
	;

// real nodes
CONNECT: 'connect';
DISCONNECT: 'disconnect';
DESC: 'desc';
INSERT: 'insert';
SELECT: 'select';
DELETE
	: 'delete'
	;
CREATE
	: 'create'
	;
INDEX
	: 'index'
	;
EXECUTE
	: 'execute'
	;
WHERE
	: 'where'
	;
SHOW
	: 'show'
	;
DROP
	: 'drop'
	;
INDEXES
 	:	'indexes'
	;
VALUES
	: 'values'
	;
SET
	:	'set'
	;
GET
	:	'get'
	;
MODULE
	: 'module'
	;
ON
	:	'on'
	;
OPERATE
	: 'operate'
	;
OUTPUT
  	: 'output'
  	;
PACKAGES
  : 'packages'
  ;
INTO
	: 'into'
	;
FUNCTION
  : 'function'
  ;
FROM
	: 'from'
	;
BY
	: 'by'
	;
AND
	: 'and'
	;
BETWEEN
	: 'between'
	;
RUN
	: 'run'
	;
STAT
	: 'stat'
	;
QUERY
	: 'query'
	;
SCAN
	: 'scan'
	;
TIMEOUT
	: 'timeout'
	;
QUIT
	: 'quit'
	;
EXIT
	: 'exit'
	;
KILL
	: 'kill'
	;
KILL_QUERY
	: 'kill_query'
	;
KILL_SCAN
	: 'kill_scan'
	;
PK 
	: 'pk'
	;
STRING
	: 'string'
	;
NUMERIC
	: 'numeric'
	;
	
EQ
	: '='
	;

STAR
	: '*'
	;
REGISTER 
	: 'register'
	;
REMOVE
	: 'remove'
	;
AGGREGATE
	: 'aggregate'
	;
MODULES
	: 'modules'
	;
NAMESPACES
	:	'namespaces'
	;
SETS
	:	'sets'
	;
BINS
	: 'bins'
	;
SCANS
	: 'scans'
	;
QUERIES
	:	'queries'
	;
SYSTEM
	: 'system'
	;
ORDER
	: 'order'
	;
PRINT : 'print';
UPDATE : 'update';
VERBOSE : 'verbose'; 
ECHO 		: 'echo'; 
TTL : 'ttl'; 
USE_SMD	: 'use_smd'; 
LUA_USER_PATH : 'lua_userpath'; 
LUA_SYSTEM_PATH : 'lua_syspath'; 	
ADD : 'add';
PUT : 'put';
APPEND : 'append';
PREPEND : 'prepend';
TOUCH : 'touch';
HEADER : 'header';
LLIST: 'llist';
LSTACK: 'lstack';
LSET: 'lset';
LMAP: 'lmap';
USER: 'user';
USERS: 'users';
PASSWORD: 'password';
ROLE: 'role';
ROLES: 'roles';
GRANT: 'grant';
REVOKE: 'revoke';
TO: 'to';
FAIL_ON_CLUSTER_CHANGE: 'FAIL_ON_CLUSTER_CHANGE';
REPAIR: 'repair';
FOR: 'for';




IDENTIFIER : ( LETTER | UNDERSCORE )( LETTER| DIGIT | UNDERSCORE | HYPHEN)*;

    
/**
Single quote delimited string 
e.g. 'cats' or 'cat\'s'
*/
STRINGLITERAL
    :   '\''
    ( EscapeSequence | ~('\\'|'\'') )* 
    '\''
    ; 
	
FLOATLITERAL
  : ('+'|'-')? IntegerNumber '.' IntegerNumber?
  ;
   
INTLITERAL
    :   ('+'|'-')? IntegerNumber 'L'?
    ;
    
HEXLITERAL
  : HexPrefix HexDigit HexDigit
  ;

//PATHSEGMENT
//  : (LETTER | DIGIT | '.' | '_')+
//  ;


fragment
IntegerNumber
    :   '0' 
    |   '1'..'9' ('0'..'9')*    
    |   '0' ('0'..'7')+         
    ;
  
fragment
HexPrefix
    :   '\\x' | '\\X'
    ;
        
fragment HexDigit
    :   (DIGIT|'a'..'f'|'A'..'F')
    ;
   
fragment LETTER : ('a'..'z' | 'A'..'Z') ;
fragment DIGIT : '0'..'9';
fragment UNDERSCORE : '_';
fragment HYPHEN : '-';
fragment SEMICOLON : ';';
fragment EscapeSequence 
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\''|'\\')         
    ;
NEWLINE: '\r'? '\n' -> channel(HIDDEN);     // return newlines to parser (end-statement signal)

WS: [ \r\t\u000C\n]+ -> channel(HIDDEN);

/**
# text_string - comment in script, line skipped.
*/
COMMENT
    :   '#' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN)
	;    	
