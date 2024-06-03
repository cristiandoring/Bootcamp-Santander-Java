/* classe normal 
public class Box {
    //<T> representa "Type" 
    private Object object;

    public void set(Object object){
        this.object = object;
    }

    public Object get(){
        return object;
    }

}
*/

//classe do tipo genérica
public class Box <T> {
    //<T> representa "Type" 
    private T t;

    public void set(T t){
        this.t = t;
    }
}
