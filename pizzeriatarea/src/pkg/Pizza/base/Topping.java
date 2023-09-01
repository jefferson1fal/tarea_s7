package pkg.Pizza.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Topping {
    private final String ingredienteName; // Nombre del ingrediente del topping
    private final double price;          // Precio del topping

    // Constructor de la clase Topping
    public Topping(String ingredienteName, double price) {
        this.ingredienteName = ingredienteName; // Asigna el nombre del ingrediente pasado como parámetro
        this.price = price;                     // Asigna el precio pasado como parámetro
    }

    // Método getter para obtener el precio del topping
    public double getPrice() {
        return price;
    }

    // Método toString para obtener una representación del topping como cadena de texto
    @Override
    public String toString() {
        return ingredienteName + " (" + price + ")";
    }

    // Método main (punto de entrada) para probar la clase Topping
    public static void main(String[] args) {
        // Crear instancias de toppings con nombres y precios
        Topping pepperoni = new Topping("Pepperoni", 1.5);
        Topping champiniones = new Topping("chanpiniones", 1.0);
        Topping piña = new Topping("pizza", 0.75);

        // Crear una lista de toppings disponibles
        List<Topping> availableToppings = new ArrayList<>();
        availableToppings.add(pepperoni);
        availableToppings.add(champiniones);
        availableToppings.add(piña);

        // Crear una instancia de la clase Pizza (esto se usa para probar la clase Topping)
        Pizza pizza = new Pizza("Pizza Margarita", 70.00);

        // Mostrar menú de toppings
        System.out.println("Menú de Toppings:");
        for (int i = 0; i < availableToppings.size(); i++) {
            System.out.println((i + 1) + ". " + availableToppings.get(i));
        }

        // Pedir al usuario que elija toppings
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Elige un topping (0 para terminar): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice > 0 && choice <= availableToppings.size()) {
                Topping selectedTopping = availableToppings.get(choice - 1);
                pizza.addTopping(selectedTopping);
                System.out.println("Topping agregado: " + selectedTopping);
            } else {
                System.out.println("Opción inválida.");
            }
        }

        // Calcular el precio total de la pizza (esto se usa para probar la clase Topping)
        double totalPrice = pizza.getPrice();
        for (Topping topping : pizza.getToppings()) {
            totalPrice += topping.getPrice();
        }

        // Mostrar información de la pizza y el precio total
        System.out.println("Pizza final:");
        System.out.println(pizza);
        System.out.println("Precio total: " + totalPrice);
    }
}
