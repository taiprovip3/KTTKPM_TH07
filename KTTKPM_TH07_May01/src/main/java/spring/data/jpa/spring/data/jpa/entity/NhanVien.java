package spring.data.jpa.spring.data.jpa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="nhanvien")
public class NhanVien {
	
	@Id
	private String MaNV;
	private String Ten;
	private int Luong;
	//Ta nên xem 2 bảng có thuộc tính gì và có mối liên hệ gì rồi phân tích. Do một NhanVien có nhiều ChungNhan. Trong ChungNhan có: {MaCN, MaNV, MaMB}. One:NhanVien Many:ChungNhan. Map @annotation ở cả 2 lớp. Phía @One.. thì sài list phía @Many... sài Object
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "nhanVien")
	private Set<ChungNhan> chungNhans = new HashSet<>();
	
//	@ManyToOne
//	@JoinColumn(name = "MaCB", nullable = false)
//	private ChuyenBay chuyenBay;	-> sai vì nếu @manyToOne ở đây thì lớp NhanVien sẽ có thêm thuộc tính MaCB. -> vô lý ko thể insert NhanVien mới dc.
	
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	public NhanVien() {
		super();
	}
	public NhanVien(String maNV, String ten, int luong) {
		super();
		MaNV = maNV;
		Ten = ten;
		Luong = luong;
	}
	
	@Override
	public String toString() {
		return "NhanVien [MaNV=" + MaNV + ", Ten=" + Ten + ", Luong=" + Luong + ", chungNhans=" + chungNhans + "]";
	}
}
