package Model.Class_User;

abstract class User {
    private String nama;
    private String alamat;
    private String tempatTanggalLahir;
    private String noTelp;
    
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getTempatTanggalLahir(){
        return tempatTanggalLahir;
    }

    public void setTempatTanggalLahir(String tempatTanggalLahir){
        this.tempatTanggalLahir = tempatTanggalLahir;
    }

    public String getNoTelp(){
        return noTelp;
    }

    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;
    }
}