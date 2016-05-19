package id.ac.unsyiah.elektro.mobile.pservices;

/**
 * Created by Alchusuvie on 5/19/2016.
 */
public class Kantor {

    private String nama;
    private int img;
    private String desk;

    public Kantor (String nama, int img,String desk ){
        this.nama=nama;
        this.img=img;
        this.desk=desk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }
}
