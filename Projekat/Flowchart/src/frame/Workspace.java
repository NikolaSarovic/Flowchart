package frame;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Workspace extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Workspace()
	{
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(240, 240, 240)), BorderFactory.createLineBorder(Color.gray)));
		Color color =new Color(254,254,254);
		setBackground(color);
	}
}
