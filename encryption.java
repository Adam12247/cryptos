# java encryption
package szyfrowanie;


public class Szyfrowanie {

    public static int numer(char literka)
    {
        return (int)literka-64;
    }
   
    public static char[]przepisz(String napis)
    {
        char[]t=new char[napis.length()];
        for (int i = 0; i < t.length; i++) {
            t[i]=napis.charAt(i);
        }
        return t;
    }
   
    public static char[]przepiszKlucz(String napis, String klucz){
        char[]t=new char[napis.length()];
        for (int i = 0; i < t.length; i++) {
            t[i]=klucz.charAt(i%klucz.length());
        }
        return t;
    }
   
    public static void pokaz(char []t)
    {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]+" ");
        }
        System.out.println("");
    }
   
    public static char[]szyfrowanie(String napis, String klucz)
    {
        char []tNapisz= przepisz(napis);
        char []tKlucz= przepiszKlucz(napis, klucz);
        char []t=new char[napis.length()];
        for (int i = 0; i < tNapisz.length; i++) {
            int kodAscii=(int)tNapisz[i];
            int nr=numer(tKlucz[i]);
            kodAscii+=nr;
            t[i]=(char)kodAscii;
            //sprawdz numer literki
        }
        return t;
    }
   
    public static void main(String[] args) {
        /*
        Podaj klucz i napis który chcesz nim zaszyfrować.
    */
        String klucz="WODA";
        String napis="You are welcome!";      
        
        char []tNapisz= przepisz(napis);
        char []tKlucz= przepiszKlucz(napis, klucz);
            
        System.out.println("Orginał: ");
        pokaz(tNapisz);
            
        System.out.println("Szyfr: ");
        pokaz(tKlucz);
    }
   
}
