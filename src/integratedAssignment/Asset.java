package integratedAssignment;

public class Asset {
	private String assetId;
	private String assetName;
	private String assetExpiry;
	
	public Asset(String assetId, String assetName, String assetExpiry) {
		this.assetId=assetId;
		this.assetName=assetName;
		this.assetExpiry=assetExpiry;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		 String regex = "^(DSK|LTP|IPH)-\\d{6}[HhLl]$";

		 try {
		    if (assetId != null && assetId.matches(regex)) {
		        this.assetId = assetId;
		    } else {
		        throw new InvalidAssetException("Invalid assetId format.");
		    }
		 }catch(InvalidAssetException e) {
			 System.out.println(e.getMessage());
		 }
		
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetExpiry() {
		return assetExpiry;
	}

	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}
	
	@Override
	public String toString() {
		return "Asset Id: "+getAssetId()+", Asset Name: "+getAssetName()+", Asset Expiry: "+getAssetExpiry();
	}
	

}
