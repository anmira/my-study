package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import kr.co.dao.BoardDAO;
import kr.co.dao.ReplyDAO;
import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;
import kr.co.vo.ReplyVO;
import kr.co.vo.SearchCriteria;

@Repository
public class ReplyServiceImpl implements ReplyService {
	
	@Inject
	private ReplyDAO dao;

	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		return dao.readReply(bno);
	}

	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		dao.writeReply(vo);
	}
	// 댓글 수정
	@Override
	public void updateReply(ReplyVO vo) throws Exception {
		dao.updateReply(vo);
		
	}
	// 댓글 삭제
	@Override
	public void deleteReply(ReplyVO vo) throws Exception {
		dao.deleteReply(vo);
		
	}
	// 선택된 댓글 조회
	@Override
	public ReplyVO selectReply(int rno) throws Exception {
		return dao.selectReply(rno);
	}
	
	
}
