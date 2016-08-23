import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Automato tal = new Automato();

		String stringElementos, stringDelta, stringEstadosFinais,estadoInicial;
		int qtdEstados;
		
		Scanner entrada = new Scanner(System.in);
		
		stringElementos = entrada.nextLine();
		tal.setelementos(stringElementos);
		
		qtdEstados = entrada.nextInt();
		tal.setestado(qtdEstados);
		
		estadoInicial = entrada.nextLine();
		try {
			tal.setestadoIni(estadoInicial);
		} catch (AutomatoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMensagem());
			// e.printStackTrace();
		}
		
	}

}
