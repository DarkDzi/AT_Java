package Bonus;

import java.util.ArrayList;

public class Vogais {
    private ArrayList<String> vogais = new ArrayList<>();

    public void setVogal(String Vogal){
          vogais.add(Vogal);

    }
    public ArrayList<String> getVogal(){
        return vogais;
    }
    public void imprimirVogais(){
        System.out.println("vogais: " + vogais);
    }
}
