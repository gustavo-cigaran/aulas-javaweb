package model;

import interfaces.AlunoInterface;

public class Aluno implements AlunoInterface {
    private double nota1;
    private double nota2;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) /2;
    }

    @Override
    public String toString() {
        return "\nDADOS:" +
                "\nNOTA 1: " + this.nota1 +
                "\nNOTA 2: " + this.nota2 +
                "\nMEDIA: " + calcularMedia();
    }
}
