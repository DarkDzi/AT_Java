package Parte2;

import java.awt.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean senhacerta = false;

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        while (!senhacerta) {
            System.out.println("Digite sua Senha:");
            String senha = sc.nextLine();
            String[] caracters = senha.split("");


            if (caracters.length < 8) {
                System.out.println("A senha deve ter pelo menos 8 caracteres!");
                senhacerta = false;
            } else if (!senha.matches(".*[A-Z].*")) {
                System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
                senhacerta = false;
            } else if (!senha.matches(".*\\d.*")) {
                System.out.println("A senha deve conter pelo menos um número.");
                senhacerta = false;
            } else if (!senha.matches(".*[@#$%^&+=!].*")) {
                System.out.println("A senha deve conter pelo menos um caractere especial (@, #, $, etc.).");
                senhacerta = false;
            } else {
                System.out.println("Senha Válida!");
                senhacerta = true;
            }
        }
    }

}



