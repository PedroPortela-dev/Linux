import java.util.Scanner;

public class Circonferencia {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);

        int i;
        double[] x = new double[3], y = new double[3];
        for(i=0;i<3;i++){

            System.out.print("X"+(i+1)+":\t");
            x[i] = Input.nextDouble();
            
            System.out.print("Y"+(i+1)+":\t");
            y[i] = Input.nextDouble();
        }

        FormulasPontos p1p2 = new FormulasPontos(x[0], x[1], y[0], y[1]);
        FormulasPontos p1p3 = new FormulasPontos(x[0], x[2], y[0], y[2]);

        if(x[1]*y[2]+x[0]*y[1]+x[2]*y[0]-x[1]*y[0]-x[2]*y[1]-x[0]*y[2]==0){

            System.out.println("Esses Pontos Formam uma reta.");
        }else{
            double y0 = (p1p2.k()-p1p3.k())/(p1p2.z()-p1p3.z());
            double x0 = p1p2.k()-y0*p1p2.z();
            double r = Math.hypot(x[0]-x0, y[0]-y0);

            System.out.println("\ncentro:\t("+x0+";"+y0+")\nraio:\t"+r);
        }
    }
}
