
public class Vehicle implements FixedAsset {

	private int id, depreciatedYear;
	private double cost, durableYear, residualValue, depreciationRate, depreciationExp, bookValue;

	public Vehicle(int id, double cost, double durableYear, double residualValue) {

		this.id = id;
		this.cost = cost;
		this.durableYear = durableYear;
		this.residualValue = residualValue;
		this.depreciatedYear = 0;
		this.bookValue = cost;
		this.calcDepreciationRate();
	}

	@Override
	public void calcDepreciationExp() {
		// TODO Auto-generated method stub

		if (this.depreciatedYear + 1 < durableYear) {

			this.calcBookValue();
			this.depreciationExp = this.bookValue * this.depreciationRate;
			this.depreciatedYear += 1;

		} else if (this.depreciatedYear + 1 == durableYear) {

			this.calcBookValue();
			this.depreciationExp = this.bookValue - this.residualValue;
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

	public void calcDepreciationRate() {

		this.depreciationRate = (1 / this.durableYear) * 2;
	}

}
