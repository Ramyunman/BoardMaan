 package son.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import son.board.domain.BoardDto;
import son.board.domain.Criteria;

public interface BoardMapper {
	
	//@Select("select * from tbl_board where bno > 0")
	public List<BoardDto> getList();
	
	public List<BoardDto> getListWithPaging(Criteria criteria);
	
	public void insert(BoardDto board);
	
	public void insertSelectKey(BoardDto board);
	
	public BoardDto read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardDto board);
	
	public int getTotalCount(Criteria cri);
	


}
