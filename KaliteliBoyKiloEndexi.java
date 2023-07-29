package KaliteliBoyKiloEndexi;
import java.util.Scanner;

public class KaliteliBoyKiloEndexi {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz(Örnek: 1.88):\t");
		double boy = scanner.nextDouble();		
		System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz(Örnek: 90):\t");
		int kilo = scanner.nextInt();
		double index = kilo/(boy*boy);
		if(index<=18){
		System.out.print("ZAYIF");}
		else if(index<=25 & index>=18.1) {
		System.out.print("FİT");}
		else if(index>=25.1 & index<=35) {
			System.out.print("KİLOLU");}
		else {
			System.out.print("OBEZİTE");
		
		
		}
		
		
			
		}
		

}
