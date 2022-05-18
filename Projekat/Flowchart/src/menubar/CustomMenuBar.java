package menubar;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import actionlisteners.MenuHelpActionListener;
import actionlisteners.PopUpActionListener;

public class CustomMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	public CustomMenuBar() {
		JMenu menuFile = new JMenu("File");
		menuFile.setMnemonic(KeyEvent.VK_F);
		initMenuFile(menuFile);
		add(menuFile);
		
		JMenu menuEdit = new JMenu("Edit");
		menuEdit.setMnemonic(KeyEvent.VK_E);
		initMenuEdit(menuEdit);
		add(menuEdit);
		
		JMenu menuInsert = new JMenu("Insert");
		menuInsert.setMnemonic(KeyEvent.VK_I);
		initMenuInsert(menuInsert);
		add(menuInsert);
		
		
		JMenu menuHelp = new JMenu("Help");
		menuHelp.setMnemonic(KeyEvent.VK_H);
		initMenuHelp(menuHelp);
		add(menuHelp);
		
		add(Box.createHorizontalGlue());
		JButton helpButton = new JButton(new ImageIcon("icons/question-frame.png"));
		helpButton.setPreferredSize(new Dimension(20, 20));
		helpButton.setMinimumSize(new Dimension(20, 20));
		helpButton.setMaximumSize(new Dimension(20, 20));
		helpButton.setActionCommand("showDialog");
		helpButton.addActionListener(new MenuHelpActionListener());
		
