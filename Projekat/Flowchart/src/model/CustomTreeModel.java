package model;

import javax.swing.tree.DefaultMutableTreeNode;

public class CustomTreeModel extends DefaultMutableTreeNode {

	private static final long serialVersionUID = 1L;
	
	public CustomTreeModel()
	{
		super("Projekat");
		
		
		DefaultMutableTreeNode las=new DefaultMutableTreeNode("Linijska algoritamska šema");
		add(las);
		
		DefaultMutableTreeNode ispis=new DefaultMutableTreeNode("Ispis");
		las.add(ispis);
		
		DefaultMutableTreeNode rs=new DefaultMutableTreeNode("Razgranata struktura");
		add(rs);
		DefaultMutableTreeNode ifthen=new DefaultMutableTreeNode("IF THEN");
		rs.add(ifthen);
		DefaultMutableTreeNode cs=new DefaultMutableTreeNode("Ciklična struktura");
		add(cs);
		
		Diagram diagram1=new Diagram("Algoritam1");
		
		ispis.add(new DiagramNode(diagram1));
		
		
	}

}
