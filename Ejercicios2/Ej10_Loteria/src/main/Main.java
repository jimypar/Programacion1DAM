package main;

public class Main {

	public static void main(String[] args) {
		
		
		int num = (int) (Math.random()*100)+1;
		
		System.out.println("El numero es: "+num);
		
		if (num<=4 && num>=1) {
			
			System.out.println(" ha ganado el primer premio ");
			
		}
		
		else if ((num<=15 && num>=5) || (num>=75 && num<=90)) {
			
			System.out.println(" Ha ganado el segundo premio.");
			
		}

		else if ((num<=30 && num>=20) || (num>=40 && num<=50) || (num>=60 && num<=70)) {
			
			System.out.println(" Ha ganado el tercer premio. ");
			
		}
		
		else {
			
			System.out.println("No has ganado nada.");
			
		}
	}

}
