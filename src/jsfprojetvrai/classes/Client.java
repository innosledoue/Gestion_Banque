
/*--------------UNE CLASSE POUR LES DONNEES CLIENTS DANS LA BASE DE DONNEES----------------------*/
/*--------------------------------------------------------------------------------------------------*/
/*--------------------------------------------------------------------------------------------------*/

package jsfprojetvrai.classes;



public class Client {

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
		         
	    
	    public  Client() {};    //    LE CONSTRUCTEUR
	    
	    public Client (String password, String userName,String prenom,Integer cartefidelite,String dateinscription,
	    		        String adresse,String codepostal,String ville,String telfixe,String mobile,String email,String remarque)
	   
	   {
			this.userName = userName;
			this.password = password;
			this.prenom = prenom;
			this.cartefidelite = cartefidelite;
			this. dateinscription =  dateinscription;
			
			this. adresse = adresse;
			this. codepostal =  codepostal;
			this. ville =  ville;
			this. telfixe =  telfixe;
			this. mobile =  mobile;
			this. email =  email;
			this. remarque = remarque;

			
		}


	    
	    
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
		
}
