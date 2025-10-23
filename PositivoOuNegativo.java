import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int numeroUsuario = 0;
        System.out.println("Digite um número para saber se ele é par ou impar: ");
        numeroUsuario = numero.nextInt();

        if (numeroUsuario >= 0){
            System.out.println("Esse Numero é possitivo!");
        }else {
            System.out.println("Esse Numero é Negativo!");
        }
    }
}
