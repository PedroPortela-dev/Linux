public class FormulasPontos {

    double[] x = new double[2], y = new double[2];
    
    public FormulasPontos(double x1,double x2,double y1,double y2){

        x[0] = x1;
        x[1] = x2;
        y[0] = y1;
        y[1] = y2;
    }

    public double z(){

        return (y[0]-y[1])/(x[0]-x[1]);
    }

    public double k(){

        return (x[0]+x[1]+(y[0]+y[1])*z())/2;
    }
}
