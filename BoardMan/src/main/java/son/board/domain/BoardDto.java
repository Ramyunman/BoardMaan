package son.board.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDto {
	
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;


}
