
public class Machine implements FixedAsset {

	private int id, depreciatedYear;
	private double cost, durableYear, residualValue, depreciationExp, bookValue;

	public Machine(int id, double cost, double durableYear, double residualValue) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.cost = cost;
		this.durableYear = durableYear;
		this.residualValue = residualValue;
		this.depreciatedYear = 0;
		this.bookValue = this.cost;
	}

	@Override
	public void calcDepreciationExp() {
		// TODO Auto-generated method stub
		if (this.depreciatedYear < this.durableYear) {
			this.depreciationExp = (this.cost - this.residualValue) / this.durableYear;
			this.depreciatedYear += 1;
		} else {
			this.depreciationExp = 0;
		}
	}

	@Override
	public void calcBookValue() {
		// TODO Auto-generated method stub
		this.bookValue -= this.depreciationExp;
	}

	@Override
	public double getDepreciationExp() {
		// TODO Auto-generated method stub
		this.calcDepreciationExp();
		return this.depreciationExp;
	}

	@Override
	public double getBookValue() {
		// TODO Auto-generated method stub
		this.calcBookValue();
		return this.bookValue;
	}

}
