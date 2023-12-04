package organizador;



public class Main {

	public static void main(String[] args) {
		
	double renda  = Passivos.renda();
	double gasto = Passivos.passivos(renda);
	double porcentagem = Passivos.porcentagem(gasto, renda);
	System.out.println(Passivos.regra(porcentagem));
		

		

	}

}
