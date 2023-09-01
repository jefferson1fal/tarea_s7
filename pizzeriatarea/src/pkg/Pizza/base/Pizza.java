package pkg.Pizza.base;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String name;            // Nombre de la pizza
    private double price;           // Precio base de la pizza
    private final List<Topping> toppings = new ArrayList<>();  // Lista de toppings de la pizza

    // Constructor de la clase Pizza
    public Pizza(String name, double price) {
        this.name = name;           // Asigna el nombre pasado como parámetro
        this.price = price;         // Asigna el precio pasado como parámetro
    }



    // Método para agregar un topping a la pizza
    public void addTopping(Topping topping) {
        toppings.add(topping);         // Agrega el topping a la lista de toppings de la pizza
        price += topping.getPrice();    // Aumenta el precio total de la pizza con el precio del topping
    }

    // Método para mostrar los toppings de la pizza
    public void mostrarToppings() {
        System.out.println("Toppings de la pizza " + name + ":");
        for (Topping topping : toppings) {
            System.out.println(topping);  // Imprime el nombre de cada topping
        }
    }

    // Método toString para obtener una representación de la pizza como cadena de texto
    @Override
    public String toString() {
        return "Pizza: {" + name + ", Precio=" + price + "}";
    }

    // Métodos getter y setter para los atributos privados
    public double getPrice() {
        return price;
    }

    public Topping[] getToppings() {
        return toppings.toArray(new Topping[0]);
    }

    public Topping[] getToppingsList() {
        return toppings.toArray(new Topping[0]);
    }


}
