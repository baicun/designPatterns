package com.example.chainmsPattern;

// 具体处理者-总经理
public class PresidentApprover extends Approver {

	public PresidentApprover(String Name) {
		super(Name + " President");
	}

	@Override
	public void ProcessRequest(PurchaseRequest request) {
		if (10000 <= request.GetSum()) {
			System.out.println("**This request " + request.GetID()
					+ " will be handled by " + this.Name + " **");
		}else {
			successor.ProcessRequest(request);
		}
	}
}
