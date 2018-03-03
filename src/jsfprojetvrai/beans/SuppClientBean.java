package jsfprojetvrai.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.io.Serializable;    // NEW   
//import java.util.ArrayList;    // NEW
//import java.util.List;        // NEW

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import jsfprojetvrai.classes.Client;

@ManagedBean(name="suppClientBean")
@SessionScoped


public class SuppClientBean {
	
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
	 
	 private String dbuserName;
	 private String dbpassword;
	 private String dbprenom;
	 private Integer dbcartefidelite;
	 private String dbdateinscription;
	 private String dbadresse;
	 private String dbcodepostal;
	 private String dbville;
	 private String dbtelfixe;
	 private String dbmobile;
	 private String dbemail;
	 private String dbremarque;
	 
	 Connection connection;
	    Statement statement;
	    ResultSet rs; 
	    int rss;
	    
	   // String rs;
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
		
		public String getDbuserName() {
			return dbuserName;
		}

		public void setDbuserName(String dbuserName) {
			this.dbuserName = dbuserName;
		}

		public String getDbpassword() {
			return dbpassword;
		}

		public void setDbpassword(String dbpassword) {
			this.dbpassword = dbpassword;
		}
		
		public Integer getDbcartefidelite() {
			return dbcartefidelite;
		}

		public void setDbcartefidelite(Integer dbcartefidelite) {
			this.dbcartefidelite = dbcartefidelite;
		}

		public String getDbprenom() {
			return dbprenom;
		}

		public void setDbprenom(String dbprenom) {
			this.dbprenom = dbprenom;
		}

		public String getDbdateinscription() {
			return dbdateinscription;
		}

		public void setDbdateinscription(String dbdateinscription) {
			this.dbdateinscription = dbdateinscription;
		}

		public String getDbadresse() {
			return dbadresse;
		}

		public void setDbadresse(String dbadresse) {
			this.dbadresse= dbadresse;
		}
		
		public String getDbcodepostal() {
			return dbcodepostal;
		}

		public void setDbcodepostal(String dbcodepostal) {
			this.dbcodepostal= dbcodepostal;
		}
		
		public String getDbville() {
			return dbville;
		}

		public void setDbville(String dbville) {
			this.dbville= dbville;
		}
		
		public String getDbtelfixe() {
			return dbtelfixe;
		}

		public void setDbtelfixe(String dbtelfixe) {
			this.dbtelfixe= dbtelfixe;
		}
		
		public String getDbmobile() {
			return dbmobile;
		}

		public void setDbmobile(String dbmobile) {
			this.dbmobile= dbmobile;
		}
		
		public String getDbemail() {
			return dbemail;
		}

		public void setDbemail(String dbemail) {
			this.dbemail=dbemail;
		}
		
		public String getDbremarque() {
			return dbremarque;
		}

		public void setDbremarque(String dbremarque) {
			this.dbremarque=dbremarque;
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

		

		 public void dbData(String password) {
		    try {   
			 
			    	  Class.forName("com.mysql.jdbc.Driver");
			    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
			    	  statement = connection.createStatement();
			    	  SQL = "SELECT * FROM indigopro.clients WHERE  code  LIKE ('"+password+"')";
			    	  		
			       
			    	  rs = statement.executeQuery(SQL);          //    rs = statement.executeUpdate(SQL);  
	                 
	                  rs.next(); 
	                  
	                 dbpassword = rs.getString("code");//.toString();           // avec le résultat affiché, il lit ttes les lignes de la colonne 1 (1) ou colonne 2 (2)
	                 dbuserName = rs.getString("nom");//.toString();
	                 dbprenom=rs.getString("prenom");
			         dbcartefidelite=rs.getInt("carte_fidele");
			           // client.setCartefidelite(""+rs.getInt(4)+"");
			         dbdateinscription=rs.getString("date");
			         dbadresse=rs.getString("addresse");
			         dbcodepostal=rs.getString("code_postal");
			         dbville=rs.getString("ville");
			         dbtelfixe=rs.getString("tel_fixe");
			         dbmobile=rs.getString("mobile");
			         dbemail=rs.getString("email");
			         dbremarque=rs.getString("remarque");      
			           
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
		    
		    
		    public String suppclient()
		    {
		    	dbData(password);
		    	
		    	 // msg=  messages.add( "INSERTION REUSSIE");  A REVOIR 
		  	  return "supprimerClient";   
		    }
		
		    public String suppclientFinal()
		    {
		    	 try {   
					 
			    	  Class.forName("com.mysql.jdbc.Driver");
			    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
			    	  statement = connection.createStatement();
			    	  SQL = "DELETE FROM indigopro.clients WHERE  code  LIKE ('"+password+"')";
			    	  		
			       
			    	  rss = statement.executeUpdate(SQL);          //  statement.executeUpdate(SQL) avec les int et les requêtes update,supp,modifier 
	                 
	                
			      }
			      
			      catch(Exception ex)
			        {
			            ex.printStackTrace();
			            System.out.println("Exception Occured in the process :" + ex);
			        }   
		    	 // msg=  messages.add( "INSERTION REUSSIE");  A REVOIR 
		  	  return "/suppSucces";   
		    }
}
