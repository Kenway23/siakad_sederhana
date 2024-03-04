/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Rifki
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import siakad_sederhana.Siakad_sederhana;

public class login {
    private static Map<String, UserData> userDatabase = new HashMap<>();

    static {
        userDatabase.put("23552011678", new UserData("23552011678", "2323", "Elis", "Kebidanan", "223PC", "Jl Metro",
                "Bandung 24 Januari", "23", "", "Mahasiswa", "1"));
        userDatabase.put("23552011679", new UserData("23552011679", "2222", "Cika", "Kebidanan", "223PC", "Jl Pahlawan",
                "Jakarta 10 Januari", "23", "", "Mahasiswa", "1"));
        userDatabase.put("23552011505", new UserData("23552011505", "5050", "Regi", "Perawat", "221PD", "Jl Antasari",
                "Jakarta 5 Maret", "21", "", "Mahasiswa", "3"));
        userDatabase.put("23552011205", new UserData("23552011205", "2525", "Adel", "Kesehatan Masyarakat", "220PA",
                "Jl Dipatiukur", "Surabaya 10 Juni", "20", "", "Mahasiswa", "5"));
        userDatabase.put("11111", new UserData("11111", "30", "Dewi", " ", " ", "Jl Dipatiukur", "Medan 23 Juni", " ",
                "Palsafah", "Akademik", ""));
    }

    public static void main(String[] args) {
        doLogin();
    }

    public static void doLogin() {
        Scanner scanner = new Scanner(System.in);
        UserData loggedInUser = null;

        // Melakukan login
        loggedInUser = login(scanner);

        if (loggedInUser != null) {
            // Menampilkan menu setelah login
            Siakad_sederhana.showMenu(loggedInUser);

        } else {
            doLogin();
        }
    }

    public static UserData login(Scanner scanner) {
        System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("│                   LOGIN                      │");
        System.out.println("├──────────────────────────────────────────────┤");
        System.out.print("│ Masukan Username : ");
        String inputUsername = scanner.nextLine();

        while (inputUsername.isEmpty()) {
            System.out.println("| Username tidak boleh kosong. Silakan coba lagi.  │");
            System.out.print("| Masukan Username : ");
            inputUsername = scanner.nextLine();
        }
        System.out.println("│                                              │");
        System.out.print("│ Masukan Password : ");
        String inputPassword = scanner.nextLine();

        while (inputPassword.isEmpty()) {
            System.out.println("| Password tidak boleh kosong. Silakan coba lagi.  │");
            System.out.print("| Masukan Password : ");
            inputPassword = scanner.nextLine();
        }

        System.out.println("|                                              │");
        System.out.println("│                                              │");
        System.out.println("│                                              │");
        System.out.println("│                                              │");
        System.out.println("└──────────────────────────────────────────────┘");

        // Memeriksa apakah input cocok dengan data array
        if (userDatabase.containsKey(inputUsername)) {
            UserData loggedInUser = userDatabase.get(inputUsername);
            if (inputPassword.equals(loggedInUser.getPassword())) {
                System.out.println("Login berhasil!");
                return loggedInUser;
            } else {
                System.out.println("Password salah. Silakan coba lagi.");
            }
        } else {
            System.out.println("Username Salah. Silahkan coba lagi");
        }

        return null;
    }
}
