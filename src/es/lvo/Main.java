package es.lvo;

public class Main {

    public static void main(String[] args) {
        Coche bmw = new Coche("BMW", "X6", "negro");
        System.out.println(bmw.getInfo());
        Coche renault = new Coche("Renault", "Kadjar", "gris");
        System.out.println(renault.getInfo());

        Participante p = new Participante(bmw);

        int posicion = p.mover();
        System.out.println("Nueva Posición: " + posicion);

        posicion = p.mover();
        System.out.println("Nueva Posición: " + posicion);

        posicion = p.mover();
        System.out.println("Nueva Posición: " + posicion);
    }
}
