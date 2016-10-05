package hansung.ac.kr.ex_5;

public class PayLogic2 implements PayLogic {

	public int calculatePay(int workingHours, int overtimeHours) {
		return workingHours*10  +  overtimeHours*20;
	}

}
