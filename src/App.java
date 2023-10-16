public class App {
    public static void main(String[] args) throws Exception {

        Biglietteria b=new Biglietteria (10,20,'c');
           System.out.println(b.toString());


           Cliente c=new Cliente("tony","tazza", 15, "f");
           System.out.println(c.toString());

            Treni t=new Treni(50,100,55);
           System.out.println(t.toString());
    }
}
