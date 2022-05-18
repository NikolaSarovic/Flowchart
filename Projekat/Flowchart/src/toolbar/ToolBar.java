package toolbar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	public ToolBar() {
		
		JButton btnNew = new JButton("New", new ImageIcon("icons/application_add.png"));
		btnNew.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "New");
		 } 
		} );
		add(btnNew);
		
		JButton btnOpen = new JButton("Open", new ImageIcon("icons/folder-open.png"));
		btnOpen.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Open");
		 } 
		} );
		add(btnOpen);
		
		addSeparator();
		
		JButton btnSave = new JButton(new ImageIcon("icons/disk-black.png"));
		btnSave.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Save");
		 } 
		} );
		add(btnSave);
		
		JButton btnSaveAs = new JButton(new ImageIcon("icons/disks-black.png"));
		btnSaveAs.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Save As");
		 } 
		} );
		add(btnSaveAs);
		
		addSeparator();
		
		JButton btnUndo = new JButton(new ImageIcon("icons/arrow-curve-180-left.png"));
		btnUndo.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Undo");
		 } 
		} );
		add(btnUndo);
		
		JButton btnRedo = new JButton(new ImageIcon("icons/arrow-curve.png"));
		btnRedo.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Redo");
		 } 
		} );
		add(btnRedo);
		
		addSeparator();
		
		JButton btnCut = new JButton(new ImageIcon("icons/scissors.png"));
		btnCut.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Cut");
		 } 
		} );
		add(btnCut);
		
		JButton btnCopy = new JButton(new ImageIcon("icons/document-copy.png"));
		btnCopy.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Copy");
		 } 
		} );
		add(btnCopy);
		
		JButton btnPaste = new JButton(new ImageIcon("icons/clipboard-paste.png"));
		btnPaste.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Paste");
		 } 
		} );
		add(btnPaste);
		
		setFloatable(true);
		
	}

}
