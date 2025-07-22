package integratedAssignment;

import java.util.ArrayList;
import java.util.List;

public class PermanentEmployee extends Employee{
	private double basicPay;
	private String[] salaryComponents;
	private float experience;
	private Asset[] assets;
	
	public PermanentEmployee(String employeeName, double basicPay, String[] salaryComponent, Asset[] assets) {
		super(employeeName);
		super.employeeId="E"+ ++Employee.permenantIdCounter;
		this.basicPay=basicPay;
		this.salaryComponents=salaryComponent;
		this.assets=assets;	
	}
	
	public double calculateBonus(float experience)throws InvalidExperienceException {
		
		if(experience<2.5) {
				throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus!");
			}
			
		if(experience>=2.5 && experience<4) {
			return 2550;
		}else if(experience>=4 && experience<8) {
			return 5000;
		}else if(experience>=8 && experience<12) {
			return 8750;
		}else{
			return 13000;
		}
	}
	
	@Override
	public void calculateSalary(float experience) throws InvalidExperienceException {
		this.experience = experience;

	    double DAComponent = 0;
	    double HRAComponent = 0;
	    double bonusAmount = 0;

	    for (String component : salaryComponents) {
	        if (component.startsWith("DA-")) {
	            int daPercent = Integer.parseInt(component.split("-")[1]);
	            DAComponent = (basicPay * daPercent) / 100;
	        } else if (component.startsWith("HRA-")) {
	            int hraPercent = Integer.parseInt(component.split("-")[1]);
	            HRAComponent = (basicPay * hraPercent) / 100;
	        }
	    }

	    bonusAmount = calculateBonus(experience);

	    double calculatedSalary = basicPay + DAComponent + HRAComponent + bonusAmount;
	    this.setSalary(Math.round(calculatedSalary));
	} 
	
	public Asset[] getAssetsByDate(String lastDate)throws InvalidAssetException {
		
		String[] parts = lastDate.split("-");
	    int givenYear = Integer.parseInt(parts[0]);
	    int givenMonth = Resources.getMonth(parts[1]);
	    int givenDay = Integer.parseInt(parts[2]);

	    List<Asset> matchedAssets = new ArrayList<>();

	    for (Asset asset : assets) {
	        String[] expiryParts = asset.getAssetExpiry().split("-");
	        int assetYear = Integer.parseInt(expiryParts[0]);
	        int assetMonth = Resources.getMonth(expiryParts[1]);
	        int assetDay = Integer.parseInt(expiryParts[2]);

	        if (assetYear < givenYear ||
	            (assetYear == givenYear && assetMonth < givenMonth) ||
	            (assetYear == givenYear && assetMonth == givenMonth && assetDay <= givenDay)) {
	            matchedAssets.add(asset);
	        }
	    }

	    if (matchedAssets.isEmpty()) {
	        throw new InvalidAssetException("No assets found for the given criteria!");
	    }

	    Asset[] result = new Asset[assets.length];
	    for (int i = 0; i < matchedAssets.size(); i++) {
	        result[i] = matchedAssets.get(i);
	    }

	    return result;	
}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public String[] getSalaryComponents() {
		return salaryComponents;
	}

	public void setSalaryComponents(String[] salaryComponents) {
		this.salaryComponents = salaryComponents;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public Asset[] getAssets() {
		return assets;
	}

	public void setAssets(Asset[] assets) {
		this.assets = assets;
	}
	
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponents()+", Assets: "+getAssets();
	}
	
	
}
