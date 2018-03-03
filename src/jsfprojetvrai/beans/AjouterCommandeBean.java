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

@ManagedBean(name="ajouterCommandeBean")
@SessionScoped

public class AjouterCommandeBean 
  {
	private String code;             
	 private String codeclient; 
	 private Double totalttc;
   private Integer codemodereglement;
  
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
		
		
		public String getCodeclient() {
			return codeclient;
		}
		
		public void setCodeclient(String codeclient) {
			this.codeclient = codeclient;
		}
		
		
		public Double getTotalttc() {
			return totalttc;
		}

		public void setTotalttc(Double totalttc) {
			this.totalttc = totalttc;
		}
		
		
		public Integer getCodemodereglement() {
			return codemodereglement;
		}
		
		public void setCodemodereglement(Integer codemodereglement) {
			this.codemodereglement = codemodereglement;
		}
		

	
		
		
		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date= date;
		}
		
		
		public void dbData (String code, String codeclient,Double totalttc,Integer codemodereglement,Date date)
	   
		{	 try {   
			 
	    	  Class.forName("com.mysql.jdbc.Driver");
	    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
	    	  statement = connection.createStatement();
SQL =  "INSERT INTO indigopro.commandes VALUES ('"+code+"','"+codeclient+"','"+totalttc+"',"+codemodereglement+",'"+date+"')";
	    	  		
	       
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
	    	dbData(code,codeclient,totalttc,codemodereglement,date);

	    	
	    	 // msg=  messages.add( "INSERTION REUSSIE");  A REVOIR 
	  	  return "/ajoutSucces";   
	    }
	    
  }


