package Bonus;

import java.util.Scanner;

public class MainDna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho das cadeias desejado");
        int tamanho = sc.nextInt();
        CadeiaDeDna cadeia1 = new CadeiaDeDna();
        CadeiaDeDna cadeia2 = new CadeiaDeDna();
        CadeiaDeDna cadeia3 = new CadeiaDeDna();
        String cadeiainicial1 =  cadeia1.gerarCadeiaDeDna(tamanho);
        String cadeiainicial2 =  cadeia2.gerarCadeiaDeDna(tamanho);
        String cadeiainicial3 =  cadeia3.gerarCadeiaDeDna(tamanho);

        AlgoritimosGeneticos algoritimo = new AlgoritimosGeneticos();


        String[] resultado1 = algoritimo.Recombinaçao(cadeiainicial1, cadeiainicial2);
        String resultado2 = algoritimo.Mutação(cadeiainicial3);
        System.out.println("Resultado da Combinação");
        System.out.println("Antes");
        System.out.println(cadeiainicial1);
        System.out.println(cadeiainicial2);
        System.out.println("Depois");
        System.out.println(resultado1[0]);
        System.out.println(resultado1[1]);
        System.out.println("===================");
        System.out.println("Resultado da Mutação");
        System.out.println(cadeiainicial3);
        System.out.println(resultado2);






    }
}
