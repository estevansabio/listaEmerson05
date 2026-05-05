package pctEx01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		
		int[] num = new int[5];
		for(int i=0;i<num.length;i++) {
			System.out.println("digite o valor para posição " +i+": ");
			num[i] = receba.nextInt();
	}
		System.out.println("\n valores digitados: ");
		for(int i = 0;i<num.length; i++) {
			System.out.println("posição é " +i+": " +num[i]);
		}

}
}