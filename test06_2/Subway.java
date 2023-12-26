package test06_2;

public class Subway {
  String lineNumber;
  int passengerCount;
  int money;
  
  public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void show() {
    	System.out.println(lineNumber + "의 승객은 "+passengerCount +"명이고, 수입은"+ money + "입니다.");
    }
}
