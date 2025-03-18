package mx.unam.aragon.modelo;

public class Carcasa {
    private String material;
    private String color;
    private int cantidad_botones;
    private boolean compatible_nfc;

    public Carcasa(String material, String color, int cantidad_botones, boolean compatible_nfc) {
        this.material = material;
        this.color = color;
        this.cantidad_botones = cantidad_botones;
        this.compatible_nfc = compatible_nfc;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad_botones() {
        return cantidad_botones;
    }

    public void setCantidad_botones(int cantidad_botones) {
        this.cantidad_botones = cantidad_botones;
    }

    public boolean isCompatible_nfc() {
        return compatible_nfc;
    }

    public void setCompatible_nfc(boolean compatible_nfc) {
        this.compatible_nfc = compatible_nfc;
    }

    @Override
    public String toString() {
        return "Carcasa{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", cantidad_botones=" + cantidad_botones +
                ", compatible_nfc=" + compatible_nfc +
                '}';
    }
}
