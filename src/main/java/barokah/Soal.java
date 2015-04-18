package barokah;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SB 604-16
 */
public class Soal {
    //Melakukan penghitungan pangkat bilangan dengan memasukan paramater bilangan dan pangkat terlebih dahulu
    public int pangkat(int bil, int pangkat) {
        int hasil = 0;
        int n = 1;
        while (n <= pangkat) {
            n++;
            hasil *= bil;
        }
        return hasil;
    }
    //Melakukan penghitungan faktorial dengan memasukan paramater terlebih dahulu
    public int faktorial(int bil) {
        int hasil = 1;
        for (int i = 1; i <= bil; i++) {
            hasil *= i;
        }
        return hasil;
    }
    //Melakukan penghitungan perkalian dengan memasukan paramater terlebih dahulu
    public int perkalian(int bilA, int bilB) {
        return bilA*bilB;
    }
    
    
}
