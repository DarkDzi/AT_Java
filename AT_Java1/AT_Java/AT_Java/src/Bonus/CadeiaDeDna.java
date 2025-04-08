package Bonus;

import java.util.Random;

public class CadeiaDeDna {
    String[] proteinas ={"A", "C", "G", "T"};


    public String gerarCadeiaDeDna(int tamanho){
String[] cadeiaDeDna = new String[tamanho];
Random rand = new Random();
for(int i = 0; i < tamanho; i++){
    cadeiaDeDna[i] = proteinas[rand.nextInt(proteinas.length)];
}
String cadeia = "";
for(String proteina : cadeiaDeDna){
    cadeia = cadeia + proteina;
}


        return cadeia;
    }
}

