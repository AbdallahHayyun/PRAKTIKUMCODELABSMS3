public class Orang {
    private int usia;
    public Orang(){}
        public void setUsia(int usia) throws InvalidAgeException{
            validateAge(usia);
            this.usia = usia;
        }
        private void validateAge(int usia) throws InvalidAgeException{
            if (usia <= 0){
                throw  new InvalidAgeException("Usia harus diatas 0 tahun!");
            }
            if (usia >= 120){
                throw new InvalidAgeException("Usia harus kurang dari 120 tahun!");
            }
        }
        public void displayInfo(){
            System.out.println("Informasi: ");
            System.out.println("Usia: " + usia + " tahun");
        }
    }