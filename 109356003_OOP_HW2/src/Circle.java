
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=6, y=6, r=6, layer=12;
				
		for(int i=0; i<=layer;i++) {
			for(int j=0; j<=layer;j++) {
				
				if(Math.pow(i-x,2) + Math.pow(j-y,2) <= Math.pow(r, 2)) {
					System.out.print('.');
				}else {
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}
	}

}
