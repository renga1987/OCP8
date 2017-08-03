package TemplateMethodDP;

public class TemplateMethodPatternClient {

	public static void main(String[] args) {
		System.out.println("NetOrder......");
		OrderProcessTemplate netOrder = new NetOrder();
		netOrder.processOrder();
		System.out.println("StoreOrder......");
		OrderProcessTemplate storeOrder = new NetOrder();
		storeOrder.isGift=true;
		storeOrder.processOrder();
	}

}
