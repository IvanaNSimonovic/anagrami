package anagrami;

import java.util.Scanner;

public class Anagrami {

	public static int[] ucitavanjeNiza(int n, String s) {
		int[] niz = new int[n];
		for(int i=0;i<n;i++){
			niz[i]=Character.getNumericValue(s.charAt(i));
		}
		return niz;

	}

	public static boolean proveraNizova(int[] niz1, int[] niz2) {
		int poklapanja = 0;
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] == -1)
				continue;
			for (int j = 0; j < niz2.length; j++) {
				if (niz2[j] == -1)
					continue;
				else if (niz1[i] == niz2[j]) {
					niz1[i] = -1;
					niz2[j] = -1;
					poklapanja += 1;
				}

			}
		}
		if (poklapanja == niz1.length)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" broj elemenata?");
		int n=sc.nextInt();
		System.out.println("elementi niz1?");
		String s1=sc.next();
		int[] niz1=Anagrami.ucitavanjeNiza(n, s1);
		System.out.println("elementi niz2?");
		String s2=sc.next();
		int[] niz2=Anagrami.ucitavanjeNiza(n, s2);
		boolean b=Anagrami.proveraNizova(niz1, niz2);
		if(b)System.out.println("Jesu anagrami.");
		else System.out.println("Nisu anagrami.");
		
		sc.close();

	}

}
