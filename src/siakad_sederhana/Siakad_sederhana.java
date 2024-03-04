/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package siakad_sederhana;

/**
 *
 * @author acer 
 */
import akademik.absen;
import akademik.nilai;

import java.util.Scanner;
import login.UserData;
import login.login;
import mahasiswa.Jadwal_mahasiswa;
import mahasiswa.info_mahasiswa;

public class Siakad_sederhana {
    public static void showMenu(UserData user) {
        if ("Mahasiswa".equalsIgnoreCase(user.getRole())) {
            System.out.println("+==============================================+");
            System.out.println("|              MENU SIAKAD(Mahasiswa)          |");
            System.out.println("|1.Info Mahasiswa                              |");
            System.out.println("|2.Absensi                                     |");
            System.out.println("|3.Jadwal                                      |");
            System.out.println("|4.Nilai                                       |");
            System.out.println("|5.Bantuan                                     |");
            System.out.println("|                                              |");
            System.out.println("|6.Login Ulang                                 |");
            System.out.println("|7.Keluar                                      |");
            System.out.println("+==============================================+");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Pilih menu (masukkan nomor menu): ");
            int selectedMenu = scanner.nextInt();

            switch (selectedMenu) {
                case 1:
                    new info_mahasiswa().showMahasiswaInfo(user);
                    break;
                case 2:
                    new absen().showAbsen(user);
                    break;
                case 3:
                    new Jadwal_mahasiswa().showMahasiswaJadwal(user);
                    break;
                case 4:
                    new nilai().showNilai(user);
                    ;
                    break;
                case 5:
                    new bantuan().BantuanMahasiswa(user);
                    break;
                case 6:
                    login.doLogin();
                    break;
                case 7:
                    System.out.println("Terimakasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    new Siakad_sederhana().showMenu(user);
            }
        }

        if ("Akademik".equalsIgnoreCase(user.getRole())) {
            System.out.println("+==============================================+");
            System.out.println("|            MENU SIAKAD (Akademik)            |");
            System.out.println("|1.Input Absensi                               |");
            System.out.println("|2.Input Nilai                                 |");
            System.out.println("|3.Bantuan                                     |");
            System.out.println("|                                              |");
            System.out.println("|4.Login Ulang                                 |");
            System.out.println("|5.Keluar                                      |");
            System.out.println("+==============================================+");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Pilih menu (masukkan nomor menu): ");
            int selectedMenu = scanner.nextInt();

            switch (selectedMenu) {
                case 1:
                    new absen().InputAbsen(user);
                    break;
                case 2:
                    new nilai().InputNilai(user);
                    break;
                case 3:
                    new bantuan().BantuanDosen(user);
                    break;
                case 4:
                    login.doLogin();
                    break;
                case 5:
                    System.out.println("Terimakasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    new Siakad_sederhana().showMenu(user);
            }
        }
    }

}
