package Bonus;

import java.util.Random;


public class AlgoritimosGeneticos {
    String[] proteinas = {"A", "C", "G", "T"};


    public String[] Recombinaçao(String cadeia1, String cadeia2) {
        String[] cadeiaseparada1 = cadeia1.split("");
        String[] cadeiaseparada2 = cadeia2.split("");
        String cadeiamutada1 = "";
        String cadeiamutada2 = "";

        Random rand = new Random();
        int pontodecorte = rand.nextInt(cadeiaseparada1.length - 1);

        for (int i = 0; i < pontodecorte; i++) {
            cadeiamutada1 += cadeiaseparada1[i];
        }

        for (int i = pontodecorte; i < cadeiaseparada1.length; i++) {
            cadeiamutada1 += cadeiaseparada2[i];
        }

        for (int i = 0; i < pontodecorte; i++) {
            cadeiamutada2 += cadeiaseparada2[i];
        }

        for (int i = pontodecorte; i < cadeiaseparada2.length; i++) {
            cadeiamutada2 += cadeiaseparada1[i];
        }

        String[] resultado = {cadeiamutada1, cadeiamutada2};
        return resultado;
    }

        public String Mutação (String cadeia1){
            String[] cadeiaseparada = cadeia1.split("");
            Random rand = new Random();

            cadeiaseparada[rand.nextInt(cadeiaseparada.length)] = proteinas[rand.nextInt(proteinas.length)];
            String cadeiamutada = "";
            for (int i = 0; i < cadeiaseparada.length; i++) {
                cadeiamutada = cadeiamutada + cadeiaseparada[i];
            }

            return cadeiamutada;
        }

}

