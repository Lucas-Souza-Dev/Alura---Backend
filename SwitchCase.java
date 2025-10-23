public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 6;
        String nomeDia;
        String menssagemFimDeSemana;
        switch (diaDaSemana) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "Segunda-Feira";
                break;
            case 3:
                nomeDia = "Terça-Feira";
                break;
            case 4:
                nomeDia = "Quarta-Feira";
                break;
            case 5:
                nomeDia = "Quinta-Feira";
                break;
            case 6:
                nomeDia = "Sexta-Feira";
                break;
            case 7:
                nomeDia = "Sabado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }
        if (nomeDia.equals("Sexta-Feira")){
            menssagemFimDeSemana = "Sextou, Não beba muito pois sábado tem mais";
            System.out.println("Hoje é "+ nomeDia +" "+ menssagemFimDeSemana);
        }
        if (nomeDia.equals("Sabado") || nomeDia.equals("domingo")){
            menssagemFimDeSemana = "Ótimo fim de semana, segunda feira te aguarda!";
            System.out.println("Hoje é "+ nomeDia +" "+ menssagemFimDeSemana);
        }else {
            System.out.println("Hoje é "+ nomeDia);
        }
    }
}
