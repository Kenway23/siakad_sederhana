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
public class nilai {
        private static String[][] Nilai = new String[20][9];
        private static int jumlahdataNilai = 0;
        private static Scanner inputNilai = new Scanner(System.in);

        public static void InputNilai(UserData user) {
                System.out.println("");
                System.out.println("");
                Scanner pilihkelas = new Scanner(System.in);
                System.out.print("Pilih Kelas (Contoh:223PC): ");
                String kelas = pilihkelas.nextLine();

                while (kelas.isEmpty()) {
                        System.out.println("| Inputan Tidak Boleh Kosong Silahkan Isi Kembali  │");
                        System.out.print("| Pilih Kelas(Contoh:223PC): ");
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
                                        "|--------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println(
                                        "|  NO  |   NIM     |        NAMA       |   MATA PELAJARAN  |    ABSEN     |    UAS   |    UTS   |  TUGAS  |    NILAI AKHIR | ");
                        System.out.println(
                                        "|------|-----------|-------------------|-------------------|--------------|----------|----------|-----------|--------------|");
                        for (int i = 0; i < jumlahdataNilai; i++) {
                                System.out.printf(
                                                "| %-8s | %-16s | %-13s | %-15s | %-13s | %-12s | %-7s | %-6s | %-8s |\n",
                                                Nilai[i][0], Nilai[i][1], Nilai[i][2], Nilai[i][3], Nilai[i][4],
                                                Nilai[i][5], Nilai[i][6],
                                                Nilai[i][7], Nilai[i][8]);

                        }
                        System.out.println(
                                        "|------|-----------|-------------------|-------------------|--------------|----------|----------|-----------|--------------|");

                        System.out.println();
                        System.out.println();

                        System.out.println("+==============================================+");
                        System.out.println("|              INPUT NILAI MAHASISWA           |");
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nim Mahasiswa : ");
                        String nim = inputNilai.nextLine();

                        while (nim.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nim tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nim Mahasiswa : ");
                                nim = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nama Mahasiswa : ");
                        String nama = inputNilai.nextLine();

                        while (nama.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nama tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nama Mahasiswa : ");
                                nama = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Mata Pelajaran : ");
                        String mapel = inputNilai.nextLine();

                        while (mapel.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Mata Pelajaran tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Mata Pelajaran Mahasiswa : ");
                                mapel = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Jumlah Hadir : ");
                        String absen = inputNilai.nextLine();

                        while (absen.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Jumlah Hadir tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Jumlah Hadir Mahasiswa : ");
                                absen = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Uas : ");
                        String uas = inputNilai.nextLine();

                        while (uas.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nilai uas tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai Uas : ");
                                uas = inputNilai.nextLine();
                        }
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Uts : ");
                        String uts = inputNilai.nextLine();

                        while (uts.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nilai uts tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai uts : ");
                                uts = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Tugas : ");
                        String tugas = inputNilai.nextLine();

                        while (tugas.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| nilai tugas tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai Tugas : ");
                                tugas = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("+==============================================+");

                        // Convert int to String
                        int Absen = Integer.parseInt(absen);
                        int Uas = Integer.parseInt(uas);
                        int Uts = Integer.parseInt(uts);
                        int Tugas = Integer.parseInt(tugas);

                        double na = (Absen / 16 * 20) + (Tugas * 0.2) + (Uts * 0.3) + (Uas * 0.3);
                        String Na = String.valueOf(na);

                        Nilai[jumlahdataNilai][0] = String.valueOf(jumlahdataNilai + 1);
                        Nilai[jumlahdataNilai][1] = nim;
                        Nilai[jumlahdataNilai][2] = nama;
                        Nilai[jumlahdataNilai][3] = mapel;
                        Nilai[jumlahdataNilai][4] = absen;
                        Nilai[jumlahdataNilai][5] = uas;
                        Nilai[jumlahdataNilai][6] = uts;
                        Nilai[jumlahdataNilai][7] = tugas;
                        Nilai[jumlahdataNilai][8] = Na;

                        System.out.println("Absen Sudah Ditambah");
                        jumlahdataNilai++;
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
                        System.out.println();

                        System.out.println(
                                        "|--------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println(
                                        "|  NO  |   NIM     |        NAMA       |   MATA PELAJARAN  |    ABSEN     |    UAS   |    UTS   |  TUGAS  |    NILAI AKHIR | ");
                        System.out.println(
                                        "|------|-----------|-------------------|-------------------|--------------|----------|----------|---------|----------------|");
                        for (int i = 0; i < jumlahdataNilai; i++) {
                                System.out.printf(
                                                "| %-8s | %-16s | %-13s | %-15s | %-13s | %-12s | %-7s | %-6s | %-8s |\n",
                                                Nilai[i][0], Nilai[i][1], Nilai[i][2], Nilai[i][3], Nilai[i][4],
                                                Nilai[i][5], Nilai[i][6],
                                                Nilai[i][7], Nilai[i][8]);

                        }
                        System.out.println(
                                        "|------|-----------|-------------------|-------------------|--------------|----------|----------|---------|----------------|");

                        System.out.println();
                        System.out.println();

                        System.out.println("+==============================================+");
                        System.out.println("|              INPUT NILAI MAHASISWA           |");
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nim Mahasiswa : ");
                        String nim = inputNilai.nextLine();

                        while (nim.isEmpty()) {
                                System.out.println("| Nim tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nim Mahasiswa : ");
                                nim = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nama Mahasiswa : ");
                        String nama = inputNilai.nextLine();

                        while (nama.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nama tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nama Mahasiswa : ");
                                nama = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Mata Pelajaran : ");
                        String mapel = inputNilai.nextLine();

                        while (mapel.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Mata Pelajaran tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Mata Pelajaran Mahasiswa : ");
                                mapel = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Jumlah Hadir : ");
                        String absen = inputNilai.nextLine();

                        while (absen.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Jumlah Hadir tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Jumlah Hadir Mahasiswa : ");
                                absen = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Uas : ");
                        String uas = inputNilai.nextLine();

                        while (uas.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nilai uas tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai Uas : ");
                                uas = inputNilai.nextLine();
                        }
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Uts : ");
                        String uts = inputNilai.nextLine();

                        while (uts.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nilai uts tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai uts : ");
                                uts = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Tugas : ");
                        String tugas = inputNilai.nextLine();

                        while (tugas.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| nilai tugas tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai Tugas : ");
                                tugas = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("+==============================================+");

                        // Convert int to String
                        int Absen = Integer.parseInt(absen);
                        int Uas = Integer.parseInt(uas);
                        int Uts = Integer.parseInt(uts);
                        int Tugas = Integer.parseInt(tugas);

                        double na = (Absen / 16 * 20) + (Tugas * 0.2) + (Uts * 0.3) + (Uas * 0.3);
                        String Na = String.valueOf(na);

                        Nilai[jumlahdataNilai][0] = String.valueOf(jumlahdataNilai + 1);
                        Nilai[jumlahdataNilai][1] = nim;
                        Nilai[jumlahdataNilai][2] = nama;
                        Nilai[jumlahdataNilai][3] = mapel;
                        Nilai[jumlahdataNilai][4] = absen;
                        Nilai[jumlahdataNilai][5] = uas;
                        Nilai[jumlahdataNilai][6] = uts;
                        Nilai[jumlahdataNilai][7] = tugas;
                        Nilai[jumlahdataNilai][8] = Na;

                        System.out.println("Absen Sudah Ditambah");
                        jumlahdataNilai++;
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
                        System.out.println();

                        System.out.println(
                                        "|--------------------------------------------------------------------------------------------------------------------------|");
                        System.out.println(
                                        "|  NO  |   NIM     |        NAMA       |   MATA PELAJARAN  |    ABSEN     |    UAS   |    UTS   |  TUGAS  |   NILAI AKHIR  | ");
                        System.out.println(
                                        "|------|-----------|-------------------|-------------------|--------------|----------|----------|---------|----------------|");
                        for (int i = 0; i < jumlahdataNilai; i++) {
                                System.out.printf(
                                                "| %-8s | %-16s | %-13s | %-15s | %-13s | %-12s | %-7s | %-6s | %-8s |\n",
                                                Nilai[i][0], Nilai[i][1], Nilai[i][2], Nilai[i][3], Nilai[i][4],
                                                Nilai[i][5], Nilai[i][6],
                                                Nilai[i][7], Nilai[i][8]);

                        }
                        System.out.println(
                                        "|------|-----------|-------------------|-------------------|--------------|----------|----------|---------|----------------|");

                        System.out.println();
                        System.out.println();

                        System.out.println("+==============================================+");
                        System.out.println("|              INPUT NILAI MAHASISWA           |");
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nim Mahasiswa : ");
                        String nim = inputNilai.nextLine();

                        while (nim.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nim tidak boleh kosong. Silakan coba lagi │");
                                System.out.print("| Masukan Nim Mahasiswa : ");
                                nim = inputNilai.nextLine();
                        }

                        System.out.println("|                                               |");
                        System.out.print("| Masukan Nama Mahasiswa : ");
                        String nama = inputNilai.nextLine();

                        while (nama.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nama tidak boleh kosong. Silakan coba lagi │");
                                System.out.print("| Masukan Nama Mahasiswa : ");
                                nama = inputNilai.nextLine();
                        }

                        System.out.println("|                                                |");
                        System.out.print("| Masukan Mata Pelajaran : ");
                        String mapel = inputNilai.nextLine();

                        while (mapel.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Mata Pelajaran tidak boleh kosong. Silakan coba lagi │");
                                System.out.print("| Masukan Mata Pelajaran Mahasiswa : ");
                                mapel = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Jumlah Hadir : ");
                        String absen = inputNilai.nextLine();

                        while (absen.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Jumlah Hadir tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Jumlah Hadir Mahasiswa : ");
                                absen = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Uas : ");
                        String uas = inputNilai.nextLine();

                        while (uas.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nilai uas tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai Uas : ");
                                uas = inputNilai.nextLine();
                        }
                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Uts : ");
                        String uts = inputNilai.nextLine();

                        while (uts.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| Nilai uts tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai uts : ");
                                uts = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.print("| Masukan Nilai Tugas : ");
                        String tugas = inputNilai.nextLine();

                        while (tugas.isEmpty()) {
                                System.out.println();
                                System.out.println();
                                System.out.println("| nilai tugas tidak boleh kosong. Silakan coba lagi.  │");
                                System.out.print("| Masukan Nilai Tugas : ");
                                tugas = inputNilai.nextLine();
                        }

                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("|                                              |");
                        System.out.println("+==============================================+");
                        // Convert int to String
                        int Absen = Integer.parseInt(absen);
                        int Uas = Integer.parseInt(uas);
                        int Uts = Integer.parseInt(uts);
                        int Tugas = Integer.parseInt(tugas);

                        double na = (Absen / 16 * 20) + (Tugas * 0.2) + (Uts * 0.3) + (Uas * 0.3);
                        String Na = String.valueOf(na);

                        Nilai[jumlahdataNilai][0] = String.valueOf(jumlahdataNilai + 1);
                        Nilai[jumlahdataNilai][1] = nim;
                        Nilai[jumlahdataNilai][2] = nama;
                        Nilai[jumlahdataNilai][3] = mapel;
                        Nilai[jumlahdataNilai][4] = absen;
                        Nilai[jumlahdataNilai][5] = uas;
                        Nilai[jumlahdataNilai][6] = uts;
                        Nilai[jumlahdataNilai][7] = tugas;
                        Nilai[jumlahdataNilai][8] = Na;

                        System.out.println("Absen Sudah Ditambah");
                        jumlahdataNilai++;
                        new Siakad_sederhana().showMenu(user);

                } else {
                        System.out.println("Maaf Kelas Tidak Ada");
                        new nilai().InputNilai(user);
                }

        }

        public static void showNilai(UserData user) {
                System.out.println(
                                "|---------------------------------------------------------------------------------------------------------|");
                System.out.println(
                                "|  NO  |   NIM   |      NAMA     |   MATA PELAJARAN  |  ABSEN   |   UAS  |  UTS |  TUGAS  |  NILAI AKHIR  |");
                System.out.println(
                                "|------|---------|---------------|-------------------|----------|--------|------|---------|---------------|");

                String mencaridata = user.getUsername();

                for (int i = 0; i < jumlahdataNilai; i++) {
                        if (Nilai[i][1].equals(mencaridata)) {
                                System.out.printf(
                                                "| %-2s | %-16s | %-15s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s |\n",
                                                Nilai[i][0], Nilai[i][1], Nilai[i][2], Nilai[i][3], Nilai[i][4],
                                                Nilai[i][5], Nilai[i][6],
                                                Nilai[i][7], Nilai[i][8]);
                        }

                }
                System.out.println(
                                "|------|---------|---------------|-------------------|----------|--------|------|---------|---------------|");
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
                                new nilai().showNilai(user);
                }
        }

        public static void showNilaiMahasiswa(UserData user) {

        }
}
