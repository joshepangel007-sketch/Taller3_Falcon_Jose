
import java.util.ArrayList;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String studentAdd, studentSearch;
        boolean stop = false; 

        for (int i = 0; i<=4; i++) {
            System.out.println("Dime el nombre");
            studentAdd = sc.nextLine();
            students.add(studentAdd);
        }

        System.out.println("Dime el nombre de e estudiante que deseas buscar");
        studentSearch = sc.nextLine();

        for (String search : students) {
            if (search.equals(studentSearch)) {
                System.out.println("Encontrado");
                stop = true;
                break;
            }
        }

        if (!stop){
            System.out.println("No encontrado");
        }
    }
}

