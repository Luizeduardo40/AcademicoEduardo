package br.edu.ifs.academico;

//Classe Professor que herda de Pessoa
public class Professor extends Pessoa {

    //Iniciando atributos da classe Professor
    private String formacao;
    private boolean coordenador;

    //Encapsulando atributos
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public boolean getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(boolean coordenador) {
        this.coordenador = coordenador;
    }

}
