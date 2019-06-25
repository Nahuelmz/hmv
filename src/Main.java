import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        Product a = new Product(20.99f,10f);
        Product b = new Product(25.99f,15f);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
        Processor c = new Processor(3500.f,0.250f,2,2.4f,"5ta");
        System.out.println(c);
        Ram d = new Ram(1500.0f,0.2f,1.2f,2);
        System.out.println(d);
        Rom e = new Rom(1000f,0.5f,"Solido",1.5f,128);
        System.out.println(e);
        PowerSupply f = new PowerSupply(500f,0.4f,"Generica",600);
        System.out.println(f);
        Computer g = new Computer("Windows",d,e,f,c,"USB x2,HDMI x1, VGA x1");
        System.out.println(g);
        System.out.println(g.calcularPrecioTotal());
        System.out.println(g.calcularPesoTotal());
        // SEGUIR INSTANCIANDO SMARTPHONE
        Smartphone h = new Smartphone(16000,0.25f,c,64,d,"Android 7",3000,"1080 full hd","16 megapixeles","15x7","USB tipoC, Jack 3.5");
        System.out.println(h);*/
        Ram d = new Ram(1500.0f,0.2f,1.2f,2);
        Ram e = new Ram(2000.0f,0.2f,1.4f,4);
        Ram f = new Ram(2500.0f,0.2f,1.6f,6);
        Ram g = new Ram(3000.0f,0.2f,1.8f,8);
        SalesDepartament a = new SalesDepartament();
        a.getProducts().adds(d);
        a.getProducts().adds(e);
        a.getProducts().adds(f);
        a.getProducts().adds(g);
        a.getProducts().list();
        System.out.println(a.getProducts().buscar(2));


    }
}
