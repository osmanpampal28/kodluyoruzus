import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n,k,total=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("üssü alınacak sayı : ");
        n=scanner.nextInt();
        System.out.println("üs olacak sayı : ");
        k=scanner.nextInt();

        for(int i=1;i<=k;i++){
            total*=n;
        }

        System.out.println("Cevap : "+total);
    }
}
