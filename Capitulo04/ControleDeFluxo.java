package Capitulo04;

public class ControleDeFluxo {

	public static void main(String[] args) {

		// 4.3 instrução if
		
			if(5 >= 3) {
				System.out.println("O valor é maior ou igual que 3");
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.4 Instrução else
			
			int v = 2;
			if(v >= 3) {
				System.out.println("O valor é maior ou igual que 3");
			}else {
				System.out.println("O valor não é maior ou igual que 3");
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.5 instruções de decisãao encadeadaas
			
			v = 2;
			if(v >= 3) {
				System.out.println("O valor é maior ou igual que 3");
			}else {
				if(v == 2) {
					System.out.println("O valor é igual a 2");
				}else {
					System.out.println("O valor é menor que 2");
				}
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.6 Instruções de repetição
		
		// 4.7 Instrução while
			
			int cont = 0;
			while(cont<=10) {
				System.out.print(cont + " ");
				cont++;
			}
			System.out.println("\nFim do contador(while)");
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.8	Insturção for
			
			for(int contfor = 0; contfor<=10; contfor++) {
				System.out.print(contfor + " ");
			}
			System.out.println("\nFim do contador(for)\n");
			
			
			for(int i1 = 0, i2 = 0; i1 <= 10 && i2 <= 10; i1++, i2 += 2) {
				System.out.print(i1 + "," + i2 + " ");
			}
			System.out.println("\nFim do contador complexo(for)");
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.9	Instruções de repetição encadeadaas
			
			System.out.println("Utilizando o FOR");
			for(int i = 1; i <= 5; i++) {
				for(int b = 1; b <= 5; b++){
					System.out.print("Sala: "+i+", Porta: "+b+"; ");
				}
				System.out.println();
			}
			System.out.println("\nUtilizando o WHILE");
			int ii = 1;
			while(ii<= 5) {
				int bb = 1;
				while(bb<=5) {
					System.out.print("Sala: "+ii+", Porta: "+bb+"; ");
					bb++;
				}
				System.out.println();
				ii++;
			}

			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.10 Instrução break	
			
			for(int b = 1; b <= 5; b++){
				System.out.println("Porta: "+b+"; ");
				if(b == 4) {
					break;
				}
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.11 Instrução continue	
			
			for(int b = 1; b <= 5; b++){
				if(b == 4) {
					continue;
				}
				System.out.println("Porta: "+b+"; ");
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.12 Bloco sem chaves
			
			for(int b = 1; b <= 5; b++)
				if(b % 2 == 0)
					System.out.println("O número: " + b + " é PAR!");

			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.13 Laços infinitos
			
			/*
			for(int cont1 = 0; cont1 <= 10;) {
				System.out.println(cont1);
			}
			
			int cont2 = 1;
			while(cont2 <= 5) {
				System.out.println(cont2);
			}*/
		
		// 4.14 instrução switch
			
			int valor1 = (int) (10 * Math.random());
			switch(valor1) {
				case 1:;
				case 2:;
				case 3:;
				case 4:;
				case 5: System.out.println(valor1 + " é menor ou igual a 5"); break;
				case 6:;
				case 7:;
				case 8:;
				case 9:;
				case 10: System.out.println(valor1 + " é maior que 5"); break;
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.15	Instrução do-while
			
			int contad = 1;
			do {
				System.out.print(contad + " ");
				contad++;
			}while(contad<=10);
			
		// 4.16 Unreachable code
			
			/*
			for(int i = 1; i<10; i++) {
				break;
				System.out.println(i);
			}*/
			
		// 4.17	ERRO: não utilizar condições booleanas
			
			/*
			if(5 + 3) {
				System.out.println("ERRO");
			}
			
			while(7-4){
				System.out.println("ERRO");
			}
			
			*/
		// 4.18	ERRO: Else sem if
			
			/*
			else {
				System.out.println("ERRO");
			}*/
			
		// 4.19 ERRO: else com condição	
			
			/*
			if(1>0) {
				System.out.println("CERTO");
			}else(1<0){
				System.out.println("ERRO");
			}*/
			
		// 4.20 ERRO: ponto e vírgula excedente
			
			/*
			if((1+2)> 3);{
				System.out.println("ERRO");
			}
			for(int i = 0; i<10; i++);{
				System.out.println("ERRO");
			}*/
		
		// 4.21 ERRO: laço infinito
			
			/*
			for(int i = 0; i <= 10;) {
				System.out.println(i);
			}
			
			int b = 1;
			while(b <= 5) {
				System.out.println(b);
			}*/
			
		// 4.22 ERRO: chave do switch com tipos incompatíveis
			
			/*
			double i = 1;
			
			switch(i){
				case 1.0:;
				case 2.0: System.out.println("ERRO");
			}*/
			
		// 4.23 ERRO: Casos do switch com expressões não constantes
			
			/*
			int i = 1;
			int b = 0;
			
			switch(i){
				case 1:;
				case b: System.out.println("ERRO");
			}*/
			
		// 4.24 ERRO: break ou continue fora de um laço
			
			/*
			if(5<0) {
				System.out.println("ERRO ABAIXO");
				continue;
			}
			if(5<0) {
				System.out.println("ERRO ABAIXO");
				break;
			}*/
			
			
		// 4.25 ERRO: Usar vírgulaa ao invés de ponto e vírgula no laço for
			
			/*
			for(int i = 0, i<10, i++) {
				System.out.println("ERRO");
			}*/
			
		
			
			
			
			
			
			
			
			
	}	
}
