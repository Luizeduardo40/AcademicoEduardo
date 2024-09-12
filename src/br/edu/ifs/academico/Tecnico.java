package br.edu.ifs.academico;

//Classe Tecnico extends Pessoa
public class Tecnico extends Pessoa {

    //Iniciando atributos
    private String profissao;
    private String laboratorio;
    private int sala;

    public Tecnico(String nome) {
        super(nome);
    }

    //Encapsulando atributos
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

}
