package actionlisteners;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import menubar.CustomMenuBar;

public class MenuHelpActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch (arg0.getActionCommand()) {
		case "showDialog":
			JFrame frame = null;
			if(arg0.getSource() instanceof JButton)
			{
				CustomMenuBar customMenuBar = (CustomMenuBar) ((JButton)arg0.getSource()).getParent();
				frame = (JFrame) SwingUtilities.getWindowAncestor(customMenuBar);
			}
			if(arg0.getSource() instanceof JMenuItem)
			{
				frame = (JFrame) SwingUtilities.getWindowAncestor((JMenuItem)arg0.getSource());
			}
			JDialog dialog = new JDialog(frame, "Help", true);
			dialog.setLocationRelativeTo(frame);
			dialog.setSize(500,300);
			ImageIcon img = new ImageIcon("icons/question-frame.png");
			dialog.setIconImage(img.getImage());
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension dim = tk.getScreenSize();
			dialog.setLocation(dim.width/2-250, dim.height/2-150);
			dialog.setVisible(true);
			break;
		}

	}

}
