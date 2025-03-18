package mx.unam.aragon.modelo;

public class Celular {
    private Bocina bocina;
    private Pantalla pantalla;
    private Procesador procesador;
    private SO so;
    private Bateria bateria;
    private Carcasa carcasa;

    public Celular(Bocina bocina, Pantalla pantalla, Procesador procesador, SO so, Bateria bateria, Carcasa carcasa) {
        this.bocina = bocina;
        this.pantalla = pantalla;
        this.procesador = procesador;
        this.so = so;
        this.bateria = bateria;
        this.carcasa = carcasa;
    }
    public Celular(){
    }

    public Bocina getBocina() {
        return bocina;
    }

    public void setBocina(Bocina bocina) {
        this.bocina = bocina;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public SO getSo() {
        return so;
    }

    public void setSo(SO so) {
        this.so = so;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Carcasa getCarcasa() {
        return carcasa;
    }

    public void setCarcasa(Carcasa carcasa) {
        this.carcasa = carcasa;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "bocina=" + bocina +
                "\n, pantalla=" + pantalla +
                "\n, procesador=" + procesador +
                "\n, so=" + so +
                "\n, bateria=" + bateria +
                "\n, carcasa=" + carcasa +
                '}';
    }
}
