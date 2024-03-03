import java.util.Scanner;
import java.util.ArrayList;

public class Podatki{


public static void zadanie(){
    System.out.println("Podaj liczbe pozycji które chciałbyś wprowadzić: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<String> firmy = new ArrayList<String>();
    ArrayList<Double> kwoty = new ArrayList<Double>();
    ArrayList<Double> procenty  = new ArrayList<Double>();
    int x =0;
    double sumanetto = 0;
    double suma23 = 0;
    double netto23=0;
    double suma8 = 0 ;
    double netto8 = 0;


    while(x<n){
        System.out.println("Pozycja: "+(x+1));
        System.out.println("Podaj nazwe firmy, kwote faktury/paragonu oraz procent podatku(23 lub 8): \n");
        String nazwa = sc.nextLine();
        double paragon = sc.nextDouble();
        sc.nextLine();
        double podatek = sc.nextDouble();
        sc.nextLine();
        x++;
        firmy.add(nazwa);
        kwoty.add(paragon);
        procenty.add(podatek);
        }

    for(int i=0;i<firmy.size();i++){
        if(procenty.get(i)==8){
            double kwotapodatku8 = kwoty.get(i)*(procenty.get(i)/100);
            suma8 += kwotapodatku8;
            netto8 += kwoty.get(i) - kwotapodatku8;
            sumanetto += kwoty.get(i) - kwotapodatku8;
        }
        else if(procenty.get(i)==23){
            double kwotapodatku23=0;
            kwotapodatku23 = kwoty.get(i)*(procenty.get(i)/100);
            suma23 += kwotapodatku23;
            netto23 += kwoty.get(i) - kwotapodatku23;
            sumanetto  += kwoty.get(i) - kwotapodatku23;
        }   
    }

    netto8 = netto8*100;
    netto8 = Math.round(netto8);
    netto8 = netto8/100;

    netto23 = netto23*100;
    netto23 = Math.round(netto23);
    netto23 = netto23/100;

    suma8 = suma8*100;
    suma8 = Math.round(suma8);
    suma8 = suma8/100;

    suma23 = suma23*100;
    suma23 = Math.round(suma23);
    suma23 = suma23/100;

    sumanetto = sumanetto*100;
    sumanetto = Math.round(sumanetto);
    sumanetto = sumanetto/100;

    

    



    System.out.println(
        "|               | Total netto:|   "+sumanetto+"   |\n"+
        "|---------------|-------------|-----------|\n"+
        "| VAT 8%        |     "+suma8+"     |   "+netto8+"   |\n"+
        "| VAT 23%       |     "+suma23+"     |   "+netto23+"   |\n");
    
    
    
    }
}