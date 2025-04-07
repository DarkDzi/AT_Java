package Parte2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double jurosmensal = 0.03;
        boolean parcelanegada = true;
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do empréstimo:");
        double valor = sc.nextDouble();


        System.out.println("Quantas parcelas você deseja fazer");
        int parcelas = sc.nextInt();

            while (parcelanegada) {
                System.out.println("Digite um numero válido de parcelas, (mínimo 6, máximo 48)");
                parcelas = sc.nextInt();
                if(parcelas >= 6 && parcelas <= 48){
                    parcelanegada = false;
                }
            }


        double valormensal = valor/parcelas + (jurosmensal * valor);
        double totalapagar = valormensal * parcelas;
        System.out.println("Olá " + nome + " Você pagara o total de " + totalapagar + " com o valor de cada parcela sendo " + String.format("%.2f", valormensal));


    }
}
