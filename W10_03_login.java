package W10;

import java.util.Scanner;

public class W10_03_login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12344";

        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อรซื่อผู้ใช้: ");
        String inputUsername = kb.nextLine();
        System.out.print("ป้อนรหัสผ่าน: ");
        String inputpassword = kb.nextLine();

        // ตรวจสอบเงื่อนไข
        if (username.equals(inputUsername) && password.equals(inputpassword)) {
            System.out.println("เข้าสู่ระบบสำเร็จ");
        } else {
            if (!username.equals(inputUsername) && password.equals(inputpassword)) {
                System.out.println("username รหัสไม่ถูกต้อง");
            } else if (username.equals(inputUsername) && !password.equals(inputpassword)) {
                System.out.println("รหัสผ่านไม่ภูกต้อง");
            } else {
                System.out.println("ซื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
            }

        }
    }
}
