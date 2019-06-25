public class Computer extends Product {

    //PROPERTIES
    private String SO;
    private Ram ram;
    private Rom rom;
    private PowerSupply powerSupply;
    private Processor processor;
    private String conections;

    //CONSTRUCTORS
    public Computer(String SO, Ram ram, Rom rom, PowerSupply powerSupply, Processor processor, String conections) {
        super(0,0);
        setSO(SO);
        setRam(ram);
        setRom(rom);
        setPowerSupply(powerSupply);
        setProcessor(processor);
        setConections(conections);
    }

    //GETTERS AND SETTERS
    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Rom getRom() {
        return rom;
    }

    public void setRom(Rom rom) {
        this.rom = rom;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String getConections() {
        return conections;
    }

    public void setConections(String conections) {
        this.conections = conections;
    }

    public float calcularPrecioTotal()
    {
        setPriceUnit(rom.getPriceUnit()+ram.getPriceUnit()+processor.getPriceUnit()+powerSupply.getPriceUnit());
        return getPriceUnit();
    }

    public float calcularPesoTotal()
    {
        setWeight(rom.getWeight()+ram.getWeight()+processor.getWeight()+powerSupply.getWeight());
        return getWeight();
    }

    //TO STRING
    @Override
    public String toString() {
        String messager = "\nSO : %s\n"+processor.toString()+"\n"+ram.toString()+"\nROM : "+rom.toString()+"\n"+powerSupply.toString()+"\nCONECTIONS : %s";
        return "\nCOMPUTER : "+ super.toString().concat(String.format(messager,getProcessor(),getConections()));
    }
}
