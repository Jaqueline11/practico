
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 */
public class DB_Conect {
    Connection con;
    Statement st;
    ResultSet rs;
    String cadConexion="jdbc:postgresql://localhost:5432/sistema";
    String pgUser="postgres";
    String pgContra="mvelmgqh";
    
     public DB_Conect() {
        
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Se Cargo Driver.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Conect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con=DriverManager.getConnection(cadConexion,pgUser,pgContra);
            System.out.println("Se conecto DB.");
        } catch (SQLException ex) {
            Logger.getLogger(DB_Conect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public SQLException noQuery(String nsql){
        System.out.println(nsql);
        try {
            st=con.createStatement();
            st.execute(nsql);
            st.close();
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(DB_Conect.class.getName()).log(Level.SEVERE, null, ex);
            return ex;
        }
    }
    
    public ResultSet query(String sql){
        System.out.println(sql);
        try {
            st=con.createStatement();
            ResultSet rs = st.executeQuery(sql);
          //  st.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DB_Conect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
