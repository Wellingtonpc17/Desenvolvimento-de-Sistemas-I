package aplicativo_mobilidade_urbana;

public class Corrida {

        public double distanciaPercorrida;
        public double tarifaBase;
        public double multiplicadorTarifa;

        public Corrida(double distanciaPercorrida, double tarifaBase, double multiplicadorTarifa) {
            this.distanciaPercorrida = distanciaPercorrida;
            this.tarifaBase = tarifaBase;
            this.multiplicadorTarifa = multiplicadorTarifa;
        }

        public double calcularValorTotal() {
            return tarifaBase + (distanciaPercorrida * multiplicadorTarifa);
        }

        public void exibir() {
            double total = calcularValorTotal();
            System.out.println("Valor da corrida: R$ " + total);
        }
    }


