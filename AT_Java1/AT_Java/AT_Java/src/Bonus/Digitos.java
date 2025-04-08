package Bonus;

import java.util.ArrayList;

public class Digitos {
    private ArrayList<Integer>  digitos = new ArrayList<>(9);

    public int nDigitos() {
        return digitos.size();
    }
    public String PrimeirosDigitos(){
        String firstdigitos = String.valueOf(digitos.get(0));
        firstdigitos =  firstdigitos + String.valueOf(digitos.get(1));
        return firstdigitos;
    }

    public void setDigitos(int digito) {
        digitos.add(digito);
    }
}
