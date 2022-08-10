public class Main {
    static class Coche {
        public int puertas = 3;
        public void IncPuertas() {
            this.puertas++;
        }
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.IncPuertas();
        System.out.println(miCoche.puertas);
    }
}