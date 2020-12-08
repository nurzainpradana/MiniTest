public class ApaBole {
    public static void main(String[] args) {
        for (int i = 1; i<=100;i++){
            String hasil = "";
            if (i % 3 == 0){
                hasil = "Apa";
                if (i % 5 == 0) {
                    hasil = "ApaBole";
                }
            } else if ( i % 5 == 0) {
                hasil = "Bole";
            }
            if (!hasil.equals("")){
                System.out.print(hasil + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
