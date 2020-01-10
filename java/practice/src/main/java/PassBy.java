import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PassBy {
    public static void main(String[] args) {
        int a = 1;
        Baloon b = new Baloon("White");
        Baloon c = new Baloon("White");

        System.out.println(a);
        System.out.println(b.colour);
        System.out.println(c.colour);

        changeStuff(a, b, c);

        System.out.println(a);
        System.out.println(b.colour);
        System.out.println(c.colour);
    }

    static void changeStuff(int x, Baloon y, Baloon z) {
        x = x * 10;
        y.colour = "Red";
        z = new Baloon("Green");
    }

    public static class Baloon {
        public String colour = "white";
        Baloon(String colour) {
            this.colour = colour;
        }
    }

}
