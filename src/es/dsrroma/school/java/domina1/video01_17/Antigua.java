package es.dsrroma.school.java.domina1.video01_17;

import java.util.Scanner;

public class Antigua {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println(s);
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
