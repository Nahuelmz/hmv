import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Factura implements AccionesLista{

    //PROPERTIES
    private Cliente cliente;
    static int contN = 1;
    private int number;
    private Date fecha;
    private ArrayList<Item> items;

    //CONSTRUCTORS
    public Factura(Cliente cliente) {
        setCliente(cliente);
        setNumber(number);
        contN++;
        items = new ArrayList<Item>();
        setFecha(fecha);
    }

    public Factura() {
        setNumber(number);
        contN++;
        items = new ArrayList<Item>();
        setFecha(fecha);
    }

    //SETTERS & GETTERS

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente != null)
            this.cliente = cliente;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = contN;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //METHODS


    //OVERRIDES

    @Override
    public void agregar(Object Obj) {
        if(items!=null) {
            items.add(Obj);
        }
    }

    @Override
    public void eliminar(Object Obj) {
        if(items!=null)
            items.remove(Obj);
    }

    @Override
    public void modificar(Object Obj) {
        if(items!=null && items.contains(Obj))
            items.replaceAll(Obj);
    }

    @Override
    public void listar() {
        if(items!=null)
            System.out.println(items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Factura factura = (Factura) o;
        return number == factura.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return " Factura nro : " + number
                "\nCliente : " + cliente +
                "\nFecha : " + fecha +
                "\nItems : " + items;
    }
}
