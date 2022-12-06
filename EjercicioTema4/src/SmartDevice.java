public class SmartDevice {
    String modelo;
    double valor;
    String marca;


    public SmartDevice(){

    }

    public SmartDevice(String modelo,  double valor, String marca) {
        this.modelo = modelo;

        this.valor = valor;
        this.marca = marca;

    }

    public String toString (){
        return "modelo=" + this.modelo +
                "valor="+this.valor+
                "marca="+this.marca;
    }


}
