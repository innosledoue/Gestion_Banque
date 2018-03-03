package jsfprojetvrai.beans;


import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;
//import java.io.Serializable;    // NEW   
//import java.util.ArrayList;    // NEW
//import java.util.List;        // NEW

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import jsfprojetvrai.classes.Client;

@ManagedBean(name="ajouterClientBean")
@SessionScoped

public class AjouterClientBean 
  {
	private String userName;             
	 private String password; 
	 private String prenom;
	 private Integer cartefidelite;
	 private String dateinscription;
	 private String adresse;
	 private String codepostal;
	 private String ville;
	 private String telfixe;
	 private String mobile;
	 private String email;
	 private String remarque;
	 Connection connection;
	    Statement statement;
	   // ResultSet rs; 
	    int rs;
	    String SQL ;
	    String msg;
	    
	    public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		public Integer getCartefidelite() {
			return cartefidelite;
		}

		public void setCartefidelite(Integer cartefidelite) {
			this.cartefidelite = cartefidelite;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getDateinscription() {
			return dateinscription;
		}

		public void setDateinscription(String dateinscription) {
			this.dateinscription = dateinscription;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse= adresse;
		}
		
		public String getCodepostal() {
			return codepostal;
		}

		public void setCodepostal(String codepostal) {
			this.codepostal= codepostal;
		}
		
		public String getVille() {
			return ville;
		}

		public void setVille(String ville) {
			this.ville= ville;
		}
		
		public String getTelfixe() {
			return telfixe;
		}

		public void setTelfixe(String telfixe) {
			this.telfixe= telfixe;
		}
		
		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile= mobile;
		}
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email=email;
		}
		
		public String getRemarque() {
			return remarque;
		}

		public void setRemarque(String remarque) {
			this.remarque=remarque;
		}
		   
	    public void dbData(String password, String userName,String prenom,Integer cartefidelite,String dateinscription,
		        String adresse,String codepostal,String ville,String telfixe,String mobile,String email,String remarque) {

	    try {   
		 
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
		    	  statement = connection.createStatement();
  SQL =  "INSERT INTO indigopro.clients VALUES ('"+password+"','"+userName+"','"+prenom+"',"+cartefidelite+",'"+dateinscription+"','"+adresse+"','"+codepostal+"','"+ville+"','"+telfixe+"','"+mobile+"','"+email+"','"+remarque+"')"; 
		    	  		
		       
                 rs = statement.executeUpdate(SQL);  // OU    rs = statement.executeUpdate(SQL);
		  /*  	  while(rs.next()) 
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
		           client.setRemarque(rs.getString("remarque"));      */
		           
		   //        clients.add(client);

		        
		        //	 clients.add(new Client(rs.getString("code"),rs.getString("nom"),rs.getString("prenom"),rs.getInt("carte_fidele"),rs.getString("date"),rs.getString("addresse"),rs.getString("code_postal"),rs.getString("ville"),rs.getString("tel_fixe"),rs.getString("mobile"),rs.getString("email"),rs.getString("remarque"))) ;				
		//         }
		      }
		      
		      catch(Exception ex)
		        {
		            ex.printStackTrace();
		            System.out.println("Exception Occured in the process :" + ex);
		        }   
   
	          // ------------------------------
                
	    }   
	    
	    
	    public String ajoutclient()
	    {
	    	dbData(password, userName,prenom,cartefidelite, dateinscription,
			         adresse, codepostal,ville,telfixe, mobile, email, remarque);

	    	
	    	 // msg=  messages.add( "INSERTION REUSSIE");  A REVOIR 
	  	  return "/ajoutSucces";   
	    }
	    
  }


