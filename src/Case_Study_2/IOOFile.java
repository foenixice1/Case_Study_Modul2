package Case_Study_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

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

}
