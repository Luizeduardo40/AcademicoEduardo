package br.edu.ifs.academico;

//Classe Vigilante extends Pessoa
public class Vigilante extends Pessoa {

    //Iniciando atributos
    private boolean armado;
    private String horario;

    //Encapsulando atributos
    public boolean getArmado() {
        return armado;
    }

    public void setArmado(boolean armado) {
        this.armado = armado;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}
