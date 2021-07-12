package Case_Study_2.QuanLyHS;

import Case_Study_2.IOOFile.IOOFile;
import Case_Study_2.Regex.UserPassRegex;

import java.util.List;
import java.util.Scanner;

public class Login {
    public static User loginUser;
    public static List<User> userList = IOOFile.readUserFile();
    static Scanner sc = new Scanner(System.in);

    public static void login() {
        while (true) {
            System.out.println();
            System.out.println("|=======================================================|");
            System.out.println("|--CHÀO MỪNG BẠN ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ HỌC SINH--|");
            System.out.println("|                 1. Đăng nhập                          |");
            System.out.println("|                 2. Đăng ký mới                        |");
            System.out.println("|                 0. Thoát                              |");
            System.out.println("|                 Mời bạn chọn                          |");
            System.out.println("|=======================================================|");
            int choice = 99;
            try {
                choice = Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
            }
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("|===================================|");
                        System.out.println("| 1. Đăng nhập bằng tài khoản ADMIN |");
                        System.out.println("| 2. Đăng nhập bằng tài khoản User  |");
                        System.out.println("| 3. Thoát                          |");
                        System.out.println("| Mời bạn chọn                      |");
                        System.out.println("|===================================|");
                        int choice1 = 99;
                        try {
                            choice1 = Integer.parseInt(sc.nextLine());

                        } catch (Exception e) {
                        }
                        if (choice1 == 3) {
                            login();
                        }
                        switch (choice1) {
                            case 1:
                                logInAdmin();
                                break;
                            case 2:
                                logInUser();
                                break;
                            default:
                                System.err.println("Vui lòng chọn đúng");
                        }
                    }
                case 2:
                    System.out.println("Đăng ký người dùng mới");
                    String user = getUserName();
                    String pass = getPassword();
                    userList.add(new User(user, pass));
                    IOOFile.writeUserFile();
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.err.println("Vui lòng nhập đúng");
            }
        }
    }

    private static void logInUser() {
        while (true) {
            System.out.println("|==============|");
            System.out.println("| ----Menu---- |");
            System.out.println("| 1. Tiếp tục  |");
            System.out.println("| 2. Thoát     |");
            System.out.println("|==============|");
            int choice = 99;
            try {
                choice = Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
            }
            if (choice == 2) {
                return;
            }
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
                            StudentManage.readFile();
                        }
                    }
                    if (login) {
                        Menu.menuUser();
                    } else {
                        System.err.println("Sai tài khoản hoặc mật khẩu");
                    }
                    break;
                default:
                    System.err.println("Vui lòng chọn đúng");
            }
        }
    }

    private static void logInAdmin() {
        while (true) {
            System.out.println("|==============|");
            System.out.println("| ----Menu---- |");
            System.out.println("| 1. Tiếp tục  |");
            System.out.println("| 2. Thoát     |");
            System.out.println("|==============|");
            int choice = 99;
            try {
                choice = Integer.parseInt(sc.nextLine());

            } catch (Exception e) {
            }
            if (choice == 2) {
                return;
            }
            switch (choice) {
                case 1:
                    System.out.println("Tài Khoản :");
                    String username = sc.nextLine();
                    System.out.println("Mật khẩu");
                    String password = sc.nextLine();
                    boolean login = false;
                    if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
                        System.out.println("Xin chào " + username);
                        login = true;
                        StudentManage.readFile();
                    }
                    if (login) {
                        Menu.menuAdmin();
                    } else {
                        System.err.println("Sai tài khoản hoặc mật khẩu");
                    }
                    break;
                default:
                    System.err.println("Vui lòng chọn đúng");
            }
        }
    }

    private static String getUserName() {
        while (true) {
            try {
                System.out.println("Tài khoản");
                String username = sc.nextLine();
                if (UserPassRegex.validate(username)) {
                    boolean exit = false;
                    for (User user : userList) {
                        if (user.getUsername().equalsIgnoreCase(username)) {
                            System.err.println("Tài khoản đã tồn tại");
                            exit = true;
                        }
                    }
                    if (!exit) {
                        return username;
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.err.println("Tài khoản có ít nhất 1 ký tự");
            }
        }
    }

    private static String getPassword() {
        while (true) {
            try {
                System.out.println("Mật khẩu");
                String password = sc.nextLine();
                if (UserPassRegex.validate(password)) {
                    return password;
                } else throw new Exception();
            } catch (Exception e) {
                System.err.println("Mật khẩu ít nhất phải có 1 ký tư");
            }
        }
    }
}
