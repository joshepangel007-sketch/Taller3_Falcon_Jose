import java.util.ArrayList;
import java.util.Scanner;

public class InventoryPlayer {
    public static void main(String[] args) {
        var inventory = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
        boolean fiend= false;
        String remove;
        String search;

        Jugador(inventory, sc );

        System.out.println("Que deseas buscar");
        search =sc.nextLine();
        
        for (String elem : inventory) {
            if (elem.equals(search)){
                System.out.println("Encontrado:");
                fiend = true;
                break;
            }
        }

        if (!fiend){
            System.out.println("Elemento no encontrado");
        }
        
        System.out.println("Que deseas eliminar?");
        remove = sc.nextLine();
        inventory.remove(remove);

        System.out.println( "Tus elementos actuales son: " + inventory);
    }

    public static String Jugador (ArrayList<String> inventario, Scanner sc){
         String objectUser = "";
         
         System.out.println("Dime que quieres guardar, puedes guardar solo tres cosas;");

         for (int i = 0; i <=2; i++) {
            objectUser = sc.nextLine();
            inventario.add(objectUser); 
         }
         System.out.println(inventario);
        return objectUser;  
    }
}
