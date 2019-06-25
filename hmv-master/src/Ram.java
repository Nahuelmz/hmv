public class Ram extends Product {

    //PROPERTIES

    private float speed;
    private int capacity;

    //CONSTRUCTORS

    public Ram(float priceUnit, float weight, float speed, int capacity) {
        super(priceUnit, weight);
        setSpeed(speed);
        setCapacity(capacity);
    }

    //GETTERS AND SETTERS

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
        String messagerFormat = "\nCAPACITY : %dGB\nSPEED : %.2fGhz";
        return "RAM:" +super.toString().concat(String.format(messagerFormat,getCapacity(),getSpeed()));
    }


    //EQUALS


}
