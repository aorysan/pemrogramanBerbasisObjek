package tugas;
import java.util.Scanner;

public class TestKoperasi {
	public static void main(String[] args) {
		Anggota donny = new Anggota("111333444", "Donny", 5000000);
        Scanner ii = new Scanner(System.in);
		
		System.out.println("Nama Anggota: " + donny.getNama());
		System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
		
		System.out.print("\nSilahkan masukkan jumlah peminjaman : ");
		int pinjam = ii.nextInt();
        donny.pinjam(pinjam);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
		
		System.out.print("\nSilahkan masukkan jumlah peminjaman : ");
		pinjam = ii.nextInt();
        donny.pinjam(pinjam);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
		
		System.out.print("\nSilahkan masukkan nilai angsuran : ");
        int angsur = ii.nextInt();
		donny.angsur(angsur);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

		System.out.print("\nSilahkan masukkan nilai angsuran : ");
        angsur = ii.nextInt();
		donny.angsur(angsur);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
		
		System.out.print("\nSilahkan masukkan nilai angsuran : ");
        angsur = ii.nextInt();
		donny.angsur(angsur);
		System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        ii.close();
	}
}

