package es.lvo;

public class Participante {
    private Coche coche;
    private int posicion;

    public Participante(Coche coche) {
        this.coche = coche;
        this.posicion = 0;
    }

    public Coche getCoche() {
        return coche;
    }

    public int mover() {
        posicion = posicion + (int) (Math.random() * 5) + 5;
        return posicion;
    }

    public String posicion() {
        String resultado = "";

        for (int i = 0; i < posicion; i++) {
            resultado += ' ';
        }
        return resultado;
    }
}
