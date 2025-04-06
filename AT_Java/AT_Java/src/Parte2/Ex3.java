package Parte2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double imposto = 0;
        System.out.println("Informe seu Salario mensal");
        double salario = sc.nextDouble();



         if(salario <= 22847.76 ){
             System.out.println("Insento a Impostos");
         }else if(salario > 22847.76 && salario <= 33919.81){
             System.out.println("Você deve pagar 7.6%");
             imposto = 7.6;
         }else if(salario >= 33919.81 && salario <= 45012.60){
             System.out.println("Você deve pagar 15%");
             imposto = 15.0;
         }else if(salario > 45012.61){
             System.out.println("Você deve pagar 27.5%");
             imposto = 27.5;
         }
        double salarioliquido = salario - (imposto/100 * salario);

         System.out.println("Valor do Imposto: " + imposto/100 * salario);
         System.out.println("Total de sálario liquido: " + salarioliquido);
    }
}
