import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};
        ArrayList<String> namaTerpanjang = cariNamaTerpanjang(nama);
        System.out.println("Nama terpanjang adalah: " + String.join(", ", namaTerpanjang));
    }

    public static ArrayList<String> cariNamaTerpanjang(String[] array){
        ArrayList<String> hasil = new ArrayList<>();
        int panjangMax = 0;
        for (String nama : array){
            if (nama.length() > panjangMax){
                panjangMax = nama.length();
                hasil.clear();
                hasil.add(nama);
            } else if (nama.length() == panjangMax) {
                hasil.add(nama);
            }
        }
        return hasil;
    }
}
