package spring.data.jpa.spring.data.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	//Rất may mắn lớp này toàn đơn trị. Chỉ có lớp khác mang thuộc tính của nó như là: ChungNhan: chứng nhận máy bay nào, ChuyenBay: chuyến bay này của MayBay nào
@Table(name = "maybay")
public class MayBay {
	@Id
	private int MaMB;
	private String Loai;
	private int TamBay;
	
	public int getMaMB() {
		return MaMB;
	}
	public void setMaMB(int maMB) {
		MaMB = maMB;
	}
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		Loai = loai;
	}
	public int getTamBay() {
		return TamBay;
	}
	public void setTamBay(int tamBay) {
		TamBay = tamBay;
	}
	public MayBay() {
		super();
	}
	public MayBay(int maMB, String loai, int tamBay) {
		super();
		MaMB = maMB;
		Loai = loai;
		TamBay = tamBay;
	}
	
	@Override
	public String toString() {
		return "MayBay [MaMB=" + MaMB + ", Loai=" + Loai + ", TamBay=" + TamBay + "]";
	}
}
