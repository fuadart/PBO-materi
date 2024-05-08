package week1;
import java.util.*;
import week5.MataKuliah;
public class Mahasiswa
{
    private String nim,nama;
    private String tanggal_lahir;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<MataKuliah> mk = new ArrayList<MataKuliah>();

    public Mahasiswa(String nama, String nim)
    {
        this.nim = nim;
        this.nama = nama;
    }

    public Mahasiswa(String nama, String nim, String tanggal_lahir)
    {
        this.nim = nim;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getTanggalLahir()
    {
        return tanggal_lahir;
    }

    public void belajar()
    {
        System.out.println(nama + " belajar");
    }

    public void mainGamne()
    {
        System.out.println(nama + " main game");
    }

    public void getIdentitas()
    {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM Mahasiswa : " + nim);
        getNilai();
        getMatKul();
    }

    public String getNama()
    {
        return nama;
    }

    public String getNiM()
    {
        return nim;
    }

    public void insertNilai(double nl)
    {
        nilai.add(nl);
    }

    public void insertMatKul(String matkul, String kelompok, int sks)
    {
        mk.add(new MataKuliah(matkul,kelompok,sks));
    }

    public void getNilai()
    {
        Iterator<Double> it = nilai.iterator();
        while(it.hasNext())
        {
            System.out.println("Nilai : " + it.next());
        }
    }

    public void getMatKul()
    {
        Iterator<MataKuliah> it = mk.iterator();
        System.out.println("Daftar Mata Kuliah : ");
        while(it.hasNext())
        {
            it.next().getInfo();
        }
    }
}