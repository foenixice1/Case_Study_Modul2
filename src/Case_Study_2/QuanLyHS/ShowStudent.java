package Case_Study_2.QuanLyHS;

import Case_Study_2.QuanLyHS.StudentManage;

import java.util.Scanner;

public class ShowStudent{
    static Scanner sc = new Scanner(System.in);
    public static void show() {
        System.out.println("|==================================|");
        System.out.println("|            ---MENU---            |");
        System.out.println("| 1. Hiển thị toàn bộ học sinh     |");
        System.out.println("| 2. Hiển thị  học sinh Giỏi       |");
        System.out.println("| 3. Hiển thị  học sinh Khá        |");
        System.out.println("| 4. Hiển thị  học sinh Trung Bình |");
        System.out.println("| 0 . Thoát                        |");
        System.out.println("| Mời bạn chọn                     |");
        System.out.println("|==================================|");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 0) {
            return;
        }
        switch (choice) {
            case 1:
                StudentManage.showALL();
                break;
            case 2:
                StudentManage.showHSG();
                break;
            case 3:
                StudentManage.showHSK();
                break;
            case 4:
                StudentManage.showHSTB();
                break;
            case 0:
                System.exit(0);
            default:
                System.err.println("Vui lòng nhập đúng");
        }
    }
}
