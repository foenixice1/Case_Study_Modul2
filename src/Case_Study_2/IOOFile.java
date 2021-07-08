package Case_Study_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOOFile {
    public static void writeFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Student.csv"));
            String something = "Id,HoTen,Tuoi,GioiTinh,SDT,Gmail,DiaChi,DiemTB";
            bufferedWriter.write(something);
            for (Student hocSinh : StudentManage.hocSinhs) {
                bufferedWriter.newLine();
                bufferedWriter.write(hocSinh.display());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void writeUserFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("User.txt"));
            String somthing = "User,Password";
            bufferedWriter.write(somthing);
            for (User user : Login.userList) {
                bufferedWriter.newLine();
                bufferedWriter.write(user.display());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Student> readFile() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Student.csv"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(new Student(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static ArrayList<User> readUserFile() {
        ArrayList<User> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("User.txt"));
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(new User(arr[0],arr[1]));
            }
        } catch (Exception e) {
            System.err.println("Người dùng không tồn tại");;
        }
        return list;
    }
//    public static void writeUserFile(String path, List<User> users) {
//        try {
//            FileOutputStream fos = new FileOutputStream(path,false);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(users);
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static ArrayList<User> readUserFile(String path) {
//        ArrayList<User> users = new ArrayList<>();
//        try {
//            FileInputStream fis = new FileInputStream(path);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            users = (ArrayList<User>) ois.readObject();
//            ois.close();
//        } catch (Exception e) {
//           System.err.println("Không tồn tại");
//        }
//        return users;
//    }

}
