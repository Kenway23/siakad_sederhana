/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mahasiswa;

import login.UserData;

/**
 *
 * @author Rifki
 */
public class absen_mahasiswa {
    private static String[][] AbsenPC = new String[20][6];
    private static int jumlahdataAbsenPC = 0;

    public static void showAbsen(UserData user) {

        System.out.println(
                "|   NO     |      Nim         |    Nama       |   Mata Pelajaran  | Pertemuan  | Keterangan    | ");
        System.out.println(
                "|----------|------------------|---------------|-------------------|------------|---------------|");

        String mencaridata = user.getUsername();

        for (int i = 0; i < jumlahdataAbsenPC; i++) {
            if (AbsenPC[i][1].equals(mencaridata)) {
                System.out.printf("| %-2s | %-16s | %-15s | %-12s | %-11s |\n",
                        AbsenPC[i][0], AbsenPC[i][1], AbsenPC[i][2], AbsenPC[i][3], AbsenPC[i][4], AbsenPC[i][5],
                        AbsenPC[i][6]);

            }
            System.out.println(
                    "|----------|------------------|---------------|-------------------|------------|---------------|");
            System.out.println("");

        }
    }
}
