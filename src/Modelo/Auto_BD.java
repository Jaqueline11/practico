/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import org.postgresql.util.Base64;

/**
 *
 * @author Myrian
 */
public class Auto_BD extends Auto_MD {

    DB_Conect conectar = new DB_Conect();

    public Auto_BD() {
    }

    public Auto_BD(String placa, String marca, String modelo, int anio, String color, int motor, String chasis, double precio, String estado, Image foto) {
        super(placa, marca, modelo, anio, color, motor, chasis, precio, estado,foto);
    }

    

    public List<Auto_MD> mostrardatos() {
        try {
            List<Auto_MD> lista = new ArrayList<Auto_MD>();
            String sql = "select * from auto";
            ResultSet rs = conectar.query(sql);
            byte[] is;
            while (rs.next()) {
                Auto_MD m = new Auto_MD();
                m.setPlaca(rs.getString("placa"));
                m.setMarca(rs.getString("marca"));
                m.setModelo(rs.getString("modelo"));
                m.setAnio(rs.getInt("anio"));
                m.setColor(rs.getString("color"));
                m.setMotor(rs.getInt("motor"));
                m.setChasis(rs.getString("chasis"));
                m.setPrecio(rs.getDouble("precio"));
                m.setEstado(rs.getString("estado"));                
                is = rs.getBytes("foto");
                if (is != null) {
                    try {
                        is = Base64.decode(is, 0, rs.getBytes("foto").length);
//                    BufferedImage bi=Base64.decode( ImageIO.read(is));
                        m.setFoto(getImage(is, false));
                    } catch (Exception ex) {
                        m.setFoto(null);
                        Logger.getLogger(Auto_BD.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    m.setFoto(null);
                }
                lista.add(m);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(Auto_BD.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    public static BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }

    private Image getImage(byte[] bytes, boolean isThumbnail) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator readers = ImageIO.getImageReadersByFormatName("png");
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis; // File or InputStream
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        if (isThumbnail) {
            param.setSourceSubsampling(4, 4, 0, 0);
        }
        return reader.read(0, param);
    }
    public List<Auto_MD> obtenerdatos(String placa) {
        try {
            List<Auto_MD> lista = new ArrayList<Auto_MD>();
            String sql = "select * from auto"+" where \"placa\"='"+placa+"'";
            ResultSet rs = conectar.query(sql);
            byte[] is;
            while (rs.next()) {
                Auto_MD m = new Auto_MD();
                m.setPlaca(rs.getString("placa"));
                m.setMarca(rs.getString("marca"));
                m.setModelo(rs.getString("modelo"));
                m.setAnio(rs.getInt("anio"));
                m.setColor(rs.getString("color"));
                m.setMotor(rs.getInt("motor"));
                m.setChasis(rs.getString("chasis"));
                m.setPrecio(rs.getDouble("precio"));
                m.setEstado(rs.getString("estado"));
                is = rs.getBytes("foto");
                if (is != null) {
                    try {
                        is = Base64.decode(is, 0, rs.getBytes("foto").length);
//                    BufferedImage bi=Base64.decode( ImageIO.read(is));
                        m.setFoto(getImage(is, false));
                    } catch (Exception ex) {
                        m.setFoto(null);
                        Logger.getLogger(Auto_BD.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    m.setFoto(null);
                }
                lista.add(m);
            }
            rs.close();
            return lista;
        } catch (Exception e) {
            Logger.getLogger(Auto_BD.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }


    public boolean insertar() {
        
        //Transformo image a base64 encode para postgresl
        String ef = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            BufferedImage img = toBufferedImage(getFoto());
            ImageIO.write(img, "PNG", bos);
            byte[] imgb = bos.toByteArray();
            ef = Base64.encodeBytes(imgb);
        } catch (IOException ex) {
            Logger.getLogger(Auto_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String nsql = "INSERT INTO auto(placa,marca,modelo,anio,color,motor,chasis,precio,estado,foto)" + "VALUES ('" + getPlaca() + "','" + getMarca() + "','" + getModelo() + "','" + getAnio() + "','" + getColor() + "','" + getMotor() + "','" + getChasis() + "','" + getPrecio() + "','" + getEstado() +"','"+ef + "')";

        if (conectar.noQuery(nsql) == null) {
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }

    public boolean modificar(String placa) {
        String ef = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            BufferedImage img = toBufferedImage(getFoto());
            ImageIO.write(img, "PNG", bos);
            byte[] imgb = bos.toByteArray();
            ef = Base64.encodeBytes(imgb);
        } catch (IOException ex) {
            Logger.getLogger(Auto_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "update auto set \"marca\"='" + getMarca() + "',\"modelo\"='" + getModelo() + "',\"anio\"='" + getAnio() + "',\"color\"='" + getColor() + "',\"motor\"='" + getMotor() + "',\"chasis\"='" + getChasis() + "',\"precio\"='" + getPrecio() + "',\"foto\"='" + ef + "'"
                + " where \"placa\"='" + placa + "'";

       if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }
    public boolean cambiar_estado(String placa) {
        String sql = "update auto set \"estado\"='" + getEstado() + "'"
                + " where \"placa\"='" + placa + "'";

       if (conectar.noQuery(sql) == null) {
            return true;
        } else {
            System.out.println("ERROR");
            return false;
        }
    }
     public boolean eliminar(String placa){
        String nsql = "delete from auto where \"placa\"='" +placa+ "'";
        if(conectar.noQuery(nsql)==null){
            return true;
        }
        else
        {
            System.out.println("Error eliminar");
            return false;
        }
    }

}
