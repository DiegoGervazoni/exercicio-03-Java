import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primeiraEntrada = sc.nextInt();
		int segundaEntrada = sc.nextInt();
		int terceiraEntrada = sc.nextInt();
		int quartaEntrada = sc.nextInt();
		
		int diferenca;
		
		diferenca = (primeiraEntrada * segundaEntrada - terceiraEntrada * quartaEntrada);
		
		System.out.println("Diferença entre os numeros: " + diferenca);
		
		sc.close();
	}

}
