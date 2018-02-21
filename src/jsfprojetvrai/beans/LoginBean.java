
/*------------UN BEAN POUR LES DONNEES CONNEXION ADMIN DANS LA BASE DE DONNEES------------------*/
/*--------------------------------------------------------------------------------------------------*/
/*--------------------------------------------------------------------------------------------------*/

package jsfprojetvrai.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

 
@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
    private String userName;
    private String password;
    private String dbuserName;
    private String dbpassword;
   // private String msg_affiche;
   
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    String SQL;
    
 
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
	
	

	 /*  --------- POUR AFFICHER LE MENU APRES VERIFICATION DES INFOS DE L'ADMIN ---------------   */
	
		/*----------------PARTIE 1: gestion de la connexion avec la BD*/

	public void dbData(String userName)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/indigopro","root","jsfp");
            statement = connection.createStatement();
           
            SQL = "SELECT * FROM indigopro.clients WHERE  nom   LIKE ('JOMIKA')";
            
            resultSet = statement.executeQuery(SQL);   
            resultSet.next();                                // avec le résultat affiché, il lit ttes les lignes de la colonne 1 (1) ou colonne 2 (2)
            dbuserName = resultSet.getString(2).toString();
            dbpassword = resultSet.getString(1).toString();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            System.out.println("Exception Occured in the process :" + ex);
        }
    }
	
	
	/*------------PARTIE 2: la fonction qui gère l'affichage de la page suivte après vérification*/

	public String checkValidUser()
    {
        dbData(userName);  // c'est ici que nous gérons le contenu de la variable pour vérification
 
        if(userName.equalsIgnoreCase(dbuserName))
        {
 
            if(password.equals(dbpassword))
                 //return "personne";          ---------POUR LA CONNEXION CLIENT
            	   return "menuadministrateur";
            else
            {
                return "failure";
            }
        }
        else
        {
            return "failure";
        }
}                    


          
}
    
	/*--FIN-------------------------------------------------------------------------*/
    
    
   
