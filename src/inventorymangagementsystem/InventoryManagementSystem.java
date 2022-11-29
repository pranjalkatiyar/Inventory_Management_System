
package inventorymangagementsystem;

import com.inventory.ui.LoginDialog;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class InventoryManagementSystem {
    public InventoryManagementSystem(int a){
      }

    public static void main(String[] args) {
     //   f.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("/images/addPeople.png")));  
            try{
                Properties p=new Properties();
                p.put("logoString","IMS");
                HiFiLookAndFeel.setCurrentTheme(p);
                //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");  
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");  
            }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
             System.out.println("ims");
                e.printStackTrace();
            }
        

        LoginDialog ld=new LoginDialog();
        ld.setLocationRelativeTo(null);
        ld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ld.setVisible(true);
        }
    
}
