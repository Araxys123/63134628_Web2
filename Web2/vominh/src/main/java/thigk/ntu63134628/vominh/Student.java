package thigk.ntu63134628.vominh;

public class Student {
	private String ten;
	private String lop;
    private String khoa;
    private String truong;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
    public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getTruong() {
		return truong;
	}
	public void setTruong(String truong) {
		this.truong = truong;
	}
	public Student(String ten, String lop, String khoa, String truong) {
		this.ten = ten;
		this.lop = lop;
        this.khoa = khoa;
        this.truong = truong;
	}
}