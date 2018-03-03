
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



import jsfprojetvrai.classes.Article;    // IMPORTATION DE LA CLASSE CLIENT ISSUE D4UN AUTRE PACKAGE

 
@ManagedBean(name="articleBean")
@SessionScoped

public class ArticleBean implements Serializable {              // POUR FICHIER OU BD
	   private static final long serialVersionUID = 1L;
	   Connection connection;
	    Statement statement;
	    ResultSet rs;
	    String SQL;
	   

	   public List<Article> getArticles() {
		   
		//   ResultSet rs = null;
		 //     PreparedStatement pst = null;
		  //    Connection con = getConnection();
		    //  String stm = "SELECT * FROM indigopro.clients";
		      //List<Client> records = new ArrayList<Client>();
		      List<Article> articles = new ArrayList<Article>();
		      
		      try {   
		  //       pst = con.prepareStatement(stm);
		  //       pst.execute();
		  //       rs = pst.getResultSet();
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
		    	  statement = connection.createStatement();
		    	  SQL =  "SELECT * FROM indigopro.articles";
		        // while(rs.next()) 
		    	  rs = statement.executeQuery(SQL);
		    	  while(rs.next()) 
		                         {                        // POUR PARCOURIR TOUTE LA TABLE
		          Article article = new Article();           // LE CONSTRUCTEUR EST DEJA DEFINI DS LA CLASSE
		           article.setCode(rs.getString("code"));
		           article.setCodecategorie(rs.getString("code_categorie"));
		           article.setDesignation(rs.getString("designation"));
		           article.setQuantite(rs.getInt("quantite"));
		           // client.setCartefidelite(""+rs.getInt(4)+"");
		           article.setPrixunitaire(rs.getDouble("prix_unitaire"));
		           article.setDate(rs.getDate("date"));
		             
		           
		           articles.add(article);

		        
		        //	 clients.add(new Client(rs.getString("code"),rs.getString("nom"),rs.getString("prenom"),rs.getInt("carte_fidele"),rs.getString("date"),rs.getString("addresse"),rs.getString("code_postal"),rs.getString("ville"),rs.getString("tel_fixe"),rs.getString("mobile"),rs.getString("email"),rs.getString("remarque"))) ;				
		         }
		      }
		      
		      catch(Exception ex)
		        {
		            ex.printStackTrace();
		            System.out.println("Exception Occured in the process :" + ex);
		        }
		      return articles;
		   }

	
                    
		   
	 


}
     
