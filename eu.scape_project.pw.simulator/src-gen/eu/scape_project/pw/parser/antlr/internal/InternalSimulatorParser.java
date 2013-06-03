package eu.scape_project.pw.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.scape_project.pw.services.SimulatorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimulatorParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g"; }



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
    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:67:1: entryRuleSimulation returns [EObject current=null] : iv_ruleSimulation= ruleSimulation EOF ;
    public final EObject entryRuleSimulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulation = null;


        try {
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:68:2: (iv_ruleSimulation= ruleSimulation EOF )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:69:2: iv_ruleSimulation= ruleSimulation EOF
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
    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:76:1: ruleSimulation returns [EObject current=null] : (otherlv_0= 'Simulation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) ;
    public final EObject ruleSimulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_events_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:79:28: ( (otherlv_0= 'Simulation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:80:1: (otherlv_0= 'Simulation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            {
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:80:1: (otherlv_0= 'Simulation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:80:3: otherlv_0= 'Simulation' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSimulation122); 

                	newLeafNode(otherlv_0, grammarAccess.getSimulationAccess().getSimulationKeyword_0());
                
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:84:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:85:1: (lv_name_1_0= RULE_STRING )
            {
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:85:1: (lv_name_1_0= RULE_STRING )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:86:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimulation139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSimulationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimulationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSimulation156); 

                	newLeafNode(otherlv_2, grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:106:1: ( (lv_events_3_0= ruleEvent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:107:1: (lv_events_3_0= ruleEvent )
            	    {
            	    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:107:1: (lv_events_3_0= ruleEvent )
            	    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:108:3: lv_events_3_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimulationAccess().getEventsEventParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleSimulation177);
            	    lv_events_3_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimulationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_3_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSimulation190); 

                	newLeafNode(otherlv_4, grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleEvent"
    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:136:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:137:2: (iv_ruleEvent= ruleEvent EOF )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:138:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent226);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent236); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:145:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'schedules =>' ( (lv_events_4_0= ruleEvent ) )+ )? otherlv_5= '}' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_events_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:148:28: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'schedules =>' ( (lv_events_4_0= ruleEvent ) )+ )? otherlv_5= '}' ) )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:149:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'schedules =>' ( (lv_events_4_0= ruleEvent ) )+ )? otherlv_5= '}' )
            {
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:149:1: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'schedules =>' ( (lv_events_4_0= ruleEvent ) )+ )? otherlv_5= '}' )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:149:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' (otherlv_3= 'schedules =>' ( (lv_events_4_0= ruleEvent ) )+ )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEvent273); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
                
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:153:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:154:1: (lv_name_1_0= RULE_STRING )
            {
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:154:1: (lv_name_1_0= RULE_STRING )
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:155:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEvent307); 

                	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
                
            // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:175:1: (otherlv_3= 'schedules =>' ( (lv_events_4_0= ruleEvent ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:175:3: otherlv_3= 'schedules =>' ( (lv_events_4_0= ruleEvent ) )+
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEvent320); 

                        	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getSchedulesKeyword_3_0());
                        
                    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:179:1: ( (lv_events_4_0= ruleEvent ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:180:1: (lv_events_4_0= ruleEvent )
                    	    {
                    	    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:180:1: (lv_events_4_0= ruleEvent )
                    	    // ../eu.scape_project.pw.simulator/src-gen/eu/scape_project/pw/parser/antlr/internal/InternalSimulator.g:181:3: lv_events_4_0= ruleEvent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEventAccess().getEventsEventParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvent_in_ruleEvent341);
                    	    lv_events_4_0=ruleEvent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"events",
                    	            		lv_events_4_0, 
                    	            		"Event");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEvent356); 

                	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEvent"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSimulation_in_entryRuleSimulation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimulation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSimulation122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimulation139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSimulation156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleSimulation177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSimulation190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEvent273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEvent307 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleEvent320 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEvent341 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleEvent356 = new BitSet(new long[]{0x0000000000000002L});

}