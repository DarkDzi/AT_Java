package Parte3;

public class Ex6 {
    public static class Carro {
        private String placa = "RND4J82";
        private String modelo = "Chevrolet Onix 1.0 Turbo Premier AT ";
        private int anofabricacao = 2023;
        private double quilometragem = 0;

        public void exibirDetalhes() {
            System.out.println("Placa: " + placa);
            System.out.println("Modelo: " + modelo);
            System.out.println("anofabricacao: " + anofabricacao);
            System.out.println("Quilometragem: " + quilometragem + "km");
        }

        public void registrarViagem(double km) {
            quilometragem = km;
        }
    }

    public static void main(String[] args) {
Carro carro1 = new Carro();
carro1.registrarViagem(100);
carro1.exibirDetalhes();

    }
}

