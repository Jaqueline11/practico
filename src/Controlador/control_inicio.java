/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.*;
/**
 *
 * @author Myrian
 */
public class control_inicio {
    private final vista_inicio vista;
    
    public control_inicio(vista_inicio vista) {
        this.vista=vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.getBtn_guardar().addActionListener(e->guardar());
    }
    private void guardar(){
        vista.getTxt_usuario().setText("Myrian");
        vista_menu vistamenu=new vista_menu();
        control_menu conmenu=new control_menu(vistamenu);
        vista.setVisible(false);
    }
    
}
