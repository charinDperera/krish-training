package main;

public class Bill extends Handler{
	@Override
	public double addToFee(PayingSlip payingSlip) {
		return successor.addToFee(payingSlip);
	}
}

