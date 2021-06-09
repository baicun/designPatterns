package com.example.chainmsPattern;


public class MainTest {

	public static void main(String[] args) {
		//初始化数据
		Client mClient=new Client();
		Approver GroupLeader=new GroupApprover("Tom");
		Approver DepartmentLeader=new DepartmentApprover("Jerry");
		Approver President=new PresidentApprover("Bush");

		//设置责任链处理顺序
		GroupLeader.SetSuccessor(DepartmentLeader);
		DepartmentLeader.SetSuccessor(President);
		President.SetSuccessor(GroupLeader);

		//开始处理-设置处理起点：组长
		GroupLeader.ProcessRequest(mClient.sendRequst(1, 100, 40));
		GroupLeader.ProcessRequest(mClient.sendRequst(2, 200, 40));
		GroupLeader.ProcessRequest(mClient.sendRequst(4, 400, 140));

		//开始处理-设置处理起点：总经理
		/*President.ProcessRequest(mClient.sendRequst(1, 100, 40));
		President.ProcessRequest(mClient.sendRequst(2, 200, 40));
		President.ProcessRequest(mClient.sendRequst(4, 400, 140));*/
	}


}
