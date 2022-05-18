package frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import menubar.CustomMenuBar;
import toolbar.ToolBar;
import tree.TreePanel;

public class MainWindow extends JFrame implements WindowListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainWindow()
	{
		 try
		{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setTitle("Flowchart");
       
		ImageIcon img = new ImageIcon("icons/process.png");
		setIconImage(img.getImage());
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension dim = tk.getScreenSize();
		
		setSize(1000, 600);
		
		setLocation(dim.width/2-500, dim.height/2-300);
		
		setLayout(new BorderLayout());
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(this);
		
		getContentPane().add(new ToolBar(), BorderLayout.NORTH);
		getContentPane().add(new TreePanel(), BorderLayout.WEST);
		setJMenuBar(new CustomMenuBar());
		getContentPane().add(new Workspace(), BorderLayout.CENTER);
		getContentPane().add(new Symbols(), BorderLayout.EAST);
		
		setVisible(true);
		}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		Window frame = e.getWindow();
		Object [] options = {"Da", "Ne"};
		
		int odluka = JOptionPane.showOptionDialog(frame, "Da li želite da izađete iz programa?", "Izlaz",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		
		if (odluka == JOptionPane.YES_OPTION) 
		{
			System.exit(0);
		}
		else if (odluka == JOptionPane.NO_OPTION) {}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
