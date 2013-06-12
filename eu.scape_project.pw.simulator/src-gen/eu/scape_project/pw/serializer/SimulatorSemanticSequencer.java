package eu.scape_project.pw.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.scape_project.pw.services.SimulatorGrammarAccess;
import eu.scape_project.pw.simulator.ConditionalScheduling;
import eu.scape_project.pw.simulator.Entity;
import eu.scape_project.pw.simulator.Event;
import eu.scape_project.pw.simulator.EventScheduling;
import eu.scape_project.pw.simulator.Simulation;
import eu.scape_project.pw.simulator.SimulatorPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SimulatorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimulatorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SimulatorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SimulatorPackage.CONDITIONAL_SCHEDULING:
				if(context == grammarAccess.getConditionalSchedulingRule() ||
				   context == grammarAccess.getSchedulingRule()) {
					sequence_ConditionalScheduling(context, (ConditionalScheduling) semanticObject); 
					return; 
				}
				else break;
			case SimulatorPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case SimulatorPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case SimulatorPackage.EVENT_SCHEDULING:
				if(context == grammarAccess.getEventSchedulingRule() ||
				   context == grammarAccess.getSchedulingRule()) {
					sequence_EventScheduling(context, (EventScheduling) semanticObject); 
					return; 
				}
				else break;
			case SimulatorPackage.SIMULATION:
				if(context == grammarAccess.getSimulationRule()) {
					sequence_Simulation(context, (Simulation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (observes=[Event|ID] schedule=[Event|ID] delay=INT?)
	 */
	protected void sequence_ConditionalScheduling(EObject context, ConditionalScheduling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimulatorPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimulatorPackage.Literals.ENTITY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (schedule=[Event|ID] start=INT? end=INT? repeat=INT? every=INT?)
	 */
	protected void sequence_EventScheduling(EObject context, EventScheduling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING entity=[Entity|ID])
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimulatorPackage.Literals.EVENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimulatorPackage.Literals.EVENT__NAME));
			if(transientValues.isValueTransient(semanticObject, SimulatorPackage.Literals.EVENT__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimulatorPackage.Literals.EVENT__ENTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEventAccess().getEntityEntityIDTerminalRuleCall_5_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING entities+=Entity* events+=Event* scheduling+=Scheduling*)
	 */
	protected void sequence_Simulation(EObject context, Simulation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
