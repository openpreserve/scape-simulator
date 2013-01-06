package eu.scape_project.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.scape_project.services.SimulatorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimulatorParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g"; }



     	private SimulatorGrammarAccess grammarAccess;
     	
        public InternalSimulatorParser(TokenStream input, SimulatorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Simulation";	
       	}
       	
       	@Override
       	protected SimulatorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSimulation"
    // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:67:1: entryRuleSimulation returns [EObject current=null] : iv_ruleSimulation= ruleSimulation EOF ;
    public final EObject entryRuleSimulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulation = null;


        try {
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:68:2: (iv_ruleSimulation= ruleSimulation EOF )
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:69:2: iv_ruleSimulation= ruleSimulation EOF
            {
             newCompositeNode(grammarAccess.getSimulationRule()); 
            pushFollow(FOLLOW_ruleSimulation_in_entryRuleSimulation75);
            iv_ruleSimulation=ruleSimulation();

            state._fsp--;

             current =iv_ruleSimulation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimulation85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulation"


    // $ANTLR start "ruleSimulation"
    // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:76:1: ruleSimulation returns [EObject current=null] : (otherlv_0= 'Simulation { ' otherlv_1= 'name=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) ;
    public final EObject ruleSimulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:79:28: ( (otherlv_0= 'Simulation { ' otherlv_1= 'name=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' ) )
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:80:1: (otherlv_0= 'Simulation { ' otherlv_1= 'name=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            {
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:80:1: (otherlv_0= 'Simulation { ' otherlv_1= 'name=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}' )
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:80:3: otherlv_0= 'Simulation { ' otherlv_1= 'name=' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSimulation122); 

                	newLeafNode(otherlv_0, grammarAccess.getSimulationAccess().getSimulationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSimulation134); 

                	newLeafNode(otherlv_1, grammarAccess.getSimulationAccess().getNameKeyword_1());
                
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:88:1: ( (lv_name_2_0= RULE_ID ) )
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:89:1: (lv_name_2_0= RULE_ID )
            {
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:89:1: (lv_name_2_0= RULE_ID )
            // ../eu.scape_project.simulator/src-gen/eu/scape_project/parser/antlr/internal/InternalSimulator.g:90:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimulation151); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSimulationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimulationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSimulation168); 

                	newLeafNode(otherlv_3, grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimulation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSimulation_in_entryRuleSimulation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimulation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSimulation122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimulation134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimulation151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSimulation168 = new BitSet(new long[]{0x0000000000000002L});

}