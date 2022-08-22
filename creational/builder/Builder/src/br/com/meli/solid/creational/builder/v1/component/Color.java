package br.com.meli.solid.creational.builder.v1.component;

public class Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String result() {
        return this.color;
    }
}