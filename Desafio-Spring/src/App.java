public class App {
    public static void main(String[] args) throws Exception {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}
