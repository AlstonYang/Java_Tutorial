
public class Multi_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result;
		System.out.println();
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				
				result = i*j;
				
				System.out.printf("%2d%2s%2d%2s%3d ", i,'*',j,'=',result);
				
			}
			System.out.println();
		}
	}

}

