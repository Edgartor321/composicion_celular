package mx.unam.aragon.modelo;

public class Procesador {
    private String fabricante;
    private String modelo;
    private int cant_nucleos;
    private int cant_cache;
    public Procesador(String fabricante,String modelo,int cant_nucleos,int cant_cache){
        this.cant_cache=cant_cache;
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.cant_nucleos=cant_nucleos;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCant_nucleos() {
        return cant_nucleos;
    }

    public void setCant_nucleos(int cant_nucleos) {
        this.cant_nucleos = cant_nucleos;
    }

    public int getCant_cache() {
        return cant_cache;
    }

    public void setCant_cache(int cant_cache) {
        this.cant_cache = cant_cache;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cant_nucleos=" + cant_nucleos +
                ", cant_cache=" + cant_cache +
                '}';
    }
}

