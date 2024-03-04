/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author acer
 */
public class UserData {
    private String username;
    private String password;
    private String nama;
    private String prodi;
    private String kelas;
    private String alamat;
    private String ttl;
    private String angkatan;
    private String mapel;
    private String role;
    private String semester;

    public UserData(String username, String password, String nama, String prodi, String kelas, String alamat,
            String ttl, String angkatan, String mapel, String role, String semester) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
        this.alamat = alamat;
        this.ttl = ttl;
        this.angkatan = angkatan;
        this.mapel = mapel;
        this.role = role;
        this.semester = semester;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getKelas() {
        return kelas;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public String getMapel() {
        return mapel;
    }

    public String getRole() {
        return role;
    }

    public String getSemester() {
        return semester;
    }

}
