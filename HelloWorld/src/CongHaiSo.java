import java.util.Scanner;
public class CongHaiSo {
    public static void main(String[] args) {

        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        num1 = sc.nextInt();

        System.out.println("Nhập vào số thứ hai: ");
        num2 = sc.nextInt();

        sc.close();
        sum = num1 + num2;
        System.out.println("Tổng của hai số vừa nhập là: "+sum);
    }
}
