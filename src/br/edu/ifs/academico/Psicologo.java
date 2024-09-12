package br.edu.ifs.academico;

//Classe Pedagogo extends Pessoa
public class Psicologo extends Pessoa {

    //Iniciando atributos da classe Pedagogo
    private String crp;
    private String especialidade;
    private String alocacao;

    public Psicologo(String nome) {
        super(nome);
    }

    //Encapsulando atributos
    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(String alocacao) {
        this.alocacao = alocacao;
    }

}
