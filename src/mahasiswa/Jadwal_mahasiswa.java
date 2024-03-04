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
 * @author Rifki
 */
public class Jadwal_mahasiswa {

    public static void showMahasiswaJadwal(UserData user) {
        if ("223PC".equalsIgnoreCase(user.getKelas())) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|                        Jadwal Mahasiswa                    |");
            System.out.println("| Senin : Keperawatan Dasar :07.00,Inggris : 08.00" + "      |");
            System.out.println("| Selasa : Anatomi:09.00 " + "                               |");
            System.out.println("| Senin : Palsafah :07.00" + "                               |");
            System.out.println("| Senin : KDK:10.10 " + "                                    |");
            System.out.println("| Senin : Bahasa Indonesia :07.00" + "                       |");
            System.out.println("| Senin : Kesetahan Jasmani:08.00 " + "                      |");
            System.out.println("| Senin : Agama :08.00" + "                                  |");
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
                    new Jadwal_mahasiswa().showMahasiswaJadwal(user);
            }

        } else if ("221PD".equalsIgnoreCase(user.getKelas())) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|                        Jadwal Mahasiswa                    |");
            System.out.println("| Senin : Keperawatan Dasar:08.20,Palsafah:09.15 " + "       |");
            System.out.println("| Selasa : Bahasa Indonesia:09.00" + "                       |");
            System.out.println("| Senin : Inggris :10.00" + "                                |");
            System.out.println("| Senin : KDK :09.10" + "                                    |");
            System.out.println("| Senin : Anatomi :08.20" + "                                |");
            System.out.println("| Senin : Kesetahan Jasmani :09.00" + "                      |");
            System.out.println("| Senin : Agama :09.00" + "                                  |");
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
                    new Jadwal_mahasiswa().showMahasiswaJadwal(user);

            }

        } else if ("220PA".equalsIgnoreCase(user.getKelas())) {
            {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("+------------------------------------------------------------+");
                System.out.println("|                        Jadwal Mahasiswa                    |");
                System.out.println("| Senin : Agama:08.20,Inggris:09.15 " + "                    |");
                System.out.println("| Selasa : Kesehatan jasmani:09.00" + "                      |");
                System.out.println("| Senin : Keperawatan Dasar :10.00" + "                      |");
                System.out.println("| Senin : KDK :08.10" + "                                    |");
                System.out.println("| Senin : Anatomi :09.20" + "                                |");
                System.out.println("| Senin : Bahasa Indonesia :09.00" + "                       |");
                System.out.println("| Senin : Palsafah :09.00" + "                               |");
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
                        new Jadwal_mahasiswa().showMahasiswaJadwal(user);

                }
            }

        }
    }
}