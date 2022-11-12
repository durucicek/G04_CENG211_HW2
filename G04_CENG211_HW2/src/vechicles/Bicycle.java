package vechicles;

public class Bicycle extends Vehicle {
	private String chainType;
	private String seatPost;
	
	public Bicycle(String vehicleID, String monthOfSale, String cityOfSale, 
			int productionYear, String chainType, String seatPost,int VAT ) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, VAT);
		this.chainType = chainType;
		this.seatPost = seatPost;
	}
	
	public double chainTypeValue() {
		double  chainTypeValue = 0;
		switch(chainType) {
			case "derailleur":
				 chainTypeValue = 1.1;
				 break;
				
			case "onechain":
				 chainTypeValue = 1.2;
				 break;
				
			case "doublechain":
				 chainTypeValue = 1.3;
				 break;
		}
		return chainTypeValue;
	}
	
	public double seatPostValue() {
		double  seatPostValue = 0;
		switch(seatPost) {
			case "carbonfiber":
				 seatPostValue = 0.8;
				 break;
				
			case "steel":
				 seatPostValue = 0.7;
				 break;
				
			case "aluminum":
				 seatPostValue = 0.9;
				 break;
				 
			case "titanium":
				 seatPostValue = 0.6;
				 break;
		}
		return seatPostValue;
	}
	
	public double calculateSCT() {
		SCT = (chainTypeValue()*seatPostValue()*0.1) + saleMonthValue();
		return SCT;
	}
	
	public double calculateTotalPrice() {
		return (10000 * 0.9) * (1 + calculateSCT()) + (1+ VAT/100);
		
	}
}
