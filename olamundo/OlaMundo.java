import java.util.Scanner;

public class OlaMundo {
    
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        double[][] cord = new double[3][2];
        double centroX, centroY, raio;
        
        for(int i=0; i<cord.length; i++){

            System.out.print("digite x"+(i+1)+":  ");
            cord[i][0] = Input.nextFloat();
            System.out.print("digite y"+(i+1)+":  ");
            cord[i][1] = Input.nextFloat();
        }

        calculo p1p2 = new calculo(cord[0][0], cord[1][0], cord[0][1], cord [1][1]);
        calculo p1p3 = new calculo(cord[0][0], cord[2][0], cord[0][1], cord [2][1]);

        centroY=(p1p2.getCalculo()-p1p3.getCalculo())/(p1p2.getDerivada()-p1p3.getDerivada());
        centroX=p1p2.getCalculo()-centroY*p1p2.getDerivada();
        raio=Math.hypot(cord[0][0]-centroX, cord[0][1]-centroY);

        System.out.println("Coordenadas do centro ("+centroX+";"+centroY+") e raio: "+raio);

    }
}
