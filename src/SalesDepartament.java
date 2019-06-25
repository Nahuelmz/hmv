import java.util.ArrayList;

public class SalesDepartament {

    private static int codCont = 1;
    private int code;
    private MyClass<Product> products;

    public SalesDepartament() {
        setId();

        //products = new ArrayList<>();
        products=new MyClass<Product>();
    }

    public int getCode() {
        return code;
    }

    public void setId() {
        this.code = codCont;
        codCont++;
    }

    public MyClass<Product> getProducts() {
        return products;
    }
    /*public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }*/

}
