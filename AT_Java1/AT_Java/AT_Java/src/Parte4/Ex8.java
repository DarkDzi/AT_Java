package Parte4;

public class Ex8 {
    public static class Funcionario{
        protected String nome = "Eduardo";
        protected double salario  = 1500;

        public Funcionario(String nome, double salario){
  this.nome = nome;
  this.salario = salario;
        }
        public double calcularSalario(){
            return salario;
        }
        public void exibirsalario(){
            System.out.println("Nome: " + nome + "\nSalario: " + String.format("%.2f" , calcularSalario()));
        }
    }
    public static class Estagiario extends Funcionario{
            public Estagiario(String nome, double salario){
                super(nome, salario);

            }

    @Override
    public double calcularSalario(){
        return salario = salario - (salario*0.10);
            }


    }
    public static class Gerente extends Funcionario{
        public Gerente(String nome, double salario){
            super(nome, salario);
        }
        @Override
        public double calcularSalario(){
            return salario = salario + (salario*0.20);
        }
    }

    public static void main(String[] args) {

    Gerente gerente = new Gerente("Eduardo", 1500);
    gerente.exibirsalario();
    Estagiario estagiario = new Estagiario("Eduardo", 1500);
    estagiario.exibirsalario();
    }
}
