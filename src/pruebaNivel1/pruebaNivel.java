package pruebaNivel1;
import java.util.Scanner;
public class pruebaNivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String nomb, ape, manzana, passw, fruta;
		int edad, menu;
		double precio1, precio2, precio3, suma;
		System.out.println("Introduce el nombre: ");
		nomb = teclado.next();
		System.out.println("Intorduce el apellido: ");
		ape = teclado.next();
		System.out.println("Introduce la edad");
		edad = teclado.nextInt();
		if (edad < 18) {
			System.out.println("No puedes introducirte en el sistema");
		}
		
		else {
			System.out.println("Bienvenido " +nomb +" " +ape +" a la fruteria");
			System.out.println("1 - Realizar una nueva compra");
			System.out.println("2 - Comprobar si existe fruta");
			System.out.println("3 - Introducir fruta");
			System.out.println("4 - Salir");
			System.out.println("Que quieres realizar? ");
			menu = teclado.nextInt();
			switch (menu) {
			case 1:
				System.out.println("**Realizar compra**");
				System.out.println("Introduce el precio del primer producto:");
				precio1 = teclado.nextDouble();
				while (precio1 < 0) {
					System.out.println("ERROR, introducelo de nuevo");
					System.out.println("Introduce el precio del primer producto:");
					precio1 = teclado.nextDouble();
				} 
				System.out.println("Introduce el precio del segundo producto:");
				precio2 = teclado.nextDouble();
				while (precio2 < 0) {
					System.out.println("ERROR, introducelo de nuevo");
					System.out.println("Introduce el precio del primer producto:");
					precio2 = teclado.nextDouble();
				} 
				System.out.println("Introduce el precio del tercer producto:");
				precio3 = teclado.nextDouble();
				while (precio3 < 0) {
					System.out.println("ERROR, introducelo de nuevo");
					System.out.println("Introduce el precio del primer producto:");
					precio3 = teclado.nextDouble();
				}				
				suma = precio1 + precio2 + precio3;
				System.out.println("Total: " +suma);
				break;
			case 2:
				System.out.println("**Comprobar si existe fruta**");
				System.out.println("Introduce el nombre de la futa");
				manzana = teclado.next();
				if (manzana.equalsIgnoreCase("manzana")   ) {
					System.out.println("Si tenemos esa fruta");
				}
				else {
					System.out.println("No tenemos esa fruta");
				}
				break;
			case 3:
				System.out.println("**Introducir fruta**");
				do {
					System.out.println("Para realizar esta accion necesitas ser administrador. Introduce la contraseña");
					passw = teclado.next();
				}while (!passw.equals("abc"));
					
				System.out.println("Introduce el nombre de la furta:");
				fruta = teclado.next();
				for (int i = 0; i<3; i++) {
					System.out.println("La fruta " +fruta +" se ha guardado");
					
				}
				break;
			case 4:
				System.out.println("**Salir**");
				System.out.println("Hasta luego " +nomb);
				break;
				
				default :
					System.out.println("Elija una opcion correcta");
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		teclado.close();
	}

}
