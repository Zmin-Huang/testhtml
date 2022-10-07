package tw.com.shopmall.shoppy.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentBean, Integer>{
	CommentBean queryByContent(String content);
}
