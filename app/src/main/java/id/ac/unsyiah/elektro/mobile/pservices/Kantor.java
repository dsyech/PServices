package id.ac.unsyiah.elektro.mobile.pservices;

/**
 * Created by Alchusuvie on 5/19/2016.
 */
public class Kantor {

    private String nama;
    private int img;
    private String desk;
    private String sms;
    private String mail;
    private double lat;
    private double lang;
    private String web;
    private String tel;

    public Kantor (String nama, int img, String desk, String sms,String mail, double lat, double lang,String web,String tel){
        this.nama=nama;
        this.img=img;
        this.desk=desk;
        this.sms=sms;
        this.mail=mail;
        this.lat=lat;
        this.lang=lang;
        this.web=web;
        this.tel=tel;
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






    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }





    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }





    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }





    public double getLang() {
        return lang;
    }

    public void setLang(double lang) {
        this.lang = lang;
    }



    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }








    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}