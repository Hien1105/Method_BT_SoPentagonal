import java.util.Scanner;

public class Method_BT_SoPentagonal {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        System.out.println("So pentagonal tương ứng của n là: "+getPentagonalNumber(n));
    }
    public static int getPentagonalNumber(int n){
        int pen;
        if (n >=1 ) pen = n*(3*n - 1)/2;
        else pen = -1;
        return pen;
    }
}
