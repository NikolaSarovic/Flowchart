package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Symbols extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Symbols() {
		
		
	  //  FlowLayout flowLayout = new FlowLayout(FlowLayout.TRAILING, 5, 3);
		setLayout(new FlowLayout());
		Dimension dim=new Dimension(205,30);
		setPreferredSize(dim);
		Color color =new Color(245,245,245);
		setBackground(color);
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(240, 240, 240)), BorderFactory.createLineBorder(Color.gray)));
		JLabel label = new JLabel("Symbols");
		Font font = new Font("Prismatic", Font.BOLD,14);
		label.setFont(font);
		add(label);
		JLabel label2 = new JLabel("___________________________");
		add(label2);
		setVisible(true);
	
		JButton btn1 = new JButton(new ImageIcon("icons/start3.png"));  
		btn1.setBorderPainted(false);
		btn1.setBackground(new Color(245,245,245));
		btn1.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Start/End Symbol\n The terminator symbol marks the starting or ending point of the system. \n It usually contains the word \"Start\" or \"End.\"");
		 } 
		} );
		add(btn1);
		
		JButton btn2 = new JButton(new ImageIcon("icons/action.png"));  
		btn2.setBackground(new Color(245,245,245));
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Action or Process Symbol\n A box can represent a single step (\"add two cups of flour\"), \n or and entire sub-process (\"make bread\") within a larger process.  ");
		 } 
		} );
		add(btn2);
		
		JButton btn3 = new JButton(new ImageIcon("icons/Documenti.png"));  
		btn3.setBackground(new Color(245,245,245));
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Document Symbol \n A printed document or report.");
		 } 
		} );
		add(btn3);
		
		JButton btn4 = new JButton(new ImageIcon("icons/multiple-document.png"));  
		btn4.setBackground(new Color(245,245,245));
		btn4.setBorderPainted(false);
		btn4.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Multiple Documents Symbol\n Represents multiple documents in the process");
		 } 
		} );
		add(btn4);
		
		JButton btn5 = new JButton(new ImageIcon("icons/decision.png"));  
		btn5.setBackground(new Color(245,245,245));
		btn5.setBorderPainted(false);
		btn5.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Decision Symbol\r\n" + 
						"A decision or branching point. Lines representing different decisions emerge from different points of the diamond.");
		 } 
		} );
		add(btn5);
		
		JButton btn6 = new JButton(new ImageIcon("icons/input-output.png"));  
		btn6.setBackground(new Color(245,245,245));
		btn6.setBorderPainted(false);
		btn6.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Input/Output Symbol\r\n" + 
						"Represents material or information entering or leaving the system, such as customer order (input) or a product (output).");
		 } 
		} );
		add(btn6);
		
		JButton btn7 = new JButton(new ImageIcon("icons/manual-input.png"));  
		btn7.setBackground(new Color(245,245,245));
		btn7.setBorderPainted(false);
		btn7.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Manual Input Symbol\r\n" + 
						"Represents a step where a user is prompted to enter information manually.");
		 } 
		} );
		add(btn7);
		
		JButton btn8 = new JButton(new ImageIcon("icons/preparation.png"));  
		btn8.setBackground(new Color(245,245,245));
		btn8.setBorderPainted(false);
		btn8.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Preparation Symbol\r\n" + 
						"Represents a set-up to another step in the process.");} 
		} );
		add(btn8);
		
		JButton btn9 = new JButton(new ImageIcon("icons/connector.png"));  
		btn9.setBackground(new Color(245,245,245));
		btn9.setBorderPainted(false);
		btn9.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Connector Symbol\r\n" + 
						"Indicates that the flow continues where a matching symbol (containing the same letter) has been placed.");} 
		} );
		add(btn9);
		
		JButton btn10 = new JButton(new ImageIcon("icons/or.png"));  
		btn10.setBackground(new Color(245,245,245));
		btn10.setBorderPainted(false);
		btn10.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Or Symbol\r\n" + 
						"Indicates that the process flow continues in more than two branches.");} 
		} );
		add(btn10);
		
		JButton btn11 = new JButton(new ImageIcon("icons/summoning-junction.png"));  
		btn11.setBackground(new Color(245,245,245));
		btn11.setBorderPainted(false);
		btn11.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Summoning Junction Symbol\r\n" + 
						"Indicates a point in the flowchart where multiple branches converge back into a single process.");} 
		} );
		add(btn11);
		
		JButton btn12 = new JButton(new ImageIcon("icons/merge.png"));  
		btn12.setBackground(new Color(245,245,245));
		btn12.setBorderPainted(false);
		btn12.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Merge Symbol\r\n" + 
						"Indicates a step where two or more sub-lists or sub-processes become one.");} 
		} );
		add(btn12);
		
		JButton btn13 = new JButton(new ImageIcon("icons/collate.png"));  
		btn13.setBackground(new Color(245,245,245));
		btn13.setBorderPainted(false);
		btn13.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Collate Symbol\r\n" + 
						"Indicates a step that orders information into a standard format.");} 
		} );
		add(btn13);
		
		JButton btn14 = new JButton(new ImageIcon("icons/sort.png"));  
		btn14.setBackground(new Color(245,245,245));
		btn14.setBorderPainted(false);
		btn14.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Sort Symbol\r\n" + 
						"Indicates a step that organizes a list of items into a sequence or sets based on some pre-determined criteria.");} 
		} );
		add(btn14);
		
		JButton btn15 = new JButton(new ImageIcon("icons/subroutine.png"));  
		btn15.setBackground(new Color(245,245,245));
		btn15.setBorderPainted(false);
		btn15.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Subroutine Symbol\r\n" + 
						"Indicates a sequence of actions that perform a specific task embedded within a larger process.\nThis sequence of actions could be described in more detail on a separate flowchart.");} 
		} );
		add(btn15);
		
		JButton btn16 = new JButton(new ImageIcon("icons/delay.png"));  
		btn16.setBackground(new Color(245,245,245));
		btn16.setBorderPainted(false);
		btn16.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Delay Symbol\r\n" + 
						"Indicates a delay in the process.");} 
		} );
		add(btn16);
		
		JButton btn17 = new JButton(new ImageIcon("icons/manual-loop.png"));  
		btn17.setBackground(new Color(245,245,245));
		btn17.setBorderPainted(false);
		btn17.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Manual Loop Symbol\r\n" + 
						"Indicates a sequence of commands that will continue to repeat until stopped manually.");} 
		} );
		add(btn17);
		
		JButton btn18 = new JButton(new ImageIcon("icons/loop-limit.png"));  
		btn18.setBackground(new Color(245,245,245));
		btn18.setBorderPainted(false);
		btn18.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Loop Limit Symbol\r\n" + 
						"Indicates the point at which a loop should stop.");} 
		} );
		add(btn18);
		
		JButton btn19 = new JButton(new ImageIcon("icons/data-storage-stored-data.png"));  
		btn19.setBackground(new Color(245,245,245));
		btn19.setBorderPainted(false);
		btn19.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Data Storage or Stored Data Symbol\r\n" + 
						"Indicates a step where data gets stored.");} 
		} );
		add(btn19);
		
		JButton btn20 = new JButton(new ImageIcon("icons/database.png"));  
		btn20.setBackground(new Color(245,245,245));
		btn20.setBorderPainted(false);
		btn20.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Database Symbol\r\n" + 
						"Indicates a list of information with a standard structure that allows for searching and sorting.");} 
		} );
		add(btn20);
		
		JButton btn21 = new JButton(new ImageIcon("icons/internal-storage.png"));  
		btn21.setBackground(new Color(245,245,245));
		btn21.setBorderPainted(false);
		btn21.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Internal Storage Symbol\r\n" + 
						"Indicates that information was stored in memory during a program,\nused in software design flowcharts.");} 
		} );
		add(btn21);
		
		JButton btn22 = new JButton(new ImageIcon("icons/display.png"));  
		btn22.setBackground(new Color(245,245,245));
		btn22.setBorderPainted(false);
		btn22.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Display Symbol\r\n" + 
						"Indicates a step that displays information.");} 
		} );
		add(btn22);
		
		JButton btn23 = new JButton(new ImageIcon("icons/off-page.png"));  
		btn23.setBackground(new Color(245,245,245));
		btn23.setBorderPainted(false);
		btn23.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Off Page\r\n" + 
						"Indicates that the process continues off page.");} 
		} );
		add(btn23);
		
		JLabel label3 = new JLabel("___________________________");
		add(label3);
		
		JLabel label4 = new JLabel("Other");
		label4.setFont(font);
		add(label4);
		
		JLabel label5 = new JLabel("___________________________");
		add(label5);
		
		JButton btn24 = new JButton(new ImageIcon("icons/typography.png"));  
		btn24.setBackground(new Color(245,245,245));
		btn24.setBorderPainted(false);
		btn24.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Text");} 
		} );
		add(btn24);
		
		JButton btn25 = new JButton(new ImageIcon("icons/paper (1).png"));  
		btn25.setBackground(new Color(245,245,245));
		btn25.setBorderPainted(false);
		btn25.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Note");} 
		} );
		add(btn25);
		
		JButton btn26 = new JButton(new ImageIcon("icons/arrow2.png"));  
		btn26.setBackground(new Color(245,245,245));
		btn26.setBorderPainted(false);
		btn26.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Arrow");} 
		} );
		add(btn26);
	}
}
