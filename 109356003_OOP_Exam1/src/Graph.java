import java.util.Scanner;

public class Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int layer=0;
				Scanner layerScanner = new Scanner(System.in);
				System.out.print("Please input the layer(must be odd):");
				layer = layerScanner.nextInt();
				
				int x=1;
				for(int i =1; i<=(layer+1)/2;i++) {
					
					for(int j=i; j<(layer+1)/2;j++) {
						System.out.print(' ');
					}
					for(int j=0; j<x;j++) {
						System.out.print('*');
					}
					System.out.println();
					x+=2;
				}
				
				
				x-=4;
				for(int i =1; i<=((layer+1)/2)-1;i++) {
					
					for(int j=1; j<=i;j++) {
						System.out.print(' ');
					}
					for(int j=0; j<x;j++) {
						System.out.print('*');
					}
					x-=2;
					System.out.println();
				}
				
			}

}




