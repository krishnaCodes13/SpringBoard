package interfaces;

public class SmartPhone extends Mobile implements Testable {
	private String networkGeneration;
	
	public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
		super(name, brand, operatingSystemName, operatingSystemVersion);
		this.networkGeneration=networkGeneration;
	}

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}



	@Override
	public boolean testCompatibility() {
		if(super.getOperatingSystemName().equals("Saturn")) {
			if(this.getNetworkGeneration().equals("3G")){
				if(super.getOperatingSystemVersion().equals("1.1") || super.getOperatingSystemVersion().equals("1.2") || super.getOperatingSystemVersion().equals("1.3")) {
					return true;
					}	
			}else if(this.getNetworkGeneration().equals("4G")){
				if(super.getOperatingSystemVersion().equals("1.2") || super.getOperatingSystemVersion().equals("1.3")) {
					return true;
				}
			}else if(this.getNetworkGeneration().equals("5G")){
				if(super.getOperatingSystemVersion().equals("1.3")) {
					return true;
					}
			}
		}else {
			if(super.getOperatingSystemName().equals("Gara")) {
				if(this.getNetworkGeneration().equals("3G")) {
					if(super.getOperatingSystemVersion().equals("EXRT.1") || super.getOperatingSystemVersion().equals("EXRT.2") || super.getOperatingSystemVersion().equals("EXRU.1")) {
						return true;
					}
							
				}else if(this.getNetworkGeneration().equals("4G")){
					if(super.getOperatingSystemVersion().equals("EXRT.2") || super.getOperatingSystemVersion().equals("EXRU.1")) {
						return true;
						}
	
				}else if(this.getNetworkGeneration().equals("5G")){
					if(super.getOperatingSystemVersion().equals("EXRU.1")) {
						return true;
						}
				}
			}
		}
		return false;
	}
	
	
	
}
