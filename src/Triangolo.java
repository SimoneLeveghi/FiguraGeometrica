import java.util.Arrays;

public class Triangolo implements IFiguraGeometrica {
    private double[] lati;

    public static final int EQUILATERO = 1;
    public static final int ISOSCELE = 2;
    public static final int SCALENO = 3;

    public Triangolo(double[] lati) throws Exception{
        this.lati = new double[3];
        if(lati.length != 3) throw new Exception("Numero lati invalido");
        for(int i = 0; i < 3; ++i) {
            if(lati[i] <= 0) {
                throw new Exception("Valore lati invalido");
            }
            this.lati[i] = lati[i];
        }

        if(
                this.lati[0] + this.lati[1] < this.lati[2] ||
                this.lati[0] + this.lati[2] < this.lati[1] ||
                this.lati[1] + this.lati[2] < this.lati[0]
        ) {
            throw new Exception("Triangolo non valido");
        }
    }


    @Override
    public double area() {
        double semiP = perimetro() / 2;
        return Math.sqrt(semiP * (semiP - lati[0]) * (semiP - lati[1]) * (semiP - lati[2]));
    }

    @Override
    public double perimetro() {
        return lati[0] + lati[1] + lati[2];
    }

    public int getTipo() {
        if(lati[0] == lati[1] && lati[1] == lati[2]) return Triangolo.EQUILATERO;
        if(lati[0] == lati[1] || lati[1] == lati[2] || lati[0] == lati[2]) return Triangolo.ISOSCELE;
        return Triangolo.SCALENO;
    }
}
