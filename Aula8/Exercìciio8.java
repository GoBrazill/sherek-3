package aula08;

import java.util.Scanner;

public class Exercìciio8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int nums1 [] = {2, 8, 14, 6, 75};
		int nums2 [] = {5, 8, 18, 9, 75};
		
		// preferi fazer usando só if else já que são poucos elementos
		if (nums1 [0] == nums2 [0]) {
			System.out.println("Os números dos vetores 0 são iguais");
		} else {
			System.out.println("Os números dos vetores 0 não são iguais");
		}
		
		if (nums1 [1] == nums2 [1]) {
			System.out.println("Os números dos vetores 1 são iguais");
		} else {
			System.out.println("Os números dos vetores 1 não são iguais");
		}
		
		if (nums1 [2] == nums2 [2]) {
			System.out.println("Os números dos vetores 2 são iguais");
		} else {
			System.out.println("Os números dos vetores 2 não são iguais");
		}
		
		if (nums1 [3] == nums2 [3]) {
			System.out.println("Os números dos vetores 3 são iguais");
		} else {
			System.out.println("Os números dos vetores 3 não são iguais");
		}
		
		if (nums1 [4] == nums2 [4]) {
			System.out.println("Os números dos vetores 4 são iguais");
		} else {
			System.out.println("Os números dos vetores 4 não são iguais");
		}
		
		scn.close();
	}

}
