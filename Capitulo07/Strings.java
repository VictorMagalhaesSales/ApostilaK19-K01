package Capitulo07;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Strings {

	public static void main(java.lang.String[] args) {
		
		// 7.1 Referências
		
			String nome = "Victor";
			
		// 7.2 Pool de Strings
			
			String a = "Victor";
			String b = "Victor";
			System.out.println(a.intern());
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 7.3 Diferença entre o operador '==' e o método equals
			
			String s1 = "K19";
			String s2 = "K19";
			String s3 = new String("K19");
			String s4 = new String("K19");
			System.out.println("• Utilizando o operador '=='");
			System.out.println(s1 == s2);
			System.out.println(s3 == s4);
			System.out.println("• Utilizando método equals");
			System.out.println(s1.equals(s2));
			System.out.println(s3.equals(s4));
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 7.4 Imutabilidade
			
			String n1 = "Victor";
			String n2 = n1.toUpperCase();
			System.out.println(n1);
			System.out.println(n2);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 7.5 StringBuilder
			
			StringBuilder stringBuilder = new StringBuilder();
			
			for(int i = 0; i < 5; i++) {
				stringBuilder.append(i + " ");
			}
			String contagem = stringBuilder.toString();
			System.out.println("Contagem: " + contagem);
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
		
		// 7.6 Formatação
			
			System.out.format("%27s\n", "CUPOM FISCAL");
			
			//Parâmetros da string de formatação
			System.out.format("%s %s %s\n", "PRIMEIRO","SEGUNDO","TERCEIRO");
			System.out.format("%2$s %3$s %1$s\n", "PRIMEIRO","SEGUNDO","TERCEIRO");
			
			//Definindo a quantidade mínima de caracteres
			System.out.format("%30s %20s %10s\n", "PRIMEIRO","SEGUNDO","TERCEIRO");
			
			//Alinhamento
			System.out.format("%-20s %-30s %-40s\n", "PRIMEIRO","SEGUNDO","TERCEIRO");
			
			
			
			String produto1 = "Leite";
			produto1 = produto1.substring( 0 , Math.min(16, produto1.length()));
			String produto2 = "Café";
			produto2 = produto2.substring( 0 , Math.min(16, produto2.length()));
			String produto3 = "Biscoito";
			produto3 = produto3.substring( 0 , Math.min(16, produto3.length()));
			String produto4 = "Biscoito de chocolate";
			produto4 = produto4.substring( 0 , Math.min(16, produto4.length()));
			
			float preco1 = 5;
			double preco2 = 3;
			double preco3 = 1;
			double preco4 = 1.5;
			int qtd1 = 2;
			int qtd2 = 3;
			int qtd3 = 4;
			int qtd4 = 4;
			double total1 = preco1 * qtd1;
			double total2 = preco2 * qtd2;
			double total3 = preco3 * qtd3;
			double total4 = preco4 * qtd4;
			double totalCompra = total1+total2+total3+total4;
			
			System.out.println();
			System.out.println("------------------------------------------");
			System.out.format("%-16s %10s %3s %10s\n", "Produto","Unitario","QTD","TOTAL");
			System.out.println("------------------------------------------");
			System.out.format("%-16s %10.2f %03d %10.2f\n", produto1, preco1,qtd1,total1);
			System.out.format("%-16s %10.2f %03d %10.2f\n", produto2, preco2,qtd2,total2);
			System.out.format("%-16s %10.2f %03d %10.2f\n", produto3, preco3,qtd3,total3);
			System.out.format("%-16s %10.2f %03d %10.2f\n", produto4, preco4,qtd4,total4);
			System.out.println("------------------------------------------");
			System.out.format("TOTAL: R$ %s \n ", totalCompra);
			System.out.println("------------------------------------------");
			System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			
		// 7.7 Formatação de Data e Hora
			
			Calendar novaData = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			String dataFormatada = sdf.format(novaData.getTime());
			System.out.println("Data e hora: " + dataFormatada);

	}

}
