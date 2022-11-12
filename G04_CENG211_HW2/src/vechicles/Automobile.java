package vechicles;

public class Automobile extends Vehicle {
	private Double engineVolume;
	
	public Automobile(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, int VAT, Double engineVolume) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, VAT);
		this.engineVolume = engineVolume;
	}

	
}
