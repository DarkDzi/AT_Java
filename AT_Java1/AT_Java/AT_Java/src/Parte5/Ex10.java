package Parte5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("infos.txt");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastre uma compra no modelo produto||quantidade||valor");
            String info = sc.nextLine();
            fw.write(info);
            fw.close();
            System.out.println("Produto cadastrado e arquivado confira em infos.txt");
        }


    }


}
