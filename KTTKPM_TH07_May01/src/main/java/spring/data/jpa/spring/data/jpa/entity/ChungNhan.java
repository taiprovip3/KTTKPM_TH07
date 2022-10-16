package spring.data.jpa.spring.data.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="chungnhan")
public class ChungNhan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MaCN;
	
	@ManyToOne
	@JoinColumn(name="MaNV", nullable = false)
	private NhanVien nhanVien;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MaMB", referencedColumnName = "MaMB")
	private MayBay mayBay;
	
	public int getMaCN() {
		return MaCN;
	}
	public void setMaCN(int maCN) {
		MaCN = maCN;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public MayBay getMayBay() {
		return mayBay;
	}
	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}

	@Override
	public String toString() {
		return "ChungNhan [MaCN=" + MaCN + ", MaNhanVien=" + nhanVien.getMaNV() + ", MaMayBay=" + mayBay.getMaMB() + "]";
	}
}
