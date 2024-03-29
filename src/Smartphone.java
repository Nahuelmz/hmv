public class Smartphone extends Product {

    //PROPERTIES
    private Processor processor;
    private int capacity;
    private Ram ram;
    private String so;
    private int batery;
    private String screen;
    private String camera;
    private String dimension;
    private String conection;

    //CONSTRUCTORS
    public Smartphone(float priceUnit, float weight, Processor processor, int capacity, Ram ram, String so, int batery, String screen, String camera, String dimension, String conection) {
        super(priceUnit, weight);
        setProcessor(processor);
        setCapacity(capacity);
        setRam(ram);
        setSo(so);
        setBatery(batery);
        setScreen(screen);
        setCamera(camera);
        setDimension(dimension);
        setConection(conection);
    }

    //GETTERS AND SETTERS
    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getBatery() {
        return batery;
    }

    public void setBatery(int batery) {
        this.batery = batery;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getConection() {
        return conection;
    }

    public void setConection(String conection) {
        this.conection = conection;
    }

    //TO STRING
    @Override
    public String toString() {
        String messager = "\nSO : %s\n"+processor.toString()+"\nCAPACITY : %dGB\n"+ram.toString()+"\nCREEN : %s\nBATERY : %d\nCONECTION : %s\nDIMENSION : %s";
        return "\nSMARTPHONE : "+super.toString().concat(String.format(messager,getSo(),getCapacity(),getScreen(),getBatery(),getConection(),getDimension()));
    }
}
