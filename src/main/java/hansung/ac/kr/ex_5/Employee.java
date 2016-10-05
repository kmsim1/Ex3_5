package hansung.ac.kr.ex_5;

public class Employee {
	private String id, name;
	private int workingHours, overtimeHours;
	
	private PayLogic p1; // 연관관계 구현
	
	public void setPayLogic(PayLogic p1) {
		this.p1 = p1;
	}
	
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	// 위임
	public int calculatePay() {
		return p1.calculatePay(workingHours, overtimeHours);
	}
}
