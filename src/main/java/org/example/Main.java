package org.example;

import org.example.Listado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Listado lista = new Listado();
        System.out.println("Bienvenido al gestor de tareas.");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Ver tareas");
        System.out.println("3. Marcar tarea como completada");
        System.out.println("4. Eliminar tarea");
        System.out.println("5. Salir");

        int opcion = 1;

        do {
            System.out.println("Ingrese la opción deseada:");
            try {
                opcion = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingrese un número entero.");
            }
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la tarea a agregar:");
                    String tarea = sc.nextLine();
                    lista.agregarTarea(tarea);
                    break;
                case 2:
                    lista.verTareas();
                    break;
                case 3:
                    System.out.println("Ingrese el índice de la tarea a marcar como completada:");
                    int indexCompletada = sc.nextInt();
                    sc.nextLine();
                    lista.marcarCompletada(indexCompletada - 1);
                    break;
                case 4:
                    System.out.println("Ingrese el índice de la tarea a eliminar:");
                    int indexEliminar = sc.nextInt();
                    sc.nextLine();
                    lista.eliminarTarea(indexEliminar - 1);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }

}

