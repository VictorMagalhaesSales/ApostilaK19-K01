package Capitulo02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Variaveis {
	public static void main(String args[]){
		
	// 2.2 inicialização das variáveis
		int valor1 = 123;
		double valor2 = 2.4;
		boolean teste = true;
		
	// 2.3 Exibindp variáveis 
		System.out.println("Valor 1: " + valor1 + "\nvalor 2: " + valor2 + "\nteste: " + teste);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
	// 2.4 Copiando valores
		int a = 4;
		int b = 1;
		System.out.println("Variável 'A': " + a);
		System.out.println("Variável 'B': " + b);
		a = 6;
		b = 4;
		System.out.println("Variável 'A': " + a);
		System.out.println("Variável 'B': " + b);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
	// 2.5 Tipos Primitivos
		
		byte varB = 127;
		short varS = 32767;
		int varI = 2147483647;
		long varL = 9223372036854775807L;
		float varF = 2.5F;
		double varD = 2.5;
		boolean varBo = true;
		char varC = 43; // '+'
		
		
		// BIGINTEGER E BIGDECIMAL
		BigInteger biExemplo = new BigInteger("1321212332123112123321");
		System.out.println(biExemplo);
		
		BigDecimal bdExemplo = new BigDecimal("12312313.123");
		System.out.println(bdExemplo);
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// VALORES MÍNIMOS E MÁXIMOS
		
		// byte
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE + "\n");
		// short
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE + "\n");
		// int
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE + "\n");
		// long
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE + "\n");
		// float
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE + "\n");
		// double
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE + "\n");
		// char
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

	// 2.5 Tipos Não Primitivos
		
		Byte naoPrimitivoB;
		Short naoPrimitivoS;
		int naoPrimitivoI;
		Long naoPrimitivoL;
		Float naoPrimitivoF;
		Double naoPrimitivoD;
		Character naoPrimitivoChar;
		Boolean naoPrimitivoBo;
	
	// 2.7 String
		
		String varString = "Variável do tipo String";
		
	// 2.8 Data e Hora
		
		 Calendar dataHoraAtual = Calendar.getInstance();
		 System.out.println(dataHoraAtual.getTime());
		 
		 Calendar t = new GregorianCalendar(2001,01,15,11,6,30);
		 System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
	
	 // 2.8 Valores Literais
		 
		 // Null
		 Integer valorNull = null; // é diferente de 0
		 
		 // Boleanos
		 boolean literalBoleano = true;
		 System.out.println("literalBoleano: " + literalBoleano);
		 literalBoleano = false;
		System.out.println("literalBoleano: " + literalBoleano);
		 
		 // Inteiros
		int literalInteiro = 4; // decimal
		System.out.println("literalInteiro: " + literalInteiro);
		literalInteiro = 0b100; // b
		System.out.println("literalInteiro: " + literalInteiro);
		literalInteiro = 012; // octal
		System.out.println("literalInteiro: " + literalInteiro);
		literalInteiro = 0xA; // hexadeciaml
		System.out.println("literalInteiro: " + literalInteiro);
		
		// Reais
		double literalReal = 5.2;
		System.out.println("literalReal: " + literalInteiro);
		float literalRealFloat = 10.3F;
		System.out.println("literalReal: " + literalInteiro);
		
		// Caracteres
		char literalChar = 'K';
		System.out.println("literalChar: " + literalChar);
		literalChar = 75;
		System.out.println("literalChar: " + literalChar);
		literalChar = '\'';
		System.out.println("literalChar: " + literalChar);
		literalChar = 937;
		System.out.println("literalChar: " + literalChar);
		
		// Strings
		String literalString = "Sempre será definido com aspas duplas";
		System.out.println("literalString: " + literalString);
		
		// Legibilidade
		
		int legibilidade = 4_000_000;
		System.out.println("Legibilidade(4_000_000): " + legibilidade);
		 System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
	// 2.10 Modificador final
		
		final int finalb = 50;
		final int finalc;
		finalc = 50;
		
	// 2.11 Números Aleatórios
		
		double numeroAleatorio = Math.random();
		System.out.println("Exmeplo random: " + numeroAleatorio);
		
		// criando interlavos
		int maximo = 10;
		int minimo = 5;
		
		double numeroFinal = ((maximo-minimo) * Math.random()) + minimo;
		System.out.println("Número final(5->10): " + numeroFinal);
		
	// 2.12 Convenções de Nomenclatura

		String nomeVariavelComposto;
		
	// 2.13 Regras de Nomenclatura
		
		int nomeValido;
		int nome123Valido;
		int nomme_Valido;
		int nome$$Valido;
		int nomeValido$$123;
		
	// 2.14 Palavras Reservadas
	
	// 2.15 ERRO: Variáveis com nomes repetidos
		
		/*
		int a = 4;
		short a = 2;
		
		String var = "asd";
		Char var = 'a';
		*/
		
	// 2.16 ERRO: Esquecer a inicialização de uma variável local
		
		/*
		int naoIniciada;
		System.out.println(naoIniciada);
		*/
	
	//	2.17 ERRO: Trocar aspas simples por aspas duplas ou vice-versa
		
		/*
		char trocarAspas = "a";
		String trocarAspas2 = 'Sem as aspas duplas';
		*/
	
	// 2.18 ERRO: Utilizar o separador decimal errado	
		
		/*
		double separadorErrado = 19,09;
		float separadorErrado2 = 15,2F;
		*/
	
	// 2.19 ERRO: Valores incompatíveis com os tipos das variáveis
		
		/*
		int valoresIncopativel = 12.5;
		String valoresIncopativel2 = 123;
		char valoresIncopativel3 = "asdasd";
		*/
	
	// 2.20 ERRO: Esquecer dos caracteres de tipagem para long ou flat
		
		/*
		float semTipagem = 1230;
		long = 1234;
		*/
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		
		 

		
	
	}

}
