<<<<<<< HEAD
import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        long min = sc.nextLong();
        
        long years = min / (60 * 24 * 365);
        long remainingMinutes = min % (60 * 24 * 365);
        long days = remainingMinutes / (60 * 24);
        
        System.out.println(min + " min is approximately " + years + " years and " + days + " days.");
        
        //scanner.close();
    }
}
=======
import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        long min = sc.nextLong();
        
        long years = min / (60 * 24 * 365);
        long remainingMinutes = min % (60 * 24 * 365);
        long days = remainingMinutes / (60 * 24);
        
        System.out.println(min + " min is approximately " + years + " years and " + days + " days.");
        
        //scanner.close();
    }
}
>>>>>>> 8f37139f6698a3a0831086bc62fa0c8903cf2f96
