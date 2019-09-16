package fr.wildcodeschool.idetest;

public class Wilder {
	
	// attributs
    private String firstname;
    private boolean aware;
    private String state;
    
    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = true;
    }    
        
    
    // accesseurs (getters)
    public String getFirstName() {
    	return this.firstname;
    }
    
    public boolean isAware() {
        return this.aware;
    }
    
    // méthode statique
    public static String said() {
        return "Je suis Jean claude et je suis aware !";
    }
    
    // méthode instanciée
    public String whoAmI() {
    	if(this.firstname =="Jean-Claude") {
    		return "Je m'appele " + this.getFirstName() + " et je suis trés trés " + this.state;
    	} else {
    		
    		return "Je m'appele " + this.getFirstName() + " et je ne suis " + this.state;
    	}
    }

 
    //mutateurs (set)
    public void setAware(boolean aware) {
    		
        this.aware = aware;
        if (this.isAware()) {
        	this.state = "aware";
        } else {
        	this.state = "pas aware";
        }
    }

	
}
