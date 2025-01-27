package week5;

public class MataKuliah{
    private String nama;
    private String kelompok;
    private int sks;

    public MataKuliah(String nama, String kelompok, int sks)
    {
        this.nama = nama;
        this.kelompok = kelompok;
        this.sks = sks;
    }
    
    public String getNamaMatkul()
    {
        return nama;
    }

    public String getKelompok()
    {
        return kelompok;
    }

    public int getSks()
    {
        return sks;
    }

    public void getInfo()
    {
        System.out.println(nama + " - " + kelompok + " - " + sks);
    }
}