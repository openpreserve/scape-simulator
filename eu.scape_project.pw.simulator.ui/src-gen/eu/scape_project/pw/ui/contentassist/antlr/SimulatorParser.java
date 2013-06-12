/*
* generated by Xtext
*/
package eu.scape_project.pw.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import eu.scape_project.pw.services.SimulatorGrammarAccess;

public class SimulatorParser extends AbstractContentAssistParser {
	
	@Inject
	private SimulatorGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected eu.scape_project.pw.ui.contentassist.antlr.internal.InternalSimulatorParser createParser() {
		eu.scape_project.pw.ui.contentassist.antlr.internal.InternalSimulatorParser result = new eu.scape_project.pw.ui.contentassist.antlr.internal.InternalSimulatorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSchedulingAccess().getAlternatives(), "rule__Scheduling__Alternatives");
					put(grammarAccess.getSimulationAccess().getGroup(), "rule__Simulation__Group__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEventSchedulingAccess().getGroup(), "rule__EventScheduling__Group__0");
					put(grammarAccess.getEventSchedulingAccess().getGroup_3(), "rule__EventScheduling__Group_3__0");
					put(grammarAccess.getEventSchedulingAccess().getGroup_4(), "rule__EventScheduling__Group_4__0");
					put(grammarAccess.getEventSchedulingAccess().getGroup_5(), "rule__EventScheduling__Group_5__0");
					put(grammarAccess.getEventSchedulingAccess().getGroup_6(), "rule__EventScheduling__Group_6__0");
					put(grammarAccess.getConditionalSchedulingAccess().getGroup(), "rule__ConditionalScheduling__Group__0");
					put(grammarAccess.getConditionalSchedulingAccess().getGroup_4(), "rule__ConditionalScheduling__Group_4__0");
					put(grammarAccess.getSimulationAccess().getNameAssignment_1(), "rule__Simulation__NameAssignment_1");
					put(grammarAccess.getSimulationAccess().getEntitiesAssignment_4(), "rule__Simulation__EntitiesAssignment_4");
					put(grammarAccess.getSimulationAccess().getEventsAssignment_6(), "rule__Simulation__EventsAssignment_6");
					put(grammarAccess.getSimulationAccess().getSchedulingAssignment_8(), "rule__Simulation__SchedulingAssignment_8");
					put(grammarAccess.getEventAccess().getNameAssignment_1(), "rule__Event__NameAssignment_1");
					put(grammarAccess.getEventAccess().getEntityAssignment_5(), "rule__Event__EntityAssignment_5");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEventSchedulingAccess().getScheduleAssignment_1(), "rule__EventScheduling__ScheduleAssignment_1");
					put(grammarAccess.getEventSchedulingAccess().getStartAssignment_3_2(), "rule__EventScheduling__StartAssignment_3_2");
					put(grammarAccess.getEventSchedulingAccess().getEndAssignment_4_2(), "rule__EventScheduling__EndAssignment_4_2");
					put(grammarAccess.getEventSchedulingAccess().getRepeatAssignment_5_2(), "rule__EventScheduling__RepeatAssignment_5_2");
					put(grammarAccess.getEventSchedulingAccess().getEveryAssignment_6_2(), "rule__EventScheduling__EveryAssignment_6_2");
					put(grammarAccess.getConditionalSchedulingAccess().getObservesAssignment_0(), "rule__ConditionalScheduling__ObservesAssignment_0");
					put(grammarAccess.getConditionalSchedulingAccess().getScheduleAssignment_2(), "rule__ConditionalScheduling__ScheduleAssignment_2");
					put(grammarAccess.getConditionalSchedulingAccess().getDelayAssignment_4_2(), "rule__ConditionalScheduling__DelayAssignment_4_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			eu.scape_project.pw.ui.contentassist.antlr.internal.InternalSimulatorParser typedParser = (eu.scape_project.pw.ui.contentassist.antlr.internal.InternalSimulatorParser) parser;
			typedParser.entryRuleSimulation();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SimulatorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SimulatorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
