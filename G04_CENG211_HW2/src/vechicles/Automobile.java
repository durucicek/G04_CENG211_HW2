package vechicles;

public class Automobile extends Vehicle {
	protected double engineVolume;
	
	public Automobile(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, int VAT, double engineVolume) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, VAT);
		this.engineVolume = engineVolume;
	}

	public double calculateTotalPrice() {
		return 200000 * (1+ (calculateSCT()*0.8)) + (1+ VAT/100);
		
	}
}
