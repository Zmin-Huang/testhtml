package tw.com.shopmall.shoppy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.shopmall.shoppy.member.CommentBean;
import tw.com.shopmall.shoppy.member.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	
	public List<CommentBean> select(CommentBean bean) {
		List<CommentBean> result = null;
		if(bean!=null && bean.getComid()!=null && !bean.getComid().equals(0)) {
			Optional<CommentBean> data = commentRepository.findById(bean.getComid());
			if(data.isPresent()) {
				result = new ArrayList<CommentBean>();
				result.add(data.get());
			}
		} else {
			result = commentRepository.findAll(); 
		}
		return result;
	}
	public CommentBean insert(CommentBean bean) {
		CommentBean result = null;
		if(bean!=null && bean.getContent()!=null) {
			if(commentRepository.queryByContent(bean.getContent())==null) {
				return commentRepository.save(bean);
			}
			
		}
		return result;
	}
}
