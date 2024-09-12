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

        //Iniciando variaveis de 'Globais'
        String nome;
        String dataNascimento;
        String localNascimento;
        char sexo;

        //Iniciando loop
        while(repete) {
            
            menu.imprimirMenu();
            leia.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Nome: ");
                    nome = leia.next();

                    Aluno aluno = new Aluno(nome);

                    System.out.println("Data de Nascimento: ");
                    dataNascimento = leia.next();
                    aluno.setDataNascimento(dataNascimento);

                    System.out.println("Local de Nascimento: ");
                    localNascimento = leia.next();
                    aluno.setLocalNascimento(localNascimento);

                    System.out.println("Sexo: ");
                    sexo = leia.next().charAt(0);
                    aluno.setSexo(sexo);
                    
                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("Nome: ");
                    nome = leia.next();

                    Professor professor = new Professor(nome);

                    System.out.println("Data de Nascimento: ");
                    dataNascimento = leia.next();
                    professor.setDataNascimento(dataNascimento);

                    System.out.println("Local de Nascimento: ");
                    localNascimento = leia.next();
                    professor.setLocalNascimento(localNascimento);

                    System.out.println("Sexo: ");
                    sexo = leia.next().charAt(0);
                    professor.setSexo(sexo);
                
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Nome: ");
                    nome = leia.next();

                    Merendeira merendeira = new Merendeira(nome);

                    System.out.println("Data de Nascimento: ");
                    dataNascimento = leia.next();
                    merendeira.setDataNascimento(dataNascimento);

                    System.out.println("Local de Nascimento: ");
                    localNascimento = leia.next();
                    merendeira.setLocalNascimento(localNascimento);

                    System.out.println("Sexo: ");
                    sexo = leia.next().charAt(0);
                    merendeira.setSexo(sexo);
                    
                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Nome: ");
                    nome = leia.next();

                    Pedagogo pedagogo = new Pedagogo(nome);

                    System.out.println("Data de Nascimento: ");
                    dataNascimento = leia.next();
                    pedagogo.setDataNascimento(dataNascimento);

                    System.out.println("Local de Nascimento: ");
                    localNascimento = leia.next();
                    pedagogo.setLocalNascimento(localNascimento);

                    System.out.println("Sexo: ");
                    sexo = leia.next().charAt(0);
                    pedagogo.setSexo(sexo);
                    
                    break;

                case 8:
                    break;

                case 9:
                    System.out.println("Nome: ");
                    nome = leia.next();

                    Psicologo psicologo = new Psicologo(nome);

                    System.out.println("Data de Nascimento: ");
                    dataNascimento = leia.next();
                    psicologo.setDataNascimento(dataNascimento);

                    System.out.println("Local de Nascimento: ");
                    localNascimento = leia.next();
                    psicologo.setLocalNascimento(localNascimento);

                    System.out.println("Sexo: ");
                    sexo = leia.next().charAt(0);
                    psicologo.setSexo(sexo);
                    
                    break;

                case 10:
                    break;

                case 11:
                    System.out.println("Nome: ");
                    nome = leia.next();

                    Tecnico tecnico = new Tecnico(nome);

                    System.out.println("Data de Nascimento: ");
                    dataNascimento = leia.next();
                    tecnico.setDataNascimento(dataNascimento);

                    System.out.println("Local de Nascimento: ");
                    localNascimento = leia.next();
                    tecnico.setLocalNascimento(localNascimento);

                    System.out.println("Sexo: ");
                    sexo = leia.next().charAt(0);
                    tecnico.setSexo(sexo);
                    
                    break;

                case 12:
                    break;

                case 13:
                    System.out.println("Nome: ");
                    nome = leia.next();

                    Vigilante vigilante = new Vigilante(nome);

                    System.out.println("Data de Nascimento: ");
                    dataNascimento = leia.next();
                    vigilante.setDataNascimento(dataNascimento);

                    System.out.println("Local de Nascimento: ");
                    localNascimento = leia.next();
                    vigilante.setLocalNascimento(localNascimento);

                    System.out.println("Sexo: ");
                    sexo = leia.next().charAt(0);
                    vigilante.setSexo(sexo);
                    
                    break;

                case 14:
                    break;
            
                case 0:
                    System.out.println("Finalizando o menu...");

                    repete = false;

                    break;
            }
        }
    }

}
