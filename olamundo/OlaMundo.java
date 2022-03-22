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

        centroY=((cord[1][0]-cord[2][0]-cord[1][1]*(cord[1][1]-cord[0][1])/(cord[0][0]-cord[1][0])-cord[2][1]*(cord[0][1]-cord[2][1]))/((cord[1][1]-cord[0][1])/(cord[0][0]-cord[1][0])+cord[0][1]-cord[2][1])-cord[0][1])/2;
        centroX=((2*centroY+cord[0][1]+cord[1][1])*(cord[1][1]-cord[0][1])/(cord[0][0]-cord[1][0])-(cord[0][0]+cord[1][0]))/2;
        raio=Math.sqrt(Math.pow(cord[0][0]-centroX,2)+Math.pow(cord[0][1]-centroY,2));

        System.out.println("Cordenadas do centro ("+centroX+";"+centroY+") e raio: "+raio);
    }
}
