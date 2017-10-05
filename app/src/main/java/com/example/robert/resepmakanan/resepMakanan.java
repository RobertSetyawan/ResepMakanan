package com.example.robert.resepmakanan;

import java.security.PublicKey;

/**
 * Created by Robert on 05/10/2017.
 */

public class resepMakanan {
    private String nama,desk,cara_buat;
    private int gmbr;

    public resepMakanan(String nama, String desk, String cara_buat, int gmbr){
        this.nama = nama;
        this.desk = desk;
        this.cara_buat = cara_buat;
        this.gmbr = gmbr;
    }

    public String getNama(){
        return nama;
    }
    public String getDesk(){
        return desk;
    }
    public String getCara_buat(){
        return cara_buat;
    }
    public int getGmbr(){
        return gmbr;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setDesk(String desk){
        this.desk = desk;
    }
    public void setGmbr(int gmbr){
        this.gmbr = gmbr;
    }
    public void setCara_buat(String cara_buat){
        this.cara_buat = cara_buat;
    }
}
