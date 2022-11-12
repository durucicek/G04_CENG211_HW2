package vechicles;


public class Vehicle {
	//protected mi yapılmalı getter mı ? 
	protected String vehicleID;
	protected String monthOfSale;
	protected String cityOfSale;
	protected int productionYear;
	protected int VAT;
	protected double SCT;
	
	public Vehicle(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, int VAT) {
		this.vehicleID = vehicleID;
		this.monthOfSale=monthOfSale;
		this.cityOfSale=cityOfSale;
		this.productionYear=productionYear;
		this.VAT=VAT;
	}
	
	public double saleMonthValue() {
		double saleMonthValue = 0;
		switch(monthOfSale) {
			case "January":
				saleMonthValue = 0.3;
				break;
				
			case "May":
				saleMonthValue = 0.4;
				break;
				
			case "August":
				saleMonthValue = 0.5;
				break;
				
			case "October":
				saleMonthValue = 0.6;
				break;
				
			case "December":
				saleMonthValue = 0.7;
				break;
		}
		return saleMonthValue;
	}
	
	
	public double cityOfSaleValue() {
		double cityOfSaleValue = 0;
		switch(cityOfSale) {
			case "Izmir":
				cityOfSaleValue = 0.1;
				break;
				
			case "Istanbul":
				cityOfSaleValue = 0.3;
				break;
				
			case "Ankara":
				cityOfSaleValue = 0.2;
				break;
		}
		return cityOfSaleValue;
	}
	
	public double productionYearValue() {
		double productionYearValue = 0;
		
		if(productionYear>=2001 && productionYear<=2003) 
			productionYearValue = 1.0;
		
		else if(productionYear>=2012 && productionYear<=2017) {
			productionYearValue = 1.2;
		}
		
		else if(productionYear>=2018 && productionYear<=2022) {
			productionYearValue = 1.6;
		}
		
		return productionYearValue;
		}
		
	
	
	
	//??
	public double calculateSCT() {
		return SCT;
	}
	
	public double calculateTotalPrice() {
		return 0;
		
	}
	
	public String getID() {
		return vehicleID;
	}
}


