package spring.data.jpa.spring.data.jpa.service;

import java.util.List;

import spring.data.jpa.spring.data.jpa.entity.NhanVien;

public interface NhanVienService {
	public List<NhanVien> getNhanVienByLuong(int Luong);
//	Câu 8 Cho biết tổng số lương phải trả cho các nhân viên.
	public int getTotalLuong();
//	Câu 9 Cho biết mã số của các phi công lái máy báy Boeing.
	public List<String> getPhiCongBoeing();
//	Câu 10 Cho biết các nhân viên có thể lái máy bay có mã số 747
	public List<NhanVien> getNhanVienHaveMaMB747();
}
