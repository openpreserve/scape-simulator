package eu.scape_project.ui.contentassist.antlr.internal; 

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
import eu.scape_project.services.SimulatorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimulatorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Simulation { '", "'name='", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g"; }


     
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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:60:1: entryRuleSimulation : ruleSimulation EOF ;
    public final void entryRuleSimulation() throws RecognitionException {
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:61:1: ( ruleSimulation EOF )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:62:1: ruleSimulation EOF
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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:69:1: ruleSimulation : ( ( rule__Simulation__Group__0 ) ) ;
    public final void ruleSimulation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:73:2: ( ( ( rule__Simulation__Group__0 ) ) )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:74:1: ( ( rule__Simulation__Group__0 ) )
            {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:74:1: ( ( rule__Simulation__Group__0 ) )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:75:1: ( rule__Simulation__Group__0 )
            {
             before(grammarAccess.getSimulationAccess().getGroup()); 
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:76:1: ( rule__Simulation__Group__0 )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:76:2: rule__Simulation__Group__0
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


    // $ANTLR start "rule__Simulation__Group__0"
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:90:1: rule__Simulation__Group__0 : rule__Simulation__Group__0__Impl rule__Simulation__Group__1 ;
    public final void rule__Simulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:94:1: ( rule__Simulation__Group__0__Impl rule__Simulation__Group__1 )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:95:2: rule__Simulation__Group__0__Impl rule__Simulation__Group__1
            {
            pushFollow(FOLLOW_rule__Simulation__Group__0__Impl_in_rule__Simulation__Group__0128);
            rule__Simulation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simulation__Group__1_in_rule__Simulation__Group__0131);
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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:102:1: rule__Simulation__Group__0__Impl : ( 'Simulation { ' ) ;
    public final void rule__Simulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:106:1: ( ( 'Simulation { ' ) )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:107:1: ( 'Simulation { ' )
            {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:107:1: ( 'Simulation { ' )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:108:1: 'Simulation { '
            {
             before(grammarAccess.getSimulationAccess().getSimulationKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Simulation__Group__0__Impl159); 
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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:121:1: rule__Simulation__Group__1 : rule__Simulation__Group__1__Impl rule__Simulation__Group__2 ;
    public final void rule__Simulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:125:1: ( rule__Simulation__Group__1__Impl rule__Simulation__Group__2 )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:126:2: rule__Simulation__Group__1__Impl rule__Simulation__Group__2
            {
            pushFollow(FOLLOW_rule__Simulation__Group__1__Impl_in_rule__Simulation__Group__1190);
            rule__Simulation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simulation__Group__2_in_rule__Simulation__Group__1193);
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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:133:1: rule__Simulation__Group__1__Impl : ( 'name=' ) ;
    public final void rule__Simulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:137:1: ( ( 'name=' ) )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:138:1: ( 'name=' )
            {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:138:1: ( 'name=' )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:139:1: 'name='
            {
             before(grammarAccess.getSimulationAccess().getNameKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Simulation__Group__1__Impl221); 
             after(grammarAccess.getSimulationAccess().getNameKeyword_1()); 

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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:152:1: rule__Simulation__Group__2 : rule__Simulation__Group__2__Impl rule__Simulation__Group__3 ;
    public final void rule__Simulation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:156:1: ( rule__Simulation__Group__2__Impl rule__Simulation__Group__3 )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:157:2: rule__Simulation__Group__2__Impl rule__Simulation__Group__3
            {
            pushFollow(FOLLOW_rule__Simulation__Group__2__Impl_in_rule__Simulation__Group__2252);
            rule__Simulation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Simulation__Group__3_in_rule__Simulation__Group__2255);
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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:164:1: rule__Simulation__Group__2__Impl : ( ( rule__Simulation__NameAssignment_2 ) ) ;
    public final void rule__Simulation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:168:1: ( ( ( rule__Simulation__NameAssignment_2 ) ) )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:169:1: ( ( rule__Simulation__NameAssignment_2 ) )
            {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:169:1: ( ( rule__Simulation__NameAssignment_2 ) )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:170:1: ( rule__Simulation__NameAssignment_2 )
            {
             before(grammarAccess.getSimulationAccess().getNameAssignment_2()); 
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:171:1: ( rule__Simulation__NameAssignment_2 )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:171:2: rule__Simulation__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Simulation__NameAssignment_2_in_rule__Simulation__Group__2__Impl282);
            rule__Simulation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getNameAssignment_2()); 

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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:181:1: rule__Simulation__Group__3 : rule__Simulation__Group__3__Impl ;
    public final void rule__Simulation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:185:1: ( rule__Simulation__Group__3__Impl )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:186:2: rule__Simulation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Simulation__Group__3__Impl_in_rule__Simulation__Group__3312);
            rule__Simulation__Group__3__Impl();

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
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:192:1: rule__Simulation__Group__3__Impl : ( '}' ) ;
    public final void rule__Simulation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:196:1: ( ( '}' ) )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:197:1: ( '}' )
            {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:197:1: ( '}' )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:198:1: '}'
            {
             before(grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Simulation__Group__3__Impl340); 
             after(grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Simulation__NameAssignment_2"
    // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:220:1: rule__Simulation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simulation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:224:1: ( ( RULE_ID ) )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:225:1: ( RULE_ID )
            {
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:225:1: ( RULE_ID )
            // ../eu.scape_project.simulator.ui/src-gen/eu/scape_project/ui/contentassist/antlr/internal/InternalSimulator.g:226:1: RULE_ID
            {
             before(grammarAccess.getSimulationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Simulation__NameAssignment_2384); 
             after(grammarAccess.getSimulationAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Simulation__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSimulation_in_entryRuleSimulation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimulation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__0_in_ruleSimulation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__0__Impl_in_rule__Simulation__Group__0128 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Simulation__Group__1_in_rule__Simulation__Group__0131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Simulation__Group__0__Impl159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__1__Impl_in_rule__Simulation__Group__1190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Simulation__Group__2_in_rule__Simulation__Group__1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Simulation__Group__1__Impl221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__2__Impl_in_rule__Simulation__Group__2252 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Simulation__Group__3_in_rule__Simulation__Group__2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__NameAssignment_2_in_rule__Simulation__Group__2__Impl282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Simulation__Group__3__Impl_in_rule__Simulation__Group__3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Simulation__Group__3__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Simulation__NameAssignment_2384 = new BitSet(new long[]{0x0000000000000002L});

}