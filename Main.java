public class Main {
    public static void main(String[] args) {
        suma (2, 4, 6);
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma( int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

//Ejercicio3
class Coche{
    int puertas = 0;
    public void agregarPuertas(){
        this.puertas++;
    }
}
