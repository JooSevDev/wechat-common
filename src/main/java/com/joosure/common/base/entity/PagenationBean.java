package com.joosure.common.base.entity;

public class PagenationBean {

	private static final int DEFAULT_SIZE = 10;
	
	private int limit = DEFAULT_SIZE;//每页大小
	private int offset = 0;//偏移，起始位置
	private int pageNum = 1;//第几页
	
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
}
