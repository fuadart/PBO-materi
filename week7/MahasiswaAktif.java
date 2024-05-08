package week7;
import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa
{
    public int usia;
    public int semester;

    public MahasiswaAktif(String nama, String nim, String tanggal_lahir, int semester)
    {
        super(nama,nim,tanggal_lahir);
        this.usia = usia;
        this.semester = semester;
    }

    //override
    public void getIdentitas()
    {
        System.out.println("Nama Mahasiswa : " + super.getNama());
        System.out.println("NIM            : " + super.getNiM());
        System.out.println("Tanggal Lahir  : " + super.getTanggalLahir());
        System.out.println("Usia           : " + getUsia());
        System.out.println("Semester       : " + getSemester());

    }

    public int getUsia()
    {
        return usia;
    }

    public int getSemester()
    {
        return semester;
    }

}