package mx.unam.aragon.modelo;

public class Pantalla {
    private int resolucion;
    private int frecuencia;
    private String tipo;
    private int profundidad_color;

    public Pantalla(int resolucion,int frecuencia,String tipo,int profundidad_color){
        this.resolucion=resolucion;
        this.frecuencia=frecuencia;
        this.profundidad_color=profundidad_color;
        this.tipo=tipo;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getProfundidad_color() {
        return profundidad_color;
    }

    public void setProfundidad_color(int profundidad_color) {
        this.profundidad_color = profundidad_color;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "resolucion=" + resolucion +
                ", frecuencia=" + frecuencia +
                ", tipo='" + tipo + '\'' +
                ", profundidad_color=" + profundidad_color +
                '}';
    }
}
