package com.example.demo.Java9.Exeption_Pracktic.Task2;


public class Planet {

    private int size;
    private Color color;
    private Type type;

    public Planet() {
    }
    public Planet(int size, Color color, Type type) throws TypeExeption,ColorExeption {

        this.size = size;
        this.color = color;
        this.type = type;
    }
    public Planet(int size, String color, String type) throws TypeExeption,ColorExeption {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }

    private Color colorStrToEnum(String color) throws ColorExeption {
        switch (color.toLowerCase()) {
            case "red":
                return Color.RED;
            case "dark":
                return Color.DARK;
            case "white":
                return Color.WHITE;
            case "green":
                return Color.GREEN;
            default:
                throw new ColorExeption("Input only color blue, red, white or yellow");
        }
    }

    private Type typeStrToEnum(String type) throws TypeExeption {
        switch (type.toLowerCase()) {
            case "big":
                return Type.BIG;
            case "little":
                return Type.LITTLE;
            case "small":
                return Type.SMALL;
            case "very_big":
                return Type.VERY_BIG;
            default:
                throw new TypeExeption("Tnput type of flower from next list: Rose, Tulip, Pion, Orchid, Iris, Lily");
        }
    }

    @Override
    public String toString() {
        return "Planet{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
