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
public class control_menu {
    private final vista_menu vista;

    public control_menu(vista_menu vista) {
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.getBtn_regresar().addActionListener(e->regresar());
        vista.getBtn_autos().addActionListener(e->autos());
    }
    private void regresar(){
        vista.setVisible(false);
        vista_inicio vistainicio =new vista_inicio();
        control_inicio coninicio=new control_inicio(vistainicio);
        
    }
    public void autos(){
        vista_autos visautos= new vista_autos();
        control_autos controlautos=new control_autos(visautos);
        vista.dispose();
    }
    
}
