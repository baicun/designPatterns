package com.example.chainmsPattern;

// 抽象处理者
public abstract class Approver {
	 Approver successor;//下一个处理者
	 String Name;//姓名
	public Approver(String Name)
	{
		this.Name=Name;
	}
	public abstract void ProcessRequest( PurchaseRequest request);
	public void SetSuccessor(Approver successor) {
		this.successor=successor;
	}
}
