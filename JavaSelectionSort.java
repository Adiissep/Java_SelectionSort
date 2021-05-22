package javaselectionsort;
import static java.lang.System.currentTimeMillis;
import java.util.Scanner;
/**
 *
 * @author Adi Sepriyadi 
 * TI20E REG B 
 * Universitas Nusa Putra
 * 
 */
public class JavaSelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Jumlah Data yang akan di SORTIR:");
        int jumdata = scan.nextInt();
        int [] data = new int[jumdata];
        System.out.println("");
        for (int x=0; x<jumdata; x++)
        {
            System.out.println("Input nilai data ke-"+(x+1)+":");
            data[x]=scan.nextInt();
        }        
        //Tampil data sebelum sortir
        System.out.println("");
        System.out.println("Data Sebelum di sortir :");
        for (int x=0;x<jumdata;x++){
            System.out.println("Apakah data "+data[x]+" sudah benar pada urutannya?");
        }
        System.out.println("\n\nProses Selection Sort :");
        long startTime = System.currentTimeMillis();
        for (int x=0; x<jumdata-1; x++){  
            for (int y=0; y<jumdata; y++){
                System.out.println(data[y]+" ");
            }System.out.println("Data yang akan ditukar "+data[x]+"\n");
                System.out.println("Literasi ke-"+(x+1)+" ");
                System.out.println("Proses Seleksi Pertukaran :");
                boolean tukar =false;               
                int index = 0;
                int min =data[x];
                String pesan="Tidak ada pertukaran";
                for (int y=x+1;y<jumdata; y++){
                    if (min > data[y]){
                        tukar=true;
                        index =y;
                        min= data[y];
                    }
                }
                if (tukar == true){
                    //pertukaran data
                    pesan ="data "+data[x]+" ditukar dengan data "+data[index];
                    int temp =data[x];
                    data[x]=data[index];
                    data[index]=temp;
                }
                for (int y=0;y<jumdata;y++){
                    System.out.println(data[y]+" ");
                    System.out.println(pesan+"\n");
                }
                    //Tampilkan data setelah sorting
                    System.out.println("Data Setelah di sorting : ");
                    for (int t=0; t<jumdata; t++){
                        System.out.println(data[t]+" ");
                    }
                    long endTime = System.currentTimeMillis();
                    System.out.println("Waktu pertukaran : " + (endTime - startTime) + " milidetik");
                    System.out.println("=======================================================");
            }
        
    }
    
}
 
