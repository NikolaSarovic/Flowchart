package tree.listeners;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import model.Diagram;

public class CustomTreeSelectionListener implements TreeSelectionListener {

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		System.out.println(arg0.getPath().getParentPath()+" - "+ arg0.getPath().getLastPathComponent().toString());
		
		DefaultMutableTreeNode selectedNode=(DefaultMutableTreeNode) arg0.getPath().getLastPathComponent();
		
		if(selectedNode.getUserObject() instanceof Diagram)
		{
			Diagram diagram=(Diagram) selectedNode.getUserObject();
			System.out.println(diagram.getNaziv());
			
		}
		System.out.println();
		

	}

}
