package model.service;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService; 
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer mounths) {
		OnlinePaymentService onpay = new PaypalService();
		double valueDivided = contract.getTotalValue()/mounths;
		
		for( int times = 1; times <= mounths; times++) {
			double firstFees = onpay.interest(valueDivided, times);
			double secondFees = onpay.paymentFee(valueDivided + firstFees);
			
			contract.getInstallments().add(new Installment(contract.getDate().plusMonths(times), valueDivided + secondFees + firstFees)); 
			
		}
		
		
		
	}
	
}
