package Parte4;

public class Ex9 {
    public static class contaBancaria{
        public String titular = "Eduardo";
        private double saldo;

        public void depositar(double valor){
            if(valor > 0){
                saldo = saldo + valor;
            }else {
                System.out.println("Valor de deposito invalido");
            }
        }
        public void sacar(double valor){
            if(valor <= saldo){
                saldo = saldo - valor;
            }else{
                System.out.println("Saldo insuficiente");
            }
        }
    public void exibirsaldo(){
            System.out.println(saldo);
   }
    }
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();
        conta.depositar(110);
        conta.sacar(100);
        conta.exibirsaldo();
    }
}
