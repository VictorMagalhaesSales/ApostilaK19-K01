package Capitulo04;

public class ControleDeFluxo {

	public static void main(String[] args) {

		// 4.3 instru��o if
		
			if(5 >= 3) {
				System.out.println("O valor � maior ou igual que 3");
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.4 Instru��o else
			
			int v = 2;
			if(v >= 3) {
				System.out.println("O valor � maior ou igual que 3");
			}else {
				System.out.println("O valor n�o � maior ou igual que 3");
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.5 instru��es de decis�ao encadeadaas
			
			v = 2;
			if(v >= 3) {
				System.out.println("O valor � maior ou igual que 3");
			}else {
				if(v == 2) {
					System.out.println("O valor � igual a 2");
				}else {
					System.out.println("O valor � menor que 2");
				}
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.6 Instru��es de repeti��o
		
		// 4.7 Instru��o while
			
			int cont = 0;
			while(cont<=10) {
				System.out.print(cont + " ");
				cont++;
			}
			System.out.println("\nFim do contador(while)");
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.8	Instur��o for
			
			for(int contfor = 0; contfor<=10; contfor++) {
				System.out.print(contfor + " ");
			}
			System.out.println("\nFim do contador(for)\n");
			
			
			for(int i1 = 0, i2 = 0; i1 <= 10 && i2 <= 10; i1++, i2 += 2) {
				System.out.print(i1 + "," + i2 + " ");
			}
			System.out.println("\nFim do contador complexo(for)");
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.9	Instru��es de repeti��o encadeadaas
			
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
		
		// 4.10 Instru��o break	
			
			for(int b = 1; b <= 5; b++){
				System.out.println("Porta: "+b+"; ");
				if(b == 4) {
					break;
				}
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.11 Instru��o continue	
			
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
					System.out.println("O n�mero: " + b + " � PAR!");

			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 4.13 La�os infinitos
			
			/*
			for(int cont1 = 0; cont1 <= 10;) {
				System.out.println(cont1);
			}
			
			int cont2 = 1;
			while(cont2 <= 5) {
				System.out.println(cont2);
			}*/
		
		// 4.14 instru��o switch
			
			int valor1 = (int) (10 * Math.random());
			switch(valor1) {
				case 1:;
				case 2:;
				case 3:;
				case 4:;
				case 5: System.out.println(valor1 + " � menor ou igual a 5"); break;
				case 6:;
				case 7:;
				case 8:;
				case 9:;
				case 10: System.out.println(valor1 + " � maior que 5"); break;
			}
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 4.15	Instru��o do-while
			
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
			
		// 4.17	ERRO: n�o utilizar condi��es booleanas
			
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
			
		// 4.19 ERRO: else com condi��o	
			
			/*
			if(1>0) {
				System.out.println("CERTO");
			}else(1<0){
				System.out.println("ERRO");
			}*/
			
		// 4.20 ERRO: ponto e v�rgula excedente
			
			/*
			if((1+2)> 3);{
				System.out.println("ERRO");
			}
			for(int i = 0; i<10; i++);{
				System.out.println("ERRO");
			}*/
		
		// 4.21 ERRO: la�o infinito
			
			/*
			for(int i = 0; i <= 10;) {
				System.out.println(i);
			}
			
			int b = 1;
			while(b <= 5) {
				System.out.println(b);
			}*/
			
		// 4.22 ERRO: chave do switch com tipos incompat�veis
			
			/*
			double i = 1;
			
			switch(i){
				case 1.0:;
				case 2.0: System.out.println("ERRO");
			}*/
			
		// 4.23 ERRO: Casos do switch com express�es n�o constantes
			
			/*
			int i = 1;
			int b = 0;
			
			switch(i){
				case 1:;
				case b: System.out.println("ERRO");
			}*/
			
		// 4.24 ERRO: break ou continue fora de um la�o
			
			/*
			if(5<0) {
				System.out.println("ERRO ABAIXO");
				continue;
			}
			if(5<0) {
				System.out.println("ERRO ABAIXO");
				break;
			}*/
			
			
		// 4.25 ERRO: Usar v�rgulaa ao inv�s de ponto e v�rgula no la�o for
			
			/*
			for(int i = 0, i<10, i++) {
				System.out.println("ERRO");
			}*/
			
		
			
			
			
			
			
			
			
			
	}	
}