		add(helpButton);
		add(Box.createRigidArea(new Dimension(12, 5)));
		
	}
	public void initMenuInsert(JMenu menuInsert) {
		
		JMenuItem startEnd = new JMenuItem("Start");
		startEnd.setIcon(new ImageIcon("icons/start3.png"));
		startEnd.addActionListener(new PopUpActionListener());
		menuInsert.add(startEnd);
		
		JMenuItem actionProcess = new JMenuItem("Action or Process");
		actionProcess.setIcon(new ImageIcon("icons/action.png"));
		actionProcess.addActionListener(new PopUpActionListener());
		menuInsert.add(actionProcess);
		
		JMenuItem decision = new JMenuItem("Decision");
		decision.setIcon(new ImageIcon("icons/decision.png"));
		decision.addActionListener(new PopUpActionListener());
		menuInsert.add(decision);
		
		JMenuItem input = new JMenuItem("Input/Output");
		input.setIcon(new ImageIcon("icons/input-output.png"));
		input.addActionListener(new PopUpActionListener());
		menuInsert.add(input);
		
		JMenuItem arrow = new JMenuItem("Arrow");
		arrow.setIcon(new ImageIcon("icons/arrow.png"));
		arrow.addActionListener(new PopUpActionListener());
		menuInsert.add(arrow);
		
	}
	
	public void initMenuFile(JMenu menuFile) {
		JMenuItem newMenuItem = new JMenuItem("New");
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		newMenuItem.setIcon(new ImageIcon("icons/application_add.png"));
		newMenuItem.setActionCommand("New");
		newMenuItem.addActionListener(new PopUpActionListener());
		menuFile.add(newMenuItem);
		
		JMenuItem openMenuItem = new JMenuItem("Open");
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
		openMenuItem.setIcon(new ImageIcon("icons/folder-open.png"));
		openMenuItem.setActionCommand("Open");
		openMenuItem.addActionListener(new PopUpActionListener());
		menuFile.add(openMenuItem);
		
		JMenuItem saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		saveMenuItem.setIcon(new ImageIcon("icons/disk-black.png"));
		saveMenuItem.setActionCommand("Save");
		saveMenuItem.addActionListener(new PopUpActionListener());
		menuFile.add(saveMenuItem);
		
		JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
		saveAsMenuItem.setMnemonic(KeyEvent.VK_A);
		saveAsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK+KeyEvent.SHIFT_MASK));
		saveAsMenuItem.setIcon(new ImageIcon("icons/disks-black.png"));
		saveAsMenuItem.setActionCommand("Save As");
		saveAsMenuItem.addActionListener(new PopUpActionListener());
		menuFile.add(saveAsMenuItem);
		
		JMenuItem renameMenuItem = new JMenuItem("Rename");
		renameMenuItem.setMnemonic(KeyEvent.VK_A);
		renameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_MASK+KeyEvent.SHIFT_MASK));
		renameMenuItem.setIcon(new ImageIcon("icons/application_edit.png"));
		renameMenuItem.setActionCommand("Rename");
		renameMenuItem.addActionListener(new PopUpActionListener());
		menuFile.add(renameMenuItem);
		
		menuFile.addSeparator();
		
		JMenuItem importMenuItem = new JMenuItem("Import...");
		importMenuItem.setMnemonic(KeyEvent.VK_A);
		importMenuItem.setIcon(new ImageIcon("icons/import (1).png"));
		importMenuItem.setActionCommand("Import");
		importMenuItem.addActionListener(new PopUpActionListener());
		menuFile.add(importMenuItem);
		
		JMenuItem exportMenuItem = new JMenuItem("Export...");
		exportMenuItem.setMnemonic(KeyEvent.VK_A);
		exportMenuItem.setIcon(new ImageIcon("icons/share.png"));
		exportMenuItem.setActionCommand("Export");
		exportMenuItem.addActionListener(new PopUpActionListener());
		menuFile.add(exportMenuItem);
		
		
		menuFile.addSeparator();
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setMnemonic(KeyEvent.VK_E);
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_MASK));
		exitMenuItem.addActionListener(new ActionListener(){  
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}  
			});  		
		menuFile.add(exitMenuItem);
	}

	public void initMenuEdit(JMenu menuEdit) {
		JMenuItem undoMenuItem = new JMenuItem("Undo");
		undoMenuItem.setMnemonic(KeyEvent.VK_U);
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
		undoMenuItem.setIcon(new ImageIcon("icons/arrow-curve-180-left.png"));
		undoMenuItem.setActionCommand("Undo");
		undoMenuItem.addActionListener(new PopUpActionListener());
		menuEdit.add(undoMenuItem);
		
		JMenuItem redoMenuItem = new JMenuItem("Redo");
		redoMenuItem.setMnemonic(KeyEvent.VK_R);
		redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
		redoMenuItem.setIcon(new ImageIcon("icons/arrow-curve.png"));
		redoMenuItem.setActionCommand("Redo");
		redoMenuItem.addActionListener(new PopUpActionListener());
		menuEdit.add(redoMenuItem);
		
		menuEdit.addSeparator();
		
		JMenuItem cutMenuItem = new JMenuItem("Cut");
		cutMenuItem.setMnemonic(KeyEvent.VK_C);
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		cutMenuItem.setIcon(new ImageIcon("icons/scissors-blue.png"));
		cutMenuItem.setActionCommand("Cut");
		cutMenuItem.addActionListener(new PopUpActionListener());
		menuEdit.add(cutMenuItem);
		
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		copyMenuItem.setMnemonic(KeyEvent.VK_O);
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		copyMenuItem.setIcon(new ImageIcon("icons/document-copy.png"));
		copyMenuItem.setActionCommand("Copy");
		copyMenuItem.addActionListener(new PopUpActionListener());
		menuEdit.add(copyMenuItem);
		
		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		pasteMenuItem.setMnemonic(KeyEvent.VK_P);
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		pasteMenuItem.setIcon(new ImageIcon("icons/clipboard-paste.png"));
		pasteMenuItem.setActionCommand("Paste");
		pasteMenuItem.addActionListener(new PopUpActionListener());
		menuEdit.add(pasteMenuItem);
		
		menuEdit.addSeparator();
		
		JMenuItem deleteMenuItem = new JMenuItem("Delete");
		deleteMenuItem.setMnemonic(KeyEvent.VK_DELETE);
		deleteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, KeyEvent.CTRL_MASK));
		deleteMenuItem.setIcon(new ImageIcon("icons/DelIcon.png"));
		deleteMenuItem.setActionCommand("Delete");
		deleteMenuItem.addActionListener(new PopUpActionListener());
		menuEdit.add(deleteMenuItem);
		
		JMenuItem selectAllMenuItem = new JMenuItem("Select All");
		selectAllMenuItem.setMnemonic(KeyEvent.VK_A);
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
		selectAllMenuItem.setActionCommand("Select All");
		selectAllMenuItem.addActionListener(new PopUpActionListener());
		menuEdit.add(selectAllMenuItem);
		
		menuEdit.addSeparator();
		
		JMenu zoomMenu = new JMenu("Zoom");
		menuEdit.add(zoomMenu);
		
		JMenuItem magnifier = new JMenuItem("Magnifier");
		magnifier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, KeyEvent.CTRL_MASK));
		magnifier.setIcon(new ImageIcon("icons/magnifier.png"));
		magnifier.setActionCommand("Magnifier");
		magnifier.addActionListener(new PopUpActionListener());
		zoomMenu.add(magnifier);
		
		JMenuItem zoomIn = new JMenuItem("Zoom In");
		zoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, KeyEvent.CTRL_MASK));
		zoomIn.setIcon(new ImageIcon("icons/magnifier-zoom-in.png"));
		zoomIn.setActionCommand("Zoom In");
		zoomIn.addActionListener(new PopUpActionListener());
		zoomMenu.add(zoomIn);
		
		JMenuItem zoomOut = new JMenuItem("Zoom Out");
		zoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, KeyEvent.CTRL_MASK));
		zoomOut.setIcon(new ImageIcon("icons/magnifier-zoom-out.png"));
		zoomOut.setActionCommand("Zoom Out");
		zoomOut.addActionListener(new PopUpActionListener());
		zoomMenu.add(zoomOut);		
	}

	public void initMenuHelp(JMenu menuHelp) {
		JMenuItem showHelpMenuItem = new JMenuItem("Show help");
		showHelpMenuItem.setMnemonic(KeyEvent.VK_S);
		showHelpMenuItem.setAccelerator(KeyStroke.getKeyStroke("F1"));
		showHelpMenuItem.setIcon(new ImageIcon("icons/question-frame.png"));
		showHelpMenuItem.setActionCommand("showDialog");
		showHelpMenuItem.addActionListener(new MenuHelpActionListener());
		menuHelp.add(showHelpMenuItem);
		
		menuHelp.addSeparator();
		
		JMenu langMenu = new JMenu("Language");
		menuHelp.add(langMenu);
		
		JMenuItem engLang = new JMenuItem("Engleski(SAD)");
		engLang.setIcon(new ImageIcon("icons/USAFlagIcon.png"));
		langMenu.add(engLang);
		
		JMenuItem gerLang = new JMenuItem("Njemački");
		gerLang.setIcon(new ImageIcon("icons/GermanyFlagIcon.png"));
		langMenu.add(gerLang);
		
		JMenuItem serbLang = new JMenuItem("Srpski");
		serbLang.setIcon(new ImageIcon("icons/SerbiaFlagIcon.png"));
		langMenu.add(serbLang);
		
		menuHelp.addSeparator();
		
		JMenuItem aboutHelpMenuItem = new JMenuItem("About");
		menuHelp.add(aboutHelpMenuItem);
	}
		
}
