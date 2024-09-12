public class Main {
    public static void main(String[] args) {

        Calculadora calcu = new Calculadora(15,2);
        int suma = calcu.sumar();
        System.out.println("la Suma de los dos números es "+suma);
        int resta = calcu.restar();
        System.out.println("la Resta de los dos números es "+resta);
        int multiplicar = calcu.multiplicar();
        System.out.println("la Multiplicación de los dos números es "+multiplicar);
        double dividir = calcu.dividir();
        System.out.println("la División de los dos números es "+dividir);

    }
}