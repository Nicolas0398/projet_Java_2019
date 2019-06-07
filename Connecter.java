/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;
import java.sql.*;

/**
 *
 * @author rajur
 */
public class Connecter {
    Connection cnx;
    public Connecter (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
           }catch(ClassNotFoundException e){
               System.err.println(e);
           }
        try{
            String url = "jdbc:mysql://localhost:3306/projetjava";
            String user="root";
            String password="";
            cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien etablie");
        }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){return cnx;}  
}
