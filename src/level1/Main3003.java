package level1;

import java.util.Scanner;

public class Main3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int king = sc.nextInt();
		sc = new Scanner(System.in);
		int queen = sc.nextInt();
		sc = new Scanner(System.in);
		int rook = sc.nextInt();
		sc = new Scanner(System.in);
		int bishop = sc.nextInt();
		sc = new Scanner(System.in);
		int knight = sc.nextInt();
		sc = new Scanner(System.in);
		int pone = sc.nextInt();
		
		if(king != 1) {
			if(king > 1) {
				System.out.println("-"+(king-1));
			}else{
				System.out.println((1-king));
			}
		}else {
			System.out.println("0");
		}
		if(queen != 1) {
			if(queen > 1) {
				System.out.println("-"+(queen-1));
			}else{
				System.out.println((1-queen));
			}
		}else {
			System.out.println("0");
		}
		if(rook != 2) {
			if(rook > 2) {
				System.out.println("-"+(rook-2));
			}else{
				System.out.println((2-rook));
			}
		}else {
			System.out.println("0");
		}
		if(bishop != 2) {
			if(bishop > 2) {
				System.out.println("-"+(bishop-2));
			}else{
				System.out.println((2-bishop));
			}
		}else {
			System.out.println("0");
		}
		if(knight != 2) {
			if(knight > 2) {
				System.out.println("-"+(knight-2));
			}else{
				System.out.println((2-knight));
			}
		}else {
			System.out.println("0");
		}
		if(pone != 8) {
			if(pone > 8) {
				System.out.println("-"+(pone-8));
			}else{
				System.out.println((8-pone));
			}
		}else {
			System.out.println("0");
		}


	}

}
