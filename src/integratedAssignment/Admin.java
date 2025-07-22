package integratedAssignment;

public class Admin {
	
	public static void generateSalarySlip(Employee employees[], float salaryFactor[]) throws InvalidExperienceException {
		for (int i = 0; i < employees.length; i++) {
	        employees[i].calculateSalary(salaryFactor[i]);
	    }
		
	}
	
	public static int generateAssetsReport(Employee employees[], String lastDate) {
		 int totalAssets = 0;

		    for (Employee emp : employees) {
		        if (emp instanceof PermanentEmployee) {
		            try {
		                Asset[] filteredAssets = ((PermanentEmployee) emp).getAssetsByDate(lastDate);
		                for (Asset a : filteredAssets) {
		                    if (a != null) {
		                        totalAssets++;
		                    }
		                }
		            } catch (InvalidAssetException e) {
		                return -1;
		            }
		        }
		    }

		    return totalAssets;
	}
	
	public static String[] generateAssetsReport(Employee employees[], char assetCategory) {
		 String[] result = new String[employees.length * 3];
		    int index = 0;

		    for (Employee emp : employees) {
		        if (emp instanceof PermanentEmployee) {
		            PermanentEmployee pEmp = (PermanentEmployee) emp;
		            Asset[] assets = pEmp.getAssets();
		            if (assets == null) continue;

		            for (Asset a : assets) {
		                if (a != null && a.getAssetId() != null &&
		                    a.getAssetId().toLowerCase().charAt(0) == Character.toLowerCase(assetCategory)) {
		                    if (index < result.length) {
		                        result[index++] = a.getAssetId();
		                    }
		                }
		            }
		        }
		    }

		    return result;
	}
}
