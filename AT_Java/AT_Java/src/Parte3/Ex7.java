package Parte3;

public class Ex7 {
    public static class Aluno {
        private String nome = "Eduardo";
        private int matricula = 123456;
        private int nota1 = 7;
        private int nota2 = 8;
        private int nota3 = 8;
        private int media;
        public void calcularmedia() {
             media = (nota1 + nota2 + nota3) / 3;

        }
        public void verificarAprovacao(){
            if(media >= 7){
                System.out.println("Aluno " + nome + " aprovado com sucesso!");
            }else{
                System.out.println("Aluno " + nome + " reprovado");
            }
        }
    }
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.calcularmedia();
        aluno1.verificarAprovacao();
    }
}
