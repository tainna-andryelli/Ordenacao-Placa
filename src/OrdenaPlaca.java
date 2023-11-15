public class OrdenaPlaca {
  public void algoritmoDeOrdenacao1(Placa[] placas){
    //ordena as letras - Inserção Direta
    for(int i=1; i<placas.length; i++){
      int j = i;
      String letras = placas[i].getLetras();
      Placa placa = placas[i];
      
      while((j>0) && (placas[j-1].getLetras().compareTo(letras) > 0) ){
        placas[j] = placas[j-1];
        j--;
      }

      placas[j] = placa;
    }
  }

  public void algoritmoDeOrdenacao2(Placa[] placas){
    //ordena os números - seleção Direta
    int min = 0;
    for(int i=0; i<placas.length-1;i++){
      min = i;

      for(int j = i+1; j<placas.length; j++){
        int possivelMinimo = Integer.parseInt(placas[min].getNumeros());
        int valorComparacao = Integer.parseInt(placas[j].getNumeros()); 
        if(valorComparacao < possivelMinimo){
          min = j;
        }

      }

      Placa A = placas[i];
      placas[i] = placas[min];
      placas[min] = A;
    }
  }

  public void ordena(Placa[] placas){
    algoritmoDeOrdenacao2(placas);
    algoritmoDeOrdenacao1(placas); //ordenacao principal
  }
}
