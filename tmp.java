import java.util.ArrayList;

public class tmp {
    // Main
    public static void main(String[] argz) {
        // double p = 5;
        // double l = 7.6;

        // System.out.println("Jadi Luasnya Adalah :"+  hitungLuasPersegiPanjang( p,  l) );
        // hitungLuasPersegiPanjang(p,l);
        
        int umur = 17;
        boolean ktp = true;
        if ((umur >= 17 && umur <= 20) && ktp == true) {
            System.out.println("Sudah boleh berkendara");
        }


        int[] arrInt = {1,2,3,4,5};
        for (int i = 1; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        boolean status = false;
        do { 
            System.out.println("Jalan");
        } while (status);

        while (status){ 
            System.out.println("Jalan");
        }

        ArrayList<Integer> listOfNum = new ArrayList<>();
        for (int i : listOfNum){
            System.out.println(listOfNum.get(i));
        }
    }

    // Function
    public static double hitungLuasPersegiPanjang(double p, double l) {
        return p * l;
    }

    // Prosedur
    public static void hello() {
        System.out.println("Hello");
    }
}
