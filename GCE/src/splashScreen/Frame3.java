package splashScreen;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Frame3 {
	public static void main(String[] args) {
		 Runnable run = new Runnable()
         {
              public void run()
              {
                  new ComboBoxWindow();
              }
         };  
         SwingUtilities.invokeLater(run);
        JOptionPane.showMessageDialog(null,"You are here!");
    }  
}
