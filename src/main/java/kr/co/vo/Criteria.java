package kr.co.vo;

public class Criteria {
	
	private int page;
	private int perPageNum; // 페이지당 보여줄 게시글의 개수
	private int rowStart;
	private int rowEnd;

	public Criteria() {
		 // 기본 생성자 : 최초 게시판에 진입시 필요한 기본값
		this.page = 1;
		this.perPageNum = 10;
		// 이부분이 설정되면 페이지 표시와 목록에 몇 개나 보여줄지 설정하는것.
	}
	
	// 현재 페이지 번호 page : getter, setter
	public void setPage(int page) {
		if (page <= 0 ) {
			this.page = 1;
			return;
		}
		this.page = page;
	}
	
	// 페이지당 보여줄 게시글의 개수 perPageNum : getter, setter
	public void setPerPageNum(int perPageNum) {
		if (perPageNum <= 0 || perPageNum > 100) {
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
	}
	
	// 현재 페이지 번호 page : getter, setter
	public int getPage() {
		return page;
	}
	
	public int getPageStart() {
		// 특정 페이지의 범위를 정하는 구간, 현재 페이지의 게시글 시작 번호
        // 0 ~ 10 , 10 ~ 20 이런식으로
		return (this.page - 1) * perPageNum;
	}
	
	// 페이지당 보여줄 게시글의 개수 perPageNum : getter, setter
	public int getPerPageNum() {
		return this.perPageNum;
	}
	
	public int getRowStart() {
		rowStart = ((page - 1) * perPageNum) + 1;
		return rowStart;
	}
	
	public int getRowEnd() {
		rowEnd = rowStart + perPageNum - 1;
		return rowEnd;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", rowStart=" + rowStart + ", rowEnd=" + rowEnd
				+ "]";
	}
	
	
}




