package eu.scape_project.pw.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.scape_project.pw.services.SimulatorGrammarAccess;
import eu.scape_project.pw.simulator.Event;
import eu.scape_project.pw.simulator.Simulation;
import eu.scape_project.pw.simulator.SimulatorPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class SimulatorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimulatorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SimulatorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SimulatorPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
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
	 *     (name=STRING events+=Event*)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING events+=Event*)
	 */
	protected void sequence_Simulation(EObject context, Simulation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
