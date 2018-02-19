
/*--------------------UN BEAN POUR LES DONNEES CLIENTS DANS LA BASE DE DONNEES----------------------*/
/*--------------------------------------------------------------------------------------------------*/
/*--------------------------------------------------------------------------------------------------*/


package jsfprojetvrai.beans;


import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;   // NEW
import java.sql.ResultSet;
//import java.sql.SQLException;       // NEW
import java.sql.Statement;
import java.io.Serializable;    // NEW   
import java.util.ArrayList;    // NEW
import java.util.List;        // NEW

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



import jsfprojetvrai.classes.Client;    // IMPORTATION DE LA CLASSE CLIENT ISSUE D4UN AUTRE PACKAGE

 
@ManagedBean(name="clientBean")
@SessionScoped

public class ClientBean implements Serializable {              // POUR FICHIER OU BD
	   private static final long serialVersionUID = 1L;
	   Connection connection;
	    Statement statement;
	    ResultSet rs;
	    String SQL;
	   

	   public List<Client> getClients() {
		   
		//   ResultSet rs = null;
		 //     PreparedStatement pst = null;
		  //    Connection con = getConnection();
		    //  String stm = "SELECT * FROM indigopro.clients";
		      //List<Client> records = new ArrayList<Client>();
		      List<Client> clients = new ArrayList<Client>();
		      
		      try {   
		  //       pst = con.prepareStatement(stm);
		  //       pst.execute();
		  //       rs = pst.getResultSet();
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
		    	  statement = connection.createStatement();
		    	  SQL =  "SELECT * FROM indigopro.clients";
		        // while(rs.next()) 
		    	  rs = statement.executeQuery(SQL);
		    	  while(rs.next()) 
		                         {                        // POUR PARCOURIR TOUTE LA TABLE
		          Client client = new Client();           // LE CONSTRUCTEUR EST DEJA DEFINI DS LA CLASSE
		           client.setPassword(rs.getString("code"));
		           client.setUserName(rs.getString("nom"));
		           client.setPrenom(rs.getString("prenom"));
		           client.setCartefidelite(rs.getInt("carte_fidele"));
		           // client.setCartefidelite(""+rs.getInt(4)+"");
		           client.setDateinscription(rs.getString("date"));
		           client.setAdresse(rs.getString("addresse"));
		           client.setCodepostal(rs.getString("code_postal"));
		           client.setVille(rs.getString("ville"));
		           client.setTelfixe(rs.getString("tel_fixe"));
		           client.setMobile(rs.getString("mobile"));
		           client.setEmail(rs.getString("email"));
		           client.setRemarque(rs.getString("remarque"));   
		           
		           clients.add(client);

		        
		        //	 clients.add(new Client(rs.getString("code"),rs.getString("nom"),rs.getString("prenom"),rs.getInt("carte_fidele"),rs.getString("date"),rs.getString("addresse"),rs.getString("code_postal"),rs.getString("ville"),rs.getString("tel_fixe"),rs.getString("mobile"),rs.getString("email"),rs.getString("remarque"))) ;				
		         }
		      }
		      
		      catch(Exception ex)
		        {
		            ex.printStackTrace();
		            System.out.println("Exception Occured in the process :" + ex);
		        }
		      return clients;
		   }

	
                    
		   
	 


}
     
