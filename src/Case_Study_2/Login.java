package Case_Study_2;

import Case_Study_2.IOOFile;
import Case_Study_2.User;

import java.util.List;
import java.util.Scanner;

public class Login {
    public static User loginUser;
    public static List<User> userList = IOOFile.readUserFile();
    static Scanner sc = new Scanner(System.in);

    public static void login() {
        while (true) {
            System.out.println();
            System.out.println("--CHÀO MỪNG BẠN ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ HỌC SINH--");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký người");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Tài Khoản :");
                    String username = sc.nextLine();
                    System.out.println("Mật khẩu");
                    String password = sc.nextLine();
                    boolean login = false;
                    for (User user : userList) {
                        if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                            System.out.println("Xin chào " + user.getUsername());
                            login = true;
                            loginUser = user;
                        }
                    }
                    if (login) {
                        Menu.menu();
                    } else {
                        System.err.println("Sai tài khoản hoặc mật khẩu");
                    }
                    break;
                case 2:
                    System.out.println("Đăng ký người dùng mới");
                    String user = getUserName();
                    System.out.println("Mật khẩu");
                    String pass = sc.nextLine();
                    userList.add(new User(user,pass));
                    IOOFile.writeUserFile();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập đúng");
            }
        }
    }
    private static String getUserName() {
        while (true) {
            System.out.println("Tài khoản");
            String username = sc.nextLine();
            boolean exit = false;
            for (User user : userList) {
                if (user.getUsername().equalsIgnoreCase(username)){
                    System.err.println("Tài khoản đã tồn tại");
                    exit = true;
                }
            }
            if (!exit) {
                return username;
            }
        }
    }
}
