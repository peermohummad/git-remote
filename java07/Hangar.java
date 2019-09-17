import java.util.ArrayList;

public class Hangar {

    public static void main(String[] args) {

        // une nouvelle instance de la classe Car
        Car clio = new Car("Clio"); 
        
	// utilisation d'un setter    
        clio.setKilometers(8400);
        
       // utilisation de getters      
       System.out.println("1. Car modele is : " + clio.getBrand());
       System.out.println("2. Car kilometers are  " + String.valueOf(clio.getKilometers()));
       System.out.println("3. " + clio.DoStuff());

       Boat titanic = new Boat("Titanic");
       System.out.println("4. Boat name is : " + titanic.getBrand());
       System.out.println("5. Boat kilometers are " + String.valueOf(titanic.getKilometers()));
       System.out.println("6. " + titanic.DoStuff());
        
        // comme clio et titanic sont des enfants de Vehicle
        // il est possible de les stocker dans une même ArrayList
       
	ArrayList<Vehicle> listvehicles = new ArrayList<>();
        listvehicles.add(clio);
        listvehicles.add(titanic);
        
        System.out.println("7. Machines de la liste : ");
        // parcours de la liste
        for (Vehicle vehicle : listvehicles) {
            System.out.println("- " + vehicle.getBrand());
        }
    }
}
