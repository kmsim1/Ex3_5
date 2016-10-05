package hansung.ac.kr.ex_5;

public class PayLogic1 implements PayLogic {

	public int calculatePay(int workingHours, int overtimeHours) {
		
		return 10*workingHours + 15*overtimeHours;
	}

}
