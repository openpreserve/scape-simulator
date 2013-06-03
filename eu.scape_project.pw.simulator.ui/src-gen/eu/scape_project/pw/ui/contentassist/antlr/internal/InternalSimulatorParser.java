package eu.scape_project.pw.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import eu.scape_project.pw.services.SimulatorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimulatorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Simulation'", "'{'", "'}'", "'Event'", "'schedules =>'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSimulatorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimulatorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimulatorParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g"; }


     
     	private SimulatorGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SimulatorGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSimulation"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:60:1: entryRuleSimulation : ruleSimulation EOF ;
    public final void entryRuleSimulation() throws RecognitionException {
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:61:1: ( ruleSimulation EOF )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:62:1: ruleSimulation EOF
            {
             before(grammarAccess.getSimulationRule()); 
            pushFollow(FOLLOW_ruleSimulation_in_entryRuleSimulation61);
            ruleSimulation();

            state._fsp--;

             after(grammarAccess.getSimulationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimulation68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimulation"


    // $ANTLR start "ruleSimulation"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:69:1: ruleSimulation : ( ( rule__Simulation__Group__0 ) ) ;
    public final void ruleSimulation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:73:2: ( ( ( rule__Simulation__Group__0 ) ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:74:1: ( ( rule__Simulation__Group__0 ) )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:74:1: ( ( rule__Simulation__Group__0 ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:75:1: ( rule__Simulation__Group__0 )
            {
             before(grammarAccess.getSimulationAccess().getGroup()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:76:1: ( rule__Simulation__Group__0 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:76:2: rule__Simulation__Group__0
            {
            pushFollow(FOLLOW_rule__Simulation__Group__0_in_ruleSimulation94);
            rule__Simulation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimulation"


    // $ANTLR start "entryRuleEvent"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:88:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:89:1: ( ruleEvent EOF )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:90:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent121);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:97:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:101:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:102:1: ( ( rule__Event__Group__0 ) )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:102:1: ( ( rule__Event__Group__0 ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:103:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:104:1: ( rule__Event__Group__0 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:104:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent154);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "rule__Simulation__Group__0"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:118:1: rule__Simulation__Group__0 : rule__Simulation__Group__0__Impl rule__Simulation__Group__1 ;
    public final void rule__Simulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:122:1: ( rule__Simulation__Group__0__Impl rule__Simulation__Group__1 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:123:2: rule__Simulation__Group__0__Impl rule__Simulation__Group__1
            {
            pushFollow(FOLLOW_rule__Simulation__Group__0__Impl_in_rule__Simulation__Group__0188);
            rule__Simulation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simulation__Group__1_in_rule__Simulation__Group__0191);
            rule__Simulation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__0"


    // $ANTLR start "rule__Simulation__Group__0__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:130:1: rule__Simulation__Group__0__Impl : ( 'Simulation' ) ;
    public final void rule__Simulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:134:1: ( ( 'Simulation' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:135:1: ( 'Simulation' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:135:1: ( 'Simulation' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:136:1: 'Simulation'
            {
             before(grammarAccess.getSimulationAccess().getSimulationKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Simulation__Group__0__Impl219); 
             after(grammarAccess.getSimulationAccess().getSimulationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__0__Impl"


    // $ANTLR start "rule__Simulation__Group__1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:149:1: rule__Simulation__Group__1 : rule__Simulation__Group__1__Impl rule__Simulation__Group__2 ;
    public final void rule__Simulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:153:1: ( rule__Simulation__Group__1__Impl rule__Simulation__Group__2 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:154:2: rule__Simulation__Group__1__Impl rule__Simulation__Group__2
            {
            pushFollow(FOLLOW_rule__Simulation__Group__1__Impl_in_rule__Simulation__Group__1250);
            rule__Simulation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simulation__Group__2_in_rule__Simulation__Group__1253);
            rule__Simulation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__1"


    // $ANTLR start "rule__Simulation__Group__1__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:161:1: rule__Simulation__Group__1__Impl : ( ( rule__Simulation__NameAssignment_1 ) ) ;
    public final void rule__Simulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:165:1: ( ( ( rule__Simulation__NameAssignment_1 ) ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:166:1: ( ( rule__Simulation__NameAssignment_1 ) )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:166:1: ( ( rule__Simulation__NameAssignment_1 ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:167:1: ( rule__Simulation__NameAssignment_1 )
            {
             before(grammarAccess.getSimulationAccess().getNameAssignment_1()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:168:1: ( rule__Simulation__NameAssignment_1 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:168:2: rule__Simulation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Simulation__NameAssignment_1_in_rule__Simulation__Group__1__Impl280);
            rule__Simulation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__1__Impl"


    // $ANTLR start "rule__Simulation__Group__2"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:178:1: rule__Simulation__Group__2 : rule__Simulation__Group__2__Impl rule__Simulation__Group__3 ;
    public final void rule__Simulation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:182:1: ( rule__Simulation__Group__2__Impl rule__Simulation__Group__3 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:183:2: rule__Simulation__Group__2__Impl rule__Simulation__Group__3
            {
            pushFollow(FOLLOW_rule__Simulation__Group__2__Impl_in_rule__Simulation__Group__2310);
            rule__Simulation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simulation__Group__3_in_rule__Simulation__Group__2313);
            rule__Simulation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__2"


    // $ANTLR start "rule__Simulation__Group__2__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:190:1: rule__Simulation__Group__2__Impl : ( '{' ) ;
    public final void rule__Simulation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:194:1: ( ( '{' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:195:1: ( '{' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:195:1: ( '{' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:196:1: '{'
            {
             before(grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Simulation__Group__2__Impl341); 
             after(grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__2__Impl"


    // $ANTLR start "rule__Simulation__Group__3"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:209:1: rule__Simulation__Group__3 : rule__Simulation__Group__3__Impl rule__Simulation__Group__4 ;
    public final void rule__Simulation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:213:1: ( rule__Simulation__Group__3__Impl rule__Simulation__Group__4 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:214:2: rule__Simulation__Group__3__Impl rule__Simulation__Group__4
            {
            pushFollow(FOLLOW_rule__Simulation__Group__3__Impl_in_rule__Simulation__Group__3372);
            rule__Simulation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simulation__Group__4_in_rule__Simulation__Group__3375);
            rule__Simulation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__3"


    // $ANTLR start "rule__Simulation__Group__3__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:221:1: rule__Simulation__Group__3__Impl : ( ( rule__Simulation__EventsAssignment_3 )* ) ;
    public final void rule__Simulation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:225:1: ( ( ( rule__Simulation__EventsAssignment_3 )* ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:226:1: ( ( rule__Simulation__EventsAssignment_3 )* )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:226:1: ( ( rule__Simulation__EventsAssignment_3 )* )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:227:1: ( rule__Simulation__EventsAssignment_3 )*
            {
             before(grammarAccess.getSimulationAccess().getEventsAssignment_3()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:228:1: ( rule__Simulation__EventsAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:228:2: rule__Simulation__EventsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Simulation__EventsAssignment_3_in_rule__Simulation__Group__3__Impl402);
            	    rule__Simulation__EventsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSimulationAccess().getEventsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__3__Impl"


    // $ANTLR start "rule__Simulation__Group__4"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:238:1: rule__Simulation__Group__4 : rule__Simulation__Group__4__Impl ;
    public final void rule__Simulation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:242:1: ( rule__Simulation__Group__4__Impl )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:243:2: rule__Simulation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Simulation__Group__4__Impl_in_rule__Simulation__Group__4433);
            rule__Simulation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__4"


    // $ANTLR start "rule__Simulation__Group__4__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:249:1: rule__Simulation__Group__4__Impl : ( '}' ) ;
    public final void rule__Simulation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:253:1: ( ( '}' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:254:1: ( '}' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:254:1: ( '}' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:255:1: '}'
            {
             before(grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Simulation__Group__4__Impl461); 
             after(grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:278:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:282:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:283:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__0502);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__0505);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:290:1: rule__Event__Group__0__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:294:1: ( ( 'Event' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:295:1: ( 'Event' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:295:1: ( 'Event' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:296:1: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Event__Group__0__Impl533); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:309:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:313:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:314:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__1564);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__2_in_rule__Event__Group__1567);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:321:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:325:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:326:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:326:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:327:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:328:1: ( rule__Event__NameAssignment_1 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:328:2: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl594);
            rule__Event__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:338:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:342:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:343:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__2624);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__3_in_rule__Event__Group__2627);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:350:1: rule__Event__Group__2__Impl : ( '{' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:354:1: ( ( '{' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:355:1: ( '{' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:355:1: ( '{' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:356:1: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Event__Group__2__Impl655); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:369:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:373:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:374:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__3686);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__4_in_rule__Event__Group__3689);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:381:1: rule__Event__Group__3__Impl : ( ( rule__Event__Group_3__0 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:385:1: ( ( ( rule__Event__Group_3__0 )? ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:386:1: ( ( rule__Event__Group_3__0 )? )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:386:1: ( ( rule__Event__Group_3__0 )? )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:387:1: ( rule__Event__Group_3__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_3()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:388:1: ( rule__Event__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:388:2: rule__Event__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_3__0_in_rule__Event__Group__3__Impl716);
                    rule__Event__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:398:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:402:1: ( rule__Event__Group__4__Impl )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:403:2: rule__Event__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__4747);
            rule__Event__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:409:1: rule__Event__Group__4__Impl : ( '}' ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:413:1: ( ( '}' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:414:1: ( '}' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:414:1: ( '}' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:415:1: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Event__Group__4__Impl775); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group_3__0"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:438:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:442:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:443:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
            {
            pushFollow(FOLLOW_rule__Event__Group_3__0__Impl_in_rule__Event__Group_3__0816);
            rule__Event__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group_3__1_in_rule__Event__Group_3__0819);
            rule__Event__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__0"


    // $ANTLR start "rule__Event__Group_3__0__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:450:1: rule__Event__Group_3__0__Impl : ( 'schedules =>' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:454:1: ( ( 'schedules =>' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:455:1: ( 'schedules =>' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:455:1: ( 'schedules =>' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:456:1: 'schedules =>'
            {
             before(grammarAccess.getEventAccess().getSchedulesKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__Event__Group_3__0__Impl847); 
             after(grammarAccess.getEventAccess().getSchedulesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__0__Impl"


    // $ANTLR start "rule__Event__Group_3__1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:469:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:473:1: ( rule__Event__Group_3__1__Impl )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:474:2: rule__Event__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_3__1__Impl_in_rule__Event__Group_3__1878);
            rule__Event__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__1"


    // $ANTLR start "rule__Event__Group_3__1__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:480:1: rule__Event__Group_3__1__Impl : ( ( ( rule__Event__EventsAssignment_3_1 ) ) ( ( rule__Event__EventsAssignment_3_1 )* ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:484:1: ( ( ( ( rule__Event__EventsAssignment_3_1 ) ) ( ( rule__Event__EventsAssignment_3_1 )* ) ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:485:1: ( ( ( rule__Event__EventsAssignment_3_1 ) ) ( ( rule__Event__EventsAssignment_3_1 )* ) )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:485:1: ( ( ( rule__Event__EventsAssignment_3_1 ) ) ( ( rule__Event__EventsAssignment_3_1 )* ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:486:1: ( ( rule__Event__EventsAssignment_3_1 ) ) ( ( rule__Event__EventsAssignment_3_1 )* )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:486:1: ( ( rule__Event__EventsAssignment_3_1 ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:487:1: ( rule__Event__EventsAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getEventsAssignment_3_1()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:488:1: ( rule__Event__EventsAssignment_3_1 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:488:2: rule__Event__EventsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Event__EventsAssignment_3_1_in_rule__Event__Group_3__1__Impl907);
            rule__Event__EventsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getEventsAssignment_3_1()); 

            }

            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:491:1: ( ( rule__Event__EventsAssignment_3_1 )* )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:492:1: ( rule__Event__EventsAssignment_3_1 )*
            {
             before(grammarAccess.getEventAccess().getEventsAssignment_3_1()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:493:1: ( rule__Event__EventsAssignment_3_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:493:2: rule__Event__EventsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Event__EventsAssignment_3_1_in_rule__Event__Group_3__1__Impl919);
            	    rule__Event__EventsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getEventsAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__1__Impl"


    // $ANTLR start "rule__Simulation__NameAssignment_1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:509:1: rule__Simulation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Simulation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:513:1: ( ( RULE_STRING ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:514:1: ( RULE_STRING )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:514:1: ( RULE_STRING )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:515:1: RULE_STRING
            {
             before(grammarAccess.getSimulationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Simulation__NameAssignment_1961); 
             after(grammarAccess.getSimulationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__NameAssignment_1"


    // $ANTLR start "rule__Simulation__EventsAssignment_3"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:524:1: rule__Simulation__EventsAssignment_3 : ( ruleEvent ) ;
    public final void rule__Simulation__EventsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:528:1: ( ( ruleEvent ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:529:1: ( ruleEvent )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:529:1: ( ruleEvent )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:530:1: ruleEvent
            {
             before(grammarAccess.getSimulationAccess().getEventsEventParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Simulation__EventsAssignment_3992);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getEventsEventParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__EventsAssignment_3"


    // $ANTLR start "rule__Event__NameAssignment_1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:539:1: rule__Event__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:543:1: ( ( RULE_STRING ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:544:1: ( RULE_STRING )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:544:1: ( RULE_STRING )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:545:1: RULE_STRING
            {
             before(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Event__NameAssignment_11023); 
             after(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_1"


    // $ANTLR start "rule__Event__EventsAssignment_3_1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:554:1: rule__Event__EventsAssignment_3_1 : ( ruleEvent ) ;
    public final void rule__Event__EventsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:558:1: ( ( ruleEvent ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:559:1: ( ruleEvent )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:559:1: ( ruleEvent )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:560:1: ruleEvent
            {
             before(grammarAccess.getEventAccess().getEventsEventParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Event__EventsAssignment_3_11054);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventAccess().getEventsEventParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventsAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSimulation_in_entryRuleSimulation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimulation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__0_in_ruleSimulation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__0__Impl_in_rule__Simulation__Group__0188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Simulation__Group__1_in_rule__Simulation__Group__0191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Simulation__Group__0__Impl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__1__Impl_in_rule__Simulation__Group__1250 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Simulation__Group__2_in_rule__Simulation__Group__1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__NameAssignment_1_in_rule__Simulation__Group__1__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__2__Impl_in_rule__Simulation__Group__2310 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Simulation__Group__3_in_rule__Simulation__Group__2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Simulation__Group__2__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__3__Impl_in_rule__Simulation__Group__3372 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Simulation__Group__4_in_rule__Simulation__Group__3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__EventsAssignment_3_in_rule__Simulation__Group__3__Impl402 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__4__Impl_in_rule__Simulation__Group__4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Simulation__Group__4__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__0502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__0505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Event__Group__0__Impl533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__1564 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Event__Group__2_in_rule__Event__Group__1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__2__Impl_in_rule__Event__Group__2624 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Event__Group__3_in_rule__Event__Group__2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Event__Group__2__Impl655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__3__Impl_in_rule__Event__Group__3686 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Event__Group__4_in_rule__Event__Group__3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_3__0_in_rule__Event__Group__3__Impl716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__4__Impl_in_rule__Event__Group__4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Event__Group__4__Impl775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_3__0__Impl_in_rule__Event__Group_3__0816 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Event__Group_3__1_in_rule__Event__Group_3__0819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Event__Group_3__0__Impl847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_3__1__Impl_in_rule__Event__Group_3__1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventsAssignment_3_1_in_rule__Event__Group_3__1__Impl907 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Event__EventsAssignment_3_1_in_rule__Event__Group_3__1__Impl919 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Simulation__NameAssignment_1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Simulation__EventsAssignment_3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Event__NameAssignment_11023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Event__EventsAssignment_3_11054 = new BitSet(new long[]{0x0000000000000002L});

}