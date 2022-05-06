package jogo;

import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) {

        System.out.println("*****************************************************************************************");
        System.out.println("******************************   Quizz da Angra  ****************************************");
        System.out.println("*****************************************************************************************");

        Scanner input = new Scanner(System.in);

        int continua = 1;
        while (continua != 10){
            System.out.println("                       \n Escolha uma das opções do menu \n                              ");
            System.out.println("                         ---------------------------------                               ");
            System.out.println("                            |1 - iniciar |2 - sair |                                     ");
            System.out.println("\n Número: ");
            int escolhaMenu = input.nextInt();

            switch (escolhaMenu){
                case 1:
                    int resp = 0;
                    System.out.println("                             \n Configurações Iniciais \n                                ");

                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println("                           Escolha uma das opções abaixo \n                              ");
                    System.out.println("                    1 - Responder     2 - Voltar para o menu ou Sair \n                  ");
                    System.out.println("Número: ");

                    int opcResponder = input.nextInt();
                    switch (opcResponder){
                        case 1:
                            int pt = 0;

                            System.out.println("Digite o seu nome: ");
                            String nome = input.next();
                            System.out.println(" ");

                            System.out.println("Pergunta Nª1\n");
                            System.out.println("1. Normalmente, quantos litros de sangue uma pessoa tem? Em média, " +
                                    "quantos são retirados em uma doação de sangue?\n");

                            System.out.println("Selecione uma opção:\n");
                            System.out.println("1- Tem entre 2 a 4 litros. São retirados 450ml");
                            System.out.println("2- Tem entre 4 a 6 litros. São retirados 450ml");
                            System.out.println("3- Tem 10 litros. São retirados 2L");
                            System.out.println("4- Tem 7 litros. São retirados 1,5L");
                            System.out.println("5- Tem 0,5 litros. São retirados 0,5L");
                            System.out.println("\nResposta: ");
                            resp =  input.nextInt();
                            System.out.println("___________________________________________________________________________________________");
                            if (resp == 2){
                                System.out.println(nome + " Você acertou !!!\n" +
                                        "A quantidade de sangue varia de pessoa para pessoa. O volume de sangue é " +
                                        "entre 7% e 8% do peso corporal. Assim um adulto com 50Kg e 80Kg pode ter" +
                                        "entre 4 a 6 litros de sangue respectivamente.");
                                pt = pt + 2;
                                System.out.println("___________________________________________________________________________________________");
                            }else {
                                System.out.println(nome + "Resposta incorreta !!!");
                                pt = pt + 0;
                                System.out.println("____________________________________________________________________________________________");
                            }
                            System.out.println("\nVocê fez um total de: "+ pt +" pontos\n");

                            break;
                    }
            }
            System.out.println("\nDigite o número correspondente ao que deseja executar:");
            System.out.println("1- Menu    2- Sair");
            System.out.println("Número: ");
            continua = input.nextInt();
            if (continua == 2){
                System.exit(0);
            }
        }
        input.close();
    }
}

