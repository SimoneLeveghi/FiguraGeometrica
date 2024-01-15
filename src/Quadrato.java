public class Quadrato implements IFiguraGeometrica {
    private double lato;

    public Quadrato(double lato) throws Exception {
        if(lato <= 0) throw new Exception("Valore lato invalido");
        this.lato = lato;
    }

    @Override
    public double area() {
        return lato * lato;
    }

    @Override
    public double perimetro() {
        return lato * 4;
    }
}
