public class DebuggingJava {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou o programa no método main");
        a();
        System.out.println("Finalizou o programa no método main");
    }

    public void a(){
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou no método a.");
    }

    public void b(){
        System.out.println("Entrou no método b.");

        for(int i=0;i<=4;i++) System.out.println(i);
        c();
        System.out.println("Finalizou no método b.");
    }

    public void c(){
        System.out.println("Entrou no método c.");
        
        System.out.println("Finalizou no método c.");
    }

    
}
