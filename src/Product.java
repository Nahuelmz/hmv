public abstract class Product {

    //PROPERTIES
    private static int idCont = 0;
    private int id;
    private float priceUnit;
    private float weight;

    //CONSTRUCTORS
    public Product(float priceUnit, float weight) {
        id=idCont+1;
        idCont++;
        setPriceUnit(priceUnit);
        setWeight(weight);
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        this.priceUnit = priceUnit;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    //TO STRING
    @Override
    public String toString() {

        String messagerFormat = "\nID : %d\nUNIT PRICE : %.2f\nWEIGHT : %.2f";
        return String.format(messagerFormat,getId(),getPriceUnit(),getWeight());
    }

    //EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

}
