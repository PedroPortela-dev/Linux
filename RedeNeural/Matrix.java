import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Matriz
 */
public class Matrix {

    int linha;
    int coluna;
    List<Double> matrix = new ArrayList<>();

    void aleatorio(){
        matrix.clear();
        for (int i = 0; i < linha; i++) {
            List<Double> aleatorio = new ArrayList<>();
            for (int j = 0; j < coluna; j++) {
                aleatorio.add(Math.random()*2 - 1);
            }
            matrix.addAll(aleatorio);
        }
    }

    Matrix(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;

        for (int i = 0; i < linha; i++) {
            List<Double> aleatorio = new ArrayList<>();
            for (int j = 0; j < coluna; j++) {
                aleatorio.add(Math.floor(Math.random()*10));
            }
            matrix.addAll(aleatorio);
        }
    }

    static Matrix transpose(Matrix A){
        Matrix result = new Matrix(A.coluna, A.linha);
        for (int i = 0; i < result.linha; i++) {
            for (int j = 0; j < result.coluna; j++) {
                result.escrever(i, j, A.ler(j, i));
            }
        }

        return result;
    }

    static Matrix arrayToMatrix(List<Double> arr){
        Matrix mat = new Matrix(arr.size(), 1);

        for (int i = 0; i < mat.linha; i++) {
            mat.escrever(i, 0, arr.get(i));
        }

        return mat;
    }

    static List<Double> matrixToArray(Matrix mat){
        List<Double> arr = new ArrayList<>();

        for (int i = 0; i < mat.linha; i++) {
            arr.add(mat.ler(i, 0));
        }

        return arr;
    }

    void print(){
        for (int i = 0; i < linha; i++) {
            System.out.print(i+": [");
            for (int j = 0; j < coluna; j++) {
                if(j != 0) System.out.print(", ");
                System.out.print(ler(i, j));
            }
            System.out.println("]");
        }
        System.out.println("------------------------");
    }

    double ler(int i,int j){
        int posicaoList = i*coluna+j;

        return matrix.get(posicaoList);
    }

    void escrever(int i, int j, double valor){
        int posicaoList = i*coluna+j;

        matrix.set(posicaoList, valor);
    }

    static Matrix add(Matrix A, Matrix B){
        Matrix result = new Matrix(A.linha, A.coluna);

        for (int i = 0; i < A.linha; i++) {
            for (int j = 0; j < B.coluna; j++) {
                result.escrever(i, j, A.ler(i, j)+B.ler(i, j));
            }
        }

        return result;
    }

    static Matrix subtract(Matrix A, Matrix B){
        Matrix result = new Matrix(A.linha, A.coluna);

        for (int i = 0; i < A.linha; i++) {
            for (int j = 0; j < B.coluna; j++) {
                result.escrever(i, j, A.ler(i, j)-B.ler(i, j));
            }
        }

        return result;
    }

    static Matrix multiply(Matrix A, Matrix B){
        Matrix result = new Matrix(A.linha, B.coluna);
        double aux;

        for (int i = 0; i < result.linha; i++) {
            for (int j = 0; j < result.coluna; j++) {
                aux = 0;
                for (int j2 = 0; j2 < A.coluna; j2++) {
                    aux += A.ler(i, j2)*B.ler(j2, j);
                }
                result.escrever(i, j, aux);
            }
        }

        return result;
    }

    static Matrix escalar_multiply(Matrix A, double escalar){
        Matrix result = new Matrix(A.linha, A.coluna);

        for (int i = 0; i < A.linha; i++) {
            for (int j = 0; j < A.coluna; j++) {
                result.escrever(i, j, A.ler(i, j)*escalar);
            }
        }

        return result;
    }

    static Matrix hadmard(Matrix A, Matrix B){
        Matrix result = new Matrix(A.linha, A.coluna);

        for (int i = 0; i < A.linha; i++) {
            for (int j = 0; j < B.coluna; j++) {
                result.escrever(i, j, A.ler(i, j)*B.ler(i, j));
            }
        }

        return result;
    }
}