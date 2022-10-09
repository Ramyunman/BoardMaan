package son.board.service;

import java.util.List;

import son.board.domain.BoardAttachVO;
import son.board.domain.BoardDto;
import son.board.domain.Criteria;

public interface BoardService {
	
	public void register(BoardDto board);
	
	public BoardDto get(Long bno);
	
	public boolean modify(BoardDto board);
	
	public boolean remove(Long bno);
	
//	public List<BoardDto> getList();
	
	public List<BoardDto> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
	
	public List<BoardAttachVO> getAttachList(Long bno);

}
