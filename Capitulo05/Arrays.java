package Capitulo05;

public class Arrays {

	public static void main(String[] args) {
		
		// 5.4 Declara��o
		
			int[] numeros;
			int numeros1[];
			int[] n1,n2,n3;
			
		// 5.5 Inicializa��o
			
			int nomes[] = new int[10];
			boolean teste[] = new boolean[5];
			String pessoas[] = new String[5];
			
		// 5.6	Acessando o conte�do de um array

			System.out.println(pessoas[0]);
			System.out.println(pessoas[2]);
			System.out.println(pessoas[3]);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 5.7 Alterando o conte�do de um array
			
			pessoas[0] = "Victor";
			pessoas[1] = "Nicolas";
		
		// 5.8 Outras formas de inicializa��o
			
			String cidades[] = new String[]{"Maracana�","Fortaleza","Pacatuba"};
			String paises[] = {"Brasil","Paraguai"};
			
		// 5.9 Percorrendo um array
			
			for(int i = 0; i<5; i++) {
				pessoas[i] = String.valueOf(i);
			}
			for(int i = 0; i<5; i++) {
				System.out.print(pessoas[i] + " ");
			}
			System.out.println();
			
			// length
			for(int i = 0; i<pessoas.length; i++) {
				System.out.print(pessoas[i] + " ");
			}
			System.out.println();
			
			//foreach
			for(String nome : pessoas){
				System.out.print(nome + " ");
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 5.10 Array multidimensional
			
			// Declara��o
			int[][] nx;
			int[] ny[][];
			int nnz[][][][];
			
			// Inicializa��o
			int[][] nn = new int[5][5];
			int[][] nn2 = new int[5][];
			
			// Outras formas de inicializa��o
			nx = new int[][]{{1,2,3},{1,2}};
			
			// Aceso
			nn[1][2] = 1;
			nn[0][0] = 3;
			
			//Percorrendo um array multidimensional
			for(int i = 0; i < 5; i++){
				for(int a = 0; a < 5; a++) {
					nn[i][a] = i + a;
				}
			}
			for(int i = 0; i < 5; i++){
				for(int a = 0; a < 5; a++) {
					System.out.print(nn[i][a] + " ");
				}
				System.out.println();
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 5.11	ERRO: utilizar valores incompat�veis com �ndices de um array
			
			/*
			double[] erroD = new double[4];
			erroD[1.0] = 4;
			*/
		
		// 5.12 ERRO: n�o definir a primeira dimens�o de um array em sua inicializa��o
			
			/*
			int[][] b = new int[][4];
			*/
			
		// 5.13 ERRO: acessar uma posi��o inv�lida de um array
			
			/*
			int[] x = new int[4];
			x[5] = 1;
			*/

	}

}
