/*
* generated by Xtext
*/
grammar InternalSimulator;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package eu.scape_project.pw.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleSimulation
entryRuleSimulation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSimulationRule()); }
	 iv_ruleSimulation=ruleSimulation 
	 { $current=$iv_ruleSimulation.current; } 
	 EOF 
;

// Rule Simulation
ruleSimulation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Simulation' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSimulationAccess().getSimulationKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSimulationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSimulationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='events:' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSimulationAccess().getEventsKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSimulationAccess().getEventsEventParserRuleCall_4_0()); 
	    }
		lv_events_4_0=ruleEvent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimulationRule());
	        }
       		add(
       			$current, 
       			"events",
        		lv_events_4_0, 
        		"Event");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5='scheduling:' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSimulationAccess().getSchedulingKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSimulationAccess().getSchedulingSchedulingParserRuleCall_6_0()); 
	    }
		lv_scheduling_6_0=ruleScheduling		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSimulationRule());
	        }
       		add(
       			$current, 
       			"scheduling",
        		lv_scheduling_6_0, 
        		"Scheduling");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	 iv_ruleEvent=ruleEvent 
	 { $current=$iv_ruleEvent.current; } 
	 EOF 
;

// Rule Event
ruleEvent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Event' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleScheduling
entryRuleScheduling returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSchedulingRule()); }
	 iv_ruleScheduling=ruleScheduling 
	 { $current=$iv_ruleScheduling.current; } 
	 EOF 
;

// Rule Scheduling
ruleScheduling returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSchedulingAccess().getEventSchedulingParserRuleCall_0()); 
    }
    this_EventScheduling_0=ruleEventScheduling
    { 
        $current = $this_EventScheduling_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSchedulingAccess().getConditionalSchedulingParserRuleCall_1()); 
    }
    this_ConditionalScheduling_1=ruleConditionalScheduling
    { 
        $current = $this_ConditionalScheduling_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEventScheduling
entryRuleEventScheduling returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventSchedulingRule()); }
	 iv_ruleEventScheduling=ruleEventScheduling 
	 { $current=$iv_ruleEventScheduling.current; } 
	 EOF 
;

// Rule EventScheduling
ruleEventScheduling returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='schedule ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEventSchedulingAccess().getScheduleKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventSchedulingRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getEventSchedulingAccess().getScheduleEventCrossReference_1_0()); 
	}

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEventSchedulingAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='start' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEventSchedulingAccess().getStartKeyword_3_0());
    }
	otherlv_4='=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEventSchedulingAccess().getEqualsSignKeyword_3_1());
    }
(
(
		lv_start_5_0=RULE_INT
		{
			newLeafNode(lv_start_5_0, grammarAccess.getEventSchedulingAccess().getStartINTTerminalRuleCall_3_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventSchedulingRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"start",
        		lv_start_5_0, 
        		"INT");
	    }

)
)	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEventSchedulingAccess().getSemicolonKeyword_3_3());
    }
)?(	otherlv_7='end' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEventSchedulingAccess().getEndKeyword_4_0());
    }
	otherlv_8='=' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getEventSchedulingAccess().getEqualsSignKeyword_4_1());
    }
(
(
		lv_end_9_0=RULE_INT
		{
			newLeafNode(lv_end_9_0, grammarAccess.getEventSchedulingAccess().getEndINTTerminalRuleCall_4_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventSchedulingRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"end",
        		lv_end_9_0, 
        		"INT");
	    }

)
)	otherlv_10=';' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getEventSchedulingAccess().getSemicolonKeyword_4_3());
    }
)?(	otherlv_11='repeat' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getEventSchedulingAccess().getRepeatKeyword_5_0());
    }
	otherlv_12='=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getEventSchedulingAccess().getEqualsSignKeyword_5_1());
    }
(
(
		lv_repeat_13_0=RULE_INT
		{
			newLeafNode(lv_repeat_13_0, grammarAccess.getEventSchedulingAccess().getRepeatINTTerminalRuleCall_5_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventSchedulingRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"repeat",
        		lv_repeat_13_0, 
        		"INT");
	    }

)
)	otherlv_14=';' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getEventSchedulingAccess().getSemicolonKeyword_5_3());
    }
)?(	otherlv_15='every' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getEventSchedulingAccess().getEveryKeyword_6_0());
    }
	otherlv_16='=' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getEventSchedulingAccess().getEqualsSignKeyword_6_1());
    }
(
(
		lv_every_17_0=RULE_INT
		{
			newLeafNode(lv_every_17_0, grammarAccess.getEventSchedulingAccess().getEveryINTTerminalRuleCall_6_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventSchedulingRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"every",
        		lv_every_17_0, 
        		"INT");
	    }

)
)	otherlv_18=';' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getEventSchedulingAccess().getSemicolonKeyword_6_3());
    }
)?	otherlv_19='}' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getEventSchedulingAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleConditionalScheduling
entryRuleConditionalScheduling returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConditionalSchedulingRule()); }
	 iv_ruleConditionalScheduling=ruleConditionalScheduling 
	 { $current=$iv_ruleConditionalScheduling.current; } 
	 EOF 
;

// Rule ConditionalScheduling
ruleConditionalScheduling returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionalSchedulingRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getConditionalSchedulingAccess().getObservesEventCrossReference_0_0()); 
	}

)
)	otherlv_1='=>' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConditionalSchedulingAccess().getEqualsSignGreaterThanSignKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionalSchedulingRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getConditionalSchedulingAccess().getScheduleEventCrossReference_2_0()); 
	}

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConditionalSchedulingAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='delay' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getConditionalSchedulingAccess().getDelayKeyword_4_0());
    }
	otherlv_5='=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getConditionalSchedulingAccess().getEqualsSignKeyword_4_1());
    }
(
(
		lv_delay_6_0=RULE_INT
		{
			newLeafNode(lv_delay_6_0, grammarAccess.getConditionalSchedulingAccess().getDelayINTTerminalRuleCall_4_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConditionalSchedulingRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"delay",
        		lv_delay_6_0, 
        		"INT");
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getConditionalSchedulingAccess().getSemicolonKeyword_4_3());
    }
)?	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getConditionalSchedulingAccess().getRightCurlyBracketKeyword_5());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


