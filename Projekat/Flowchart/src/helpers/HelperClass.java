package helpers;

import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class HelperClass
{
	/**
	 * Metoda prolazi kroz lanac komponenti koje sadrze {@link JMenuItem} 
	 * te vraca roditeljsku komponentu.
	 * 
	 * @param component Komponenta koja poziva akciju
	 * @return Vraca roditeljsku komponentu koja sadrzi {@link JMenu} ili {@link JPopupMenu}
	 * @author Vladimir Vujovic
	 */
	public static Component getMenuRootComponent(Object component)
	{
		JMenuItem menuItem = (JMenuItem) component;
		JPopupMenu popupMenu = (JPopupMenu) menuItem.getParent();

		if (popupMenu.getInvoker() instanceof JMenuItem)
		{
			Component invoker = popupMenu.getInvoker();

			if (invoker.getParent() instanceof JPopupMenu)
			{
				invoker = getMenuRootComponent(invoker);
			}

			return invoker;
		}
		else
		{
			return popupMenu.getInvoker();
		}
	}
}
