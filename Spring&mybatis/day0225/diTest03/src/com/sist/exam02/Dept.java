package com.sist.exam02;

public class Dept {
	private int dno;
	private String dname;
	private String dloc;
	public Dept(int dno, String dname, String dloc) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dloc = dloc;
	}
	public void info() {
		System.out.println("부서번호:"+dno);
		System.out.println("부서이름:"+dname);
		System.out.println("부서위치:"+dloc);
	}
}
