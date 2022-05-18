package tree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

import model.CustomTreeModel;
import tree.editor.CustomCellEditor;
import tree.listeners.CustomMouseListener;
import tree.listeners.CustomTreeExpansionListener;
import tree.listeners.CustomTreeSelectionListener;
import tree.renderer.CustomTreeCellRenderer;

public class TreePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	JTree stablo=null;
	public TreePanel() {
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(200, 0));
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(240, 240, 240)), BorderFactory.createLineBorder(Color.gray)));
	
		stablo=new JTree(new CustomTreeModel());
		stablo.setRootVisible(true);
		stablo.setShowsRootHandles(true);
		stablo.setCellRenderer(new CustomTreeCellRenderer());
		
		stablo.addTreeSelectionListener(new CustomTreeSelectionListener());
		stablo.addTreeExpansionListener(new CustomTreeExpansionListener());
		stablo.addMouseListener(new CustomMouseListener());
		stablo.setCellEditor(new CustomCellEditor());
		
		stablo.setEditable(true);
		JScrollPane scrollPane=new JScrollPane(stablo);
		add(scrollPane, BorderLayout.CENTER);
	}

}
