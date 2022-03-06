package main;

public class PayingSlip {
	private int referenceNumer;
	private int numberCourses;
	private double outStandingFee;
	private boolean latePay;

	protected void setOutStandingFee(double outStandingFee) {
		this.outStandingFee = outStandingFee;
	}

	public PayingSlip(int referenceNumer, int numberCourses, boolean latePay) {
		this.referenceNumer = referenceNumer;
		this.numberCourses = numberCourses;
		this.latePay = latePay;
	}

	public int getReferenceNumer() {
		return referenceNumer;
	}

	public int getNumberCourses() {
		return numberCourses;
	}

	public double getOutStandingFee() {
		return outStandingFee;
	}

	public boolean isLatePay() {
		return latePay;
	}
	
}
