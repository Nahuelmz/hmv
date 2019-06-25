public class Rom extends Product {

    //PROPERTIES
    private String tipo;
    private float speed;
    private int capacity;

    //CONSTRUCTORS
    public Rom(float priceUnit, float weight,String tipo, float speed, int capacity) {
        super(priceUnit, weight);
        setTipo(tipo);
        setSpeed(speed);
        setCapacity(capacity);
    }

    //GETTERS AND SETTERS
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //TO STRING
    @Override
    public String toString() {
        String messager = "TIPO : %s \nCAPACITY : %dGB \nSPEDD : %.2fGhz";
        return "\nROM : "+super.toString().concat(String.format(messager,getTipo(),getCapacity(),getSpeed()));
    }
}
