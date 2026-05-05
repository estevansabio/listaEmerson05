package pctEx01;

public class ex02 {

	public static void main(String[] args) {
	
		int[] num = {1,2,3,4,5};
		int soma = 0;
		for(int num1 : num) {
			soma += num1; 
	}
		System.out.println("A soma dos numeros é: " +soma);
}
}