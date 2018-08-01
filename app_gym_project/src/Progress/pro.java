/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Progress;

import Logging_Forget_Pass.Logging;

/**
 *
 * @author Buwaneka
 */
public class pro {

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            ////////////////////////////////////////////////////////////////////////// 
            Splash object_frame = new Splash();
            object_frame.setVisible(true);

            ////////////////////////////////////////////////////////////////////// 
        } catch (ClassNotFoundException ex) {
            ///java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(Select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public static void Exite() {
        
        Logging_Forget_Pass.Logging L = new Logging();
        L.setVisible(true);
        Splash object_frame = new Splash();
        object_frame.setVisible(false);

    }

}
