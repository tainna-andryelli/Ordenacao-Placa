public class TestePlaca {
  public static void main(String[] args) {
		//gerando um num de placas aleatorio:
		Placa[] placas = new Placa[(int)(Math.random()*100+1)];
		
		for(int i=0; i<placas.length; i++){
			String numero = "";
			for(int j=0; j<4; j++)
				numero += (int)(Math.random()*10);

			String letras = "";
      for(int j=0; j<3; j++)
				letras += (char)((int)(Math.random()*26) + 65);

			placas[i] = new Placa(letras, numero);
		}
		
		//placas antes da ordenacao:
		System.out.println("Placas antes da Ordenação:");
		for(Placa p: placas)
			System.out.println(p);

		//Ordenando as placas:
		OrdenaPlaca op = new OrdenaPlaca();
		op.ordena(placas);
		
		System.out.println("\nPlacas depois da ordenação:");
		for(Placa p: placas)
			System.out.println(p);
	}
}
