
package com.mycompany.taller2;

import java.util.ArrayList;
import java.util.Scanner;
public class Taller2 extends Productos{
private ArrayList<String> productos;
  public Taller2(){
    productos = new ArrayList<>();
}
  public void addProduct(String product) {
        productos.add(product);
    }

    public void removeProduct(int index) {
        productos.remove(index);
    }

    public void displayProduct() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles.");
        } else {
            System.out.println("Productos:");
            for (int i = 0; i < productos.size(); i++) {
                System.out.println(i + 1 + ". " + productos.get(i));
            }
        }
    }
 public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Taller2 listaTareas = new Taller2();

        while (true) {
            System.out.println("\nSelecciona una opcion:");
            System.out.println("1. Buscar producto");
            System.out.println("2. crear cuenta");
            System.out.println("3. Lista de productos");
            System.out.println("4. Salir");

            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1 -> {
                    System.out.print("Ingrese una tarea: ");
                    String task = scanner.nextLine();
                    listaTareas.addProduct(task);
                }
                case 2 -> {
                    listaTareas.displayProduct();
                    if (!listaTareas.productos.isEmpty()) {
                        System.out.print("Ingrese el numero de la tarea que desea eliminar: ");
                        int index = scanner.nextInt();
                        listaTareas.removeProduct(index - 1);
                    }
                }
                case 3 -> listaTareas.displayProduct();
                case 4 -> {
                    System.out.println("Saliendo...");
                    System.exit(0);
                }
                default -> System.out.println("Opcion invalida.");
            }
        }
    }
}
