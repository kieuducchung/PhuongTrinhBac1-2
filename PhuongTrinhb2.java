
package phuongtrinhb2;
import java.util.Scanner;


public class PhuongTrinhb2 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Đầu tiên thì nhập giá trị cho 3 hệ số cua pt
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;

        // Kiểm tra điều kiện của delta để tính nghiệm
        if (delta > 0) {
            // Công thưc tính hai nghiệm phân biệt
           double x1 = (-b + Math.sqrt(delta)) / (2 * a);
           double x2 = (-b - Math.sqrt(delta)) / (2 * a);
           System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            // Công thức Tính nghiệm kép
            double x1 = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x1);
        } else {
            // Nếu delta nhỏ hơn 0 thì phương trình vô nghiệm 
            System.out.println("Phuong trinh vo nghiem");
        }

    }
}
