package Parte5;

import java.util.*;

public class Ex11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        List<Integer> numerosSorteados = new ArrayList<>();
        List<Integer> numerosEscolhidos = new ArrayList<>();
        while (numerosSorteados.size() < 6) {
            int numero = random.nextInt(60) + 1;
            numerosSorteados.add(numero);
        }
        while (numerosEscolhidos.size() < 6) {
            System.out.println("Digite um numero");
            int numero = sc.nextInt();
            numerosEscolhidos.add(numero);
        }
        List<Integer> acertos = new ArrayList<>();
        for(int num : numerosSorteados) {
            if(numerosEscolhidos.contains(num)) {
                acertos.add(num);
            }
        }
System.out.println("Você acertou " + acertos.size() + " e são " + acertos);
    }


}
