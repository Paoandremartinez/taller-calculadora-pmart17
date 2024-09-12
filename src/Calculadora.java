public class Calculadora {
    //atributos
    private int dato1;
    private int dato2;

    //Constructores
    public Calculadora(){

    }
    public Calculadora(int dato1, int dato2){
        this.dato1=dato1;
        this.dato2=dato2;


    }
    //metodos
    public int sumar(){
        int suma = this.dato1 + this.dato2;
        return suma;
    }
    public int restar(){
        int resta = this.dato1 - this.dato2;
        return resta;
    }
    public int multiplicar(){
        int multi = this.dato1 * this.dato2;
        return multi;
    }
    public double dividir(){
        double div =  this.dato1 /  this.dato2;
        return div;
    }
}
