package Model.Class_User;

abstract class Mahasiswa extends User {
    private String nim;
    private String nama;

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}
