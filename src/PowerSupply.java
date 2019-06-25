public class PowerSupply extends Product {

    //PROPERTIES
    private String tipo;
    private int watts;

    //CONSTRUCTORS
    public PowerSupply(float priceUnit, float weight, String tipo, int watts) {
        super(priceUnit, weight);
        setTipo(tipo);
        setWatts(watts);
    }

    //GETTERS AND SETTERS
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    //TO STRING
    @Override
    public String toString() {
        String messager = "\nTIPO : %s \nWATTS : %dW ";
        return "\nPOWERSUPPLY :"+super.toString().concat(String.format(messager,getTipo(),getWatts()));
    }
}
