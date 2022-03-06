package main;

public class VAT extends Handler{

	@Override
	public double addToFee(PayingSlip payingSlip) {
		payingSlip.setOutStandingFee(payingSlip.getOutStandingFee() + (payingSlip.getOutStandingFee()*0.02));
		System.out.println("VAT Added");
		
		return payingSlip.getOutStandingFee();
	}

}
