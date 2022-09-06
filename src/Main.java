import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int n;
       Scanner inp = new Scanner(System.in);
        System.out.println("sayiyi giriniz");
        n=inp.nextInt();



        for (int i = 1; i<=n;i*=6)
        {
            System.out.println("4'un katlari " + i);
        }
        System.out.println("------------------");
        for (int i = 1; i<=n; i*=7)
        {
            System.out.println("5'in katlari"+ i);
        }
    }
}