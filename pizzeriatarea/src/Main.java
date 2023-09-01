import pkg.Pizza.base.Pizza;
import pkg.Pizza.base.Topping;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scaner para leer datos de la consola

        // Crear una pizza con un nombre y precio base
        Pizza pizza = new Pizza("Pizza Margarita", 70.00);

        // Crear toppings con nombres y precios
        Topping pepperoni = new Topping("Pepperoni", 1.5);
        Topping champiniones = new Topping("Champiñones", 1.0);
        Topping piña = new Topping("Piña", 0.75);

        // Crear una lista de toppings disponibles
        List<Topping> availableToppings = new ArrayList<>();
        availableToppings.add(pepperoni);
        availableToppings.add(champiniones);
        availableToppings.add(piña);

        // Mostrar el nombre y precio base de la pizza
        System.out.println("Bienvenido a la pizzería!");
        System.out.println("Hoy estamos preparando: pizza margarita (Q70.00)");

        // Mostrar el menú de toppings
        System.out.println("\nMenú de Toppings:");
        for (int i = 0; i < availableToppings.size(); i++) {
            System.out.println((i + 1) + ". " + availableToppings.get(i));
        }

        // Pedir al usuario que elija toppings
        while (true) {
            System.out.print("\nElige un topping para agregar (0 para terminar): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice > 0 && choice <= availableToppings.size()) {
                Topping selectedTopping = availableToppings.get(choice - 1);
                pizza.addTopping(selectedTopping); // Agregar el topping seleccionado a la pizza
                System.out.println("Topping agregado: " + selectedTopping);
            } else {
                System.out.println("Opción inválida.");
            }
        }

        // Calcular el precio total de la pizza
        double totalPrice = pizza.getPrice();
        for (Topping topping : pizza.getToppingsList()) {
            totalPrice += topping.getPrice();
        }

        // Mostrar información de la pizza y el precio total
        System.out.println("\nPizza final:");
        System.out.println(pizza);

    }
}
