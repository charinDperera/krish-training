package main;

public class CourseBilling extends Handler {

	@Override
	public double addToFee(PayingSlip payingSlip) {
		payingSlip.setOutStandingFee(payingSlip.getNumberCourses() * 10000);
		System.out.println("Course Fee Calculated");
		
		if (payingSlip.getOutStandingFee() > 50000 && !payingSlip.isLatePay())
			return payingSlip.getOutStandingFee();
		else
			return successor.addToFee(payingSlip);
	}

}
