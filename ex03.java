package pctEx01;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num []= {10,80,30,8,0,23};
		int numMaior = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>numMaior) {
				numMaior = num[i];
			}
	}
		System.out.println("o maior numero é: "+numMaior);
}
}