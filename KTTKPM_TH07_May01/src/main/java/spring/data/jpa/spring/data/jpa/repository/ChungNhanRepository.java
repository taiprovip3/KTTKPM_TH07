package spring.data.jpa.spring.data.jpa.repository;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.data.jpa.spring.data.jpa.entity.ChungNhan;
@Repository
public interface ChungNhanRepository extends JpaRepository<ChungNhan, Integer> {
//	Câu 16 support
	@Query(value="select cn.mamb,mb.loai,count(manv) from chungnhan cn join maybay mb on cn.mamb = mb.mamb group by cn.mamb,loai", nativeQuery = true)
	public List<Object[]> getAllMayBayCoNguoiLai();
}
