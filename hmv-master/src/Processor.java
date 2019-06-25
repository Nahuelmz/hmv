public class Processor extends Product {

    //PROPERTIES

    private int quantityCore;
    private float speed;
    private String generation;

    //CONSTRUCTORS

    public Processor(float priceUnit, float weight, int quantityCore, float speed, String generation) {
        super(priceUnit, weight);
        setQuantityCore(quantityCore);
        setSpeed(speed);
        setGeneration(generation);
    }


    //GETTERS AND SETTERS

    public int getQuantityCore() {
        return quantityCore;
    }

    public void setQuantityCore(int quantityCore) {
        this.quantityCore = quantityCore;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    //TO STRING


    @Override
    public String toString()
    {
        String messagerFormat = "\nQUANTITY CORE : %d\nSPEED : %.2fGhz\nGENERATION : %s";
                return "PROCESSOR:"+super.toString().concat(String.format(messagerFormat,getQuantityCore(),getSpeed(),getGeneration()));
    }
}
