package jsfprojetvrai.beans;


import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;
//import java.io.Serializable;    // NEW   
//import java.util.ArrayList;    // NEW
//import java.util.List;        // NEW
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import jsfprojetvrai.classes.Client;

@ManagedBean(name="ajouterArticleBean")
@SessionScoped

public class AjouterArticleBean 
  {
	private String code;             
	 private String codecategorie; 
	 private String designation;
   private Integer quantite;
   private Double prixunitaire;
	 private Date date;
	 
	 
	 
	 Connection connection;
	    Statement statement;
	   // ResultSet rs; 
	    int rs;
	    String SQL ;
	    String msg;
	    
	    public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
		
		public String getCodecategorie() {
			return codecategorie;
		}
		
		public void setCodecategorie(String codecategorie) {
			this.codecategorie = codecategorie;
		}
		
		
		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}
		
		
		public Integer getQuantite() {
			return quantite;
		}
		
		public void setQuantite(Integer quantite) {
			this.quantite = quantite;
		}
		

		public Double getPrixunitaire() {
			return prixunitaire;
		}

		public void setPrixunitaire(Double prixunitaire) {
			this.prixunitaire= prixunitaire;
		}
		
		
		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date= date;
		}
		
		
		public void dbData (String code, String codecategorie,String designation,Integer quantite,Double prixunitaire,
		        Date date)
	   
		{	 try {   
			 
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
	    	  statement = connection.createStatement();
SQL =  "INSERT INTO indigopro.articles VALUES ('"+code+"','"+codecategorie+"','"+designation+"',"+quantite+","+prixunitaire+",current_date())";
	    	  		
	       
           rs = statement.executeUpdate(SQL);  // OU    rs = statement.executeUpdate(SQL);
  }
              
	      catch(Exception ex)
	        {
	            ex.printStackTrace();
	            System.out.println("Exception Occured in the process :" + ex);
	        }   
   
  }
                
	       
	    
	    
	    public String ajoutarticle()
	    {
	    	dbData(code,codecategorie,designation,quantite,prixunitaire,date);

	    	
	    	 // msg=  messages.add( "INSERTION REUSSIE");  A REVOIR 
	  	  return "/ajoutSucces";   
	    }
	    
  }


