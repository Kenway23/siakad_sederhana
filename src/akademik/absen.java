/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akademik;

import java.util.Scanner;
import login.UserData;
import siakad_sederhana.Siakad_sederhana;

/**
 *
 * @author Rifki
 */
public class absen {

        private static String[][] AbsenPC = new String[20][6];
        private static int jumlahdataAbsenPC = 0;
        private static Scanner inputabsen = new Scanner(System.in);

        public static void InputAbsen(UserData user) {
                System.out.println("");
                System.out.println("");
                Scanner pilihkelas = new Scanner(System.in);
                System.out.print("Pilih Kelas (Contoh:223PC): ");
                String kelas = pilihkelas.nextLine();

                while (kelas.isEmpty()) {
                        System.out.println("| Inputan Tidak Boleh Kosong Silahkan Isi Kembali  │");
                        System.out.print("| Pilih Kelas (Contoh:223PC): ");
                        kelas = pilihkelas.nextLine();
                }

                if (kelas.equals("223PC")) {
                        System.out.println("+==============================================+");
                        System.out.println("|           DAFTAR KELAS 223PC                 |");
                        System.out.println("================================================");
                        System.out.println("|NO |       NAMA      |         NIM            |");
                        System.out.println("================================================");
                        System.out.println("|1  |       ELIS      |         23552011678    |");
                        System.out.println("+==============================================+");
                        System.out.println("|2  |       Cika      |         23552011679    |");
                        System.out.println("+==============================================+");
                        System.out.println("");
                        System.out.println();

                        System.out.println(
                                        "------------------------------------------------------------------------------------------------");
                        System.out.println(
                                        "|   NO     |      Nim         |    Nama       |   Mata Pelajaran  | Pertemuan  | Keterangan    | ");
                        System.out.println(
                                        "|----------|------------------|---------------|-------------------|------------|---------------|");
                        for (int i = 0; i < jumlahdataAbsenPC; i++) {
                                System.out.printf("| %-8s | %-16s | %-13s | %-15s | %-13s | %-12s |\n",
                                                AbsenPC[i][0], AbsenPC[i][1], AbsenPC[i][2], AbsenPC[i][3],
                                                AbsenPC[i][4], AbsenPC[i][5]);

                        }
                        System.out.println(
                                        "|----------|------------------|---------------|-------------------|------------|---------------|");

                        System.out.println();

                        System.out.println("+==============================================+");
                        System.out.println("|              INPUT ABSEN MAHASISWA           |");
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nim Mahasiswa : ");
                        String nim = inputabsen.nextLine();

                        while (nim.isEmpty()) {
                                System.out.println("| Nim tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nim Mahasiswa : ");
                                nim = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nama Mahasiswa : ");
                        String nama = inputabsen.nextLine();

                        while (nama.isEmpty()) {
                                System.out.println("| Nama tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nama Mahasiswa : ");
                                nama = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Mata Pelajaran : ");
                        String mapel = inputabsen.nextLine();

                        while (mapel.isEmpty()) {
                                System.out.println("| Mata Pelajaran tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Mata Pelajaran Mahasiswa : ");
                                mapel = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Pertemuan : ");
                        String pertemuan = inputabsen.nextLine();

                        while (pertemuan.isEmpty()) {
                                System.out.println("| Pertemuan tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Pertemuan Mahasiswa : ");
                                pertemuan = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Keterangan (H/S/I/A) : ");
                        String keterangan = inputabsen.nextLine();

                        while (keterangan.isEmpty()) {
                                System.out.println("| Keterangan tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Keterangan Mahasiswa : ");
                                keterangan = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("+==============================================+");

                        AbsenPC[jumlahdataAbsenPC][0] = String.valueOf(jumlahdataAbsenPC + 1);
                        AbsenPC[jumlahdataAbsenPC][1] = nim;
                        AbsenPC[jumlahdataAbsenPC][2] = nama;
                        AbsenPC[jumlahdataAbsenPC][3] = mapel;
                        AbsenPC[jumlahdataAbsenPC][4] = pertemuan;
                        AbsenPC[jumlahdataAbsenPC][5] = keterangan;

                        System.out.println("Absen Sudah Ditambah");
                        jumlahdataAbsenPC++;
                        new Siakad_sederhana().showMenu(user);

                } else if (kelas.equals("221PD")) {
                        System.out.println("+==============================================+");
                        System.out.println("|           DAFTAR KELAS 221PD                 |");
                        System.out.println("================================================");
                        System.out.println("|NO |       NAMA      |         NIM            |");
                        System.out.println("================================================");
                        System.out.println("|1  |       Regi      |         23552011505    |");
                        System.out.println("+==============================================+");
                        System.out.println("");
                        System.out.println("");

                        System.out.println(
                                        "------------------------------------------------------------------------------------------------");
                        System.out.println(
                                        "|   NO     |      Nim         |    Nama       |   Mata Pelajaran  | Pertemuan  | Keterangan    | ");
                        System.out.println(
                                        "|----------|------------------|---------------|-------------------|------------|---------------|");
                        for (int i = 0; i < jumlahdataAbsenPC; i++) {
                                System.out.printf("| %-8s | %-16s | %-13s | %-15s | %-13s | %-12s |\n",
                                                AbsenPC[i][0], AbsenPC[i][1], AbsenPC[i][2], AbsenPC[i][3],
                                                AbsenPC[i][4], AbsenPC[i][5]);

                        }
                        System.out.println(
                                        "|----------|------------------|---------------|-------------------|------------|---------------|");

                        System.out.println();

                        System.out.println("+==============================================+");
                        System.out.println("|              INPUT ABSEN MAHASISWA           |");
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nim Mahasiswa : ");
                        String nim = inputabsen.nextLine();

                        while (nim.isEmpty()) {
                                System.out.println("| Nim tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nim Mahasiswa : ");
                                nim = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nama Mahasiswa : ");
                        String nama = inputabsen.nextLine();

                        while (nama.isEmpty()) {
                                System.out.println("| Nama tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nama Mahasiswa : ");
                                nama = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Mata Pelajaran : ");
                        String mapel = inputabsen.nextLine();

                        while (mapel.isEmpty()) {
                                System.out.println("| Mata Pelajaran tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Mata Pelajaran Mahasiswa : ");
                                mapel = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Pertemuan :  ");
                        String pertemuan = inputabsen.nextLine();

                        while (pertemuan.isEmpty()) {
                                System.out.println("| Pertemuan tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Pertemuan Mahasiswa : ");
                                pertemuan = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Keterangan (H/S/I/A) : ");
                        String keterangan = inputabsen.nextLine();

                        while (keterangan.isEmpty()) {
                                System.out.println("| Keterangan tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Keterangan Mahasiswa : ");
                                keterangan = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("+==============================================+");

                        AbsenPC[jumlahdataAbsenPC][0] = String.valueOf(jumlahdataAbsenPC + 1);
                        AbsenPC[jumlahdataAbsenPC][1] = nim;
                        AbsenPC[jumlahdataAbsenPC][2] = nama;
                        AbsenPC[jumlahdataAbsenPC][3] = mapel;
                        AbsenPC[jumlahdataAbsenPC][4] = pertemuan;
                        AbsenPC[jumlahdataAbsenPC][5] = keterangan;

                        System.out.println("Absen Sudah Ditambah");
                        jumlahdataAbsenPC++;
                        new Siakad_sederhana().showMenu(user);

                } else if (kelas.equals("220PA")) {
                        System.out.println("+==============================================+");
                        System.out.println("|           DAFTAR KELAS 220PA                 |");
                        System.out.println("================================================");
                        System.out.println("|NO |       NAMA      |         NIM            |");
                        System.out.println("================================================");
                        System.out.println("|1  |       Adel      |         23552011205    |");
                        System.out.println("+==============================================+");
                        System.out.println("");
                        System.out.println("");

                        System.out.println(
                                        "------------------------------------------------------------------------------------------------");
                        System.out.println(
                                        "|   NO     |      Nim         |    Nama       |   Mata Pelajaran  | Pertemuan  | Keterangan    | ");
                        System.out.println(
                                        "|----------|------------------|---------------|-------------------|------------|---------------|");
                        for (int i = 0; i < jumlahdataAbsenPC; i++) {
                                System.out.printf("| %-8s | %-16s | %-13s | %-15s | %-13s | %-12s |\n",
                                                AbsenPC[i][0], AbsenPC[i][1], AbsenPC[i][2], AbsenPC[i][3],
                                                AbsenPC[i][4], AbsenPC[i][5]);

                        }
                        System.out.println(
                                        "|----------|------------------|---------------|-------------------|------------|---------------|");

                        System.out.println();

                        System.out.println("+==============================================+");
                        System.out.println("|              INPUT ABSEN MAHASISWA           |");
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nim Mahasiswa : ");
                        String nim = inputabsen.nextLine();

                        while (nim.isEmpty()) {
                                System.out.println("| Nim tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nim Mahasiswa : ");
                                nim = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nama Mahasiswa : ");
                        String nama = inputabsen.nextLine();

                        while (nama.isEmpty()) {
                                System.out.println("| Nama tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nama Mahasiswa : ");
                                nama = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Mata Pelajaran : ");
                        String mapel = inputabsen.nextLine();

                        while (mapel.isEmpty()) {
                                System.out.println("| Mata Pelajaran tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Mata Pelajaran Mahasiswa : ");
                                mapel = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Pertemuan : ");
                        String pertemuan = inputabsen.nextLine();

                        while (pertemuan.isEmpty()) {
                                System.out.println("| Pertemuan tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Pertemuan Mahasiswa : ");
                                pertemuan = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Keterangan (H/S/I/A) : ");
                        String keterangan = inputabsen.nextLine();

                        while (keterangan.isEmpty()) {
                                System.out.println("| Keterangan tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Keterangan Mahasiswa : ");
                                keterangan = inputabsen.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("+==============================================+");

                        AbsenPC[jumlahdataAbsenPC][0] = String.valueOf(jumlahdataAbsenPC + 1);
                        AbsenPC[jumlahdataAbsenPC][1] = nim;
                        AbsenPC[jumlahdataAbsenPC][2] = nama;
                        AbsenPC[jumlahdataAbsenPC][3] = mapel;
                        AbsenPC[jumlahdataAbsenPC][4] = pertemuan;
                        AbsenPC[jumlahdataAbsenPC][5] = keterangan;

                        System.out.println("Absen Sudah Ditambah");
                        jumlahdataAbsenPC++;
                        new Siakad_sederhana().showMenu(user);

                } else {
                        System.out.println("Maaf Kelas Tidak Ada");
                        new absen().InputAbsen(user);
                }

        }

        public static void showAbsen(UserData user) {
                System.out.println(
                                "------------------------------------------------------------------------------------------------");
                System.out.println(
                                "|   NO     |      Nim         |    Nama       |   Mata Pelajaran  | Pertemuan  | Keterangan    | ");
                System.out.println(
                                "|----------|------------------|---------------|-------------------|------------|---------------|");

                String mencaridata = user.getUsername();

                for (int i = 0; i < jumlahdataAbsenPC; i++) {
                        if (AbsenPC[i][1].equals(mencaridata)) {
                                System.out.printf("| %-8s | %-16s | %-13s | %-15s | %-13s | %-12s |\n",
                                                AbsenPC[i][0], AbsenPC[i][1], AbsenPC[i][2], AbsenPC[i][3],
                                                AbsenPC[i][4], AbsenPC[i][5]);
                        }

                }
                System.out.println(
                                "|----------|------------------|---------------|-------------------|------------|---------------|");
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
                }
        }
}
