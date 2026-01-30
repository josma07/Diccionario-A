package tema6_ejerDicA;

import java.util.Scanner;

public class Main {
	static void imprimirMenu() {
		System.out.println("Elija una opcion: ");
		System.out.println("1) introducir un término y su definición en el diccionario");
		System.out.println("2) mostrar todos los términos");
		System.out.println("3) obtener la definición de un término que el usuario introduzca");
		System.out.println("4) eliminar un término y su definición");
		System.out.println("0) Salir");
	}

	public static void main(String[] args) {
		Palabra[] diccionario = new Palabra[100];
		Scanner sc = new Scanner(System.in);
		int op;

		do {
			imprimirMenu();
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("Dime el termino: ");
				String termino = sc.nextLine();
				System.out.println("Dime la definicion: ");
				String definicion = sc.nextLine();
				diccionario[Palabra.getCont()] = new Palabra(termino, definicion);
				break;
			case 2:
				try {
					for (Palabra pal : diccionario) {
						System.out.println(pal.getTermino());
					}
				} catch (NullPointerException e) {

				}
				break;
			case 3:
					System.out.println("Dime un termino ya incluido");
					String term = sc.nextLine();
					try {
					for (Palabra pal : diccionario) {
						if (pal.getTermino().equals(term)) {
							System.out.println(pal.getDefinicion());
						}
					}
						}catch (Exception e1) {

						}
					
				break;
			case 4:
				System.out.println("Dime que termino quieres eliminar: ");
				String t = sc.nextLine();
				try {
				for (int i = 0; i < 100; i++) {
					if (diccionario[i].getTermino().equals(t)) {
						diccionario[i].setDefinicion("");
						diccionario[i].setTermino("");
					}
				}
				}catch (NullPointerException e2) {

				}
			}
		} while (op != 0);

} }
