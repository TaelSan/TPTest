import java.util.Scanner;

public class Main {
	
	private static Scanner clavier = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			int aff;
			System.out.println("Saisir un nombre : ");
			
			try{
				aff = clavier.nextInt();
				System.out.println(aff);
			}
			catch(Exception erreur){
				System.out.println("Erreur, veuillez saisir un nombre");
				System.out.println(erreur.toString());
			}
			 //commentaire git
			// le changement
		}
}
