package skyravens1lver.frontend.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class StudentUpdate {
    private int id;
    private String nim;
    private String namaDepan;
    private String namaBelakang;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tanggal_lahir;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    @Override
    public String toString() {
        return "StudentUpdate{" +
                "id=" + id +
                ", nim='" + nim + '\'' +
                ", namaDepan='" + namaDepan + '\'' +
                ", namaBelakang='" + namaBelakang + '\'' +
                ", tanggal_lahir=" + tanggal_lahir +
                '}';
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }
}
