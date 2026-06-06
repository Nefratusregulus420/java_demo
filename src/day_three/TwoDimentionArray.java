package day_three;

public class TwoDimentionArray {

	public static void main(String[] args) {
		int a[][]= {{1,5,7},
				    {6,8,2},
				    {7,4,8}};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
