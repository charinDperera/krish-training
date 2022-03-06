package main;

public class LatePayment extends Handler{

	@Override
	public double addToFee(PayingSlip payingSlip) {
		payingSlip.setOutStandingFee(payingSlip.getOutStandingFee() + (payingSlip.getOutStandingFee() * 0.05));
		System.out.println("Late Fee tax Added");
		
		if (payingSlip.getOutStandingFee() >= 50000)
			return payingSlip.getOutStandingFee();
		else
			return successor.addToFee(payingSlip);
	}
	
}
