package com.project.restaurant;

public class Customer {
	private int table_no;
	private int pressedNum;
	public void setTableNo(int table_no){
		this.table_no=table_no;
	}
	public int getTableNo(){
		return table_no;
	}
	public void setPressNumberForOrder(int pressedNum){
		this.pressedNum=pressedNum;
	}
	public int getPressNumberForOrder(){
		return pressedNum;
	}
}
