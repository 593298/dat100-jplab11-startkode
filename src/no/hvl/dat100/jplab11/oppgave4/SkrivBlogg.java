package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		PrintWriter skriver = null;
		try {
			skriver = new PrintWriter(mappe + filnavn);
			String streng = samling.toString();
		skriver.write(streng);	
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		finally {
			if (skriver != null) {
				skriver.close();
				return true;
			}
		}
		return false;
	}
}
