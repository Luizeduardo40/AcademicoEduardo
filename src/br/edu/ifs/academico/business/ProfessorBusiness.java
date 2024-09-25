package br.edu.ifs.academico.business;

import br.edu.ifs.academico.Professor;

public class ProfessorBusiness extends PessoaBusiness {

    public Professor cadastrarProfessor() {
        System.out.println("Nome: ");
        String nome = leia.next();

        Professor professor = new Professor(nome);

        System.out.println("Data de Nascimento: ");
        String dataNascimento = leia.next();
        professor.setDataNascimento(dataNascimento);

        System.out.println("Local de Nascimento: ");
        String localNascimento = leia.next();
        professor.setLocalNascimento(localNascimento);

        System.out.println("Sexo: ");
        char sexo = leia.next().charAt(0);
        professor.setSexo(sexo);

        return professor;
    }

}