package Parte5;

import java.awt.*;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome1;
        String nome2;
        System.out.println("Digite o nome do primeiro usuario");
        nome1 = sc.nextLine();
        System.out.println("Digite o nome do segundo usuario");
        nome2 = sc.nextLine();

        String[] mensagems = new String[10];
        int contador = 0;
         while(contador < mensagems.length){

                 System.out.println(nome1 + " Digite sua mensagem: ");
                 mensagems[contador] = nome1 + ": " + sc.nextLine();
                 contador++;
                 System.out.println(nome2 + " Digite sua mensagem: ");
                 mensagems[contador] = nome2 + ": " + sc.nextLine();
                 contador++;

         }
         System.out.println("Seu tempo de conversa terminou :(");
         System.out.println("----Seu historico de mensagems---");
         for(int i = 0 ; i < mensagems.length; i++){
             System.out.println(mensagems[i]);
         }
    }
}
