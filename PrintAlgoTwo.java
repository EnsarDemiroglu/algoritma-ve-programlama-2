public class PrintAlgoTwo {
   
    public static void main(String[] args) {
  
        /*  Adını ekrana 10 defa yazan java kodu

yaz(10);
        
    }
    public static void yaz(int t){
        if(t<=0) System.exit(1);
System.out.println("Ensar Demiroğlu");
yaz(--t);
*/

/*Kendisine parametre olarak gelen bir dizide kaç tane 5 vardır

int [] a= {1,2,3,4,5,6,7,5,9,5};
System.out.println(bul(a, 0, 0));
    }
    public static int bul(int [] dizi,int adet,int i){
if(i>=dizi.length) return adet;
else
if(dizi[i]==5) adet++;
return bul(dizi, adet, ++i);
*/

/*kendisine parametre olarak gelen tek boyutlu String dizisi içinde en uzun karaktere sahip Stringi reqursive metod ile yazınız

String [] a={"Ensar","Muhammed","Yavuz","Alparslan"};
String result=bul(a, 0,a[0]);
System.out.println(result);

    }
    public static String bul(String [] a,int i,String kelime){
        if(i>=a.length) return kelime;
        if(a[i].length()>kelime.length()) 
        kelime=a[i];
        return bul(a, ++i, kelime);
        */

/*Fktöriyel bulan reqursive metod

int a=5;
int result=bul(a);
System.out.println(result);
    }
    public static int bul(int a){
if(a==0 || a==1)
    return 1;
    return a * bul(a-1);
*/

/*  reqursive bir şekilde fibonacci hesaplayan java kodu

int n=10;
int result=fibonacci(n);
System.out.println(result);
    }
    public static int fibonacci(int n){
if(n==0) return 0;
if(n==1) return 1;

return fibonacci (n-1) + fibonacci(n-2);  
*/  
  
/*  Soru 6 kendisine parametre olarak gelen pozitif tam sayıya kadar olan sayıların toplamını hesaplayan reqursive fonksiyon

int n=5;
int result=bul(n);
System.out.println(result);
    }
    public static int bul(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return n+bul(n-1);
*/

  /*  Soru 7 kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan rekürsive fonksiyon
  
int a=376768;
int result=bul(a);
System.out.println(result);
    }
    public static int bul(int a){
if(a==0) return 0;

return 1+ bul(a/10);
*/
         /*  Soru 8 Kendisine parametre olarak gelen a ve b sayısını üslü biçimde yaz reqursive metod ile yazınız
int a=2;
int b=3;

int result=bul(a, b);

System.out.println(result);
    }
    public static int bul(int a, int b){
       if(b==0) return 1;
       if(b==1) return a;

return a* bul(a, b-1);

*/
        /*   Soru 9  0 dan 10 a kadar tam sayıların toplamını bulan reqursive metod
int sonuc=toplam(10);
System.out.println(sonuc);


    }
    public static int toplam  (int n) {
        if(n==0) return 0;

        return n+toplam(n-1);
        */

    /*Soru 10 bir sayı dizisindeki en büyük sayıyı bulan reqursive metodu yazınız

    int [] dizi={1,8,3,9,5,0,7};
    int result=bul(dizi, 0, 0);
System.out.println(result);

    }
    public static int bul(int [] dizi,int i,int max){
if(i>=dizi.length) return max;
if(max<dizi[i]) max=dizi[i];
return bul(dizi,++ i, max);
*/


       /*Soru 11 bir sayı dizisindeki en büyük sayıyı bulan reqursive metodu global değişken kullanrak yapınız
int [] dizi={1,5,6,7,3,5,4};
max=dizi[0]; i=0;
System.out.println(bul(dizi));
    }
    public static int bul(int [] dizi){
        if(i>=dizi.length) return max;
        if(max<dizi[i]) max=dizi[i];
        i++;
        return bul(dizi);
        */


        /*  Soru 12 kendisine parametre olarak gelen stringteki küçük a' ların sayısını yazan reqursive metodu yazınız
       String a="Karahanlı";
       int result=bul(a, 0, 0);
       System.out.println(result);
    }
    public static int bul(String a ,int i,int adet){
        if(i>=a.length()) return adet;
        if(a.charAt(i)=='a') adet ++;
        return bul(a, ++i, adet);
        */


  /*  Soru 14 kendisine parametre olarak gelen tam sayı dizisinin sıralı olup olmadığını bulan reqursive metodu java kodu ile yazınız
    int [] a={1,4,2,7,9,11,3};
System.out.println(bul(a, 0));


    }
    public static boolean bul(int [] a,int i){
if(i>=a.length-1) return true;
if(a[i]>a[i+1]) return false;
return bul(a,++ i);
*/




 //   Soru 15  Kendisine parametre olarak gelen dizinin simetrik olup olmadığını hesaplayan reqursive fonk
int [] dizi={1,2,3,4,3,2,1};
System.out.println(bul(dizi, dizi.length-1, 0));
    }
    public static boolean bul(int [] dizi,int right,int left){
      if(left>=right) return true;  
      if(dizi[left]!=dizi[right])
      return false;
      return bul(dizi, right-1, left+1);
      

    }
}           