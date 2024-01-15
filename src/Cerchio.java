public class Cerchio implements IFiguraGeometrica {
    private double raggio;

    public Cerchio(double raggio) throws Exception{
        if(raggio <= 0) throw new Exception("Valore raggio invalido");
        this.raggio = raggio;
    }


    @Override
    public double area() {
        return raggio * raggio * Math.PI;
    }

    @Override
    public double perimetro() {
        return raggio * 2 * Math.PI;
    }
}
