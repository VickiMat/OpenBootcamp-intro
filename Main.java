public class Main {
    public static void main(String[] args) {
        suma (2, 4, 6);
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);

        Persona persona = new Persona();
        persona.setNombre("Maria");
        persona.setEdad(30);
        persona.setTelefono(345253);

        System.out.println("Hola mi nombre completo es "
                + persona.getNombre() + " ,mi edad  " + persona.getEdad() +
                " y mi numero de telefono es "+ persona.getTelefono());

        Cliente cliente = new Cliente();
        cliente.setEdad(23);
        cliente.setNombre("Claudia");
        cliente.setTelefono(35692043);
        cliente.setCredito("3456");

        System.out.println("Hola soy " + cliente.getNombre() + " de " + cliente.getEdad() + " años de edad y mi telefono y credito disponible son " + cliente.getTelefono() + " " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(45);
        trabajador.setNombre("Carlos");
        trabajador.setTelefono(32142563);
        trabajador.setSalario(1000);
        System.out.println("Nombre: " + trabajador.getNombre()
        + " edad: " + trabajador.getEdad()
        + " telefono: " + trabajador.getTelefono()
        + " salario: " + trabajador.getSalario());
        //Ejercicio tema 4
        //IF
        int numeroIf = 0;

        if (numeroIf > 0) {
                System.out.println("numeroIf Es un número positivo");
        } else if (numeroIf < 0) {
                System.out.println(("numeroIf Es un número negativo"));
        } else {
                System.out.println("numeroIf Es 0");
        }

        //WHILE
        var numeroWhile = 0;

        while (numeroWhile<3){
            numeroWhile = numeroWhile + 1;
            System.out.println("numeroWhile es: " + numeroWhile);
        }

        //DO WHILE
        var numeroDoWhile = 0;

        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println("numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile == 0);

        //FOR
        var numeroFor = 0;

        for (;numeroFor<=3;numeroFor++){
            System.out.println("numeroFor es " + numeroFor);
        }

        //SWITCH
        var estacion = "inviern";

        switch (estacion){
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("Eso no es una estación!");
        }
    }
    public static int suma( int num1, int num2, int num3){
        return num1 + num2 + num3;
    }


}

//Ejercicio tema 3
class Coche{
    int puertas = 0;
    public void agregarPuertas(){
        this.puertas++;
    }
}

//Ejercicio tema 8

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

//Ejercicio tema 9
class Cliente extends Persona {
    public String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}


