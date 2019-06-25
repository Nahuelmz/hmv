import java.util.ArrayList;
import java.util.Collection;

public class MyClass<T> /*implements Actions<T>*/{

    private ArrayList<T> a;

    public MyClass() {
        a = new ArrayList<T>();
    }

    public ArrayList<T> getA() {
        return a;
    }


    public void adds(T obj){
        if(a!=null)
            a.add(obj);
    }

    public void list() {
        if(a!=null) {
            for (T obj : a
            ) {
                System.out.println(obj);
            }
        }
    }
    public T buscar(int num)
    {
        T obj = null;
        if(a!=null)
        {
            for (T x: a
                 ) {
                if(x.equals())
                {
                    obj=x;
                }

            }
        }
        return obj;
    }

    /*public T eliminate (T Obj)
    {
        T x;
        if(a!=null)
        {
            x =
        }
    }*/
}
