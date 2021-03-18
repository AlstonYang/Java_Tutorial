import java.util.ArrayList;

public class Company {

	private String name;
	private ArrayList<FixedAsset> fixedAssets;
	private double bookValue, totalDepreciationExp;

	public Company(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.fixedAssets = new ArrayList<FixedAsset>();
		this.bookValue = 0;
		this.totalDepreciationExp = 0;
	}

	public void addFixedAsset(FixedAsset asset) {

		this.fixedAssets.add(asset);
		this.bookValue += asset.getBookValue();
	}
	
	public double getTotalBookValue() {
		this.updateBookValue();
		return this.bookValue;
	}

	public double getDepreciationExp() {

		this.updateDepreciationExp();
		return this.totalDepreciationExp;
	}
	
	public void updateBookValue() {

		this.bookValue -= this.totalDepreciationExp;
	}

	public void updateDepreciationExp() {

		this.totalDepreciationExp = 0;

		for (FixedAsset asset : fixedAssets) {
			this.totalDepreciationExp += asset.getDepreciationExp();
		}
	}

}
