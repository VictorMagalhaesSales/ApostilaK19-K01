package Capitulo03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Operadores {

	public static void main(String[] args) {
		
		// 3.2 Convers�es entre tipos primitivos
			
			int valorInt = 123;
			long valorLong = valorInt;
			valorInt = (int)valorLong;
			
			long valorLong2 = 123123L;
			float valorFloat = valorLong2;
			valorLong2 = (long)valorFloat;
		
		// 3.3 Convers�es entre tipos primitivos e n�o primitivos
			
			// boxing
			int v1 = 123;
			Integer v2 = Integer.valueOf(v1);
			double d1 = 12.2;
			Double d2 = Double.valueOf(d1);
			
			// unboxing
			v1 = v2.intValue();
			d1 = d2.doubleValue();
			
		// 3.4 Convers�ao entre tipos primitivos e String
			
			String teste = "123";
			int int1 = Integer.parseInt(teste);
			double double1 = Double.parseDouble(teste);
			float flaot1 = Float.parseFloat(teste);
		
		// 3.5 Convers�es autom�ticas
			
			byte byte1 = 123; // A convers�o int -> byte � realizada automaticamente
			char char1 = 12; // A convers�o int -> char � realizada automaticamente
			Byte bytePri = 12; // O valor int foi convertido para byte e depois para Byte
			
		// 3.6 Operadores Aritm�ticos
			
			System.out.println("Adi��o: " + (50 + 12));
			System.out.println("Subtra��o: " + (50-5));
			System.out.println("Divis�o: " + (50/2));
			System.out.println("M�dulo: " + (51 % 2));
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
			// Modulo
			int b = 111 % 5;
			int c = 231 % 2;
			
			// Divis�o por 0
			double do1 = 10.0 / 0; // +Infinity
			double do2 = -10.0 / 0; // -Infinity
			double do3 = 0.0 / 0; // NaN
			
		// 3.7 Tipo do resultado de uma opera��o aritm�tica
			
			double result0 = 50.0 + 5;
			double result1 = 12.5 + 12;
			float result2 = 5 + 5f;
			int result3 = 6 + 5;

			System.out.println("Com o casting(double): " + ((double)5 + 5));
			System.out.println("Sem o casting: " + (5 + 5));
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 3.8 Divis�o inteira
			
			System.out.println( 5 / 2 ); // Exibe um resultado inteiro
			System.out.println( (double)5 / 2 ); // Exibe um resultado double
			System.out.println( (double)5 / (double)2 ); // Exibe um resultado double
			
		// 3.9 Overflow e Underflow

			System.out.println("Overflow no inteiro: " + (Integer.MAX_VALUE+1));
			System.out.println("Underflow no inteiro: " + (-Integer.MIN_VALUE-1));
			System.out.println("Overflow no double: " + (Double.MAX_VALUE*2));
			System.out.println("Overflow no double: " + (-Double.MAX_VALUE*2));
			System.out.println("Underflow no double: " + (Double.MIN_VALUE/2));
			System.out.println("Underflow no double: " + (-Double.MIN_VALUE/2));
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 3.10 Regras para opera��es aritm�ticas com valores especiais
			
			double infinity = Double.MAX_VALUE * 2;
				
			System.out.println(infinity-infinity);
			System.out.println(15 + infinity);
			System.out.println(5 - infinity);
			System.out.println(+0-0);
			System.out.println(-0-0);
			System.out.println(0*infinity);
			System.out.println(infinity*infinity);
			System.out.println(infinity/infinity);
			System.out.println(infinity / 5);
			System.out.println(0/5);
			System.out.println(infinity % 5);
			System.out.println(5 % infinity);
			System.out.println(0 % 5);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 3.11 Concatena��o de Strings
			
			String s1 = "Victor";
			String s2 = "Magalh�es";
			String s3 = "Sales";
			String s4 = s1 + s2 + s3;
			String s5 = s1 + 50;
			System.out.println(s4);
			System.out.println(s5);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 3.12 Opderadores un�rios + e -
			
			int vv1 = 1;
			int vv2 = 3;
			int vv3 = 5;
			int vv4 = 3;
			vv2 += 2;
			vv1 *= vv2;
			vv3 /= vv2;
			vv4 %= 2;

			System.out.println("vv1: " +vv1);
			System.out.println("vv2: " +vv2);
			System.out.println("vv3: " +vv3);
			System.out.println("vv4: " +vv4);
			System.out.println(++vv1);
			System.out.println(vv1++);
			System.out.println(--vv1);
			System.out.println(vv1--);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 3.13 Operadores de compara��o

			System.out.println(1 == 1);
			System.out.println(1 != 1);
			System.out.println(1 > 1);
			System.out.println(1 < 1);
			System.out.println(1 >= 1);
			System.out.println(1 <= 1);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 3.15 Operadores L�gicos

			System.out.println(1 <= 1 && 1 >= 1);
			System.out.println(1 <= 1 && 1 != 1);
			System.out.println(1 <= 1 || 1 != 1);
			System.out.println(1 <= 1 ^ 1 != 1);
			System.out.println(1 <= 1 ^ 1 == 1);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 3.16 Operador tern�rio
			
			double nota = 10.0 * Math.random();
			String resultado = nota>=6?"Aprovado":"Reprovado";
			System.out.println(resultado);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 3.17 Operador de nega��o
			
			boolean neg = true;
			System.out.println("Vari�vel: " + neg);
			System.out.println("Vari�vel com nega��o: " + !neg);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 3.18 incremento e descremento
			
			int i = 10;
			System.out.println("P�s incremento: " + i);
			System.out.println(i++);
			System.out.println("Pr� incremento: " + i);
			System.out.println(++i);
			System.out.println("P�s decremento: " + i);
			System.out.println(i--);
			System.out.println("Pr� decremento: " + i);
			System.out.println(--i);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 3.19 Avaliando uma express�o	
			
			int x = 2;
			int y = 1;
			System.out.println(1 + (((7 * 3) / 4) / ((double)((int)x))) - y);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 3.20 Opera��es com Strings
			
			String testando = "Testando uma string";
			
			// lengtg
			System.out.println(testando.length());
			// CharAt
			System.out.println(testando.charAt(5));
			// Contains
			System.out.println(testando.contains("Test"));
			// endsWith
			System.out.println(testando.endsWith("ing"));
			// startsWidth
			System.out.println(testando.startsWith("Test"));
			// replaceAll
			System.out.println(testando.replaceAll("a", "10"));
			// Substring
			System.out.println(testando.substring(2,5));
			// toUpperCase
			System.out.println(testando.toUpperCase());
			// toLowerCase
			System.out.println(testando.toLowerCase());
			// trim
			testando = "    Testando uma string       ";
			System.out.println(testando.trim());
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 3.21 Opera��es com Data e Hora 	
			
			Calendar dat = new GregorianCalendar(2018,07,02);
			Calendar datHoje = Calendar.getInstance();
			
			// add
			dat.add(Calendar.DAY_OF_MONTH, 1);
			dat.add(Calendar.YEAR, 1);
			dat.add(Calendar.HOUR, 10);
			System.out.println(dat.getTime());
			// before e after
			System.out.println(dat.before(datHoje));
			System.out.println(dat.after(datHoje));
			
		// 3.22	ERRO: Utilizaar opernados e operadores incomat�veis
			
			/*
			String ss1 = "aab";
			String ss2 = "bba";
			System.out.println(ss1 - ss2);
			*/
		
		// 3.23 ERRO: Divis�o inteira por zero
			
			/*
			System.out.println(10/0);
			*/
			
		// 3.24 ERRO: Armazenamneto de valores incompat�veis
			
			/*
			int valor1 = 12 + 10.0;
			*/
		
		// 3.25 ERRO: Castings n�o permitidos
			
			/*
			int test1 = 12;
			String varString = (String)test1;
			*/
	}

}
