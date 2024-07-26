package com.objectgeladeira;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
int op = -1;
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Geladeira geladeria1 = new Geladeira("Midia","2005","Cinza",true,true,2223.2,1321.32);
        do{
            System.out.println(" 1- Ligar   ");
            System.out.println(" 2- desligar ");
            System.out.println(" 3-Abrir     ");
            System.out.println(" 4-Fechar   ");
            System.out.println(" 5 -Display ");
            System.out.println(" 0- sair");
            System.out.println("Opção: ");
            op = input.nextInt();

            switch(op){
                case 1:
                    geladeria1.ligar();
                    break;
                case 2:
                    geladeria1.desligar();
                    break;
                case 3:
                    geladeria1.abrir();
                    break;
                case 4:
                    geladeria1.fechar();
                    break;
                case 5:
                    geladeria1.toDisplay();
                    break;
                default:

                    System.out.println("Opção incorreta");
                    break;
            }

        }while(op != 0);
        System.out.println("Finalizado");
    }
}