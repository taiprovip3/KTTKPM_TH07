package spring.data.jpa.spring.data.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.data.jpa.spring.data.jpa.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
	@Query("SELECT mb.Loai FROM MayBay mb WHERE mb.TamBay >= ?1")
	public List<String> getMayBayByTamBay(int TamBay);
}
