package vechicles;

public class Sedan extends Automobile {
	private String roofType;

	public Sedan(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, int VAT,
			Double engineVolume, String roofType) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, VAT, engineVolume);
		this.roofType = roofType;
	}
	
	public double roofTypeValue() {
		double  roofTypeValue = 0;
		switch(roofType) {
			case "Regular":
				 roofTypeValue = 0.5;
				 break;
				
			case "Moonroof":
				 roofTypeValue = 0.6;
				 break;
				
			case "Sunroof":
				 roofTypeValue = 0.8;
				 break;
		}
		return roofTypeValue;
	}



}
