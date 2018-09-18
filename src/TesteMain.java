
public class TesteMain {
    
    public static void main(String[] args) throws Exception{
        
        FilaListaE3 f1 = new FilaListaE3();
        FilaListaE3 f2 = new FilaListaE3();
        FilaListaE3 f3 = new FilaListaE3();
        
        FilaVetorE3 f4 = new FilaVetorE3(10);
        FilaVetorE3 f5 = new FilaVetorE3(10);
        FilaVetorE3 f6 = new FilaVetorE3(10);
        
        int n = 10;
        int n1 = 20;
        int n2 = 30;
        int n3 = 40;
        int n4 = 50;
        int n5 = 60;
        
        f4.insere(n);
        f4.insere(n1);
        f4.insere(n2);
        f5.insere(n3);
        f5.insere(n4);
        f5.insere(n5);
        
        
        
        String str = "0";
        String str1 = "2";
        String str2 = "3";
        String str3 = "4";
       
        String str4 = "5";
        String str5  = "11";
        String str6 = "1";
        String str7 = "1";
        
        
        
        f1.insere(str);
        f1.insere(str1);
        f1.insere(str2);
        f1.insere(str3);
        f2.insere(str4);
        f2.insere(str5);
        f2.insere(str6);
        f2.insere(str7);
        
        f6 = (FilaVetorE3) f4.concatenar(f1);
        
        System.out.println("FilaVetor1.main()" + f4.toString());
        System.out.println("FilaVetor2.main()" + f5.toString());
        System.out.println("FilaVetor3.main()" + f6.toString());
        
        
        
        f3 = (FilaListaE3) f1.concatenar(f2);
        
        System.out.println("FilaLista1.main() " + f1.toString());
        System.out.println("FilaLista2.main() " + f2.toString());
        System.out.println("FilaLista3.main() " + f3.toString());
        
        
        
        str6 = "111";
        str7 = "10";
          System.out.println("TestandoTrocaValor.main() " + f1.toString());
        System.out.println("TestandoTrocaValor.main() " + f2.toString());
        
        
        
    }
    
}
