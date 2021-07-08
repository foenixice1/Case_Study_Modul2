package Case_Study_2.QuanLyHS;

public class Student {
    private String id;
    private String hoTen;
    private String doTuoi;
    private String gioiTinh;
    private String soDT;
    private String gmail;
    private String diaChi;
    private String diemTB;

    public Student(String id, String hoTen, String doTuoi, String gioiTinh, String soDT, String gmail, String diaChi, String diemTB) {
        this.id = id;
        this.hoTen = hoTen;
        this.doTuoi = doTuoi;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.gmail = gmail;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDoTuoi() {
        return doTuoi;
    }

    public void setDoTuoi(String doTuoi) {
        this.doTuoi = doTuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(String diemTB) {
        this.diemTB = diemTB;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Học Sinh{" +
                "ID ='" + id + '\'' +
                ", Họ Tên ='" + hoTen + '\'' +
                ", Tuổi ='" + doTuoi + '\'' +
                ", Giới tính ='" + gioiTinh + '\'' +
                ", SDT ='" + soDT + '\'' +
                ", Gmail ='" + gmail + '\'' +
                ", Địa chỉ ='" + diaChi + '\'' +
                ", Điểm TB ='" + diemTB + '\'' +
                '}';
    }

    public String display() {
        return id + "," + hoTen + "," + doTuoi + "," + gioiTinh + "," + soDT + "," + gmail + "," + diaChi + "," + diemTB;
    }
}
