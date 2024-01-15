public class Main {
    public static void main(String[] args) {
        Quadrato q;
        Cerchio c;
        Triangolo t;
        try {
            q = new Quadrato(5.5);
            c = new Cerchio(8);
            t = new Triangolo(new double[]{3, 3, 3});

            System.out.println("Area q = " + q.area());
            System.out.println("Perimetro t = " + t.perimetro());
            System.out.println("Area c = " + c.area());
            System.out.println("Perimetro c = " + c.perimetro());
            System.out.println("Area t = " + t.area());
            System.out.println("Perimetro t = " + t.perimetro());
            System.out.println("Tipo t = " + t.getTipo());
        }
        catch(Exception e) {
            System.out.print(e.getMessage());
        }
    }
}