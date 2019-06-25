public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Product a = new Product(20.99f,10f);
        Product b = new Product(25.99f,15f);
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));*/
        Product c = new Processor(3500.f,0.250f,2,2.4f,"5ta");
        System.out.println(c);
        Product d = new Ram(1500.0f,0.2f,1.2f,2);
        System.out.println(d);
        Product e = new Rom(1000f,0.5f,"Solido",1.5f,128);
        System.out.println(e);
    }
}
