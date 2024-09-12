package br.edu.ifs.academico;

//Classe Pedagogo extends Pessoa
public class Pedagogo extends Pessoa {

    //Iniciando atributos
    private String experiencia;
    private String faixaClasse;

    //Encapsulando atributos
    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFaixaClasse() {
        return faixaClasse;
    }

    public void setFaixaClasse(String faixaClasse) {
        this.faixaClasse = faixaClasse;
    }

}
