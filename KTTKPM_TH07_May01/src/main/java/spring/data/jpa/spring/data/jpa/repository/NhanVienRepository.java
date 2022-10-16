package spring.data.jpa.spring.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.data.jpa.spring.data.jpa.entity.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{
	@Query("select nv from NhanVien nv where nv.Luong < 10000")
	public List<NhanVien> getNhanVienByLuong(int Luong);
	
	@Query(value = "select nv.manv from nhanvien nv join chungnhan cn on nv.manv = cn.manv join maybay mb on cn.mamb = mb.mamb where mb.loai like 'Boeing%'", nativeQuery = true)
	public List<String> getPhiCongBoeing();
	
	@Query(value = "select nv.* from nhanvien nv join chungnhan cn on nv.manv = cn.manv join maybay mb on cn.mamb = mb.mamb where mb.mamb = '747';", nativeQuery = true)
	public List<NhanVien> getNhanVienHaveMaMB747();
}
