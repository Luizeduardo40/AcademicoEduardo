package br.edu.ifs.academico.business;

import br.edu.ifs.academico.Aluno;

public class AlunoBusiness extends PessoaBusiness {

    public Aluno cadastrarAluno() {
        System.out.println("Nome: ");
        String nome = leia.next();

        Aluno aluno = new Aluno(nome);

        System.out.println("Data de Nascimento: ");
        String dataNascimento = leia.next();
        aluno.setDataNascimento(dataNascimento);

        System.out.println("Local de Nascimento: ");
        String localNascimento = leia.next();
        aluno.setLocalNascimento(localNascimento);

        System.out.println("Sexo: ");
        char sexo = leia.next().charAt(0);
        aluno.setSexo(sexo);

        return aluno;
    }

}
