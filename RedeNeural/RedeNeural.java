import java.util.List;

public class RedeNeural {
    
        private Matrix bais_ih;
        private Matrix bais_ho;
        private Matrix weight_ih;
        private Matrix weight_ho;
        private Matrix input;
        private Matrix hidden;
        private Matrix output;
        private Matrix target;
        private Matrix output_erro;
        private Matrix d_output;
        private Matrix gradient;
        private double learning_rate = 0.1;
        private Matrix hidden_T;
        private Matrix weight_ho_deltas;
        private Matrix weight_ho_T;
        private Matrix hidden_error;
        private Matrix d_hidden;
        private Matrix input_T;
        private Matrix gradient_H;
        private Matrix weight_ih_deltas;
        private List<Double> arrOutput;

        RedeNeural(int i_nodes,int h_nodes,int o_nodes){

            bais_ih = new Matrix(h_nodes, 1);
            bais_ih.aleatorio();
            bais_ho = new Matrix(o_nodes, 1);
            bais_ho.aleatorio();

            weight_ih = new Matrix(h_nodes, i_nodes);
            weight_ih.aleatorio();

            weight_ho = new Matrix(o_nodes, h_nodes);
            weight_ho.aleatorio();
        }

        void train(List<Double> arrInput, List<Double> target){
            input = Matrix.arrayToMatrix(arrInput);
            hidden = Matrix.multiply(weight_ih, input);
            hidden = Matrix.add(hidden, bais_ih);
            

            for (int i = 0; i < hidden.linha; i++) {
                hidden.escrever(i, 0, 1/(1+Math.exp(-hidden.ler(i, 0))));
            }

            output = Matrix.multiply(weight_ho, hidden);
            output = Matrix.add(output, bais_ho);

            for (int i = 0; i < output.linha; i++) {
                output.escrever(i, 0, 1/(1+Math.exp(-output.ler(i, 0))));
            }

            this.target = Matrix.arrayToMatrix(target);
            output_erro = Matrix.subtract(this.target, output);

            d_output = new Matrix(output.linha, 1);
            for(int i = 0; i < output.linha; i++){
                d_output.escrever(i, 0, output.ler(i, 0)*(1-output.ler(i, 0)));
            }

            hidden_T = Matrix.transpose(hidden);

            gradient = Matrix.hadmard(output_erro, d_output);
            gradient = Matrix.escalar_multiply(gradient, learning_rate);

            bais_ho = Matrix.add(bais_ho, gradient);

            weight_ho_deltas = Matrix.multiply(gradient, hidden_T);
            weight_ho = Matrix.add(weight_ho, weight_ho_deltas);

            weight_ho_T = Matrix.transpose(weight_ho);
            hidden_error = Matrix.multiply(weight_ho_T, output_erro);
            
            d_hidden = new Matrix(hidden.linha, 1);
            for(int i = 0; i < hidden.linha; i++){
                d_hidden.escrever(i, 0, hidden.ler(i, 0)*(1-hidden.ler(i, 0)));
            }
            input_T = Matrix.transpose(input);

            gradient_H = Matrix.hadmard(hidden_error, d_hidden);
            gradient_H = Matrix.escalar_multiply(gradient_H, learning_rate);

            bais_ih = Matrix.add(bais_ih, gradient_H);

            weight_ih_deltas = Matrix.multiply(gradient_H, input_T);
            weight_ih = Matrix.add(weight_ih, weight_ih_deltas);
        }

        List<Double> predict(List<Double> arrInput){
            this.input = Matrix.arrayToMatrix(arrInput);
            hidden = Matrix.multiply(weight_ih, this.input);
            hidden = Matrix.add(hidden, bais_ih);

            for (int i = 0; i < hidden.linha; i++) {
                hidden.escrever(i, 0, 1/(1+Math.exp(-hidden.ler(i, 0))));
            }

            output = Matrix.multiply(weight_ho, hidden);
            output = Matrix.add(output, bais_ho);

            for (int i = 0; i < output.linha; i++) {
                output.escrever(i, 0, 1/(1+Math.exp(-output.ler(i, 0))));
            }
            arrOutput = Matrix.matrixToArray(output);

            return arrOutput;
        }
}
