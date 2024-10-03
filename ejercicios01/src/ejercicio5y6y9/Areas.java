package ejercicio5y6y9;

import java.math.MathContext;

public class Areas {

    public double areaRectangulo (double base,double altura){

        return base*altura;
    }

    public double areaTriangulo (double base,double altura){

        return (base*altura)/2;
    }

    public double volumenCono (double radio, double altura){

        return (1.0/3) * Math.PI * Math.pow(radio, 2) * altura;
    }
}
