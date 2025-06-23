public class pattern2{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after inner loop
        }
    }
}
