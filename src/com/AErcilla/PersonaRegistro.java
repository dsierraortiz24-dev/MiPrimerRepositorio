package com.AErcilla;

public record PersonaRegistro(String nombre, String apellido) {
    @Override
    public String toString() {
        System.out.println("Esta instrución es inservible");
        return "%s %s".formatted(nombre, apellido);
    }
}
