import java.util.Scanner;

public class rightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int layer=0;
		Scanner layerScanner = new Scanner(System.in);
		System.out.print("Please input the layer:");
		layer = layerScanner.nextInt();
		
		for(int i =1; i<=layer;i++) {
			for(int j=1; j<=i;j++) {
			System.out.print('*');
			}
			System.out.println();
		}
		
	}

}
