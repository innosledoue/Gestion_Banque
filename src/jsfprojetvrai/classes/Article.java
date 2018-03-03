
/*--------------UNE CLASSE POUR LES DONNEES CLIENTS DANS LA BASE DE DONNEES----------------------*/
/*--------------------------------------------------------------------------------------------------*/
/*--------------------------------------------------------------------------------------------------*/

package jsfprojetvrai.classes;

import java.util.Date;

public class Article {

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
	
		         
	    
	    public  Article() {};    //    LE CONSTRUCTEUR
	    
	    public Article (String code, String codecategorie,String designation,Integer quantite,Double prixunitaire,
	    		        Date date)
	   
	   {
			this.code = code;
			this.codecategorie = codecategorie;
			this.designation = designation;
			this.quantite = quantite;
			this. prixunitaire=  prixunitaire;
			
			this. date = date;

			
		}


	    
	    
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
		
}
