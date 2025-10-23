import java.util.Scanner;

public class BancoSimulado {
    public static void main(String[] args) {
        Scanner retorno = new Scanner(System.in);
        int operacaoSelecionada = 0;
        int contador = 0;
        double saldo = 2500;
        String nome = "Lucas Pereira";
        String tipoConta = "Corrente";

        System.out.printf("""
        ******************************");
        Dados do Cliente:
        Nome:            %s
        Tipo Conta:      %s
        Saldo Inicial:  R$ %.2f
        ******************************%n""", nome, tipoConta, saldo);



        while (contador != 4) {
            System.out.println("""
            Operações
            1 - Consultar saldos
            2 - Receber valor
            3 - Transferir valor
            4 - Sair""");
            operacaoSelecionada = retorno.nextInt();

            if (operacaoSelecionada == 4){
                System.out.println("Operação encerrada!");
                contador = 4;
            }

            switch (operacaoSelecionada){
                case 1:
                    System.out.println("O seu Saldo é : R$" + saldo);
                    break;
                case 2:
                    double valorAReceber = 0;
                    System.out.println("Qual o Valor que você irá receber? ");
                    valorAReceber = retorno.nextDouble();
                    if (valorAReceber > 0){
                        saldo = saldo + valorAReceber;
                    }else {
                        System.out.println("Não é possivel receber esse valor");
                    }


                    System.out.println("Seu saldo é de : R$" + saldo);
                    break;
                case 3:
                    double valorAEnviar = 0;
                    System.out.println("Qual o Valor que você irá transferir?");
                    valorAEnviar = retorno.nextDouble();
                        if(valorAEnviar > saldo){
                            System.out.println("Saldo Insuficiente");
                        }else{
                            saldo = saldo - valorAEnviar;
                        }

                    System.out.println("Seu saldo é de : R$" + saldo);
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }


    }
}
