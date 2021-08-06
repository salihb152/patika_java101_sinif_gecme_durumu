import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input =new Scanner(System.in);

    
        System.out.println("Matematik notunuz : ");
        mat=input.nextInt();

        System.out.println("Türkçe notunuz : ");
        turkce=input.nextInt();

        System.out.println("Fizik notunuz : ");
        fizik=input.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya=input.nextInt();

        System.out.println("Müzik notunuz : ");
        muzik=input.nextInt();
        double total=0;;
        double avarage=0;
        int count=0;
        int[] notlar={mat, turkce, fizik, kimya,muzik};
        for(int a : notlar){
            if(a<=100&&a>=0){
                total+=a;
                count++;
            }
        }
        if(count!=0){
            avarage=total/count;
        } else{
            System.out.println("Gerçerli not bulunamadı.");
        }
        if(avarage<55){
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere!");
        }else{
            System.out.println("Tebrikler, sınıf geçtiniz !");
        }
        System.out.println("Ortalamanız : "+ avarage);

        input.close();

    }
}
