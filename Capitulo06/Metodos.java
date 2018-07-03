package Capitulo06;

public class Metodos {
	
	// 6.2 Estrutura geral de um m�todo
	
		static void exibeCabecalho(){
			System.out.println("=-=-=-=-= K19 Treinamentos =-=-=-=-=");
			System.out.println("=-=-=-=- cibtati@k19.com.br -=-=-=-=");
			System.out.println("=-=-=-=-=-= 11 2387-3791 =-=-=-=-=-=");
		}
		
	// 6.3 Par�metros
		
		static void calcularJurosSimples(double capital, double taxa, int periodo) {
			double juro = capital * taxa * periodo;
		}
		
	// 6.4 Resposta
		
		static double calcularJurosSimplesComResposta(double capital, double taxa, int periodo) {
			double juro = capital * taxa * periodo;
			return juro;
		}
		
	// 6.5	Passagem de par�metros
		
		static void teste(int a) {
			a = 4;
		}
		
	// 6.6 Sobrecarga	
		
		static void maximo(int a, int b, int c, int d) {
			// L�gica para identificar o maior n�mero
		}
		static void maximo(int a, int b, int c) {
			// L�gica para identificar o maior n�mero
		}
		static void maximo(int a, int b) {
			// L�gica para identificar o maior n�mero
		}
		
	// 6.7 Varargs
		
		static int calcularSoma(int n1, int ... valores) {
			int soma = n1;
			for(int i = 0; i<valores.length; i++){
				soma += valores[i];
			}
			return soma;
		}
		
	// 6.8 ERRO: par�metros incompat�veis
		
		 static int parametrosIncompativeis(int n1) {
			return n1;
		}
		 
	// 6.9 ERRO: resposta incompat�vel
		 
		 static String metodo() {
			 return "M�todo que retorna String";
		 }
		 
	// 6.10 ERRO: esquecer a instru��o return
		 
		 /*
		 static int teste() {
			 System.out.println("O 'return' n�o foi adicionado");
		 }
		 */
		 
	// 6.11 ERRO: n�o utilizar os par�nteses
		 
		 /*
		 static void erro{
			 System.out.println("ERRO!");
		 }
		 */
		

	public static void main(String[] args) {
		// 6.2
		exibeCabecalho();
		
		// 6.4
		System.out.println("Juro: " + calcularJurosSimplesComResposta(20000, 0.03, 24));
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 6.5
		int a = 1;
		teste(a);
		System.out.println(a); // Continua sendo 1
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 6.6
		maximo(1,2);
		maximo(1,2,3);
		maximo(1,2,3,4);
		
		// 6.7
		System.out.println("Soma dos valores: " + calcularSoma(1,4,4,5,6));
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 6.8
		/*
		parametrosIncompativeis("a");
		*/
		
		// 6.9
		/*
		int a = metodo();
		double a = metodo();
		*/
		
		
		
		
		

	}

}
