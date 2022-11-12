package vechicles;

public class Hatchback extends Automobile {
	private String cityMode;
	
	public Hatchback(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, int VAT,
			Double engineVolume, String cityMode) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, VAT, engineVolume);
		this.cityMode = cityMode;
	}


	public double cityModeValue() {
		double  cityModeValue = 0;
		switch(cityMode) {
			case "yes":
				 cityModeValue = 0.15;
				 break;
				
			case "no":
				 cityModeValue = 0.1;
				 break;
		}
		return cityModeValue;
	}

	
}
