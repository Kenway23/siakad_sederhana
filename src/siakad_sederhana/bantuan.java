package siakad_sederhana;

import java.util.Scanner;

import akademik.absen;
import akademik.nilai;
import login.UserData;
import mahasiswa.Jadwal_mahasiswa;
import mahasiswa.info_mahasiswa;

public class bantuan {
    public static void BantuanMahasiswa(UserData user) {
        System.out.println("+=================================================================================================+");
        System.out.println("|                               MENU BANTUAN MAHASISWA                                            |");
        System.out.println("|                                                                                                 |");
        System.out.println("|1.Menu pertama adalah menu info mahasiswa,Fungsi nya adalah                                      |");
        System.out.println("|untuk melihat informasi mahasiswa seperti biodata diri,kelas,semester dan angkatan.              |");
        System.out.println("|                                                                                                 |");
        System.out.println("|2.Menu Kedua adalah menu Absensi,yang berfungsi                                                  |");
        System.out.println("|untuk melihat informasi absensi mahasiswa selama berkuliah.                                      |");
        System.out.println("|                                                                                                 |");
        System.out.println("|3.Menu Ketiga adalah menu Jadwal,yang berfungsi                                                  |");
        System.out.println("|untuk melihat informasi jadwal pelajaran yang ditetapkan di kelas masing-masing.                 |");
        System.out.println("|                                                                                                 |");
        System.out.println("|4.Menu Keempat adalah menu Nilai.yang berfungsi                                                  |");
        System.out.println("|untuk melihat nilai mahasiswa selama berkuliah dari nilai uts,uas,absensi,tugaas dan nilai akhir.|");
        System.out.println("|                                                                                                 |");
        System.out.println("|5.Menu login ulang berfungsi                                                                     |");
        System.out.println("|untuk mahasiswa jika ingin berganti akun atau melakukan login ulang.                             |");
        System.out.println("|                                                                                                 |");
        System.out.println("|6.Menu Keluat berfungsi jika mahasiswa ingin keluar dari aplikasi                                |");
        System.out.println("|                                                                                                 |");
        System.out.println("+=================================================================================================+");
        System.out.println("");

        System.out.println("1.Kembali ke menu utama");
        System.out.println("2.Keluar Aplikasi");

        Scanner scanner = new Scanner(System.in);
            System.out.print("Pilih menu (masukkan nomor menu): ");
            int selectedMenu = scanner.nextInt();

        switch (selectedMenu) {
                case 1:
                    new Siakad_sederhana().showMenu(user);;
                    break;
                case 2:
                System.out.println("Terimakasih");
                System.exit(0);
                break;
                default:
                    System.out.println("Menu tidak valid.");
                    new bantuan().BantuanMahasiswa(user);
            }

    }

    public static void BantuanDosen(UserData user) {
        System.out.println("+=================================================================================================+");
        System.out.println("|                               MENU BANTUAN DOSEN                                                |");
        System.out.println("|                                                                                                 |");
        System.out.println("|1.Menu Pertama adalah menu Input Absensi,Fungsi nya adalah                                       |");
        System.out.println("|untuk menambahkan absensi mahasiswa selama perkuliahan.                                          |");
        System.out.println("|                                                                                                 |");
        System.out.println("|2.Menu Kedua adalah menu Input Nilai,yang berfungsi                                              |");
        System.out.println("|untuk menginput nilai mahasiswa selama perkuliahan dari nilai absen,tugas,uts,dan uas.           |");
        System.out.println("|                                                                                                 |");
        System.out.println("|3.Menu login ulang berfungsi                                                                     |");
        System.out.println("|untuk mahasiswa jika ingin berganti akun atau melakukan login ulang.                             |");
        System.out.println("|                                                                                                 |");
        System.out.println("|4.Menu Keluat berfungsi jika mahasiswa ingin keluar dari aplikasi                                |");
        System.out.println("|                                                                                                 |");
        System.out.println("+=================================================================================================+");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih menu (masukkan nomor menu): ");
        int selectedMenu = scanner.nextInt();


        switch (selectedMenu) {
            case 1:
                new Siakad_sederhana().showMenu(user);;
                break;
            case 2:
            System.out.println("Terimakasih");
            System.exit(0);
            break;
            default:
                System.out.println("Menu tidak valid.");
                new bantuan().BantuanDosen(user);
        }

    }
}
