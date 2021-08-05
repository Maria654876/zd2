import java.util.Scanner;
public class zd4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите А: ");
        int a= in.nextInt();
        System.out.println("Введите B: ");
        int b= in.nextInt();
        int r=0;
        for (int i=0; i<a; i++) {
            r+=b;
        }
        System.out.println("А*В="+r);
    }
}
