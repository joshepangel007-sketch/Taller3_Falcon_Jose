
import java.util.ArrayList;
import java.util.Scanner;

public class Challengue {
    public static void main(String[] args) {
        ArrayList <String> task = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Task(task, sc);

        System.out.println("Quieres elminar alguna tarea? ");

    }

    public static ArrayList <String> Task (ArrayList <String> task, Scanner sc){
 
        String taskUser = "";
        String userDesicion; 
        boolean stop = false; 

        System.out.println("\nEn este apartado puedes agregar tus tareas a realizar: ");
        
        while (!stop) { 
            System.out.println("Ingresa la tarea: ");
            taskUser = sc.nextLine();
            task.add(taskUser);
            System.out.println("Deseas agregar otra tarea?");
            userDesicion = sc.nextLine().trim().toLowerCase();
            
            if (userDesicion.equals("no")){
                stop = true; 
            }
        }

        System.out.println("Tus tareas son: " + task);
        return task;
    }

    public static ArrayList <String> remove(ArrayList<String> task, Scanner sc){
        String a = "";
        String userDesicion, taskRemove; 
        boolean stop = false;

        while (!stop) {
            System.out.println("Dime que tarea deseas eliminar: ");
            taskRemove = sc.nextLine();
            task.remove(taskRemove);
            
            System.out.println("Deseas eliminar otra tarea?: ");
            userDesicion = sc.nextLine().trim().toLowerCase();
            
            if (userDesicion.equals("no")) {
                stop = true;
            }
        }

        return task;
    }   
}
