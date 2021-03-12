import java.util.ArrayList;

public class Company {

	private ArrayList<String> rankingNames;
	private ArrayList<Double> rankingValues;
	private Analyzer analyzer;
	private double netValue;

	public Company(Analyzer analyzer) {

		rankingNames = new ArrayList<String>();
		rankingValues = new ArrayList<Double>();
		this.analyzer = analyzer;
	}

	public void add(Object object) {

		double addedValue = analyzer.measurer(object);
		boolean candidate = true;

		for (int i = 0; i < rankingValues.size(); i++) {

			if (addedValue > rankingValues.get(i)) {
				rankingValues.add(i, addedValue);
				rankingNames.add(i, analyzer.getName(object));
				candidate = false;
				break;
			}
		}
		
		if (candidate) {

			rankingValues.add(addedValue);
			rankingNames.add(analyzer.getName(object));
		} 
	}

	public void calcNetValue() {

		for (double value : rankingValues) {

			this.netValue += value;
		}
	}

	public String getInfo() {

		this.calcNetValue();
		String mes = String.format("%s %.2f\n\n", "Net value:", this.netValue);
		
		mes += String.format("%-10s%10s\n", "Name", "Value");
		mes += "----------------------\n";
				
		for (int i = 0; i < rankingNames.size(); i++) {

			mes += String.format("%-10s%10.2f\n", rankingNames.get(i), rankingValues.get(i));
		}

		return mes;
	}
}
