package model;

import javax.swing.tree.DefaultMutableTreeNode;

public class DiagramNode extends DefaultMutableTreeNode {

	private static final long serialVersionUID = 1L;

	public DiagramNode(Diagram diagram)
	{
		super(diagram);
		
		DefaultMutableTreeNode drawio=new DefaultMutableTreeNode(diagram.getNaziv()+".drawio");
		add(drawio);
		
		DefaultMutableTreeNode png=new DefaultMutableTreeNode(diagram.getNaziv()+".png");
		add(png);
		
		DefaultMutableTreeNode jpg=new DefaultMutableTreeNode(diagram.getNaziv()+".jpg");
		add(jpg);
		
	}

}
