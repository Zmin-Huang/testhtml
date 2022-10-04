package tw.com.shopmall.shoppy.member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface MemberRepository extends JpaRepository<MemberBean, Integer>{
	MemberBean findByNameAndPassword(String name, String password);
	
	Optional<MemberBean> findByName(String name);
	
	Boolean existsByName(String name);
	@Query(value = "select * from member where name = ?1", nativeQuery = true)
	MemberBean queryByName(String name);
	@Query(value = "select * from member where password = ?1", nativeQuery = true)
	MemberBean queryByPassword(String password);
	@Query(value = "select * from member where name = ?1 and password = ?2", nativeQuery = true)
	MemberBean queryByNameAndPassword(String name,String password);
	
}
