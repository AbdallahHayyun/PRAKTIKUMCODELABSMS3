public class Main {
    public static void main(String[] args){
        Input input = new Input();
        Orang orang = new Orang();

        try {
            int usia = input.getAgeInput();
            orang.setUsia(usia);

            System.out.println("\nUsia berhasil divalidasi!");
            orang.displayInfo();
        } catch (InvalidAgeException e){
            System.out.println("Error Validasi: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: Input tidak valid. Masukkan angka.");
        } finally {
            input.closeScanner();
        }
    }
}
