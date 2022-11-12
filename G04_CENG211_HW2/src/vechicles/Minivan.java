package vechicles;

public class Minivan extends Automobile {
	private int numberOfSeats;
	
	public Minivan(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, int VAT,
			Double engineVolume,int numberOfSeats ) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, VAT, engineVolume);
		this.numberOfSeats = numberOfSeats;
	}


	public double seatsValue() {
		double seatsValue = 0;
		switch(numberOfSeats) {
			case 4:
				seatsValue = 0.1;
				break;
				
			case 5:
				seatsValue = 0.4;
				break;
				
			case 6:
				seatsValue = 0.6;
				break;
				
			case 7:
				seatsValue = 0.8;
				break;
		}
		return seatsValue;
	}
	
	public double calculateSCT() {
		SCT = (0.6*productionYearValue()) / (engineVolume + seatsValue());
		return SCT;
	}
}
