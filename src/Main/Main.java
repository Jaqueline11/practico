/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Controlador.*;
import Vista.*;
/**
 *
 * @author Myrian
 */
public class Main {
    public static void main(String[] args) {  
        vista_inicio vista =new vista_inicio();
        control_inicio inicio =new control_inicio(vista);
    }    
}
