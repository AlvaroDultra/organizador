package organizador;

import java.util.Scanner;

public class Passivos {
	public static double renda() {
		double renda_mensal;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bem vindo ao organizador financeiro, para iniciar digite sua renda mensal liquida ");
		renda_mensal=s.nextDouble();
		return renda_mensal;
		
	}
	
public static double passivos(double renda_mensal){
	double aluguel, agua, eletricidade, fin, fintotal = 0, gastototal = 0, renda_restante, porcentagem;
	int contfin;
	int cont = 0;
	Scanner s = new Scanner(System.in);
	
	
	System.out.println("Agora informe quanto voce gasta com aluguel ");
	aluguel = s.nextDouble();
	System.out.println("Agora informe quanto voce gasta com agua em media ");
	agua = s.nextDouble();
	System.out.println("Agora informe quanto voce gasta com eletricidade em media ");
	eletricidade = s.nextDouble();
	System.out.println("Quantos financiamentos voce possui ");
	contfin = s.nextInt();
	if (contfin>=1) {
		System.out.println("Digite o valor do primeiro financiamento ");
		fin = s.nextDouble();
		fintotal +=fin;
		cont ++;
		while(contfin!=cont) {
			System.out.println("Digite o valor de seu proximo financiamento ");
			fin = s.nextDouble();
			fintotal +=fin;
			cont ++;
				
			}
			 gastototal = aluguel + agua + eletricidade + fintotal;
			 renda_restante = renda_mensal - gastototal;
			 
			 
			 
			 
			 
			
		}
	 return gastototal;
	}
public static double porcentagem(double gastototal, double renda_mensal) {
	double porcentagem;
	porcentagem = (gastototal/renda_mensal)*100;
	return porcentagem;
	
	
}
public static String regra(double porcentagem) {
	
	String res;
	
	
	if (porcentagem > 70) {
		res = "A regra de organizacao financeira 70/30 define que suas despesas fixas devem estar abaixo de 70%, no seu caso, elas estao em " + porcentagem + "% recomenda-se que voce procure reduzir suas despesas mensais ou aumentar sua renda antes de realizar alguim investimento financeiro";
		
	}
	else if (porcentagem == 70){
		res = "A regra de organizacao financeira 70/30 define que suas despesas fixas devem estar abaixo de 70%, no seu caso, elas estao em " + porcentagem + "% diante disso, voce demonstra um bom controle de sua vida financeira, no entanto, voce nao possui margem para investimentos sem sacrificar seus gastos com despesas pessoais";
		
	}
	else {
		res = "A regra de organizacao financeira 70/30 define que suas despesas fixas devem estar abaixo de 70%, no seu caso, elas estao em " + porcentagem + "% podemos observar que voce possui margem saudavel para investimentos financeiros sem sacrificar seus gastos pessoais e nem seu custo fixo de vida, diante disso, recomenda-se que procure um auxiliar de investimentos para rentabilizar seu dinheiro e aumentar sua renda mensal";
	}
	return res;
}
}
