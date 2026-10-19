package com.AErcilla;

public class HolaMundo {
    public static void main(String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        String apellido = msg.solicitarDatos("Escribe tu apellido");
        Persona p1 = new Persona(nombre,apellido);
        msg.saludar(p1);
    }
}
