public class Main {
    public static int suma(int a, int b, int c) {
        return a+b+c;
    }

    static class Coche {
        public int puertas = 3;
        public void IncPuertas() {
            this.puertas++;
        }
    }

    public static void main(String[] args) {
        System.out.println(suma(1, -3, 31423));
        Coche miCoche = new Coche();
        miCoche.IncPuertas();
        System.out.println(miCoche.puertas);
    }
}