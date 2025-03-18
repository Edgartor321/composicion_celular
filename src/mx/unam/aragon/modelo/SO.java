package mx.unam.aragon.modelo;

public class SO {
    private String nombreSO;
    private int version;
    private String desarrollador;
    private int paquetes_incluidos;

    public SO(String nombreSO,int version,String desarrollador,int paquetes_incluidos){
        this.nombreSO=nombreSO;
        this.version=version;
        this.desarrollador=desarrollador;
        this.paquetes_incluidos=paquetes_incluidos;
    }

    public String getNombreSO() {
        return nombreSO;
    }

    public void setNombreSO(String nombreSO) {
        this.nombreSO = nombreSO;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public int getPaquetes_incluidos() {
        return paquetes_incluidos;
    }

    public void setPaquetes_incluidos(int paquetes_incluidos) {
        this.paquetes_incluidos = paquetes_incluidos;
    }

    @Override
    public String toString() {
        return "SO{" +
                "nombreSO='" + nombreSO + '\'' +
                ", version=" + version +
                ", desarrollador='" + desarrollador + '\'' +
                ", paquetes_incluidos=" + paquetes_incluidos +
                '}';
    }
}
