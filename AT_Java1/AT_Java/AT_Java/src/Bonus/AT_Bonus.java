package Bonus;

import java.awt.*;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AT_Bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string");
        String resposta = sc.nextLine();
        String string = resposta.trim().replaceAll("\\s+", "");
        String[] caracteres = string.split("");


            Digitos digitos = new Digitos();
            for (int z = 0; z < caracteres.length; z++) {
            if("0123456789".contains(caracteres[z])){
                digitos.setDigitos(Integer.parseInt(caracteres[z]));
            }
            }


            Vogais vogais = new Vogais();

            String maisculo = "";
            for (int i = 0; i < caracteres.length; i++) {
                maisculo = maisculo.trim() + caracteres[i].toUpperCase();
                if ("AEIOU".contains(caracteres[i].toUpperCase())) {
                    String vogal = caracteres[i].toUpperCase();
                    vogais.setVogal(vogal);
                }
            }
            boolean inf = false;
            boolean net = false;
            for (int j = 0; j < 3; j++) {
                if ("INFinf".contains(caracteres[j])) {
                    inf = true;
                } else {
                    inf = false;
                }
            }
            for (int y = caracteres.length - 3; y < caracteres.length - 2; y++) {
                if ("NETnet".contains(caracteres[y])) {
                    net = true;
                } else {
                    net = false;
                }

            }
            if (inf) {
                System.out.println("A string começa com inf");
            } else {
                System.out.println("A string não começa com inf");
            }
            if (net) {
                System.out.println("A string termina com net");
            } else {
                System.out.println("A string não termina com net");
            }

            System.out.println("Digitos: " + digitos.nDigitos());
            System.out.println("Os doi primeiros digitos " + digitos.PrimeirosDigitos());
            System.out.println("Tudo em Maisculo: " + maisculo);
            System.out.println("Caracteres: " + caracteres.length);
            vogais.imprimirVogais();
        }

    }

