/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.*;
import Modelo.*;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.Validaciones.TxtVLetras;
import Modelo.Validaciones.TxtVNumeros;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Myrian
 */
public class control_autos {

    private final vista_autos vista;
    Auto_BD bdauto = new Auto_BD();

    public control_autos(vista_autos vista) {
        this.vista = vista;
        vista.setVisible(true);
        // vista.getLabelmodelo().setVisible(false);
        vista.getBtn_modificar().setEnabled(false);
        vista.setLocationRelativeTo(null);
        vista.getBtn_nuevo().addActionListener(e -> nuevo());
        vista.getBtn_guardar().addActionListener(e -> guardar());
        vista.getBtn_modificar().addActionListener(e -> modificar());
        vista.getBtn_eliminar().addActionListener(e -> cam_estado());
        vista.getBtn_foto().addActionListener(e -> obtieneImagen());
        vista.getBtn_eliminar1().addActionListener(e -> eliminar());
        vista.getBtn_imprimir().addActionListener(e -> Imprimir());
        validaciones();
        ///evento para la tabla//////
        vista.getTabla_autos().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccionar();
            }

        });
        lista();
    }

    private void eliminar() {
        bdauto.setPlaca(vista.getTxt_placa().getText());
        int resp2 = JOptionPane.showConfirmDialog(null, "Confirme si esta seguro de ELIMINAR.....");
        if (resp2 == 0) {
            if (bdauto.eliminar(vista.getTxt_placa().getText())) {
                JOptionPane.showMessageDialog(null, "Datos Eliminados");
                lista();
                nuevo();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
        }
    }

    private void obtieneImagen() {
        vista.getTxt_foto().setIcon(null);
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(vista.getTxt_foto().getWidth(), vista.getTxt_foto().getHeight(), Image.SCALE_DEFAULT);
                vista.getTxt_foto().setIcon(new ImageIcon(icono));
                vista.getTxt_foto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(control_autos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void nuevo() {
        vista.getTxt_placa().setEditable(true);
        vista.getBtn_guardar().setEnabled(true);
        vista.getBtn_modificar().setEnabled(false);
        vista.getTxt_anio().setText("");
        vista.getTxt_chasis().setText("");
        vista.getTxt_modelo().setText("");
        vista.getTxt_motor().setText("");
        vista.getTxt_placa().setText("");
        vista.getTxt_precio().setText("");
        vista.getCombo_color().setSelectedIndex(0);
        vista.getCombo_marca().setSelectedIndex(0);
        vista.getCombo_estado().setSelectedIndex(0);
        //vista.getTabla_autos()
    }

    public void cam_estado() {
        bdauto.setEstado(vista.getCombo_estado().getSelectedItem().toString());
        int res = JOptionPane.showConfirmDialog(null, "Esta seguro de cambiar el estado");
        if (res == 0) {
            if (bdauto.cambiar_estado(vista.getTxt_placa().getText())) {
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                lista();
                nuevo();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
        }
    }

    public void modificar() {
        bdauto.setPlaca(vista.getTxt_placa().getText());
        bdauto.setMarca(vista.getCombo_marca().getSelectedItem().toString());
        bdauto.setModelo(vista.getTxt_modelo().getText());
        bdauto.setAnio(Integer.parseInt(vista.getTxt_anio().getText()));
        bdauto.setColor(vista.getCombo_color().getSelectedItem().toString());
        bdauto.setMotor(Integer.parseInt(vista.getTxt_motor().getText()));
        bdauto.setChasis(vista.getTxt_chasis().getText());
        bdauto.setPrecio(Double.parseDouble(vista.getTxt_precio().getText()));
        ImageIcon ic = (ImageIcon) vista.getTxt_foto().getIcon();
        bdauto.setFoto(ic.getImage());
        int res = JOptionPane.showConfirmDialog(null, "Confirme");
        if (res == 0) {
            if (bdauto.modificar(vista.getTxt_placa().getText())) {
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                lista();
                nuevo();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
        }
    }

    public void guardar() {
        if (!vista.getTxt_placa().getText().equals("") && !vista.getCombo_marca().getSelectedItem().equals("Seleccione") && !vista.getTxt_modelo().getText().equals("") && !vista.getTxt_anio().getText().equals("") && !vista.getCombo_color().getSelectedItem().equals("Seleccione")
                && !vista.getTxt_motor().getText().equals("") && !vista.getTxt_chasis().getText().equals("") && !vista.getTxt_precio().getText().equals("") && !vista.getCombo_estado().getSelectedItem().equals("Inactivo")) {

            bdauto.setPlaca(vista.getTxt_placa().getText());
            bdauto.setMarca(vista.getCombo_marca().getSelectedItem().toString());
            bdauto.setModelo(vista.getTxt_modelo().getText());
            bdauto.setAnio(Integer.parseInt(vista.getTxt_anio().getText()));
            bdauto.setColor(vista.getCombo_color().getSelectedItem().toString());
            bdauto.setMotor(Integer.parseInt(vista.getTxt_motor().getText()));
            bdauto.setChasis(vista.getTxt_chasis().getText());
            bdauto.setPrecio(Double.parseDouble(vista.getTxt_precio().getText()));
            bdauto.setEstado(vista.getCombo_estado().getSelectedItem().toString());
            ImageIcon ic = (ImageIcon) vista.getTxt_foto().getIcon();
            bdauto.setFoto(ic.getImage());

            if (bdauto.insertar()) {
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                lista();
                nuevo();

            } else {
                JOptionPane.showMessageDialog(null, "ERRROR AL GUARDAR");
            }
        } else {
            JOptionPane.showMessageDialog(null, "LLENAR TODOS L0S CAMPOS");
        }

    }

    private void Imprimir() {
        System.out.println("0000");
        DB_Conect con = new DB_Conect();
        try {
            JasperReport jas = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reportes.jasper"));
            JasperPrint jp = (JasperPrint) JasperFillManager.fillReport(jas, null, con.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
//                Map parametro = new HashMap();
//                parametro.clear();
//                parametro.put("logos",this.getClass().getResourceAsStream(imagen));
            JOptionPane.showMessageDialog(null, "Imprimiendo Autos");
            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jv.setVisible(true);
        } catch (JRException e) {
            System.out.println("no se pudo encontrar registros" + e.getMessage());
            Logger.getLogger(control_autos.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void seleccionar() {
        vista.getBtn_modificar().setEnabled(true);
        vista.getBtn_guardar().setEnabled(false);
        vista.getTxt_placa().setEditable(false);
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) vista.getTabla_autos().getModel();
        String placa = (String) modelo.getValueAt(vista.getTabla_autos().getSelectedRow(), 0);
        System.out.println(placa);
        List<Auto_MD> lista = bdauto.obtenerdatos(placa);
        bdauto.setPlaca(lista.get(0).getPlaca());
        bdauto.setMarca(lista.get(0).getMarca());
        bdauto.setModelo(lista.get(0).getModelo());
        bdauto.setAnio(lista.get(0).getAnio());
        bdauto.setColor(lista.get(0).getColor());
        bdauto.setMotor(lista.get(0).getMotor());
        bdauto.setChasis(lista.get(0).getChasis());
        bdauto.setPrecio(lista.get(0).getPrecio());
        bdauto.setEstado(lista.get(0).getEstado());
        Image img = lista.get(0).getFoto();
        if (img != null) {
            Image newimg = img.getScaledInstance(vista.getTxt_foto().getWidth(), vista.getTxt_foto().getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newimg);
            vista.getTxt_foto().setIcon(icon);
        } else {
            vista.getTxt_foto().setIcon(null);
        }
        vista.getTxt_placa().setText(bdauto.getPlaca());
        vista.getCombo_marca().setSelectedItem(bdauto.getMarca());
        vista.getTxt_modelo().setText(bdauto.getModelo());
        vista.getTxt_anio().setText(bdauto.getAnio() + "");
        vista.getCombo_color().setSelectedItem(bdauto.getColor());
        vista.getTxt_motor().setText(bdauto.getMotor() + "");
        vista.getTxt_chasis().setText(bdauto.getChasis());
        vista.getTxt_precio().setText(bdauto.getPrecio() + "");
        vista.getCombo_estado().setSelectedItem(bdauto.getEstado());
    }

    public void lista() {
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) vista.getTabla_autos().getModel();
        List<Auto_MD> lista = bdauto.mostrardatos();
        int columnas = modelo.getColumnCount();
        for (int j = vista.getTabla_autos().getRowCount() - 1; j >= 0; j--) {
            modelo.removeRow(j);
        }
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new Object[columnas]);
            vista.getTabla_autos().setValueAt(lista.get(i).getPlaca(), i, 0);
            vista.getTabla_autos().setValueAt(lista.get(i).getMarca(), i, 1);
            vista.getTabla_autos().setValueAt(lista.get(i).getModelo(), i, 2);
            vista.getTabla_autos().setValueAt(lista.get(i).getAnio(), i, 3);
            vista.getTabla_autos().setValueAt(lista.get(i).getColor(), i, 4);
            vista.getTabla_autos().setValueAt(lista.get(i).getMotor(), i, 5);
            vista.getTabla_autos().setValueAt(lista.get(i).getChasis(), i, 6);
            vista.getTabla_autos().setValueAt(lista.get(i).getPrecio(), i, 7);
            vista.getTabla_autos().setValueAt(lista.get(i).getEstado(), i, 8);
        }
    }

    public void validaciones() {
        vista.getTxt_modelo().addKeyListener(new TxtVLetras(vista.getTxt_modelo(), vista.getLabelmodelo()));
        vista.getTxt_motor().addKeyListener(new TxtVNumeros(vista.getTxt_motor(), vista.getTxtnumeros()));
    }

}
