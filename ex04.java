package pctEx01;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num []= {10,80,30,8,0,23,93,75};
		int numPar = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				numPar = num[i];
				System.out.println("o maior numero é: "+numPar);
			}
	}
	
	}

}