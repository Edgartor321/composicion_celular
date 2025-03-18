package mx.unam.aragon.modelo;

public class Bocina {
    private double decibeles;
    private int diametro;
    private double impedancia;
    private double voltaje;

    public Bocina(double decibeles,int diametro,double impedancia,double voltaje){
        this.decibeles=decibeles;
        this.diametro=diametro;
        this.impedancia=impedancia;
        this.voltaje=voltaje;
    }
    public Bocina(){

    }

    public double getDecibeles() {
        return decibeles;
    }

    public void setDecibeles(double decibeles) {
        this.decibeles = decibeles;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getImpedancia() {
        return impedancia;
    }

    public void setImpedancia(double impedancia) {
        this.impedancia = impedancia;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return "Bocina{" +
                "decibeles=" + decibeles +
                ", diametro=" + diametro +
                ", impedancia=" + impedancia +
                ", voltaje=" + voltaje +
                '}';
    }
}
