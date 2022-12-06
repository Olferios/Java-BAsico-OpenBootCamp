public class SmartWatch extends SmartDevice {
    boolean microfono;

    public SmartWatch(){

    }

    public SmartWatch(String modelo, double valor, String marca, boolean microfono) {
        super(modelo, valor, marca);
        this.microfono = microfono;
    }

    public String toString(){
        return "modelo=" + this.modelo +
            "valor="+this.valor+
            "marca="+this.marca;

    }
}
