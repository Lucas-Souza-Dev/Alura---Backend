import java.util.Scanner;

public class QuadradoOuCirculo {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        int numeroUsuario = 0;
        double dadosParaCalculo = 0;
        double area = 0;
        System.out.println("Digite 1 para Calcular a área do quadrado ou Digite 2 para calcular a área do círculo.");
        numeroUsuario = resposta.nextInt();

        switch (numeroUsuario){
            case 1: // área do quadrado
                System.out.println("Qual á medida de um dos lados do quadrado? ");
                dadosParaCalculo = resposta.nextDouble();
                area = dadosParaCalculo * dadosParaCalculo;// A = Lado²
                System.out.println("A área do Quadrado é: " + area);
                break;
            case 2: // área do circulo
                System.out.println("Qual á medida do raio do circulo? ");
                dadosParaCalculo = resposta.nextDouble();
                area = 3.14 * (dadosParaCalculo * dadosParaCalculo);
                System.out.println("A área do Circulo é: " + area); // A = 3,14 * raio²
                break;
        }
    }
}
