// Generated from aql/AQL.g4 by ANTLR 4.4

package com.aerospike.aql.grammar;
import java.util.Set;
import java.util.HashSet;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, TRUE=22, FALSE=23, CONNECT=24, 
		DISCONNECT=25, DESC=26, INSERT=27, SELECT=28, DELETE=29, CREATE=30, INDEX=31, 
		EXECUTE=32, WHERE=33, SHOW=34, DROP=35, INDEXES=36, VALUES=37, SET=38, 
		GET=39, MODULE=40, ON=41, OPERATE=42, OUTPUT=43, PACKAGES=44, INTO=45, 
		FUNCTION=46, FROM=47, BY=48, AND=49, BETWEEN=50, RUN=51, STAT=52, QUERY=53, 
		SCAN=54, TIMEOUT=55, QUIT=56, EXIT=57, KILL=58, KILL_QUERY=59, KILL_SCAN=60, 
		PK=61, STRING=62, NUMERIC=63, EQ=64, STAR=65, REGISTER=66, REMOVE=67, 
		AGGREGATE=68, MODULES=69, NAMESPACES=70, SETS=71, BINS=72, SCANS=73, QUERIES=74, 
		SYSTEM=75, ORDER=76, PRINT=77, UPDATE=78, VERBOSE=79, ECHO=80, TTL=81, 
		USE_SMD=82, LUA_USER_PATH=83, LUA_SYSTEM_PATH=84, ADD=85, PUT=86, APPEND=87, 
		PREPEND=88, TOUCH=89, HEADER=90, LLIST=91, LSTACK=92, LSET=93, LMAP=94, 
		USER=95, USERS=96, PASSWORD=97, ROLE=98, ROLES=99, GRANT=100, REVOKE=101, 
		TO=102, FAIL_ON_CLUSTER_CHANGE=103, REPAIR=104, FOR=105, IDENTIFIER=106, 
		STRINGLITERAL=107, FLOATLITERAL=108, INTLITERAL=109, HEXLITERAL=110, NEWLINE=111, 
		WS=112, COMMENT=113;
	public static final String[] tokenNames = {
		"<INVALID>", "'user-admin'", "'read-write'", "'q'", "'find'", "'nosql'", 
		"'get_capacity'", "'destroy'", "'sys-admin'", "'so'", "'lua'", "'size'", 
		"'table'", "'help'", "'read'", "'('", "'get_config'", "')'", "'generation'", 
		"','", "'json'", "'.'", "'true'", "'false'", "'connect'", "'disconnect'", 
		"'desc'", "'insert'", "'select'", "'delete'", "'create'", "'index'", "'execute'", 
		"'where'", "'show'", "'drop'", "'indexes'", "'values'", "'set'", "'get'", 
		"'module'", "'on'", "'operate'", "'output'", "'packages'", "'into'", "'function'", 
		"'from'", "'by'", "'and'", "'between'", "'run'", "'stat'", "'query'", 
		"'scan'", "'timeout'", "'quit'", "'exit'", "'kill'", "'kill_query'", "'kill_scan'", 
		"'pk'", "'string'", "'numeric'", "'='", "'*'", "'register'", "'remove'", 
		"'aggregate'", "'modules'", "'namespaces'", "'sets'", "'bins'", "'scans'", 
		"'queries'", "'system'", "'order'", "'print'", "'update'", "'verbose'", 
		"'echo'", "'ttl'", "'use_smd'", "'lua_userpath'", "'lua_syspath'", "'add'", 
		"'put'", "'append'", "'prepend'", "'touch'", "'header'", "'llist'", "'lstack'", 
		"'lset'", "'lmap'", "'user'", "'users'", "'password'", "'role'", "'roles'", 
		"'grant'", "'revoke'", "'to'", "'FAIL_ON_CLUSTER_CHANGE'", "'repair'", 
		"'for'", "IDENTIFIER", "STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", 
		"HEXLITERAL", "NEWLINE", "WS", "COMMENT"
	};
	public static final int
		RULE_aql = 0, RULE_statements = 1, RULE_statement = 2, RULE_connect = 3, 
		RULE_disconnect = 4, RULE_create = 5, RULE_drop = 6, RULE_repair = 7, 
		RULE_grant = 8, RULE_revoke = 9, RULE_user = 10, RULE_password = 11, RULE_roles = 12, 
		RULE_role = 13, RULE_remove = 14, RULE_operate = 15, RULE_insert = 16, 
		RULE_update = 17, RULE_updateList = 18, RULE_delete = 19, RULE_select = 20, 
		RULE_where = 21, RULE_operateFunction = 22, RULE_nameSet = 23, RULE_register = 24, 
		RULE_execute = 25, RULE_aggregate = 26, RULE_moduleFunction = 27, RULE_binNameList = 28, 
		RULE_valueList = 29, RULE_predicate = 30, RULE_primaryKeyPredicate = 31, 
		RULE_generationPredicate = 32, RULE_filterPredicate = 33, RULE_equalityFilter = 34, 
		RULE_ttlValue = 35, RULE_binValue = 36, RULE_rangeFilter = 37, RULE_show = 38, 
		RULE_desc = 39, RULE_stat = 40, RULE_set = 41, RULE_get = 42, RULE_viewType = 43, 
		RULE_run = 44, RULE_print = 45, RULE_kill = 46, RULE_kill_query = 47, 
		RULE_kill_scan = 48, RULE_quit = 49, RULE_help = 50, RULE_primaryKey = 51, 
		RULE_package_name = 52, RULE_index_name = 53, RULE_namespace_name = 54, 
		RULE_set_name = 55, RULE_bin = 56, RULE_value = 57, RULE_textValue = 58, 
		RULE_integerValue = 59, RULE_booleanLiteral = 60, RULE_moduleName = 61, 
		RULE_filePath = 62;
	public static final String[] ruleNames = {
		"aql", "statements", "statement", "connect", "disconnect", "create", "drop", 
		"repair", "grant", "revoke", "user", "password", "roles", "role", "remove", 
		"operate", "insert", "update", "updateList", "delete", "select", "where", 
		"operateFunction", "nameSet", "register", "execute", "aggregate", "moduleFunction", 
		"binNameList", "valueList", "predicate", "primaryKeyPredicate", "generationPredicate", 
		"filterPredicate", "equalityFilter", "ttlValue", "binValue", "rangeFilter", 
		"show", "desc", "stat", "set", "get", "viewType", "run", "print", "kill", 
		"kill_query", "kill_scan", "quit", "help", "primaryKey", "package_name", 
		"index_name", "namespace_name", "set_name", "bin", "value", "textValue", 
		"integerValue", "booleanLiteral", "moduleName", "filePath"
	};

	@Override
	public String getGrammarFileName() { return "AQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public AQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AqlContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AQLParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public AqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterAql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitAql(this);
		}
	}

	public final AqlContext aql() throws RecognitionException {
		AqlContext _localctx = new AqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); statements();
			setState(127); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__8) | (1L << CONNECT) | (1L << DISCONNECT) | (1L << DESC) | (1L << INSERT) | (1L << SELECT) | (1L << DELETE) | (1L << CREATE) | (1L << EXECUTE) | (1L << SHOW) | (1L << DROP) | (1L << SET) | (1L << GET) | (1L << OPERATE) | (1L << RUN) | (1L << STAT) | (1L << QUIT) | (1L << EXIT) | (1L << KILL))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (REGISTER - 66)) | (1L << (REMOVE - 66)) | (1L << (AGGREGATE - 66)) | (1L << (PRINT - 66)) | (1L << (UPDATE - 66)) | (1L << (GRANT - 66)) | (1L << (REVOKE - 66)) | (1L << (REPAIR - 66)))) != 0)) {
				{
				{
				setState(129); statement();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public String source;
		public String nameSpace;
		public String setName;
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public QuitContext quit() {
			return getRuleContext(QuitContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public DisconnectContext disconnect() {
			return getRuleContext(DisconnectContext.class,0);
		}
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public KillContext kill() {
			return getRuleContext(KillContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public RunContext run() {
			return getRuleContext(RunContext.class,0);
		}
		public HelpContext help() {
			return getRuleContext(HelpContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public RepairContext repair() {
			return getRuleContext(RepairContext.class,0);
		}
		public OperateContext operate() {
			return getRuleContext(OperateContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case CONNECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); connect();
				}
				break;
			case DISCONNECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); disconnect();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(137); create();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(138); drop();
				}
				break;
			case REPAIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(139); repair();
				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 6);
				{
				setState(140); grant();
				}
				break;
			case REVOKE:
				enterOuterAlt(_localctx, 7);
				{
				setState(141); revoke();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 8);
				{
				setState(142); remove();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 9);
				{
				setState(143); insert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 10);
				{
				setState(144); update();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 11);
				{
				setState(145); delete();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 12);
				{
				setState(146); select();
				}
				break;
			case REGISTER:
				enterOuterAlt(_localctx, 13);
				{
				setState(147); register();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 14);
				{
				setState(148); execute();
				}
				break;
			case AGGREGATE:
				enterOuterAlt(_localctx, 15);
				{
				setState(149); aggregate();
				}
				break;
			case OPERATE:
				enterOuterAlt(_localctx, 16);
				{
				setState(150); operate();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 17);
				{
				setState(151); show();
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 18);
				{
				setState(152); desc();
				}
				break;
			case STAT:
				enterOuterAlt(_localctx, 19);
				{
				setState(153); stat();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 20);
				{
				setState(154); set();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 21);
				{
				setState(155); get();
				}
				break;
			case RUN:
				enterOuterAlt(_localctx, 22);
				{
				setState(156); run();
				}
				break;
			case KILL:
				enterOuterAlt(_localctx, 23);
				{
				setState(157); kill();
				}
				break;
			case T__18:
			case QUIT:
			case EXIT:
				enterOuterAlt(_localctx, 24);
				{
				setState(158); quit();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 25);
				{
				setState(159); help();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 26);
				{
				setState(160); print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectContext extends ParserRuleContext {
		public Token hostName;
		public Token port;
		public Token timeout;
		public List<TerminalNode> INTLITERAL() { return getTokens(AQLParser.INTLITERAL); }
		public TerminalNode STRINGLITERAL() { return getToken(AQLParser.STRINGLITERAL, 0); }
		public TerminalNode CONNECT() { return getToken(AQLParser.CONNECT, 0); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(AQLParser.INTLITERAL, i);
		}
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterConnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitConnect(this);
		}
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_connect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(CONNECT);
			setState(164); ((ConnectContext)_localctx).hostName = match(STRINGLITERAL);
			setState(165); ((ConnectContext)_localctx).port = match(INTLITERAL);
			setState(167);
			_la = _input.LA(1);
			if (_la==INTLITERAL) {
				{
				setState(166); ((ConnectContext)_localctx).timeout = match(INTLITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisconnectContext extends ParserRuleContext {
		public TerminalNode DISCONNECT() { return getToken(AQLParser.DISCONNECT, 0); }
		public DisconnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterDisconnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitDisconnect(this);
		}
	}

	public final DisconnectContext disconnect() throws RecognitionException {
		DisconnectContext _localctx = new DisconnectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_disconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(DISCONNECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateContext extends ParserRuleContext {
		public BinContext binName;
		public Token iType;
		public List<RolesContext> roles() {
			return getRuleContexts(RolesContext.class);
		}
		public TerminalNode ON() { return getToken(AQLParser.ON, 0); }
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AQLParser.STRING, 0); }
		public TerminalNode USER() { return getToken(AQLParser.USER, 0); }
		public TerminalNode PASSWORD() { return getToken(AQLParser.PASSWORD, 0); }
		public TerminalNode INDEX() { return getToken(AQLParser.INDEX, 0); }
		public TerminalNode ROLES() { return getToken(AQLParser.ROLES, 0); }
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public TerminalNode NUMERIC() { return getToken(AQLParser.NUMERIC, 0); }
		public BinContext bin() {
			return getRuleContext(BinContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(AQLParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(AQLParser.ROLE, 0); }
		public RolesContext roles(int i) {
			return getRuleContext(RolesContext.class,i);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitCreate(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(CREATE);
			setState(199);
			switch (_input.LA(1)) {
			case INDEX:
				{
				setState(172); match(INDEX);
				setState(173); index_name();
				setState(174); match(ON);
				setState(175); nameSet();
				setState(176); match(T__6);
				setState(177); ((CreateContext)_localctx).binName = bin();
				setState(178); match(T__4);
				setState(179);
				((CreateContext)_localctx).iType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==NUMERIC) ) {
					((CreateContext)_localctx).iType = (Token)_errHandler.recoverInline(this);
				}
				consume();
				definitions.add(VariableDefinition.INDEX_TASK);
				}
				break;
			case USER:
				{
				setState(182); match(USER);
				setState(183); user();
				setState(184); match(PASSWORD);
				setState(185); password();
				setState(195);
				switch (_input.LA(1)) {
				case ROLE:
					{
					setState(186); match(ROLE);
					setState(187); role();
					}
					break;
				case ROLES:
					{
					setState(188); match(ROLES);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__13) | (1L << T__7))) != 0)) {
						{
						{
						setState(189); roles();
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				definitions.add(VariableDefinition.ADMIN_POLICY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			  	definitions.add(VariableDefinition.WRITE_POLICY);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(AQLParser.INDEX, 0); }
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode DROP() { return getToken(AQLParser.DROP, 0); }
		public TerminalNode MODULE() { return getToken(AQLParser.MODULE, 0); }
		public TerminalNode SET() { return getToken(AQLParser.SET, 0); }
		public TerminalNode USER() { return getToken(AQLParser.USER, 0); }
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitDrop(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(DROP);
			setState(216);
			switch (_input.LA(1)) {
			case INDEX:
				{
				setState(204); match(INDEX);
				setState(205); nameSet();
				setState(206); index_name();
				}
				break;
			case MODULE:
				{
				setState(208); match(MODULE);
				setState(209); moduleName();
				}
				break;
			case SET:
				{
				setState(210); match(SET);
				setState(211); nameSet();
				}
				break;
			case USER:
				{
				setState(212); match(USER);
				setState(213); user();
				definitions.add(VariableDefinition.ADMIN_POLICY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepairContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(AQLParser.INDEX, 0); }
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public TerminalNode ON() { return getToken(AQLParser.ON, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode REPAIR() { return getToken(AQLParser.REPAIR, 0); }
		public RepairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterRepair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitRepair(this);
		}
	}

	public final RepairContext repair() throws RecognitionException {
		RepairContext _localctx = new RepairContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(REPAIR);
			setState(219); match(INDEX);
			setState(220); index_name();
			setState(221); match(ON);
			setState(222); nameSet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode ROLES() { return getToken(AQLParser.ROLES, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode TO() { return getToken(AQLParser.TO, 0); }
		public TerminalNode ROLE() { return getToken(AQLParser.ROLE, 0); }
		public TerminalNode GRANT() { return getToken(AQLParser.GRANT, 0); }
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitGrant(this);
		}
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(GRANT);
			setState(229);
			switch (_input.LA(1)) {
			case ROLES:
				{
				setState(225); match(ROLES);
				setState(226); roles();
				}
				break;
			case ROLE:
				{
				setState(227); match(ROLE);
				setState(228); role();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231); match(TO);
			setState(232); user();
			definitions.add(VariableDefinition.ADMIN_POLICY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode ROLES() { return getToken(AQLParser.ROLES, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AQLParser.FROM, 0); }
		public TerminalNode REVOKE() { return getToken(AQLParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(AQLParser.ROLE, 0); }
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitRevoke(this);
		}
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(REVOKE);
			setState(240);
			switch (_input.LA(1)) {
			case ROLES:
				{
				setState(236); match(ROLES);
				setState(237); roles();
				}
				break;
			case ROLE:
				{
				setState(238); match(ROLE);
				setState(239); role();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242); match(FROM);
			setState(243); user();
			definitions.add(VariableDefinition.ADMIN_POLICY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AQLParser.IDENTIFIER, 0); }
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitUser(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PasswordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AQLParser.IDENTIFIER, 0); }
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitPassword(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesContext extends ParserRuleContext {
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitRoles(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); role();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(251); match(T__2);
				setState(252); role();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleContext extends ParserRuleContext {
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitRole(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__13) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemoveContext extends ParserRuleContext {
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(AQLParser.REMOVE, 0); }
		public TerminalNode MODULE() { return getToken(AQLParser.MODULE, 0); }
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitRemove(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_remove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(REMOVE);
			setState(261); match(MODULE);
			setState(262); moduleName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperateContext extends ParserRuleContext {
		public List<OperateFunctionContext> operateFunction() {
			return getRuleContexts(OperateFunctionContext.class);
		}
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public TerminalNode ON() { return getToken(AQLParser.ON, 0); }
		public PrimaryKeyPredicateContext primaryKeyPredicate() {
			return getRuleContext(PrimaryKeyPredicateContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(AQLParser.WHERE, 0); }
		public TerminalNode AND() { return getToken(AQLParser.AND, 0); }
		public TerminalNode OPERATE() { return getToken(AQLParser.OPERATE, 0); }
		public OperateFunctionContext operateFunction(int i) {
			return getRuleContext(OperateFunctionContext.class,i);
		}
		public GenerationPredicateContext generationPredicate() {
			return getRuleContext(GenerationPredicateContext.class,0);
		}
		public OperateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterOperate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitOperate(this);
		}
	}

	public final OperateContext operate() throws RecognitionException {
		OperateContext _localctx = new OperateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(OPERATE);
			setState(265); operateFunction();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(266); match(T__2);
				setState(267); operateFunction();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273); match(ON);
			setState(274); nameSet();
			setState(275); match(WHERE);
			setState(276); primaryKeyPredicate();
			setState(279);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(277); match(AND);
				setState(278); generationPredicate();
				}
			}


				  	definitions.add(VariableDefinition.WRITE_POLICY);
				  	definitions.add(VariableDefinition.READ_POLICY);
				  	definitions.add(VariableDefinition.RECORD);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(AQLParser.VALUES, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public BinNameListContext binNameList() {
			return getRuleContext(BinNameListContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(AQLParser.INSERT, 0); }
		public TerminalNode PK() { return getToken(AQLParser.PK, 0); }
		public TerminalNode INTO() { return getToken(AQLParser.INTO, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitInsert(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_insert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(INSERT);
			setState(284); match(INTO);
			setState(285); nameSet();
			setState(286); match(T__6);
			setState(287); match(PK);
			{
			setState(288); match(T__2);
			setState(289); binNameList();
			}
			setState(291); match(T__4);
			setState(292); match(VALUES);
			setState(293); match(T__6);
			setState(294); primaryKey(((StatementContext)getInvokingContext(2)).nameSpace, ((StatementContext)getInvokingContext(2)).setName);
			{
			setState(295); match(T__2);
			setState(296); valueList();
			}
			setState(298); match(T__4);

					definitions.add(VariableDefinition.WRITE_POLICY);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public UpdateListContext updateList() {
			return getRuleContext(UpdateListContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(AQLParser.UPDATE, 0); }
		public PrimaryKeyPredicateContext primaryKeyPredicate() {
			return getRuleContext(PrimaryKeyPredicateContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(AQLParser.WHERE, 0); }
		public TerminalNode AND() { return getToken(AQLParser.AND, 0); }
		public TerminalNode SET() { return getToken(AQLParser.SET, 0); }
		public GenerationPredicateContext generationPredicate() {
			return getRuleContext(GenerationPredicateContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(UPDATE);
			setState(302); nameSet();
			setState(303); match(SET);
			setState(304); updateList();
			setState(305); match(WHERE);
			setState(306); primaryKeyPredicate();
			setState(309);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(307); match(AND);
				setState(308); generationPredicate();
				}
			}


					definitions.add(VariableDefinition.WRITE_POLICY);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateListContext extends ParserRuleContext {
		public TtlValueContext ttlValue() {
			return getRuleContext(TtlValueContext.class,0);
		}
		public List<BinValueContext> binValue() {
			return getRuleContexts(BinValueContext.class);
		}
		public BinValueContext binValue(int i) {
			return getRuleContext(BinValueContext.class,i);
		}
		public UpdateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterUpdateList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitUpdateList(this);
		}
	}

	public final UpdateListContext updateList() throws RecognitionException {
		UpdateListContext _localctx = new UpdateListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_updateList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			switch (_input.LA(1)) {
			case TTL:
				{
				setState(313); ttlValue();
				}
				break;
			case IDENTIFIER:
				{
				setState(314); binValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(317); match(T__2);
				setState(318); binValue();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(AQLParser.DELETE, 0); }
		public PrimaryKeyPredicateContext primaryKeyPredicate() {
			return getRuleContext(PrimaryKeyPredicateContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(AQLParser.WHERE, 0); }
		public TerminalNode AND() { return getToken(AQLParser.AND, 0); }
		public TerminalNode FROM() { return getToken(AQLParser.FROM, 0); }
		public GenerationPredicateContext generationPredicate() {
			return getRuleContext(GenerationPredicateContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(DELETE);
			setState(325); match(FROM);
			setState(326); nameSet();
			setState(327); match(WHERE);
			setState(328); primaryKeyPredicate();
			setState(331);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(329); match(AND);
				setState(330); generationPredicate();
				}
			}


				definitions.add(VariableDefinition.WRITE_POLICY);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public BinNameListContext binNameList() {
			return getRuleContext(BinNameListContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AQLParser.FROM, 0); }
		public TerminalNode SELECT() { return getToken(AQLParser.SELECT, 0); }
		public TerminalNode STAR() { return getToken(AQLParser.STAR, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); match(SELECT);
			setState(338);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(336); match(STAR);
				}
				break;
			case TTL:
			case IDENTIFIER:
				{
				setState(337); binNameList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340); match(FROM);
			setState(341); nameSet();
			setState(343);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(342); where();
				}
			}


				definitions.add(VariableDefinition.READ_POLICY);
				definitions.add(VariableDefinition.SCAN_POLICY);
				definitions.add(VariableDefinition.RECORD);
				definitions.add(VariableDefinition.STMT);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(AQLParser.WHERE, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitWhere(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(WHERE);
			setState(348); predicate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperateFunctionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode PREPEND() { return getToken(AQLParser.PREPEND, 0); }
		public BinContext bin() {
			return getRuleContext(BinContext.class,0);
		}
		public TerminalNode ADD() { return getToken(AQLParser.ADD, 0); }
		public TerminalNode PUT() { return getToken(AQLParser.PUT, 0); }
		public TerminalNode TOUCH() { return getToken(AQLParser.TOUCH, 0); }
		public TerminalNode APPEND() { return getToken(AQLParser.APPEND, 0); }
		public TerminalNode GET() { return getToken(AQLParser.GET, 0); }
		public TerminalNode HEADER() { return getToken(AQLParser.HEADER, 0); }
		public OperateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterOperateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitOperateFunction(this);
		}
	}

	public final OperateFunctionContext operateFunction() throws RecognitionException {
		OperateFunctionContext _localctx = new OperateFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operateFunction);
		int _la;
		try {
			setState(387);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(350); match(ADD);
				setState(351); match(T__6);
				setState(352); bin();
				setState(353); match(T__2);
				setState(354); value();
				setState(355); match(T__4);
				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(357); match(PUT);
				setState(358); match(T__6);
				setState(359); bin();
				setState(360); match(T__2);
				setState(361); value();
				setState(362); match(T__4);
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 3);
				{
				setState(364); match(APPEND);
				setState(365); match(T__6);
				setState(366); bin();
				setState(367); match(T__2);
				setState(368); value();
				setState(369); match(T__4);
				}
				break;
			case PREPEND:
				enterOuterAlt(_localctx, 4);
				{
				setState(371); match(PREPEND);
				setState(372); match(T__6);
				setState(373); bin();
				setState(374); match(T__2);
				setState(375); value();
				setState(376); match(T__4);
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 5);
				{
				setState(378); match(GET);
				setState(383);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(379); match(T__6);
					setState(380); bin();
					setState(381); match(T__4);
					}
				}

				}
				break;
			case TOUCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(385); match(TOUCH);
				}
				break;
			case HEADER:
				enterOuterAlt(_localctx, 7);
				{
				setState(386); match(HEADER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameSetContext extends ParserRuleContext {
		public String namespaceName;
		public String setName;
		public Namespace_nameContext namespace_name;
		public Set_nameContext set_name;
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public Set_nameContext set_name() {
			return getRuleContext(Set_nameContext.class,0);
		}
		public NameSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterNameSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitNameSet(this);
		}
	}

	public final NameSetContext nameSet() throws RecognitionException {
		NameSetContext _localctx = new NameSetContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nameSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); ((NameSetContext)_localctx).namespace_name = namespace_name();
			((NameSetContext)_localctx).namespaceName =  (((NameSetContext)_localctx).namespace_name!=null?_input.getText(((NameSetContext)_localctx).namespace_name.start,((NameSetContext)_localctx).namespace_name.stop):null);
			setState(395);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(391); match(T__0);
				setState(392); ((NameSetContext)_localctx).set_name = set_name();
				((NameSetContext)_localctx).setName =  (((NameSetContext)_localctx).set_name!=null?_input.getText(((NameSetContext)_localctx).set_name.start,((NameSetContext)_localctx).set_name.stop):null);
				}
			}

			}

				((StatementContext)getInvokingContext(2)).nameSpace =  _localctx.namespaceName;
				((StatementContext)getInvokingContext(2)).setName =  _localctx.setName;

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegisterContext extends ParserRuleContext {
		public FilePathContext filepath;
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public TerminalNode REGISTER() { return getToken(AQLParser.REGISTER, 0); }
		public TerminalNode MODULE() { return getToken(AQLParser.MODULE, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(REGISTER);
			setState(398); match(MODULE);
			setState(399); ((RegisterContext)_localctx).filepath = filePath();

				definitions.add(VariableDefinition.READ_POLICY);
				definitions.add(VariableDefinition.REGISTER_TASK);
				definitions.add(VariableDefinition.UDF_FILE);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecuteContext extends ParserRuleContext {
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public TerminalNode ON() { return getToken(AQLParser.ON, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ModuleFunctionContext moduleFunction() {
			return getRuleContext(ModuleFunctionContext.class,0);
		}
		public TerminalNode EXECUTE() { return getToken(AQLParser.EXECUTE, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitExecute(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(EXECUTE);
			setState(403); moduleFunction();
			setState(404); match(T__6);
			setState(406);
			_la = _input.LA(1);
			if (_la==STRINGLITERAL || _la==INTLITERAL) {
				{
				setState(405); valueList();
				}
			}

			setState(408); match(T__4);
			setState(409); match(ON);
			setState(410); nameSet();
			setState(412);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(411); where();
				}
			}


				definitions.add(VariableDefinition.READ_POLICY);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateContext extends ParserRuleContext {
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public TerminalNode ON() { return getToken(AQLParser.ON, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public TerminalNode AGGREGATE() { return getToken(AQLParser.AGGREGATE, 0); }
		public ModuleFunctionContext moduleFunction() {
			return getRuleContext(ModuleFunctionContext.class,0);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(AGGREGATE);
			setState(417); moduleFunction();
			setState(423);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(418); match(T__6);
				setState(420);
				_la = _input.LA(1);
				if (_la==STRINGLITERAL || _la==INTLITERAL) {
					{
					setState(419); valueList();
					}
				}

				setState(422); match(T__4);
				}
			}

			setState(425); match(ON);
			setState(426); nameSet();
			setState(428);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(427); where();
				}
			}


				definitions.add(VariableDefinition.QUERY_POLICY);
				definitions.add(VariableDefinition.RESULT_SET);
				definitions.add(VariableDefinition.STMT);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleFunctionContext extends ParserRuleContext {
		public Token packageName;
		public Token functionName;
		public TerminalNode LLIST() { return getToken(AQLParser.LLIST, 0); }
		public TerminalNode SCAN() { return getToken(AQLParser.SCAN, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AQLParser.IDENTIFIER, i);
		}
		public TerminalNode ADD() { return getToken(AQLParser.ADD, 0); }
		public TerminalNode LMAP() { return getToken(AQLParser.LMAP, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AQLParser.IDENTIFIER); }
		public ModuleFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterModuleFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitModuleFunction(this);
		}
	}

	public final ModuleFunctionContext moduleFunction() throws RecognitionException {
		ModuleFunctionContext _localctx = new ModuleFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_moduleFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			((ModuleFunctionContext)_localctx).packageName = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (LLIST - 91)) | (1L << (LMAP - 91)) | (1L << (IDENTIFIER - 91)))) != 0)) ) {
				((ModuleFunctionContext)_localctx).packageName = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(433); match(T__0);
			setState(434);
			((ModuleFunctionContext)_localctx).functionName = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__15) | (1L << T__14) | (1L << T__10) | (1L << T__5) | (1L << GET) | (1L << SCAN))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (REMOVE - 67)) | (1L << (ADD - 67)) | (1L << (PUT - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) ) {
				((ModuleFunctionContext)_localctx).functionName = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinNameListContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(AQLParser.TTL, 0); }
		public List<BinContext> bin() {
			return getRuleContexts(BinContext.class);
		}
		public BinContext bin(int i) {
			return getRuleContext(BinContext.class,i);
		}
		public BinNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterBinNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitBinNameList(this);
		}
	}

	public final BinNameListContext binNameList() throws RecognitionException {
		BinNameListContext _localctx = new BinNameListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_binNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			switch (_input.LA(1)) {
			case TTL:
				{
				setState(436); match(TTL);
				}
				break;
			case IDENTIFIER:
				{
				setState(437); bin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(440); match(T__2);
				setState(441); bin();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitValueList(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447); value();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(448); match(T__2);
				setState(449); value();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public FilterPredicateContext filterPredicate() {
			return getRuleContext(FilterPredicateContext.class,0);
		}
		public PrimaryKeyPredicateContext primaryKeyPredicate() {
			return getRuleContext(PrimaryKeyPredicateContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			switch (_input.LA(1)) {
			case PK:
				{
				setState(455); primaryKeyPredicate();
				}
				break;
			case IDENTIFIER:
				{
				setState(456); filterPredicate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyPredicateContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(AQLParser.EQ, 0); }
		public TerminalNode PK() { return getToken(AQLParser.PK, 0); }
		public PrimaryKeyPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterPrimaryKeyPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitPrimaryKeyPredicate(this);
		}
	}

	public final PrimaryKeyPredicateContext primaryKeyPredicate() throws RecognitionException {
		PrimaryKeyPredicateContext _localctx = new PrimaryKeyPredicateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primaryKeyPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(PK);
			setState(460); match(EQ);
			setState(461); primaryKey(((StatementContext)getInvokingContext(2)).nameSpace, ((StatementContext)getInvokingContext(2)).setName);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenerationPredicateContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(AQLParser.INTLITERAL, 0); }
		public TerminalNode EQ() { return getToken(AQLParser.EQ, 0); }
		public GenerationPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generationPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterGenerationPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitGenerationPredicate(this);
		}
	}

	public final GenerationPredicateContext generationPredicate() throws RecognitionException {
		GenerationPredicateContext _localctx = new GenerationPredicateContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generationPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); match(T__3);
			setState(464); match(EQ);
			setState(465); match(INTLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterPredicateContext extends ParserRuleContext {
		public EqualityFilterContext equalityFilter() {
			return getRuleContext(EqualityFilterContext.class,0);
		}
		public RangeFilterContext rangeFilter() {
			return getRuleContext(RangeFilterContext.class,0);
		}
		public FilterPredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterPredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterFilterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitFilterPredicate(this);
		}
	}

	public final FilterPredicateContext filterPredicate() throws RecognitionException {
		FilterPredicateContext _localctx = new FilterPredicateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_filterPredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(467); equalityFilter();
				}
				break;
			case 2:
				{
				setState(468); rangeFilter();
				}
				break;
			}

				definitions.add(VariableDefinition.QUERY_POLICY);
				definitions.add(VariableDefinition.RECORD_SET);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityFilterContext extends ParserRuleContext {
		public BinValueContext binValue() {
			return getRuleContext(BinValueContext.class,0);
		}
		public EqualityFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterEqualityFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitEqualityFilter(this);
		}
	}

	public final EqualityFilterContext equalityFilter() throws RecognitionException {
		EqualityFilterContext _localctx = new EqualityFilterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_equalityFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473); binValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TtlValueContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(AQLParser.TTL, 0); }
		public TerminalNode EQ() { return getToken(AQLParser.EQ, 0); }
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public TtlValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ttlValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterTtlValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitTtlValue(this);
		}
	}

	public final TtlValueContext ttlValue() throws RecognitionException {
		TtlValueContext _localctx = new TtlValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ttlValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(TTL);
			setState(476); match(EQ);
			setState(477); integerValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BinContext bin() {
			return getRuleContext(BinContext.class,0);
		}
		public TerminalNode EQ() { return getToken(AQLParser.EQ, 0); }
		public BinValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterBinValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitBinValue(this);
		}
	}

	public final BinValueContext binValue() throws RecognitionException {
		BinValueContext _localctx = new BinValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_binValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); bin();
			setState(480); match(EQ);
			setState(481); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeFilterContext extends ParserRuleContext {
		public IntegerValueContext low;
		public IntegerValueContext high;
		public IntegerValueContext integerValue(int i) {
			return getRuleContext(IntegerValueContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(AQLParser.BETWEEN, 0); }
		public BinContext bin() {
			return getRuleContext(BinContext.class,0);
		}
		public TerminalNode AND() { return getToken(AQLParser.AND, 0); }
		public List<IntegerValueContext> integerValue() {
			return getRuleContexts(IntegerValueContext.class);
		}
		public RangeFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterRangeFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitRangeFilter(this);
		}
	}

	public final RangeFilterContext rangeFilter() throws RecognitionException {
		RangeFilterContext _localctx = new RangeFilterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rangeFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483); bin();
			setState(484); match(BETWEEN);
			setState(485); ((RangeFilterContext)_localctx).low = integerValue();
			setState(486); match(AND);
			setState(487); ((RangeFilterContext)_localctx).high = integerValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(AQLParser.SHOW, 0); }
		public NameSetContext nameSet() {
			return getRuleContext(NameSetContext.class,0);
		}
		public TerminalNode QUERIES() { return getToken(AQLParser.QUERIES, 0); }
		public TerminalNode NAMESPACES() { return getToken(AQLParser.NAMESPACES, 0); }
		public TerminalNode USERS() { return getToken(AQLParser.USERS, 0); }
		public TerminalNode SETS() { return getToken(AQLParser.SETS, 0); }
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode SCANS() { return getToken(AQLParser.SCANS, 0); }
		public TerminalNode MODULES() { return getToken(AQLParser.MODULES, 0); }
		public TerminalNode BINS() { return getToken(AQLParser.BINS, 0); }
		public TerminalNode USER() { return getToken(AQLParser.USER, 0); }
		public TerminalNode INDEXES() { return getToken(AQLParser.INDEXES, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitShow(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489); match(SHOW);
			setState(506);
			switch (_input.LA(1)) {
			case INDEXES:
				{
				setState(490); match(INDEXES);
				setState(492);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(491); nameSet();
					}
				}

				}
				break;
			case SCANS:
				{
				setState(494); match(SCANS);
				}
				break;
			case NAMESPACES:
				{
				setState(495); match(NAMESPACES);
				}
				break;
			case SETS:
				{
				setState(496); match(SETS);
				}
				break;
			case BINS:
				{
				setState(497); match(BINS);
				}
				break;
			case QUERIES:
				{
				setState(498); match(QUERIES);
				}
				break;
			case MODULES:
				{
				setState(499); match(MODULES);
				}
				break;
			case USER:
				{
				setState(500); match(USER);
				setState(501); user();
				definitions.add(VariableDefinition.ADMIN_POLICY);
				}
				break;
			case USERS:
				{
				setState(504); match(USERS);
				definitions.add(VariableDefinition.ADMIN_POLICY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

				definitions.add(VariableDefinition.INFO_POLICY);
				definitions.add(VariableDefinition.INFO_STRING);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(AQLParser.INDEX, 0); }
		public ModuleNameContext moduleName() {
			return getRuleContext(ModuleNameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(AQLParser.DESC, 0); }
		public TerminalNode MODULE() { return getToken(AQLParser.MODULE, 0); }
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitDesc(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510); match(DESC);
			setState(517);
			switch (_input.LA(1)) {
			case MODULE:
				{
				setState(511); match(MODULE);
				setState(512); moduleName();
				}
				break;
			case INDEX:
				{
				setState(513); match(INDEX);
				setState(514); namespace_name();
				setState(515); index_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

				definitions.add(VariableDefinition.INFO_POLICY);
				definitions.add(VariableDefinition.INFO_STRING);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(AQLParser.INDEX, 0); }
		public TerminalNode STAT() { return getToken(AQLParser.STAT, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode QUERY() { return getToken(AQLParser.QUERY, 0); }
		public Namespace_nameContext namespace_name() {
			return getRuleContext(Namespace_nameContext.class,0);
		}
		public TerminalNode SYSTEM() { return getToken(AQLParser.SYSTEM, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); match(STAT);
			setState(528);
			switch (_input.LA(1)) {
			case INDEX:
				{
				setState(522); match(INDEX);
				setState(523); namespace_name();
				setState(524); index_name();
				}
				break;
			case QUERY:
				{
				setState(526); match(QUERY);
				}
				break;
			case SYSTEM:
				{
				setState(527); match(SYSTEM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

				definitions.add(VariableDefinition.INFO_POLICY);
				definitions.add(VariableDefinition.INFO_STRING);
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public Token timeOut;
		public BooleanLiteralContext verboseOn;
		public BooleanLiteralContext echoOn;
		public Token ttl;
		public Token luaUserPath;
		public TerminalNode TTL() { return getToken(AQLParser.TTL, 0); }
		public TerminalNode ECHO() { return getToken(AQLParser.ECHO, 0); }
		public ViewTypeContext viewType() {
			return getRuleContext(ViewTypeContext.class,0);
		}
		public TerminalNode FAIL_ON_CLUSTER_CHANGE() { return getToken(AQLParser.FAIL_ON_CLUSTER_CHANGE, 0); }
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode LUA_USER_PATH() { return getToken(AQLParser.LUA_USER_PATH, 0); }
		public TerminalNode FOR() { return getToken(AQLParser.FOR, 0); }
		public TerminalNode PASSWORD() { return getToken(AQLParser.PASSWORD, 0); }
		public TerminalNode INTLITERAL() { return getToken(AQLParser.INTLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(AQLParser.STRINGLITERAL, 0); }
		public TerminalNode OUTPUT() { return getToken(AQLParser.OUTPUT, 0); }
		public TerminalNode VERBOSE() { return getToken(AQLParser.VERBOSE, 0); }
		public TerminalNode TIMEOUT() { return getToken(AQLParser.TIMEOUT, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode SET() { return getToken(AQLParser.SET, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532); match(SET);
			setState(553);
			switch (_input.LA(1)) {
			case TIMEOUT:
				{
				setState(533); match(TIMEOUT);
				setState(534); ((SetContext)_localctx).timeOut = match(INTLITERAL);
				definitions.add(VariableDefinition.READ_POLICY);definitions.add(VariableDefinition.WRITE_POLICY);
				}
				break;
			case VERBOSE:
				{
				setState(536); match(VERBOSE);
				setState(537); ((SetContext)_localctx).verboseOn = booleanLiteral();
				}
				break;
			case ECHO:
				{
				setState(538); match(ECHO);
				setState(539); ((SetContext)_localctx).echoOn = booleanLiteral();
				}
				break;
			case TTL:
				{
				setState(540); match(TTL);
				setState(541); ((SetContext)_localctx).ttl = match(INTLITERAL);
				}
				break;
			case OUTPUT:
				{
				setState(542); match(OUTPUT);
				setState(543); viewType();
				}
				break;
			case LUA_USER_PATH:
				{
				setState(544); match(LUA_USER_PATH);
				setState(545); ((SetContext)_localctx).luaUserPath = match(STRINGLITERAL);
				}
				break;
			case FAIL_ON_CLUSTER_CHANGE:
				{
				setState(546); match(FAIL_ON_CLUSTER_CHANGE);
				}
				break;
			case PASSWORD:
				{
				setState(547); match(PASSWORD);
				setState(548); password();
				setState(549); match(FOR);
				setState(550); user();
				definitions.add(VariableDefinition.ADMIN_POLICY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetContext extends ParserRuleContext {
		public TerminalNode TTL() { return getToken(AQLParser.TTL, 0); }
		public TerminalNode ECHO() { return getToken(AQLParser.ECHO, 0); }
		public TerminalNode FAIL_ON_CLUSTER_CHANGE() { return getToken(AQLParser.FAIL_ON_CLUSTER_CHANGE, 0); }
		public TerminalNode LUA_USER_PATH() { return getToken(AQLParser.LUA_USER_PATH, 0); }
		public TerminalNode OUTPUT() { return getToken(AQLParser.OUTPUT, 0); }
		public TerminalNode VERBOSE() { return getToken(AQLParser.VERBOSE, 0); }
		public TerminalNode TIMEOUT() { return getToken(AQLParser.TIMEOUT, 0); }
		public TerminalNode GET() { return getToken(AQLParser.GET, 0); }
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitGet(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_get);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555); match(GET);
			setState(556);
			_la = _input.LA(1);
			if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (OUTPUT - 43)) | (1L << (TIMEOUT - 43)) | (1L << (VERBOSE - 43)) | (1L << (ECHO - 43)) | (1L << (TTL - 43)) | (1L << (LUA_USER_PATH - 43)) | (1L << (FAIL_ON_CLUSTER_CHANGE - 43)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViewTypeContext extends ParserRuleContext {
		public ViewTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterViewType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitViewType(this);
		}
	}

	public final ViewTypeContext viewType() throws RecognitionException {
		ViewTypeContext _localctx = new ViewTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_viewType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__11) | (1L << T__9) | (1L << T__1))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(AQLParser.RUN, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(AQLParser.STRINGLITERAL, 0); }
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitRun(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_run);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); match(RUN);
			setState(561); match(STRINGLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(AQLParser.PRINT, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(AQLParser.STRINGLITERAL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); match(PRINT);
			setState(565);
			_la = _input.LA(1);
			if (_la==STRINGLITERAL) {
				{
				setState(564); match(STRINGLITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KillContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(AQLParser.INTLITERAL, 0); }
		public TerminalNode SCAN() { return getToken(AQLParser.SCAN, 0); }
		public TerminalNode QUERY() { return getToken(AQLParser.QUERY, 0); }
		public TerminalNode KILL() { return getToken(AQLParser.KILL, 0); }
		public KillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterKill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitKill(this);
		}
	}

	public final KillContext kill() throws RecognitionException {
		KillContext _localctx = new KillContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_kill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); match(KILL);
			setState(568);
			_la = _input.LA(1);
			if ( !(_la==QUERY || _la==SCAN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(569); match(INTLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kill_queryContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(AQLParser.INTLITERAL, 0); }
		public TerminalNode KILL_QUERY() { return getToken(AQLParser.KILL_QUERY, 0); }
		public Kill_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kill_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterKill_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitKill_query(this);
		}
	}

	public final Kill_queryContext kill_query() throws RecognitionException {
		Kill_queryContext _localctx = new Kill_queryContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_kill_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); match(KILL_QUERY);
			setState(572); match(INTLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kill_scanContext extends ParserRuleContext {
		public TerminalNode KILL_SCAN() { return getToken(AQLParser.KILL_SCAN, 0); }
		public TerminalNode INTLITERAL() { return getToken(AQLParser.INTLITERAL, 0); }
		public Kill_scanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kill_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterKill_scan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitKill_scan(this);
		}
	}

	public final Kill_scanContext kill_scan() throws RecognitionException {
		Kill_scanContext _localctx = new Kill_scanContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_kill_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); match(KILL_SCAN);
			setState(575); match(INTLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuitContext extends ParserRuleContext {
		public TerminalNode QUIT() { return getToken(AQLParser.QUIT, 0); }
		public TerminalNode EXIT() { return getToken(AQLParser.EXIT, 0); }
		public QuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterQuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitQuit(this);
		}
	}

	public final QuitContext quit() throws RecognitionException {
		QuitContext _localctx = new QuitContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_quit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << QUIT) | (1L << EXIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HelpContext extends ParserRuleContext {
		public HelpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitHelp(this);
		}
	}

	public final HelpContext help() throws RecognitionException {
		HelpContext _localctx = new HelpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_help);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public String nameSpace;
		public String setName;
		public Token key;
		public TerminalNode INTLITERAL() { return getToken(AQLParser.INTLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(AQLParser.STRINGLITERAL, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState, String nameSpace, String setName) {
			super(parent, invokingState);
			this.nameSpace = nameSpace;
			this.setName = setName;
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitPrimaryKey(this);
		}
	}

	public final PrimaryKeyContext primaryKey(String nameSpace,String setName) throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState(), nameSpace, setName);
		enterRule(_localctx, 102, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			((PrimaryKeyContext)_localctx).key = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRINGLITERAL || _la==INTLITERAL) ) {
				((PrimaryKeyContext)_localctx).key = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AQLParser.IDENTIFIER, 0); }
		public Package_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterPackage_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitPackage_name(this);
		}
	}

	public final Package_nameContext package_name() throws RecognitionException {
		Package_nameContext _localctx = new Package_nameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_package_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AQLParser.IDENTIFIER, 0); }
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AQLParser.IDENTIFIER, 0); }
		public Namespace_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterNamespace_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitNamespace_name(this);
		}
	}

	public final Namespace_nameContext namespace_name() throws RecognitionException {
		Namespace_nameContext _localctx = new Namespace_nameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_namespace_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_nameContext extends ParserRuleContext {
		public Token setName;
		public TerminalNode IDENTIFIER() { return getToken(AQLParser.IDENTIFIER, 0); }
		public Set_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterSet_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitSet_name(this);
		}
	}

	public final Set_nameContext set_name() throws RecognitionException {
		Set_nameContext _localctx = new Set_nameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_set_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589); ((Set_nameContext)_localctx).setName = match(IDENTIFIER);

					if ((((Set_nameContext)_localctx).setName!=null?((Set_nameContext)_localctx).setName.getText():null).length() > 63) notifyErrorListeners("Set name exceeds 63 characters");
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinContext extends ParserRuleContext {
		public Token binName;
		public TerminalNode IDENTIFIER() { return getToken(AQLParser.IDENTIFIER, 0); }
		public BinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitBin(this);
		}
	}

	public final BinContext bin() throws RecognitionException {
		BinContext _localctx = new BinContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_bin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); ((BinContext)_localctx).binName = match(IDENTIFIER);

					if ((((BinContext)_localctx).binName!=null?((BinContext)_localctx).binName.getText():null).length() > 14) notifyErrorListeners("Bin name exceeds 14 characters");
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public TextValueContext textValue() {
			return getRuleContext(TextValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_value);
		try {
			setState(597);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(595); integerValue();
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(596); textValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextValueContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(AQLParser.STRINGLITERAL, 0); }
		public TextValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterTextValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitTextValue(this);
		}
	}

	public final TextValueContext textValue() throws RecognitionException {
		TextValueContext _localctx = new TextValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_textValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599); match(STRINGLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerValueContext extends ParserRuleContext {
		public TerminalNode INTLITERAL() { return getToken(AQLParser.INTLITERAL, 0); }
		public IntegerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterIntegerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitIntegerValue(this);
		}
	}

	public final IntegerValueContext integerValue() throws RecognitionException {
		IntegerValueContext _localctx = new IntegerValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_integerValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(INTLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(AQLParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(AQLParser.TRUE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AQLParser.IDENTIFIER, 0); }
		public ModuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterModuleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitModuleName(this);
		}
	}

	public final ModuleNameContext moduleName() throws RecognitionException {
		ModuleNameContext _localctx = new ModuleNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_moduleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); match(IDENTIFIER);
			setState(606); match(T__0);
			setState(607);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilePathContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(AQLParser.STRINGLITERAL, 0); }
		public FilePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).enterFilePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AQLListener ) ((AQLListener)listener).exitFilePath(this);
		}
	}

	public final FilePathContext filePath() throws RecognitionException {
		FilePathContext _localctx = new FilePathContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_filePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(STRINGLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3s\u0266\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\3\7\3\u0085\n\3\f\3\16\3\u0088\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a4\n\4\3\5\3\5\3\5\3\5\5\5\u00aa"+
		"\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00c1\n\7\f\7\16\7\u00c4\13\7\5\7\u00c6\n\7\3\7"+
		"\3\7\5\7\u00ca\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00db\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00e8\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00f3\n\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u0100\n\16\f\16"+
		"\16\16\u0103\13\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7"+
		"\21\u010f\n\21\f\21\16\21\u0112\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u011a\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0138\n\23\3\23\3\23\3\24\3\24\5\24\u013e\n\24\3"+
		"\24\3\24\7\24\u0142\n\24\f\24\16\24\u0145\13\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u014e\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u0155\n\26"+
		"\3\26\3\26\3\26\5\26\u015a\n\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0182\n\30\3\30\3\30\5\30\u0186\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u018e\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\5\33\u0199\n\33\3\33\3\33\3\33\3\33\5\33\u019f\n\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\5\34\u01a7\n\34\3\34\5\34\u01aa\n\34\3\34\3\34\3\34"+
		"\5\34\u01af\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u01b9\n"+
		"\36\3\36\3\36\7\36\u01bd\n\36\f\36\16\36\u01c0\13\36\3\37\3\37\3\37\7"+
		"\37\u01c5\n\37\f\37\16\37\u01c8\13\37\3 \3 \5 \u01cc\n \3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\5#\u01d8\n#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u01ef\n(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u01fd\n(\3(\3(\3)\3)\3)\3)\3)\3)\3)\5)\u0208\n)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\5*\u0213\n*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u022c\n+\3,\3,\3,\3-\3-\3.\3.\3.\3"+
		"/\3/\5/\u0238\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3:"+
		"\3;\3;\5;\u0258\n;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3@\3@\3@\2\2A\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\2\r\3\2@A\5\2\3\4\n\n\20\20\5\2]]``ll\13\2\6\6\b"+
		"\t\r\r\22\22))88EEWXll\7\2--99QSUUii\6\2\7\7\f\f\16\16\26\26\3\2\678\4"+
		"\2\5\5:;\4\2mmoo\3\2\30\31\3\2\13\f\u0279\2\u0080\3\2\2\2\4\u0086\3\2"+
		"\2\2\6\u00a3\3\2\2\2\b\u00a5\3\2\2\2\n\u00ab\3\2\2\2\f\u00ad\3\2\2\2\16"+
		"\u00cd\3\2\2\2\20\u00dc\3\2\2\2\22\u00e2\3\2\2\2\24\u00ed\3\2\2\2\26\u00f8"+
		"\3\2\2\2\30\u00fa\3\2\2\2\32\u00fc\3\2\2\2\34\u0104\3\2\2\2\36\u0106\3"+
		"\2\2\2 \u010a\3\2\2\2\"\u011d\3\2\2\2$\u012f\3\2\2\2&\u013d\3\2\2\2(\u0146"+
		"\3\2\2\2*\u0151\3\2\2\2,\u015d\3\2\2\2.\u0185\3\2\2\2\60\u0187\3\2\2\2"+
		"\62\u018f\3\2\2\2\64\u0194\3\2\2\2\66\u01a2\3\2\2\28\u01b2\3\2\2\2:\u01b8"+
		"\3\2\2\2<\u01c1\3\2\2\2>\u01cb\3\2\2\2@\u01cd\3\2\2\2B\u01d1\3\2\2\2D"+
		"\u01d7\3\2\2\2F\u01db\3\2\2\2H\u01dd\3\2\2\2J\u01e1\3\2\2\2L\u01e5\3\2"+
		"\2\2N\u01eb\3\2\2\2P\u0200\3\2\2\2R\u020b\3\2\2\2T\u0216\3\2\2\2V\u022d"+
		"\3\2\2\2X\u0230\3\2\2\2Z\u0232\3\2\2\2\\\u0235\3\2\2\2^\u0239\3\2\2\2"+
		"`\u023d\3\2\2\2b\u0240\3\2\2\2d\u0243\3\2\2\2f\u0245\3\2\2\2h\u0247\3"+
		"\2\2\2j\u0249\3\2\2\2l\u024b\3\2\2\2n\u024d\3\2\2\2p\u024f\3\2\2\2r\u0252"+
		"\3\2\2\2t\u0257\3\2\2\2v\u0259\3\2\2\2x\u025b\3\2\2\2z\u025d\3\2\2\2|"+
		"\u025f\3\2\2\2~\u0263\3\2\2\2\u0080\u0081\5\4\3\2\u0081\u0082\7\2\2\3"+
		"\u0082\3\3\2\2\2\u0083\u0085\5\6\4\2\u0084\u0083\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\5\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u00a4\5\b\5\2\u008a\u00a4\5\n\6\2\u008b\u00a4\5\f\7\2\u008c"+
		"\u00a4\5\16\b\2\u008d\u00a4\5\20\t\2\u008e\u00a4\5\22\n\2\u008f\u00a4"+
		"\5\24\13\2\u0090\u00a4\5\36\20\2\u0091\u00a4\5\"\22\2\u0092\u00a4\5$\23"+
		"\2\u0093\u00a4\5(\25\2\u0094\u00a4\5*\26\2\u0095\u00a4\5\62\32\2\u0096"+
		"\u00a4\5\64\33\2\u0097\u00a4\5\66\34\2\u0098\u00a4\5 \21\2\u0099\u00a4"+
		"\5N(\2\u009a\u00a4\5P)\2\u009b\u00a4\5R*\2\u009c\u00a4\5T+\2\u009d\u00a4"+
		"\5V,\2\u009e\u00a4\5Z.\2\u009f\u00a4\5^\60\2\u00a0\u00a4\5d\63\2\u00a1"+
		"\u00a4\5f\64\2\u00a2\u00a4\5\\/\2\u00a3\u0089\3\2\2\2\u00a3\u008a\3\2"+
		"\2\2\u00a3\u008b\3\2\2\2\u00a3\u008c\3\2\2\2\u00a3\u008d\3\2\2\2\u00a3"+
		"\u008e\3\2\2\2\u00a3\u008f\3\2\2\2\u00a3\u0090\3\2\2\2\u00a3\u0091\3\2"+
		"\2\2\u00a3\u0092\3\2\2\2\u00a3\u0093\3\2\2\2\u00a3\u0094\3\2\2\2\u00a3"+
		"\u0095\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3\u0098\3\2"+
		"\2\2\u00a3\u0099\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3"+
		"\u009c\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u009f\3\2"+
		"\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\7\3\2\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\7m\2\2\u00a7\u00a9\7o\2\2"+
		"\u00a8\u00aa\7o\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\t\3"+
		"\2\2\2\u00ab\u00ac\7\33\2\2\u00ac\13\3\2\2\2\u00ad\u00c9\7 \2\2\u00ae"+
		"\u00af\7!\2\2\u00af\u00b0\5l\67\2\u00b0\u00b1\7+\2\2\u00b1\u00b2\5\60"+
		"\31\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\5r:\2\u00b4\u00b5\7\23\2\2\u00b5"+
		"\u00b6\t\2\2\2\u00b6\u00b7\b\7\1\2\u00b7\u00ca\3\2\2\2\u00b8\u00b9\7a"+
		"\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\7c\2\2\u00bb\u00c5\5\30\r\2\u00bc"+
		"\u00bd\7d\2\2\u00bd\u00c6\5\34\17\2\u00be\u00c2\7e\2\2\u00bf\u00c1\5\32"+
		"\16\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00bc\3\2"+
		"\2\2\u00c5\u00be\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\7\1\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00ae\3\2\2\2\u00c9\u00b8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\b\7\1\2\u00cc\r\3\2\2\2\u00cd\u00da\7%\2\2\u00ce\u00cf"+
		"\7!\2\2\u00cf\u00d0\5\60\31\2\u00d0\u00d1\5l\67\2\u00d1\u00db\3\2\2\2"+
		"\u00d2\u00d3\7*\2\2\u00d3\u00db\5|?\2\u00d4\u00d5\7(\2\2\u00d5\u00db\5"+
		"\60\31\2\u00d6\u00d7\7a\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\b\b\1\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d4\3\2"+
		"\2\2\u00da\u00d6\3\2\2\2\u00db\17\3\2\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de"+
		"\7!\2\2\u00de\u00df\5l\67\2\u00df\u00e0\7+\2\2\u00e0\u00e1\5\60\31\2\u00e1"+
		"\21\3\2\2\2\u00e2\u00e7\7f\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e8\5\32\16"+
		"\2\u00e5\u00e6\7d\2\2\u00e6\u00e8\5\34\17\2\u00e7\u00e3\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\5\26"+
		"\f\2\u00eb\u00ec\b\n\1\2\u00ec\23\3\2\2\2\u00ed\u00f2\7g\2\2\u00ee\u00ef"+
		"\7e\2\2\u00ef\u00f3\5\32\16\2\u00f0\u00f1\7d\2\2\u00f1\u00f3\5\34\17\2"+
		"\u00f2\u00ee\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\7\61\2\2\u00f5\u00f6\5\26\f\2\u00f6\u00f7\b\13\1\2\u00f7\25\3\2\2\2\u00f8"+
		"\u00f9\7l\2\2\u00f9\27\3\2\2\2\u00fa\u00fb\7l\2\2\u00fb\31\3\2\2\2\u00fc"+
		"\u0101\5\34\17\2\u00fd\u00fe\7\25\2\2\u00fe\u0100\5\34\17\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\33\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\t\3\2\2\u0105\35\3\2\2\2\u0106"+
		"\u0107\7E\2\2\u0107\u0108\7*\2\2\u0108\u0109\5|?\2\u0109\37\3\2\2\2\u010a"+
		"\u010b\7,\2\2\u010b\u0110\5.\30\2\u010c\u010d\7\25\2\2\u010d\u010f\5."+
		"\30\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7+"+
		"\2\2\u0114\u0115\5\60\31\2\u0115\u0116\7#\2\2\u0116\u0119\5@!\2\u0117"+
		"\u0118\7\63\2\2\u0118\u011a\5B\"\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b\21\1\2\u011c!\3\2\2\2\u011d\u011e"+
		"\7\35\2\2\u011e\u011f\7/\2\2\u011f\u0120\5\60\31\2\u0120\u0121\7\21\2"+
		"\2\u0121\u0122\7?\2\2\u0122\u0123\7\25\2\2\u0123\u0124\5:\36\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\7\23\2\2\u0126\u0127\7\'\2\2\u0127\u0128\7\21\2\2"+
		"\u0128\u0129\5h\65\2\u0129\u012a\7\25\2\2\u012a\u012b\5<\37\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\7\23\2\2\u012d\u012e\b\22\1\2\u012e#\3\2\2\2\u012f"+
		"\u0130\7P\2\2\u0130\u0131\5\60\31\2\u0131\u0132\7(\2\2\u0132\u0133\5&"+
		"\24\2\u0133\u0134\7#\2\2\u0134\u0137\5@!\2\u0135\u0136\7\63\2\2\u0136"+
		"\u0138\5B\"\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\b\23\1\2\u013a%\3\2\2\2\u013b\u013e\5H%\2\u013c\u013e"+
		"\5J&\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\u0143\3\2\2\2\u013f"+
		"\u0140\7\25\2\2\u0140\u0142\5J&\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\'\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0147\7\37\2\2\u0147\u0148\7\61\2\2\u0148\u0149\5\60\31"+
		"\2\u0149\u014a\7#\2\2\u014a\u014d\5@!\2\u014b\u014c\7\63\2\2\u014c\u014e"+
		"\5B\"\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\b\25\1\2\u0150)\3\2\2\2\u0151\u0154\7\36\2\2\u0152\u0155\7C\2\2"+
		"\u0153\u0155\5:\36\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\7\61\2\2\u0157\u0159\5\60\31\2\u0158\u015a\5,\27"+
		"\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\b\26\1\2\u015c+\3\2\2\2\u015d\u015e\7#\2\2\u015e\u015f\5> \2\u015f-\3"+
		"\2\2\2\u0160\u0161\7W\2\2\u0161\u0162\7\21\2\2\u0162\u0163\5r:\2\u0163"+
		"\u0164\7\25\2\2\u0164\u0165\5t;\2\u0165\u0166\7\23\2\2\u0166\u0186\3\2"+
		"\2\2\u0167\u0168\7X\2\2\u0168\u0169\7\21\2\2\u0169\u016a\5r:\2\u016a\u016b"+
		"\7\25\2\2\u016b\u016c\5t;\2\u016c\u016d\7\23\2\2\u016d\u0186\3\2\2\2\u016e"+
		"\u016f\7Y\2\2\u016f\u0170\7\21\2\2\u0170\u0171\5r:\2\u0171\u0172\7\25"+
		"\2\2\u0172\u0173\5t;\2\u0173\u0174\7\23\2\2\u0174\u0186\3\2\2\2\u0175"+
		"\u0176\7Z\2\2\u0176\u0177\7\21\2\2\u0177\u0178\5r:\2\u0178\u0179\7\25"+
		"\2\2\u0179\u017a\5t;\2\u017a\u017b\7\23\2\2\u017b\u0186\3\2\2\2\u017c"+
		"\u0181\7)\2\2\u017d\u017e\7\21\2\2\u017e\u017f\5r:\2\u017f\u0180\7\23"+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u017d\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0186\3\2\2\2\u0183\u0186\7[\2\2\u0184\u0186\7\\\2\2\u0185\u0160\3\2"+
		"\2\2\u0185\u0167\3\2\2\2\u0185\u016e\3\2\2\2\u0185\u0175\3\2\2\2\u0185"+
		"\u017c\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186/\3\2\2\2"+
		"\u0187\u0188\5n8\2\u0188\u018d\b\31\1\2\u0189\u018a\7\27\2\2\u018a\u018b"+
		"\5p9\2\u018b\u018c\b\31\1\2\u018c\u018e\3\2\2\2\u018d\u0189\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\61\3\2\2\2\u018f\u0190\7D\2\2\u0190\u0191\7*\2\2"+
		"\u0191\u0192\5~@\2\u0192\u0193\b\32\1\2\u0193\63\3\2\2\2\u0194\u0195\7"+
		"\"\2\2\u0195\u0196\58\35\2\u0196\u0198\7\21\2\2\u0197\u0199\5<\37\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7\23"+
		"\2\2\u019b\u019c\7+\2\2\u019c\u019e\5\60\31\2\u019d\u019f\5,\27\2\u019e"+
		"\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\b\33"+
		"\1\2\u01a1\65\3\2\2\2\u01a2\u01a3\7F\2\2\u01a3\u01a9\58\35\2\u01a4\u01a6"+
		"\7\21\2\2\u01a5\u01a7\5<\37\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2"+
		"\u01a7\u01a8\3\2\2\2\u01a8\u01aa\7\23\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7+\2\2\u01ac\u01ae\5\60\31\2"+
		"\u01ad\u01af\5,\27\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\b\34\1\2\u01b1\67\3\2\2\2\u01b2\u01b3\t\4\2\2\u01b3"+
		"\u01b4\7\27\2\2\u01b4\u01b5\t\5\2\2\u01b59\3\2\2\2\u01b6\u01b9\7S\2\2"+
		"\u01b7\u01b9\5r:\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01be"+
		"\3\2\2\2\u01ba\u01bb\7\25\2\2\u01bb\u01bd\5r:\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf;\3\2\2\2"+
		"\u01c0\u01be\3\2\2\2\u01c1\u01c6\5t;\2\u01c2\u01c3\7\25\2\2\u01c3\u01c5"+
		"\5t;\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7=\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\5@!\2\u01ca"+
		"\u01cc\5D#\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc?\3\2\2\2\u01cd"+
		"\u01ce\7?\2\2\u01ce\u01cf\7B\2\2\u01cf\u01d0\5h\65\2\u01d0A\3\2\2\2\u01d1"+
		"\u01d2\7\24\2\2\u01d2\u01d3\7B\2\2\u01d3\u01d4\7o\2\2\u01d4C\3\2\2\2\u01d5"+
		"\u01d8\5F$\2\u01d6\u01d8\5L\'\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2"+
		"\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\b#\1\2\u01daE\3\2\2\2\u01db\u01dc\5"+
		"J&\2\u01dcG\3\2\2\2\u01dd\u01de\7S\2\2\u01de\u01df\7B\2\2\u01df\u01e0"+
		"\5x=\2\u01e0I\3\2\2\2\u01e1\u01e2\5r:\2\u01e2\u01e3\7B\2\2\u01e3\u01e4"+
		"\5t;\2\u01e4K\3\2\2\2\u01e5\u01e6\5r:\2\u01e6\u01e7\7\64\2\2\u01e7\u01e8"+
		"\5x=\2\u01e8\u01e9\7\63\2\2\u01e9\u01ea\5x=\2\u01eaM\3\2\2\2\u01eb\u01fc"+
		"\7$\2\2\u01ec\u01ee\7&\2\2\u01ed\u01ef\5\60\31\2\u01ee\u01ed\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01fd\3\2\2\2\u01f0\u01fd\7K\2\2\u01f1\u01fd\7H\2"+
		"\2\u01f2\u01fd\7I\2\2\u01f3\u01fd\7J\2\2\u01f4\u01fd\7L\2\2\u01f5\u01fd"+
		"\7G\2\2\u01f6\u01f7\7a\2\2\u01f7\u01f8\5\26\f\2\u01f8\u01f9\b(\1\2\u01f9"+
		"\u01fd\3\2\2\2\u01fa\u01fb\7b\2\2\u01fb\u01fd\b(\1\2\u01fc\u01ec\3\2\2"+
		"\2\u01fc\u01f0\3\2\2\2\u01fc\u01f1\3\2\2\2\u01fc\u01f2\3\2\2\2\u01fc\u01f3"+
		"\3\2\2\2\u01fc\u01f4\3\2\2\2\u01fc\u01f5\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\b(\1\2\u01ffO\3\2\2\2\u0200"+
		"\u0207\7\34\2\2\u0201\u0202\7*\2\2\u0202\u0208\5|?\2\u0203\u0204\7!\2"+
		"\2\u0204\u0205\5n8\2\u0205\u0206\5l\67\2\u0206\u0208\3\2\2\2\u0207\u0201"+
		"\3\2\2\2\u0207\u0203\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\b)\1\2\u020a"+
		"Q\3\2\2\2\u020b\u0212\7\66\2\2\u020c\u020d\7!\2\2\u020d\u020e\5n8\2\u020e"+
		"\u020f\5l\67\2\u020f\u0213\3\2\2\2\u0210\u0213\7\67\2\2\u0211\u0213\7"+
		"M\2\2\u0212\u020c\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\b*\1\2\u0215S\3\2\2\2\u0216\u022b\7(\2\2\u0217"+
		"\u0218\79\2\2\u0218\u0219\7o\2\2\u0219\u022c\b+\1\2\u021a\u021b\7Q\2\2"+
		"\u021b\u022c\5z>\2\u021c\u021d\7R\2\2\u021d\u022c\5z>\2\u021e\u021f\7"+
		"S\2\2\u021f\u022c\7o\2\2\u0220\u0221\7-\2\2\u0221\u022c\5X-\2\u0222\u0223"+
		"\7U\2\2\u0223\u022c\7m\2\2\u0224\u022c\7i\2\2\u0225\u0226\7c\2\2\u0226"+
		"\u0227\5\30\r\2\u0227\u0228\7k\2\2\u0228\u0229\5\26\f\2\u0229\u022a\b"+
		"+\1\2\u022a\u022c\3\2\2\2\u022b\u0217\3\2\2\2\u022b\u021a\3\2\2\2\u022b"+
		"\u021c\3\2\2\2\u022b\u021e\3\2\2\2\u022b\u0220\3\2\2\2\u022b\u0222\3\2"+
		"\2\2\u022b\u0224\3\2\2\2\u022b\u0225\3\2\2\2\u022cU\3\2\2\2\u022d\u022e"+
		"\7)\2\2\u022e\u022f\t\6\2\2\u022fW\3\2\2\2\u0230\u0231\t\7\2\2\u0231Y"+
		"\3\2\2\2\u0232\u0233\7\65\2\2\u0233\u0234\7m\2\2\u0234[\3\2\2\2\u0235"+
		"\u0237\7O\2\2\u0236\u0238\7m\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2"+
		"\2\u0238]\3\2\2\2\u0239\u023a\7<\2\2\u023a\u023b\t\b\2\2\u023b\u023c\7"+
		"o\2\2\u023c_\3\2\2\2\u023d\u023e\7=\2\2\u023e\u023f\7o\2\2\u023fa\3\2"+
		"\2\2\u0240\u0241\7>\2\2\u0241\u0242\7o\2\2\u0242c\3\2\2\2\u0243\u0244"+
		"\t\t\2\2\u0244e\3\2\2\2\u0245\u0246\7\17\2\2\u0246g\3\2\2\2\u0247\u0248"+
		"\t\n\2\2\u0248i\3\2\2\2\u0249\u024a\7l\2\2\u024ak\3\2\2\2\u024b\u024c"+
		"\7l\2\2\u024cm\3\2\2\2\u024d\u024e\7l\2\2\u024eo\3\2\2\2\u024f\u0250\7"+
		"l\2\2\u0250\u0251\b9\1\2\u0251q\3\2\2\2\u0252\u0253\7l\2\2\u0253\u0254"+
		"\b:\1\2\u0254s\3\2\2\2\u0255\u0258\5x=\2\u0256\u0258\5v<\2\u0257\u0255"+
		"\3\2\2\2\u0257\u0256\3\2\2\2\u0258u\3\2\2\2\u0259\u025a\7m\2\2\u025aw"+
		"\3\2\2\2\u025b\u025c\7o\2\2\u025cy\3\2\2\2\u025d\u025e\t\13\2\2\u025e"+
		"{\3\2\2\2\u025f\u0260\7l\2\2\u0260\u0261\7\27\2\2\u0261\u0262\t\f\2\2"+
		"\u0262}\3\2\2\2\u0263\u0264\7m\2\2\u0264\177\3\2\2\2(\u0086\u00a3\u00a9"+
		"\u00c2\u00c5\u00c9\u00da\u00e7\u00f2\u0101\u0110\u0119\u0137\u013d\u0143"+
		"\u014d\u0154\u0159\u0181\u0185\u018d\u0198\u019e\u01a6\u01a9\u01ae\u01b8"+
		"\u01be\u01c6\u01cb\u01d7\u01ee\u01fc\u0207\u0212\u022b\u0237\u0257";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}