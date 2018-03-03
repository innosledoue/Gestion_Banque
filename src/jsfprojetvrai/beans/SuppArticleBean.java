package jsfprojetvrai.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

//import java.io.Serializable;    // NEW   
//import java.util.ArrayList;    // NEW
//import java.util.List;        // NEW

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import jsfprojetvrai.classes.Client;

@ManagedBean(name="suppArticleBean")
@SessionScoped


public class SuppArticleBean {
	
	private String code;             
	 private String codecategorie; 
	 private String designation;
     private Integer quantite;
     private Double prixunitaire;
	 private Date date;
	
	 
	 private String dbcode;
	 private String dbcodecategorie;
	 private String dbdesignation;
	 private Integer dbquantite;
	 private Double dbprixunitaire;
	 private Date dbdate;
	
	 
	 Connection connection;
	    Statement statement;
	    ResultSet rs; 
	    int rss;
	    
	   // String rs;
	    String SQL ;
	    String msg;
	    
	    public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDbcode() {
			return dbcode;
		}

		public void setDbcode(String dbcode) {
			this.dbcode = dbcode;
		}
		
		public String getCodecategorie() {
			return codecategorie;
		}
		
		public void setCodecategorie(String codecategorie) {
			this.codecategorie = codecategorie;
		}
		
		public String getDbcodecategorie() {
			return dbcodecategorie;
		}

		public void setDbCodecategorie(String dbcodecategorie) {
			this.dbcodecategorie = dbcodecategorie;
		}
		
		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}
		
		public String getDbdesignation() {
			return dbdesignation;
		}

		public void setDbdesignation(String dbdesignation) {
			this.dbdesignation = dbdesignation;
		}
		
		public Integer getQuantite() {
			return quantite;
		}
		
		public void setQuantite(Integer quantite) {
			this.quantite = quantite;
		}
		
		public Integer getDbquantite() {
			return dbquantite;
		}

		public void setDbquantite(Integer dbquantite) {
			this.dbquantite = dbquantite;
		}

		public Double getPrixunitaire() {
			return prixunitaire;
		}

		public void setPrixunitaire(Double prixunitaire) {
			this.prixunitaire= prixunitaire;
		}
		
		public Double getDbprixunitaire() {
			return dbprixunitaire;
		}

		public void setDbprixunitaire(Double dbprixunitaire) {
			this.dbprixunitaire = dbprixunitaire;
		}
		
		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date= date;
		}
		
		public Date getDbdate() {
			return dbdate;
		}

		public void setDbdate(Date dbdate) {
			this.dbdate = dbdate;
		}
	

		
		 public void dbData(String code) {
		    try {   
			 
			    	  Class.forName("com.mysql.jdbc.Driver");
			    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
			    	  statement = connection.createStatement();
			    	  SQL = "SELECT * FROM indigopro.articles WHERE  code  LIKE ('"+code+"')";
			    	  		
			       
			    	  rs = statement.executeQuery(SQL);          //    rs = statement.executeUpdate(SQL);  
	                 
	                  rs.next(); 
	                  
	                 dbcode = rs.getString("code");//.toString();           // avec le résultat affiché, il lit ttes les lignes de la colonne 1 (1) ou colonne 2 (2)
	                 dbcodecategorie = rs.getString("code_categorie");//.toString();
	                 dbdesignation=rs.getString("designation");
			         dbquantite=rs.getInt("quantite");
			           // client.setCartefidelite(""+rs.getInt(4)+"");
			         dbprixunitaire=rs.getDouble("prix_unitaire");
			         dbdate=rs.getDate("date");
			             
			           
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
		    
		    
		    public String supparticle()
		    {
		    	dbData(code);
		    	
		    	 // msg=  messages.add( "INSERTION REUSSIE");  A REVOIR 
		  	  return "supprimerArticle";   
		    }
		
		    public String supparticleFinal()
		    {
		    	 try {   
					 
			    	  Class.forName("com.mysql.jdbc.Driver");
			    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
			    	  statement = connection.createStatement();
			    	  SQL = "DELETE FROM articles WHERE  code  LIKE ('"+code+"')";
			    	  		
			       
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
