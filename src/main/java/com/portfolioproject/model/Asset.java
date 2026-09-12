package com.portfolioproject.model;

public class Asset 
{
	private String AssetID;
	private String Assetname;
	private String Assetprice;

		public Asset(String AssetID,String name,String price)
		{
			this.AssetID=AssetID;
			this.Assetname=Assetname;
			this.Assetprice=Assetprice;
		}

		public String getAssetID() {
			return AssetID;
		}

		public void setAssetID(String assetID) {
			AssetID = assetID;
		}

		public String getAssetname() {
			return Assetname;
		}

		public void setAssetname(String assetname) {
			Assetname = assetname;
		}

		public String getAssetprice() {
			return Assetprice;
		}

		public void setAssetprice(String assetprice) {
			Assetprice = assetprice;
		}
		
}
