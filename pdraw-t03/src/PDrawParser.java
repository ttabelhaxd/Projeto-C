// Generated from PDraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PDrawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, INT=50, REAL=51, HEX=52, COLOR=53, 
		STRING=54, BOOL=55, ANGLE=56, ID=57, WS=58, COMMENT=59;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_defineVariable = 2, RULE_variableList = 3, 
		RULE_variable = 4, RULE_defineCanvas = 5, RULE_definePen = 6, RULE_penProperties = 7, 
		RULE_createPen = 8, RULE_setPenProperty = 9, RULE_movePen = 10, RULE_typeOfMovements = 11, 
		RULE_rotation = 12, RULE_movement = 13, RULE_pressureChange = 14, RULE_moveTo = 15, 
		RULE_penAction = 16, RULE_actionSequence = 17, RULE_action = 18, RULE_executeProgram = 19, 
		RULE_outputStatement = 20, RULE_pauseStatement = 21, RULE_assignmentStatement = 22, 
		RULE_assignmentStatementForLoop = 23, RULE_userInputStatement = 24, RULE_realAssignmentStatement = 25, 
		RULE_intAssignmentStatement = 26, RULE_stringAssignmentStatement = 27, 
		RULE_loopStatement = 28, RULE_untilStatement = 29, RULE_forStatement = 30, 
		RULE_untilCondition = 31, RULE_condition = 32, RULE_block = 33, RULE_expression = 34, 
		RULE_value = 35, RULE_type = 36, RULE_cast = 37, RULE_property = 38, RULE_rotateDirection = 39, 
		RULE_moveDirection = 40, RULE_pressureDirection = 41, RULE_logical_operator = 42, 
		RULE_relational_operator = 43, RULE_arithmetic_operator = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "defineVariable", "variableList", "variable", 
			"defineCanvas", "definePen", "penProperties", "createPen", "setPenProperty", 
			"movePen", "typeOfMovements", "rotation", "movement", "pressureChange", 
			"moveTo", "penAction", "actionSequence", "action", "executeProgram", 
			"outputStatement", "pauseStatement", "assignmentStatement", "assignmentStatementForLoop", 
			"userInputStatement", "realAssignmentStatement", "intAssignmentStatement", 
			"stringAssignmentStatement", "loopStatement", "untilStatement", "forStatement", 
			"untilCondition", "condition", "block", "expression", "value", "type", 
			"cast", "property", "rotateDirection", "moveDirection", "pressureDirection", 
			"logical_operator", "relational_operator", "arithmetic_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'='", "'define'", "'canvas'", "'('", "')'", "'pen'", 
			"'{'", "'}'", "'new'", "'<-'", "'position'", "'execute'", "'->'", "'stdout'", 
			"'pause'", "'real'", "'int'", "'string'", "'until'", "'for'", "'stdin'", 
			"'point'", "'bool'", "'color'", "'orientation'", "'thickness'", "'pressure'", 
			"'left'", "'right'", "'forward'", "'backward'", "'up'", "'down'", "'or'", 
			"'and'", "'=='", "'<'", "'>'", "'!='", "'<='", "'>='", "'+'", "'-'", 
			"'*'", "'/'", "'//'", "'\\\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT", "REAL", "HEX", "COLOR", "STRING", "BOOL", "ANGLE", 
			"ID", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PDraw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PDrawParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PDrawParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 287104476311847248L) != 0)) {
				{
				{
				setState(90);
				statement();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementOutputContext extends StatementContext {
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public StatementOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefinePenContext extends StatementContext {
		public DefinePenContext definePen() {
			return getRuleContext(DefinePenContext.class,0);
		}
		public StatementDefinePenContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementDefinePen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementDefinePen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementDefinePen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefineCanvasContext extends StatementContext {
		public DefineCanvasContext defineCanvas() {
			return getRuleContext(DefineCanvasContext.class,0);
		}
		public StatementDefineCanvasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementDefineCanvas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementDefineCanvas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementDefineCanvas(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementPauseContext extends StatementContext {
		public PauseStatementContext pauseStatement() {
			return getRuleContext(PauseStatementContext.class,0);
		}
		public StatementPauseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementPause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementPause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementExecuteProgramContext extends StatementContext {
		public ExecuteProgramContext executeProgram() {
			return getRuleContext(ExecuteProgramContext.class,0);
		}
		public StatementExecuteProgramContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementExecuteProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementExecuteProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementExecuteProgram(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementUserInputContext extends StatementContext {
		public UserInputStatementContext userInputStatement() {
			return getRuleContext(UserInputStatementContext.class,0);
		}
		public StatementUserInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementUserInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementUserInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementUserInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementLoopContext extends StatementContext {
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public StatementLoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementMovePenContext extends StatementContext {
		public MovePenContext movePen() {
			return getRuleContext(MovePenContext.class,0);
		}
		public StatementMovePenContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementMovePen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementMovePen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementMovePen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementAssignmentContext extends StatementContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public StatementAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDefineVariableContext extends StatementContext {
		public DefineVariableContext defineVariable() {
			return getRuleContext(DefineVariableContext.class,0);
		}
		public StatementDefineVariableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementDefineVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementDefineVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementDefineVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementCreatePenContext extends StatementContext {
		public CreatePenContext createPen() {
			return getRuleContext(CreatePenContext.class,0);
		}
		public StatementCreatePenContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementCreatePen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementCreatePen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementCreatePen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementSetPenPropertyContext extends StatementContext {
		public SetPenPropertyContext setPenProperty() {
			return getRuleContext(SetPenPropertyContext.class,0);
		}
		public StatementSetPenPropertyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementSetPenProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementSetPenProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementSetPenProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementPenActionContext extends StatementContext {
		public PenActionContext penAction() {
			return getRuleContext(PenActionContext.class,0);
		}
		public StatementPenActionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStatementPenAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStatementPenAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStatementPenAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StatementDefineVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				defineVariable();
				}
				break;
			case 2:
				_localctx = new StatementDefineCanvasContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				defineCanvas();
				}
				break;
			case 3:
				_localctx = new StatementDefinePenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				definePen();
				}
				break;
			case 4:
				_localctx = new StatementCreatePenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				createPen();
				}
				break;
			case 5:
				_localctx = new StatementSetPenPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				setPenProperty();
				}
				break;
			case 6:
				_localctx = new StatementMovePenContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				movePen();
				}
				break;
			case 7:
				_localctx = new StatementPenActionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				penAction();
				}
				break;
			case 8:
				_localctx = new StatementExecuteProgramContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				executeProgram();
				}
				break;
			case 9:
				_localctx = new StatementOutputContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				outputStatement();
				}
				break;
			case 10:
				_localctx = new StatementPauseContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(107);
				pauseStatement();
				}
				break;
			case 11:
				_localctx = new StatementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(108);
				assignmentStatement();
				}
				break;
			case 12:
				_localctx = new StatementUserInputContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(109);
				userInputStatement();
				}
				break;
			case 13:
				_localctx = new StatementLoopContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(110);
				loopStatement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefineVariableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public DefineVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterDefineVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitDefineVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitDefineVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineVariableContext defineVariable() throws RecognitionException {
		DefineVariableContext _localctx = new DefineVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defineVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			type();
			setState(114);
			variableList();
			setState(115);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public VariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitVariableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListContext variableList() throws RecognitionException {
		VariableListContext _localctx = new VariableListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			variable();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(118);
				match(T__1);
				setState(119);
				variable();
				}
				}
				setState(124);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(126);
				match(T__2);
				setState(127);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefineCanvasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PDrawParser.STRING, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public DefineCanvasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineCanvas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterDefineCanvas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitDefineCanvas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitDefineCanvas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineCanvasContext defineCanvas() throws RecognitionException {
		DefineCanvasContext _localctx = new DefineCanvasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defineCanvas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__3);
			setState(131);
			match(T__4);
			setState(132);
			match(ID);
			setState(133);
			match(STRING);
			setState(134);
			match(T__5);
			setState(135);
			value();
			setState(136);
			match(T__1);
			setState(137);
			value();
			setState(138);
			match(T__6);
			setState(139);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinePenContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public List<PenPropertiesContext> penProperties() {
			return getRuleContexts(PenPropertiesContext.class);
		}
		public PenPropertiesContext penProperties(int i) {
			return getRuleContext(PenPropertiesContext.class,i);
		}
		public DefinePenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definePen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterDefinePen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitDefinePen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitDefinePen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinePenContext definePen() throws RecognitionException {
		DefinePenContext _localctx = new DefinePenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definePen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__3);
			setState(142);
			match(T__7);
			setState(143);
			match(ID);
			setState(144);
			match(T__8);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006641152L) != 0)) {
				{
				{
				setState(145);
				penProperties();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__9);
			setState(152);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PenPropertiesContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PenPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterPenProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitPenProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitPenProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenPropertiesContext penProperties() throws RecognitionException {
		PenPropertiesContext _localctx = new PenPropertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_penProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			property();
			setState(155);
			match(T__2);
			setState(156);
			expression(0);
			setState(157);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreatePenContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PDrawParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PDrawParser.ID, i);
		}
		public CreatePenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createPen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterCreatePen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitCreatePen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitCreatePen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatePenContext createPen() throws RecognitionException {
		CreatePenContext _localctx = new CreatePenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createPen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__7);
			setState(160);
			match(ID);
			setState(161);
			match(T__2);
			setState(162);
			match(T__10);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(163);
				match(ID);
				}
			}

			setState(166);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetPenPropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetPenPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPenProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterSetPenProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitSetPenProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitSetPenProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetPenPropertyContext setPenProperty() throws RecognitionException {
		SetPenPropertyContext _localctx = new SetPenPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setPenProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(T__11);
			setState(170);
			property();
			setState(171);
			expression(0);
			setState(172);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MovePenContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public TypeOfMovementsContext typeOfMovements() {
			return getRuleContext(TypeOfMovementsContext.class,0);
		}
		public MovePenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movePen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterMovePen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitMovePen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitMovePen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovePenContext movePen() throws RecognitionException {
		MovePenContext _localctx = new MovePenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_movePen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ID);
			setState(175);
			typeOfMovements();
			setState(176);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeOfMovementsContext extends ParserRuleContext {
		public TypeOfMovementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOfMovements; }
	 
		public TypeOfMovementsContext() { }
		public void copyFrom(TypeOfMovementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MovePenToContext extends TypeOfMovementsContext {
		public MoveToContext moveTo() {
			return getRuleContext(MoveToContext.class,0);
		}
		public MovePenToContext(TypeOfMovementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterMovePenTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitMovePenTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitMovePenTo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MovePenRotationContext extends TypeOfMovementsContext {
		public RotationContext rotation() {
			return getRuleContext(RotationContext.class,0);
		}
		public MovePenRotationContext(TypeOfMovementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterMovePenRotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitMovePenRotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitMovePenRotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MovePenPressureChangeContext extends TypeOfMovementsContext {
		public PressureChangeContext pressureChange() {
			return getRuleContext(PressureChangeContext.class,0);
		}
		public MovePenPressureChangeContext(TypeOfMovementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterMovePenPressureChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitMovePenPressureChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitMovePenPressureChange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MovePenMovementContext extends TypeOfMovementsContext {
		public MovementContext movement() {
			return getRuleContext(MovementContext.class,0);
		}
		public MovePenMovementContext(TypeOfMovementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterMovePenMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitMovePenMovement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitMovePenMovement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOfMovementsContext typeOfMovements() throws RecognitionException {
		TypeOfMovementsContext _localctx = new TypeOfMovementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeOfMovements);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				_localctx = new MovePenRotationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				rotation();
				}
				break;
			case T__31:
			case T__32:
				_localctx = new MovePenMovementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				movement();
				}
				break;
			case T__33:
			case T__34:
				_localctx = new MovePenPressureChangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				pressureChange();
				}
				break;
			case T__11:
				_localctx = new MovePenToContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				moveTo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RotationContext extends ParserRuleContext {
		public RotateDirectionContext rotateDirection() {
			return getRuleContext(RotateDirectionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterRotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitRotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitRotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotationContext rotation() throws RecognitionException {
		RotationContext _localctx = new RotationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			rotateDirection();
			setState(185);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MovementContext extends ParserRuleContext {
		public MoveDirectionContext moveDirection() {
			return getRuleContext(MoveDirectionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MovementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitMovement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitMovement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovementContext movement() throws RecognitionException {
		MovementContext _localctx = new MovementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_movement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			moveDirection();
			setState(188);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PressureChangeContext extends ParserRuleContext {
		public PressureDirectionContext pressureDirection() {
			return getRuleContext(PressureDirectionContext.class,0);
		}
		public PressureChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pressureChange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterPressureChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitPressureChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitPressureChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PressureChangeContext pressureChange() throws RecognitionException {
		PressureChangeContext _localctx = new PressureChangeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pressureChange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			pressureDirection();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveToContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public MoveToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterMoveTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitMoveTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitMoveTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveToContext moveTo() throws RecognitionException {
		MoveToContext _localctx = new MoveToContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_moveTo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__11);
			setState(193);
			match(T__12);
			setState(194);
			match(T__5);
			setState(195);
			value();
			setState(196);
			match(T__1);
			setState(197);
			value();
			setState(198);
			match(T__6);
			setState(199);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PenActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public ActionSequenceContext actionSequence() {
			return getRuleContext(ActionSequenceContext.class,0);
		}
		public PenActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterPenAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitPenAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitPenAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenActionContext penAction() throws RecognitionException {
		PenActionContext _localctx = new PenActionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_penAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			actionSequence();
			setState(203);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionSequenceContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ActionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterActionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitActionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitActionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionSequenceContext actionSequence() throws RecognitionException {
		ActionSequenceContext _localctx = new ActionSequenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_actionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			action();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645865984L) != 0)) {
				{
				{
				setState(206);
				action();
				}
				}
				setState(211);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionMovementContext extends ActionContext {
		public MovementContext movement() {
			return getRuleContext(MovementContext.class,0);
		}
		public ActionMovementContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterActionMovement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitActionMovement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitActionMovement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionPauseContext extends ActionContext {
		public PauseStatementContext pauseStatement() {
			return getRuleContext(PauseStatementContext.class,0);
		}
		public ActionPauseContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterActionPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitActionPause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitActionPause(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionPressureChangeContext extends ActionContext {
		public PressureChangeContext pressureChange() {
			return getRuleContext(PressureChangeContext.class,0);
		}
		public ActionPressureChangeContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterActionPressureChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitActionPressureChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitActionPressureChange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionRotationContext extends ActionContext {
		public RotationContext rotation() {
			return getRuleContext(RotationContext.class,0);
		}
		public ActionRotationContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterActionRotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitActionRotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitActionRotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_action);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				_localctx = new ActionRotationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				rotation();
				}
				break;
			case T__31:
			case T__32:
				_localctx = new ActionMovementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				movement();
				}
				break;
			case T__33:
			case T__34:
				_localctx = new ActionPressureChangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				pressureChange();
				}
				break;
			case T__16:
				_localctx = new ActionPauseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				pauseStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PDrawParser.STRING, 0); }
		public ExecuteProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterExecuteProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitExecuteProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitExecuteProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteProgramContext executeProgram() throws RecognitionException {
		ExecuteProgramContext _localctx = new ExecuteProgramContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_executeProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
			setState(219);
			match(T__11);
			setState(220);
			match(T__13);
			setState(221);
			match(STRING);
			setState(222);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OutputStatementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterOutputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitOutputStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitOutputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_outputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			value();
			setState(225);
			match(T__14);
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PauseStatementContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PauseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pauseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterPauseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitPauseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitPauseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PauseStatementContext pauseStatement() throws RecognitionException {
		PauseStatementContext _localctx = new PauseStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pauseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__16);
			setState(230);
			value();
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(231);
				match(T__0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ID);
			setState(235);
			match(T__2);
			setState(236);
			expression(0);
			setState(237);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementForLoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatementForLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterAssignmentStatementForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitAssignmentStatementForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitAssignmentStatementForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementForLoopContext assignmentStatementForLoop() throws RecognitionException {
		AssignmentStatementForLoopContext _localctx = new AssignmentStatementForLoopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentStatementForLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
			setState(240);
			match(T__2);
			setState(241);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UserInputStatementContext extends ParserRuleContext {
		public UserInputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userInputStatement; }
	 
		public UserInputStatementContext() { }
		public void copyFrom(UserInputStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealUserInputContext extends UserInputStatementContext {
		public RealAssignmentStatementContext realAssignmentStatement() {
			return getRuleContext(RealAssignmentStatementContext.class,0);
		}
		public RealUserInputContext(UserInputStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterRealUserInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitRealUserInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitRealUserInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntUserInputContext extends UserInputStatementContext {
		public IntAssignmentStatementContext intAssignmentStatement() {
			return getRuleContext(IntAssignmentStatementContext.class,0);
		}
		public IntUserInputContext(UserInputStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterIntUserInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitIntUserInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitIntUserInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringUserInputContext extends UserInputStatementContext {
		public StringAssignmentStatementContext stringAssignmentStatement() {
			return getRuleContext(StringAssignmentStatementContext.class,0);
		}
		public StringUserInputContext(UserInputStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStringUserInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStringUserInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStringUserInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserInputStatementContext userInputStatement() throws RecognitionException {
		UserInputStatementContext _localctx = new UserInputStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_userInputStatement);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new RealUserInputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				realAssignmentStatement();
				}
				break;
			case T__18:
				_localctx = new IntUserInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				intAssignmentStatement();
				}
				break;
			case T__19:
				_localctx = new StringUserInputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				stringAssignmentStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RealAssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RealAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterRealAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitRealAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitRealAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealAssignmentStatementContext realAssignmentStatement() throws RecognitionException {
		RealAssignmentStatementContext _localctx = new RealAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_realAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__17);
			setState(249);
			match(ID);
			setState(250);
			match(T__2);
			setState(251);
			match(T__17);
			setState(252);
			match(T__5);
			setState(253);
			value();
			setState(254);
			match(T__6);
			setState(255);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntAssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IntAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterIntAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitIntAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitIntAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAssignmentStatementContext intAssignmentStatement() throws RecognitionException {
		IntAssignmentStatementContext _localctx = new IntAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_intAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__18);
			setState(258);
			match(ID);
			setState(259);
			match(T__2);
			setState(260);
			match(T__18);
			setState(261);
			match(T__5);
			setState(262);
			value();
			setState(263);
			match(T__6);
			setState(264);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringAssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StringAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAssignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterStringAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitStringAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitStringAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAssignmentStatementContext stringAssignmentStatement() throws RecognitionException {
		StringAssignmentStatementContext _localctx = new StringAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__19);
			setState(267);
			match(ID);
			setState(268);
			match(T__2);
			setState(269);
			match(T__19);
			setState(270);
			match(T__5);
			setState(271);
			value();
			setState(272);
			match(T__6);
			setState(273);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends LoopStatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForLoopContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UntilLoopContext extends LoopStatementContext {
		public UntilStatementContext untilStatement() {
			return getRuleContext(UntilStatementContext.class,0);
		}
		public UntilLoopContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterUntilLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitUntilLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitUntilLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loopStatement);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new UntilLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				untilStatement();
				}
				break;
			case T__21:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				forStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UntilStatementContext extends ParserRuleContext {
		public UntilConditionContext untilCondition() {
			return getRuleContext(UntilConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UntilStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterUntilStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitUntilStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitUntilStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilStatementContext untilStatement() throws RecognitionException {
		UntilStatementContext _localctx = new UntilStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_untilStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__20);
			setState(280);
			match(T__5);
			setState(281);
			untilCondition();
			setState(282);
			match(T__6);
			setState(283);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AssignmentStatementForLoopContext assignmentStatementForLoop() {
			return getRuleContext(AssignmentStatementForLoopContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__21);
			setState(286);
			match(T__5);
			setState(287);
			assignmentStatement();
			setState(288);
			condition();
			setState(289);
			assignmentStatementForLoop();
			setState(290);
			match(T__6);
			setState(291);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UntilConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UntilConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterUntilCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitUntilCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitUntilCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilConditionContext untilCondition() throws RecognitionException {
		UntilConditionContext _localctx = new UntilConditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_untilCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			expression(0);
			setState(296);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__8);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 287104476311847248L) != 0)) {
				{
				{
				setState(299);
				statement();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__9);
			setState(306);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public Arithmetic_operatorContext arithmetic_operator() {
			return getRuleContext(Arithmetic_operatorContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(309);
				value();
				}
				break;
			case 2:
				{
				setState(310);
				cast();
				setState(311);
				match(T__5);
				setState(312);
				expression(0);
				setState(313);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(315);
				match(T__5);
				setState(316);
				expression(0);
				setState(317);
				match(T__6);
				setState(318);
				logical_operator();
				setState(319);
				match(T__5);
				setState(320);
				expression(0);
				setState(321);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(326);
						arithmetic_operator();
						setState(327);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(330);
						relational_operator();
						setState(331);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PDrawParser.INT, 0); }
		public TerminalNode REAL() { return getToken(PDrawParser.REAL, 0); }
		public TerminalNode HEX() { return getToken(PDrawParser.HEX, 0); }
		public TerminalNode STRING() { return getToken(PDrawParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(PDrawParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(PDrawParser.ID, 0); }
		public TerminalNode ANGLE() { return getToken(PDrawParser.ANGLE, 0); }
		public TerminalNode COLOR() { return getToken(PDrawParser.COLOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_value);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(REAL);
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(HEX);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				match(STRING);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(342);
				match(T__22);
				setState(343);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				match(BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				match(ID);
				}
				break;
			case ANGLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				match(ANGLE);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				match(COLOR);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 10);
				{
				setState(348);
				match(T__5);
				setState(349);
				expression(0);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(350);
					match(T__1);
					setState(351);
					expression(0);
					}
				}

				setState(354);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 52166656L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastContext extends ParserRuleContext {
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_cast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006641152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RotateDirectionContext extends ParserRuleContext {
		public RotateDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterRotateDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitRotateDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitRotateDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotateDirectionContext rotateDirection() throws RecognitionException {
		RotateDirectionContext _localctx = new RotateDirectionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_rotateDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveDirectionContext extends ParserRuleContext {
		public MoveDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterMoveDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitMoveDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitMoveDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveDirectionContext moveDirection() throws RecognitionException {
		MoveDirectionContext _localctx = new MoveDirectionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_moveDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PressureDirectionContext extends ParserRuleContext {
		public PressureDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pressureDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterPressureDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitPressureDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitPressureDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PressureDirectionContext pressureDirection() throws RecognitionException {
		PressureDirectionContext _localctx = new PressureDirectionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pressureDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_operatorContext extends ParserRuleContext {
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitLogical_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitLogical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17317308137472L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).enterArithmetic_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PDrawListener ) ((PDrawListener)listener).exitArithmetic_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PDrawVisitor ) return ((PDrawVisitor<? extends T>)visitor).visitArithmetic_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1108307720798208L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0179\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000_\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001p\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003y\b"+
		"\u0003\n\u0003\f\u0003|\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0081\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0093\b\u0006\n\u0006\f\u0006\u0096\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a5\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00b7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00d0\b\u0011"+
		"\n\u0011\f\u0011\u00d3\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00d9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e9"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u00f7\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0116\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0005!\u012d\b!"+
		"\n!\f!\u0130\t!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0144\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u014e\b\"\n\"\f\"\u0151\t\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u0161\b#\u0001#\u0001#\u0003#\u0165\b#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0000\u0001D-\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVX\u0000\n\u0002\u0000\u0010\u001099\u0002"+
		"\u0000\u0012\u0014\u0018\u0019\u0001\u0000\u0012\u0013\u0002\u0000\r\r"+
		"\u001a\u001d\u0001\u0000\u001e\u001f\u0001\u0000 !\u0001\u0000\"#\u0001"+
		"\u0000$%\u0001\u0000&+\u0001\u0000,1\u0176\u0000]\u0001\u0000\u0000\u0000"+
		"\u0002o\u0001\u0000\u0000\u0000\u0004q\u0001\u0000\u0000\u0000\u0006u"+
		"\u0001\u0000\u0000\u0000\b}\u0001\u0000\u0000\u0000\n\u0082\u0001\u0000"+
		"\u0000\u0000\f\u008d\u0001\u0000\u0000\u0000\u000e\u009a\u0001\u0000\u0000"+
		"\u0000\u0010\u009f\u0001\u0000\u0000\u0000\u0012\u00a8\u0001\u0000\u0000"+
		"\u0000\u0014\u00ae\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000\u0000"+
		"\u0000\u0018\u00b8\u0001\u0000\u0000\u0000\u001a\u00bb\u0001\u0000\u0000"+
		"\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e\u00c0\u0001\u0000\u0000"+
		"\u0000 \u00c9\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000"+
		"$\u00d8\u0001\u0000\u0000\u0000&\u00da\u0001\u0000\u0000\u0000(\u00e0"+
		"\u0001\u0000\u0000\u0000*\u00e5\u0001\u0000\u0000\u0000,\u00ea\u0001\u0000"+
		"\u0000\u0000.\u00ef\u0001\u0000\u0000\u00000\u00f6\u0001\u0000\u0000\u0000"+
		"2\u00f8\u0001\u0000\u0000\u00004\u0101\u0001\u0000\u0000\u00006\u010a"+
		"\u0001\u0000\u0000\u00008\u0115\u0001\u0000\u0000\u0000:\u0117\u0001\u0000"+
		"\u0000\u0000<\u011d\u0001\u0000\u0000\u0000>\u0125\u0001\u0000\u0000\u0000"+
		"@\u0127\u0001\u0000\u0000\u0000B\u012a\u0001\u0000\u0000\u0000D\u0143"+
		"\u0001\u0000\u0000\u0000F\u0164\u0001\u0000\u0000\u0000H\u0166\u0001\u0000"+
		"\u0000\u0000J\u0168\u0001\u0000\u0000\u0000L\u016a\u0001\u0000\u0000\u0000"+
		"N\u016c\u0001\u0000\u0000\u0000P\u016e\u0001\u0000\u0000\u0000R\u0170"+
		"\u0001\u0000\u0000\u0000T\u0172\u0001\u0000\u0000\u0000V\u0174\u0001\u0000"+
		"\u0000\u0000X\u0176\u0001\u0000\u0000\u0000Z\\\u0003\u0002\u0001\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000`a\u0005\u0000\u0000\u0001a\u0001\u0001\u0000\u0000\u0000"+
		"bp\u0003\u0004\u0002\u0000cp\u0003\n\u0005\u0000dp\u0003\f\u0006\u0000"+
		"ep\u0003\u0010\b\u0000fp\u0003\u0012\t\u0000gp\u0003\u0014\n\u0000hp\u0003"+
		" \u0010\u0000ip\u0003&\u0013\u0000jp\u0003(\u0014\u0000kp\u0003*\u0015"+
		"\u0000lp\u0003,\u0016\u0000mp\u00030\u0018\u0000np\u00038\u001c\u0000"+
		"ob\u0001\u0000\u0000\u0000oc\u0001\u0000\u0000\u0000od\u0001\u0000\u0000"+
		"\u0000oe\u0001\u0000\u0000\u0000of\u0001\u0000\u0000\u0000og\u0001\u0000"+
		"\u0000\u0000oh\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000oj\u0001"+
		"\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\u0003\u0001\u0000"+
		"\u0000\u0000qr\u0003H$\u0000rs\u0003\u0006\u0003\u0000st\u0005\u0001\u0000"+
		"\u0000t\u0005\u0001\u0000\u0000\u0000uz\u0003\b\u0004\u0000vw\u0005\u0002"+
		"\u0000\u0000wy\u0003\b\u0004\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0007"+
		"\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0080\u00059\u0000"+
		"\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\u0081\u0003D\"\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\t"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083\u0084"+
		"\u0005\u0005\u0000\u0000\u0084\u0085\u00059\u0000\u0000\u0085\u0086\u0005"+
		"6\u0000\u0000\u0086\u0087\u0005\u0006\u0000\u0000\u0087\u0088\u0003F#"+
		"\u0000\u0088\u0089\u0005\u0002\u0000\u0000\u0089\u008a\u0003F#\u0000\u008a"+
		"\u008b\u0005\u0007\u0000\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c"+
		"\u000b\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0004\u0000\u0000\u008e"+
		"\u008f\u0005\b\u0000\u0000\u008f\u0090\u00059\u0000\u0000\u0090\u0094"+
		"\u0005\t\u0000\u0000\u0091\u0093\u0003\u000e\u0007\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\n\u0000\u0000\u0098\u0099\u0005\u0001\u0000\u0000\u0099\r\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0003L&\u0000\u009b\u009c\u0005\u0003\u0000\u0000"+
		"\u009c\u009d\u0003D\"\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e"+
		"\u000f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a1"+
		"\u00059\u0000\u0000\u00a1\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a4\u0005"+
		"\u000b\u0000\u0000\u00a3\u00a5\u00059\u0000\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0001\u0000\u0000\u00a7\u0011\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u00059\u0000\u0000\u00a9\u00aa\u0005\f\u0000"+
		"\u0000\u00aa\u00ab\u0003L&\u0000\u00ab\u00ac\u0003D\"\u0000\u00ac\u00ad"+
		"\u0005\u0001\u0000\u0000\u00ad\u0013\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u00059\u0000\u0000\u00af\u00b0\u0003\u0016\u000b\u0000\u00b0\u00b1\u0005"+
		"\u0001\u0000\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00b7\u0003"+
		"\u0018\f\u0000\u00b3\u00b7\u0003\u001a\r\u0000\u00b4\u00b7\u0003\u001c"+
		"\u000e\u0000\u00b5\u00b7\u0003\u001e\u000f\u0000\u00b6\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u0017\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0003N\'\u0000\u00b9\u00ba\u0003F#\u0000\u00ba"+
		"\u0019\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003P(\u0000\u00bc\u00bd\u0003"+
		"F#\u0000\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00bf\u0003R)\u0000"+
		"\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\f\u0000\u0000\u00c1"+
		"\u00c2\u0005\r\u0000\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4"+
		"\u0003F#\u0000\u00c4\u00c5\u0005\u0002\u0000\u0000\u00c5\u00c6\u0003F"+
		"#\u0000\u00c6\u00c7\u0005\u0007\u0000\u0000\u00c7\u00c8\u0005\u0001\u0000"+
		"\u0000\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9\u00ca\u00059\u0000\u0000"+
		"\u00ca\u00cb\u0003\"\u0011\u0000\u00cb\u00cc\u0005\u0001\u0000\u0000\u00cc"+
		"!\u0001\u0000\u0000\u0000\u00cd\u00d1\u0003$\u0012\u0000\u00ce\u00d0\u0003"+
		"$\u0012\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d9\u0003\u0018\f\u0000\u00d5\u00d9\u0003\u001a\r\u0000"+
		"\u00d6\u00d9\u0003\u001c\u000e\u0000\u00d7\u00d9\u0003*\u0015\u0000\u00d8"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"%\u0001\u0000\u0000\u0000\u00da\u00db\u00059\u0000\u0000\u00db\u00dc\u0005"+
		"\f\u0000\u0000\u00dc\u00dd\u0005\u000e\u0000\u0000\u00dd\u00de\u00056"+
		"\u0000\u0000\u00de\u00df\u0005\u0001\u0000\u0000\u00df\'\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0003F#\u0000\u00e1\u00e2\u0005\u000f\u0000\u0000\u00e2"+
		"\u00e3\u0007\u0000\u0000\u0000\u00e3\u00e4\u0005\u0001\u0000\u0000\u00e4"+
		")\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0011\u0000\u0000\u00e6\u00e8"+
		"\u0003F#\u0000\u00e7\u00e9\u0005\u0001\u0000\u0000\u00e8\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9+\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u00059\u0000\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000"+
		"\u00ec\u00ed\u0003D\"\u0000\u00ed\u00ee\u0005\u0001\u0000\u0000\u00ee"+
		"-\u0001\u0000\u0000\u0000\u00ef\u00f0\u00059\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0003\u0000\u0000\u00f1\u00f2\u0003D\"\u0000\u00f2/\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f7\u00032\u0019\u0000\u00f4\u00f7\u00034\u001a\u0000\u00f5"+
		"\u00f7\u00036\u001b\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f71\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0005\u0012\u0000\u0000\u00f9\u00fa\u0005"+
		"9\u0000\u0000\u00fa\u00fb\u0005\u0003\u0000\u0000\u00fb\u00fc\u0005\u0012"+
		"\u0000\u0000\u00fc\u00fd\u0005\u0006\u0000\u0000\u00fd\u00fe\u0003F#\u0000"+
		"\u00fe\u00ff\u0005\u0007\u0000\u0000\u00ff\u0100\u0005\u0001\u0000\u0000"+
		"\u01003\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0013\u0000\u0000\u0102"+
		"\u0103\u00059\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104\u0105"+
		"\u0005\u0013\u0000\u0000\u0105\u0106\u0005\u0006\u0000\u0000\u0106\u0107"+
		"\u0003F#\u0000\u0107\u0108\u0005\u0007\u0000\u0000\u0108\u0109\u0005\u0001"+
		"\u0000\u0000\u01095\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0014\u0000"+
		"\u0000\u010b\u010c\u00059\u0000\u0000\u010c\u010d\u0005\u0003\u0000\u0000"+
		"\u010d\u010e\u0005\u0014\u0000\u0000\u010e\u010f\u0005\u0006\u0000\u0000"+
		"\u010f\u0110\u0003F#\u0000\u0110\u0111\u0005\u0007\u0000\u0000\u0111\u0112"+
		"\u0005\u0001\u0000\u0000\u01127\u0001\u0000\u0000\u0000\u0113\u0116\u0003"+
		":\u001d\u0000\u0114\u0116\u0003<\u001e\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u01169\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0005\u0015\u0000\u0000\u0118\u0119\u0005\u0006\u0000\u0000"+
		"\u0119\u011a\u0003>\u001f\u0000\u011a\u011b\u0005\u0007\u0000\u0000\u011b"+
		"\u011c\u0003B!\u0000\u011c;\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"\u0016\u0000\u0000\u011e\u011f\u0005\u0006\u0000\u0000\u011f\u0120\u0003"+
		",\u0016\u0000\u0120\u0121\u0003@ \u0000\u0121\u0122\u0003.\u0017\u0000"+
		"\u0122\u0123\u0005\u0007\u0000\u0000\u0123\u0124\u0003B!\u0000\u0124="+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0003D\"\u0000\u0126?\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0003D\"\u0000\u0128\u0129\u0005\u0001\u0000"+
		"\u0000\u0129A\u0001\u0000\u0000\u0000\u012a\u012e\u0005\t\u0000\u0000"+
		"\u012b\u012d\u0003\u0002\u0001\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005\n\u0000\u0000\u0132"+
		"\u0133\u0005\u0001\u0000\u0000\u0133C\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0006\"\uffff\uffff\u0000\u0135\u0144\u0003F#\u0000\u0136\u0137\u0003"+
		"J%\u0000\u0137\u0138\u0005\u0006\u0000\u0000\u0138\u0139\u0003D\"\u0000"+
		"\u0139\u013a\u0005\u0007\u0000\u0000\u013a\u0144\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0005\u0006\u0000\u0000\u013c\u013d\u0003D\"\u0000\u013d"+
		"\u013e\u0005\u0007\u0000\u0000\u013e\u013f\u0003T*\u0000\u013f\u0140\u0005"+
		"\u0006\u0000\u0000\u0140\u0141\u0003D\"\u0000\u0141\u0142\u0005\u0007"+
		"\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0134\u0001\u0000"+
		"\u0000\u0000\u0143\u0136\u0001\u0000\u0000\u0000\u0143\u013b\u0001\u0000"+
		"\u0000\u0000\u0144\u014f\u0001\u0000\u0000\u0000\u0145\u0146\n\u0004\u0000"+
		"\u0000\u0146\u0147\u0003X,\u0000\u0147\u0148\u0003D\"\u0005\u0148\u014e"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\n\u0003\u0000\u0000\u014a\u014b\u0003"+
		"V+\u0000\u014b\u014c\u0003D\"\u0004\u014c\u014e\u0001\u0000\u0000\u0000"+
		"\u014d\u0145\u0001\u0000\u0000\u0000\u014d\u0149\u0001\u0000\u0000\u0000"+
		"\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150E\u0001\u0000\u0000\u0000\u0151"+
		"\u014f\u0001\u0000\u0000\u0000\u0152\u0165\u00052\u0000\u0000\u0153\u0165"+
		"\u00053\u0000\u0000\u0154\u0165\u00054\u0000\u0000\u0155\u0165\u00056"+
		"\u0000\u0000\u0156\u0157\u0005\u0017\u0000\u0000\u0157\u0165\u00056\u0000"+
		"\u0000\u0158\u0165\u00057\u0000\u0000\u0159\u0165\u00059\u0000\u0000\u015a"+
		"\u0165\u00058\u0000\u0000\u015b\u0165\u00055\u0000\u0000\u015c\u015d\u0005"+
		"\u0006\u0000\u0000\u015d\u0160\u0003D\"\u0000\u015e\u015f\u0005\u0002"+
		"\u0000\u0000\u015f\u0161\u0003D\"\u0000\u0160\u015e\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005\u0007\u0000\u0000\u0163\u0165\u0001\u0000\u0000"+
		"\u0000\u0164\u0152\u0001\u0000\u0000\u0000\u0164\u0153\u0001\u0000\u0000"+
		"\u0000\u0164\u0154\u0001\u0000\u0000\u0000\u0164\u0155\u0001\u0000\u0000"+
		"\u0000\u0164\u0156\u0001\u0000\u0000\u0000\u0164\u0158\u0001\u0000\u0000"+
		"\u0000\u0164\u0159\u0001\u0000\u0000\u0000\u0164\u015a\u0001\u0000\u0000"+
		"\u0000\u0164\u015b\u0001\u0000\u0000\u0000\u0164\u015c\u0001\u0000\u0000"+
		"\u0000\u0165G\u0001\u0000\u0000\u0000\u0166\u0167\u0007\u0001\u0000\u0000"+
		"\u0167I\u0001\u0000\u0000\u0000\u0168\u0169\u0007\u0002\u0000\u0000\u0169"+
		"K\u0001\u0000\u0000\u0000\u016a\u016b\u0007\u0003\u0000\u0000\u016bM\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0007\u0004\u0000\u0000\u016dO\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0007\u0005\u0000\u0000\u016fQ\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0007\u0006\u0000\u0000\u0171S\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0007\u0007\u0000\u0000\u0173U\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0007\b\u0000\u0000\u0175W\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0007\t\u0000\u0000\u0177Y\u0001\u0000\u0000\u0000\u0012]oz\u0080\u0094"+
		"\u00a4\u00b6\u00d1\u00d8\u00e8\u00f6\u0115\u012e\u0143\u014d\u014f\u0160"+
		"\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}