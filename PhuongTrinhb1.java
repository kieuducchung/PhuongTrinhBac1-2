
package phuongtrinhb1;
import java.util.Scanner;

public class PhuongTrinhb1 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Nhập hệ số a và b
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        
        

        // Kiểm tra trường hợp a = 0
        if (a == 0) {
            if (b == 0) {
                //Neu kiem tra dieu kien dung va b cung bang 0 thi pt co vo so nghiệm.
                System.out.println("Phưong trinh co vo so nghiem");
            } else { 
               // Nguoc lai a = 0 nhưng b khác 0, phương trình vô nghiệm
                System.out.println("Phưong trinh vo nghiem");
            }
        } else {
            // Tính nghiệm khi a khác 0
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }
}
        
        
  