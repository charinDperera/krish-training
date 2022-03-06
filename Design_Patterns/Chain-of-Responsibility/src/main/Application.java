package main;

public class Application {

	public static void main(String[] args) {
		CourseBilling courseBilling = new CourseBilling();
		LatePayment latePayment = new LatePayment();
		VAT vat = new VAT();
		Bill bill = new Bill();
		
		bill.setSuccessor(courseBilling);
		courseBilling.setSuccessor(latePayment);
		latePayment.setSuccessor(vat);
		
		PayingSlip payingSlip1  = new PayingSlip(12331, 6, true);
		System.out.println(bill.addToFee(payingSlip1));
		
		PayingSlip payingSlip2  = new PayingSlip(1498, 10, false);
		System.out.println(bill.addToFee(payingSlip2));
		
		PayingSlip payingSlip3  = new PayingSlip(1354, 3, true);
		System.out.println(bill.addToFee(payingSlip3));
		
		PayingSlip payingSlip4  = new PayingSlip(1798, 5, false);
		System.out.println(bill.addToFee(payingSlip4));
		 
	}

}
