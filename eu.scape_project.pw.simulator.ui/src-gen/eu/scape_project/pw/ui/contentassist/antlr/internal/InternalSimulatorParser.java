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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Simulation'", "'{'", "'}'", "'Collection'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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


    // $ANTLR start "entryRuleEntity"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:88:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:89:1: ( ruleEntity EOF )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:90:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity121);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity128); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:97:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:101:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:102:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:102:1: ( ( rule__Entity__Group__0 ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:103:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:104:1: ( rule__Entity__Group__0 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:104:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity154);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


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
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:221:1: rule__Simulation__Group__3__Impl : ( ( ( rule__Simulation__EntitiesAssignment_3 ) ) ( ( rule__Simulation__EntitiesAssignment_3 )* ) ) ;
    public final void rule__Simulation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:225:1: ( ( ( ( rule__Simulation__EntitiesAssignment_3 ) ) ( ( rule__Simulation__EntitiesAssignment_3 )* ) ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:226:1: ( ( ( rule__Simulation__EntitiesAssignment_3 ) ) ( ( rule__Simulation__EntitiesAssignment_3 )* ) )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:226:1: ( ( ( rule__Simulation__EntitiesAssignment_3 ) ) ( ( rule__Simulation__EntitiesAssignment_3 )* ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:227:1: ( ( rule__Simulation__EntitiesAssignment_3 ) ) ( ( rule__Simulation__EntitiesAssignment_3 )* )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:227:1: ( ( rule__Simulation__EntitiesAssignment_3 ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:228:1: ( rule__Simulation__EntitiesAssignment_3 )
            {
             before(grammarAccess.getSimulationAccess().getEntitiesAssignment_3()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:229:1: ( rule__Simulation__EntitiesAssignment_3 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:229:2: rule__Simulation__EntitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__Simulation__EntitiesAssignment_3_in_rule__Simulation__Group__3__Impl404);
            rule__Simulation__EntitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getEntitiesAssignment_3()); 

            }

            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:232:1: ( ( rule__Simulation__EntitiesAssignment_3 )* )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:233:1: ( rule__Simulation__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getSimulationAccess().getEntitiesAssignment_3()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:234:1: ( rule__Simulation__EntitiesAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:234:2: rule__Simulation__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Simulation__EntitiesAssignment_3_in_rule__Simulation__Group__3__Impl416);
            	    rule__Simulation__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSimulationAccess().getEntitiesAssignment_3()); 

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
    // $ANTLR end "rule__Simulation__Group__3__Impl"


    // $ANTLR start "rule__Simulation__Group__4"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:245:1: rule__Simulation__Group__4 : rule__Simulation__Group__4__Impl ;
    public final void rule__Simulation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:249:1: ( rule__Simulation__Group__4__Impl )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:250:2: rule__Simulation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Simulation__Group__4__Impl_in_rule__Simulation__Group__4449);
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
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:256:1: rule__Simulation__Group__4__Impl : ( '}' ) ;
    public final void rule__Simulation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:260:1: ( ( '}' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:261:1: ( '}' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:261:1: ( '}' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:262:1: '}'
            {
             before(grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Simulation__Group__4__Impl477); 
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


    // $ANTLR start "rule__Entity__Group__0"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:285:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:289:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:290:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0518);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0521);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:297:1: rule__Entity__Group__0__Impl : ( 'Collection' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:301:1: ( ( 'Collection' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:302:1: ( 'Collection' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:302:1: ( 'Collection' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:303:1: 'Collection'
            {
             before(grammarAccess.getEntityAccess().getCollectionKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__0__Impl549); 
             after(grammarAccess.getEntityAccess().getCollectionKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:316:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:320:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:321:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1580);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1583);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:328:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:332:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:333:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:333:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:334:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:335:1: ( rule__Entity__NameAssignment_1 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:335:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl610);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:345:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:349:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:350:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2640);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2643);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:357:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:361:1: ( ( '{' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:362:1: ( '{' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:362:1: ( '{' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:363:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__2__Impl671); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:376:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:380:1: ( rule__Entity__Group__3__Impl )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:381:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3702);
            rule__Entity__Group__3__Impl();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:387:1: rule__Entity__Group__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:391:1: ( ( '}' ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:392:1: ( '}' )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:392:1: ( '}' )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:393:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__3__Impl730); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Simulation__NameAssignment_1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:415:1: rule__Simulation__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Simulation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:419:1: ( ( RULE_STRING ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:420:1: ( RULE_STRING )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:420:1: ( RULE_STRING )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:421:1: RULE_STRING
            {
             before(grammarAccess.getSimulationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Simulation__NameAssignment_1774); 
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


    // $ANTLR start "rule__Simulation__EntitiesAssignment_3"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:430:1: rule__Simulation__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Simulation__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:434:1: ( ( ruleEntity ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:435:1: ( ruleEntity )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:435:1: ( ruleEntity )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:436:1: ruleEntity
            {
             before(grammarAccess.getSimulationAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Simulation__EntitiesAssignment_3805);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getEntitiesEntityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Simulation__EntitiesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:445:1: rule__Entity__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:449:1: ( ( RULE_STRING ) )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:450:1: ( RULE_STRING )
            {
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:450:1: ( RULE_STRING )
            // ../eu.scape_project.pw.simulator.ui/src-gen/eu/scape_project/pw/ui/contentassist/antlr/internal/InternalSimulator.g:451:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Entity__NameAssignment_1836); 
             after(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSimulation_in_entryRuleSimulation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimulation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__0_in_ruleSimulation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__0__Impl_in_rule__Simulation__Group__0188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Simulation__Group__1_in_rule__Simulation__Group__0191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Simulation__Group__0__Impl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__1__Impl_in_rule__Simulation__Group__1250 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Simulation__Group__2_in_rule__Simulation__Group__1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__NameAssignment_1_in_rule__Simulation__Group__1__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__2__Impl_in_rule__Simulation__Group__2310 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Simulation__Group__3_in_rule__Simulation__Group__2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Simulation__Group__2__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__3__Impl_in_rule__Simulation__Group__3372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Simulation__Group__4_in_rule__Simulation__Group__3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__EntitiesAssignment_3_in_rule__Simulation__Group__3__Impl404 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Simulation__EntitiesAssignment_3_in_rule__Simulation__Group__3__Impl416 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__4__Impl_in_rule__Simulation__Group__4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Simulation__Group__4__Impl477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__0__Impl549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2640 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__2__Impl671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__3__Impl730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Simulation__NameAssignment_1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Simulation__EntitiesAssignment_3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__NameAssignment_1836 = new BitSet(new long[]{0x0000000000000002L});

}