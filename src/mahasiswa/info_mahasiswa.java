/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import java.util.Scanner;
import login.UserData;
import siakad_sederhana.Siakad_sederhana;
/**
 *
 * @author acer
 */
public class info_mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void showMahasiswaInfo(UserData user) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("+------------------------------------------------------------+");
        System.out.println("|                        Data Mahasiswa                      |");
        System.out.println("| Nim : " + user.getUsername() + "                             |");
        System.out.println("| Nama : " + user.getNama() + "                                |");
        System.out.println("| Prodi : " + user.getProdi() + "                              |");
        System.out.println("| Kelas : " + user.getKelas() + "                              |");
        System.out.println("| Alamat : " + user.getAlamat() + "                            |");
        System.out.println("| Tempat Tanggal Lahir : " + user.getTtl() + "                 |");
        System.out.println("| Tahun Angkatan : " + user.getAngkatan() + "                  |");
        System.out.println("| Semester : " + user.getSemester() + "                        |");
        System.out.println("+------------------------------------------------------------+");
        System.out.println("");
        System.out.println("1.Kembali Ke Menu Utama");
        System.out.println("2.exit");
        
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kembali ke menu utama / exit ? : ");
        int input = scanner.nextInt();
        
        switch (input) {
            case 1:
                Siakad_sederhana.showMenu(user);
                break;
            case 2:
                System.out.println("Terimakasih Dan Sampai Jumpa");
                System.exit(0);
                break;
            default:
                System.out.println("Masukan Nomor Menu Yang Ada");
                new info_mahasiswa().showMahasiswaInfo(user);
        }
        
    }
    
}
