import java.util.ArrayList;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        calculateAverage(grades, sc);

    }

    public static double calculateAverage (ArrayList<Double> grades, Scanner sc ){
        double averague = 0;
        double notes = 0; 
        double sumaGradees = 0; 


        for (int i = 0; i <=4; i++) {
            System.out.println("Dime la nota:");
            notes = sc.nextDouble();
            grades.add(notes);
            sumaGradees += grades.get(i);
        }
        System.out.println("Tus notas son:" + grades);
        
        averague = sumaGradees/grades.size();
        System.out.println("El promedio es de " + averague);

        return averague;

    }
}