import java.util.Scanner;
public class Asteriscos {

	/**
	 * Elaborado por Carlos Perez.
	 * Organizacionde Archivos y estructuras de Datos.
	 * Sabado 7:00-9:30
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		do{
			System.out.println("Digite un numero del 1 al 8\nPara salir presione 0: ");
			numero = entrada.nextInt();
			
			switch(numero){
			case 1:
				for(int i=0; i<3; i++){
					System.out.print("*");
				}
				System.out.println("");
				break;
			case 2:
				for(int i=0; i<3; i++){
					System.out.println("*");
				}
				break;
			case 3:
				for(int i=3; i>0; i--){
					for(int j=0; j<i;j++){
						System.out.print("*");
					}
					System.out.println("");
				}
				break;
			case 4:
				for(int i=0; i<3; i++){
					for(int j=0; j<=i;j++){
						System.out.print("*");
					}
					System.out.println("");
				}
				break;
			case 5:
				for(int i=0; i<3; i++){
					for(int j=0; j<3;j++){
						System.out.print("*");
					}
					System.out.println("");
				}
				break;
			case 6:
				for(int i=0; i<3; i++){
					if(i==1){
						System.out.println(" ");
						continue;
					}
					for(int j=0; j<3;j++){
						
						if(j==1){
							System.out.print(" ");
						}else{
							System.out.print("*");
						}
					}
					System.out.println(" ");
				}
				break;
			case 7:
				String [][] matrix = {
						{"*"," ","*"},{" ","*"," "},{"*"," ","*"}
				};
				for(int i=0; i<matrix.length;i++){
					for(int j=0; j<3;j++){
						System.out.print(matrix[i][j]);
					}
					System.out.println("");
				}
				break;
			case 8:
				for(int i=0; i<3; i++){
					for(int j=0; j<=i;j++){
						System.out.print("*");
					}
					System.out.println("");
				}
				for(int i=2; i>0; i--){
					for(int j=0; j<i;j++){
						System.out.print("*");
					}
					System.out.println("");
				}
				break;
			default:
				if(numero == 0) continue;
				System.out.print("Numero ingresado no es correcto.");
				break;	
			
			}
		}while(numero != 0);
		entrada.close();
	}

}
