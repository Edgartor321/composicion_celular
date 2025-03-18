package mx.unam.aragon.inicio;

import mx.unam.aragon.modelo.*;

public class Inicio {
    public static void main(String[] args) {
        Bocina bocina=new Bocina(29.36,2,2.5546,1.5794);
        Pantalla pantalla=new Pantalla(1440,60,"LCD",32);
        Procesador procesador=new Procesador("Qualcomm","G80",8,1600);
        SO so=new SO("Android",12,"Google",248);
        Bateria bateria=new Bateria(3400,3.56f,"Li-ION",87);
        Carcasa carcasa = new Carcasa("Polipropileno","Negro",5,false);
        Celular celular= new Celular(bocina,pantalla,procesador,so,bateria,carcasa);
        System.out.println(celular.toString());
    }
}
