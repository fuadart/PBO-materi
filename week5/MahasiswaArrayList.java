package week5;
import week1.Mahasiswa;
import java.util.*;

public class MahasiswaArrayList{
    public static void main(String [] args)
    {
        Mahasiswa mhs = new Mahasiswa("Budi","12345");
        mhs.insertNilai(86.0);
        mhs.insertNilai(60.0);
        mhs.insertNilai(75.0);
        mhs.insertNilai(90.0);
        mhs.insertMatKul("PBO","A4404",4);
        mhs.insertMatKul("AlPro","A4403",4);
        mhs.getIdentitas();
    }
}