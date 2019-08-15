import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Double valor1 = 0.0;
		Double operacion = 0.0;
		Double valor2 = 0.0;
		boolean check = true;
		boolean check2 = true;

		System.out.println("Ingrese un número");
		
		do {
			s = new Scanner(System.in);
			try {
				valor1 = s.nextDouble();
				check = valor1.isNaN();
			} catch (Exception e) {
				System.out.println("Ese no es un numero");
				check = true;
			}
			
		}while(check != false);
		
		
		System.out.println("Digite: 1 para Suma, 2 para Resta, 3 para Multiplicacion, 4 para Division");
		
			
		do {
			
			s = new Scanner(System.in);
	
			try {
				operacion = s.nextDouble();
				check = operacion.isNaN();
				check2 = false;
				
			} catch (Exception e) {
				System.out.println("Esa no es una opcion de operador");
				check = true;
			}
			
			if(operacion == 1 || operacion == 2 || operacion == 3 || operacion == 4 || check2 == true) {
				check = false;
			}else {
				check = true;
				System.out.println("Esa no es una opcion de operador");
			}
						
		}while(check != false);
		
		
		
		
		

		
		

		System.out.println("Ingrese otro número");
		
		do {
			
			s = new Scanner(System.in);
			try {
				valor2 = s.nextDouble();
				check = valor2.isNaN();
			} catch (Exception e) {
				System.out.println("Ese no es un numero");
				check = true;
			}
			
		}while(check != false);
			

			
	
			
		CalculadoraDigital d = new CalculadoraDigital();
		if (operacion==1) {
			d.suma(valor1, valor2);
		} else if (operacion==2) {
			d.resta(valor1, valor2);
		} else if (operacion==3) {
			d.multiplicacion(valor1, valor2);
		} else if (operacion==4) {
			d.division(valor1, valor2);
		}
	}

		
	}

