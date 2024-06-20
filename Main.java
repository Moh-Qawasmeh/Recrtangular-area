import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int w = input.nextInt();
        System.out.print("Rectangular area = " + l * w);
    }
}