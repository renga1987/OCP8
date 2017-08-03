package TemplateMethodDP;

public abstract class OrderProcessTemplate {

	public boolean isGift;
	
	public abstract void doSelect();
	
	public abstract void doPayment();
	
	public final void giftWrap(){
		System.out.println("Gift Wrap Done..");
	}
	
	public abstract void doDelivery();
	
	public final void processOrder(){
		doSelect();
		doPayment();
		if(isGift)
			giftWrap();
		doDelivery();
	}
	
}
