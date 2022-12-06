public class SmartPhone extends SmartDevice {

    String gama;

    public SmartPhone(){

    }

    public SmartPhone(String modelo, double valor, String marca, String gama) {
        super(modelo, valor, marca);
        this.gama = gama;
    }
    public String toString (){
        return "modelo=" + this.modelo +
                "valor="+this.valor+
                "marca="+this.marca;
    }
}

