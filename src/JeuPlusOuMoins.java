import java.util.Scanner;

public class JeuPlusOuMoins {

	public static void main(String[] args){
		int nombre_secret, nombre_user;
		Scanner clavier = new Scanner(System.in);
				
	nombre_secret = (int) (Math.random()*999) + 1;
		
	do{
			System.out.print("Entrez un nombre (1-1000) :");
			nombre_user = clavier.nextInt();
			
			if(nombre_user == nombre_secret){
				System.out.println("Félicitation");
			}
			
			else if( nombre_user > nombre_secret){
				System.out.println("Le nombre est trop grand");
			}
				else {
					System.out.println("Le nombre est trop petit");
	
		}}
		while( nombre_user != nombre_secret);

		}
	}
	

	

