package test;

public class ch05Test02_05 {
	public static void main(String[] args) {
		//for 문을 이용해서 주어진 배열의 전체 항목의 합과 평균값을 구해보시오
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		
		int a= 0;
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j <array[i].length; j++ ) {
				sum += array[i][j];
				 a++;
				
				int total =array[0].length + array[1].length + array[2].length;
				avg = (double)sum/a;
				
			}
		}
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
		
		
	}
}
