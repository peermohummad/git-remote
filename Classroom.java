package fr.wildcodeschool.idetest;

public class Classroom {

	public static void main(String[] args) {
		
		System.out.println("Attribut");
		//constructeur
        Wilder jeanclaude = new Wilder("Jean-Claude"); 
        jeanclaude.setAware(true);
        System.out.println("Je m'appel : " + jeanclaude.getFirstName());
        System.out.println("Aware de " +jeanclaude.getFirstName() + " est " + String.valueOf(jeanclaude.isAware()));
        System.out.println();
        
        System.out.println("On modifie l'etat de jean claude de aware = true à aware = false");
        jeanclaude.setAware(false);
        System.out.println("Now his aware state is : " + String.valueOf(jeanclaude.isAware()));
        System.out.println();
        
        System.out.println("Méthode statique");
        // méthode statique
        System.out.println("Ce que dit Jean Claude : " + Wilder.said());
        System.out.println();

        System.out.println("Méthode instanciée");
     // méthode instanciée
        Wilder jeanclaude2 = new Wilder("Jean-Claude");
        jeanclaude2.setAware(true);
        System.out.println(jeanclaude2.whoAmI());
        
     // méthode instanciée
        Wilder henri = new Wilder("Henri");
        henri.setAware(false);
        System.out.println(henri.whoAmI());
	}

}
