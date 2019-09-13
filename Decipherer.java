package fr.wildcodeschool.idetest;

public class Decipherer {

	 public static String keyDecipherer(String message) {
		 
		 // divise par 2 la longeur du message
	     int numberKey = (message.length()) / 2;
	     
	     //recupere le sous mot a partir du 6eme caracteres
	     String subMessage = message.substring (5, numberKey + 5);
	     
	     // remplace les @#? par " "
	     subMessage = subMessage.replace("@#?", " ");
	     
	     // inverse le mot
	     String reverse = new StringBuffer(subMessage).reverse().toString();
	     //System.out.println(reverse);
	     
	     //renvoi le résultat de la class
	     return reverse;
	        
	        
	 }
	
	
	
	public static void main(String[] args) {

    	String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
    	String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
    	String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
        String messageFinal = "";
        
    	System.out.println("Le message original N° 1 est : " + message1);
        System.out.println("Le message traduit N° 1 est : " + keyDecipherer(message1));
        messageFinal = messageFinal + keyDecipherer(message1);
        System.out.println();
        System.out.println("Le message original N° 2 est : " + message2);
        System.out.println("Le message traduit N° 2 est : " + keyDecipherer(message2));
        messageFinal = messageFinal + " " + keyDecipherer(message2);
        System.out.println();
        System.out.println("Le message original N° 3 est : " + message3);
        System.out.println("Le message traduit N° 3 est : " + keyDecipherer(message3));
        messageFinal = messageFinal + " " + keyDecipherer(message3);
        System.out.println();
        System.out.println(messageFinal);
		
	}

}
