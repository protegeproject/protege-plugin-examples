package edu.stanford.bmir.protege.examples.menu;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import org.protege.editor.owl.ui.action.ProtegeOWLAction;

public class ToolsMenu2 extends ProtegeOWLAction {

	public void initialise() throws Exception {
	}

	public void dispose() throws Exception {
	}

	public void actionPerformed(ActionEvent event) {
		StringBuilder message = new StringBuilder("This is the second example menu item under the Tools menu.\n");
		message.append("The active ontology has ");
		message.append(getOWLModelManager().getActiveOntology().getAxiomCount());
		message.append(" axioms.");
		JOptionPane.showMessageDialog(getOWLWorkspace(), message.toString());	
	}
}
