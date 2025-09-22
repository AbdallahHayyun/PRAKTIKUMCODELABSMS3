import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        scanner = new Scanner(System.in);
    }
    public int getAgeInput(){
        System.out.print("Masukkan Usia: ");
        return scanner.nextInt();
    }
    public void closeScanner(){
        scanner.close();
    }
}
