package com.example.chainmsPattern;

//客户端发起请求
public class Client {

	public Client() { }

	public PurchaseRequest sendRequst(int Type, int Number, float Price) {
		return new PurchaseRequest(Type, Number, Price);
	}

}
