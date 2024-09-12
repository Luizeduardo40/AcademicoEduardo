package br.edu.ifs.academico;

//Classe Merendeira herda de Pessoa
public class Merendeira extends Pessoa {

    //Inicando atributos da classe Merendeira
    private String especialidade;
    private String vulgo;

    //Encapsulando atributos
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getVulgo() {
        return vulgo;
    }

    public void setVulgo(String vulgo) {
        this.vulgo = vulgo;
    }

}
