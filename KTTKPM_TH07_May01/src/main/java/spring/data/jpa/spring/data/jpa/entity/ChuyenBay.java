package spring.data.jpa.spring.data.jpa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="chuyenbay")
public class ChuyenBay {
	
	@Id
	private String MaCB;
	private String GaDi;
	private String GaDen;
	private int DoDai;
	private Date GioDi;
	private Date GioDen;
	private int ChiPhi;
	
	//Do 1 ChuyenBay có nhiều NhanVien & nhiều NhanVien thuộc nhiều ChuyenBay khác không thể nào có chuyện bảng NhaVien có thuộc tính MaCB khi insert nên 2 bảng ChuyenBay;NhanVien tạo thành 1 bảng chuyenbay_nhanvien_map; Khi insert chuyến bay ta insert vào bảng này.
	@ManyToMany
	@JoinTable(
		name="chuyenbay_nhanvien_map",
		joinColumns = @JoinColumn(
			name="MaCB",
			referencedColumnName = "MaCB"
		),
		inverseJoinColumns = @JoinColumn(
			name="MaNV",
			referencedColumnName = "MaNV"
		)
	)
	private Set<NhanVien> nhanViens = new HashSet<>();
	
	//Do 1 ChuyenBay chỉ có 1 MayBay. Ta nên đặt @anotation ở lớp phức tạp này, ko đặt OneToOne ở lớp MayBay. Lớp MayBay chỉ toàn thuộc tính đơn tab qua xem. Khai báo kiểu đối tượng cũng cần getset còn Set,List thì ko cần vì new thẳng luôn khi khai báo.
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MaMB", referencedColumnName = "MaMB")
	private MayBay mayBay;
	
	
	public String getMaCB() {
		return MaCB;
	}
	public void setMaCB(String maCB) {
		MaCB = maCB;
	}
	public String getGaDi() {
		return GaDi;
	}
	public void setGaDi(String gaDi) {
		GaDi = gaDi;
	}
	public String getGaDen() {
		return GaDen;
	}
	public void setGaDen(String gaDen) {
		GaDen = gaDen;
	}
	public int getDoDai() {
		return DoDai;
	}
	public void setDoDai(int doDai) {
		DoDai = doDai;
	}
	public Date getGioDi() {
		return GioDi;
	}
	public void setGioDi(Date gioDi) {
		GioDi = gioDi;
	}
	public Date getGioDen() {
		return GioDen;
	}
	public void setGioDen(Date gioDen) {
		GioDen = gioDen;
	}
	public int getChiPhi() {
		return ChiPhi;
	}
	public void setChiPhi(int chiPhi) {
		ChiPhi = chiPhi;
	}
	

	public ChuyenBay() {
		super();
	}
	public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, Date gioDi, Date gioDen, int chiPhi) {
		super();
		MaCB = maCB;
		GaDi = gaDi;
		GaDen = gaDen;
		DoDai = doDai;
		GioDi = gioDi;
		GioDen = gioDen;
		ChiPhi = chiPhi;
	}
	
	
	@Override
	public String toString() {
		return "ChuyenBay [MaCB=" + MaCB + ", GaDi=" + GaDi + ", GaDen=" + GaDen + ", DoDai=" + DoDai + ", GioDi="
				+ GioDi + ", GioDen=" + GioDen + ", ChiPhi=" + ChiPhi + ", MaMayBay=" + mayBay.getMaMB()+"]";
	}
}
