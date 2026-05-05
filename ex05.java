package pctEx01;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {10,20,30,40,50};
		int inverso = num[0];
        for (int i = num.length - 1; i >= 0; i--) {
        	inverso = num[i];
        }
            System.out.print(inverso);
	

}
}