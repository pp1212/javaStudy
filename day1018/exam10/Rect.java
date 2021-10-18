package com.sist.exam10;

public final class Rect {
	protected double width;
	protected double height;
	protected double area;
	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public final void calcArea() {
		area = width * height;
	}
	public void info() {
		System.out.println("가로:" + width + ",세로:" + height+",면적:"+area);
	}
}
