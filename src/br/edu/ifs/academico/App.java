package br.edu.ifs.academico;
import java.util.Scanner;

//Classe executavel App
public class App {

    public static void main(String[] args) {

        //Iniciando variaveis para Menu e Scanner
        Menu menu = new Menu();
        Scanner leia = new Scanner(System.in);

        //Iniciando variaveis do loop
        boolean repete = true;
        int escolha = 0;

        //Iniciando loop
        while(repete) {
            
            menu.imprimirMenu();
            leia.nextInt();

            switch (escolha) {
                case 1:
                    
                    break;
            
                case 0:
                    System.out.println("Finalizando o menu...");

                    repete = false;

                    break;
            }
        }
    }

}
