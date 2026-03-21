
import java.util.ArrayList;
import java.util.Scanner;

public class Challengue {
    public static void main(String[] args) {
        ArrayList <String> task = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Task(task, sc);
    }

    public static String Task (ArrayList <String> task, Scanner sc){
   
        String taskUser = "";
        String userDesicion; 
        int quanty = 0;
        boolean stop = false; 

        System.out.println("en este apartado puedes agregar tus tareas a realizar: ");
        
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
        return taskUser;
    }
}
