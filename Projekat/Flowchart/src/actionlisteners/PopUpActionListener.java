package actionlisteners;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import helpers.HelperClass;

public class PopUpActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Component invoker = HelperClass.getMenuRootComponent(e.getSource());

		System.out.println();

		System.out.println(SwingUtilities.getRoot(invoker));
		System.out.println(SwingUtilities.getRootPane(invoker));
		System.out.println(SwingUtilities.getWindowAncestor(invoker));
		System.out.println(SwingUtilities.windowForComponent(invoker));
		System.out.println(SwingUtilities.getAncestorOfClass(JFrame.class, invoker));
		
		JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(invoker), 
				"Izvrsena je akcija: \"" + e.getActionCommand() + "\"", 
				"Akcija", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
