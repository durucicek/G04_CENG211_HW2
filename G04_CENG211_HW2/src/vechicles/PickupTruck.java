package vechicles;

public class PickupTruck extends Vehicle {
	private String cabType;
	private String truckBedType;
	
	public PickupTruck(String vehicleID, String monthOfSale, String cityOfSale, 
			int productionYear, String cabType, String truckBedType, int VAT) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, VAT);
		this.cabType = cabType;
		this.truckBedType = truckBedType;
	}
	
	public double cabTypeValue() {
		double  cabTypeValue = 0;
		switch(cabType) {
			case "regular":
				 cabTypeValue = 2.5;
				 break;
				
			case "extended":
				 cabTypeValue = 2.8;
				 break;
				
			case "crew":
				 cabTypeValue = 3;
				 break;
		}
		return cabTypeValue;
	}

	public double truckBedTypeValue() {
		double  truckBedTypeValue = 0;
		switch(truckBedType) {
			case "regular":
				 truckBedTypeValue = 0.5;
				 break;
				
			case "tanker":
				 truckBedTypeValue = 0.8;
				 break;
				
			case "trailer":
				 truckBedTypeValue = 1.0;
				 break;
		}
		return truckBedTypeValue;
	}

	public double calculateSCT() {
		SCT = (truckBedTypeValue()*productionYearValue()) / cabTypeValue();
		return SCT;
	}
	
	public double calculateTotalPrice() {
		return 250000 * (1+ (calculateSCT()*0.6)) + (1+ VAT/100);
		
	}
}
