package mx.unam.aragon.modelo;

public class Bateria {
    private int capacidad;
    private float voltaje;
    private String material;
    private int carga;

    public Bateria(int capacidad, float voltaje, String material, int carga) {
        this.capacidad = capacidad;
        this.voltaje = voltaje;
        this.material = material;
        this.carga = carga;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(float voltaje) {
        this.voltaje = voltaje;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "capacidad=" + capacidad +
                ", voltaje=" + voltaje +
                ", material='" + material + '\'' +
                ", carga=" + carga +
                '}';
    }
}
