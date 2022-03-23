/**
 * calculo
 */
public class calculo {

    double y1, y2, x1, x2;

    public calculo(double x1, double x2, double y1, double y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }

    public double getDerivada(){

        return (y1-y2)/(x1-x2);
    }

    public double getCalculo(){

        return (x1+x2+getDerivada()*(y1+y2))/2;
    }
    
}
