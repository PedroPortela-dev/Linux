import java.util.List;

public class RedeNeural {
    
        private int i_nodes;
        private int h_nodes;
        private int o_nodes;
        private Matrix bais_ih;
        private Matrix bais_ho;
        private Matrix weight_ih;
        private Matrix weight_ho;
        private Matrix input;
        private Matrix hidder;
        private Matrix output;

        RedeNeural(int i_nodes,int h_nodes,int o_nodes){
            this.i_nodes = i_nodes;
            this.h_nodes = h_nodes;
            this.o_nodes = o_nodes;

            bais_ih = new Matrix(h_nodes, 1);
            bais_ih.aleatorio();
            bais_ho = new Matrix(o_nodes, 1);
            bais_ho.aleatorio();

            weight_ih = new Matrix(h_nodes, i_nodes);
            weight_ih.aleatorio();

            weight_ho = new Matrix(o_nodes, h_nodes);
            weight_ho.aleatorio();
        }

        void feedForward(List<Double> input){
            this.input = Matrix.arrayToMatrix(input);
            hidder = Matrix.multiply(weight_ih, this.input);
            hidder = Matrix.add(hidder, bais_ih);

            for (int i = 0; i < hidder.linha; i++) {
                hidder.escrever(i, 0, 1/(1+Math.exp(-hidder.ler(i, 0))));
            }

            output = Matrix.multiply(weight_ho, hidder);
            output = Matrix.add(output, bais_ho);

            for (int i = 0; i < output.linha; i++) {
                output.escrever(i, 0, 1/(1+Math.exp(-output.ler(i, 0))));
            }
        }
}
