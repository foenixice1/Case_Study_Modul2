package Case_Study_2.IOOFile;

import Case_Study_2.QuanLyHS.Login;
import Case_Study_2.QuanLyHS.Student;
import Case_Study_2.QuanLyHS.StudentManage;
import Case_Study_2.QuanLyHS.User;

import java.io.*;
import java.util.ArrayList;

public class IOOFile {
    public static void writeFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Student.csv"));
            String something = "Id,HoTen,Tuoi,GioiTinh,SDT,Gmail,DiaChi,DiemTB";
            bufferedWriter.write(something);
            for (Student student : StudentManage.students) {
                bufferedWriter.newLine();
                bufferedWriter.write(student.display());
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeUserFile() {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("User.txt"));
            String somthing = "User,Password";
            bufferedWriter.write(somthing);
            for (User user : Login.userList) {
                bufferedWriter.newLine();
                bufferedWriter.write(user.display());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
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
                list.add(new User(arr[0], arr[1]));
            }
        } catch (Exception e) {
        }
        return list;
    }
}
