import java.util.Scanner;
import java.text.*;
class Penginapan{
	public static void main (String[]args)
	{
	int ulangi;
		Scanner scan = new Scanner (System.in);
		String nama;
		int Lama;
		
		
		System.out.println("\t\t Aminah Fauziah");
		System.out.println("\t\t 1137050034");
		System.out.print("ID Kostumer\t\t: ");
		nama = scan.nextLine();
		kostumer ktm = new kostumer();
		ktm.getkostumer(nama,1);
		System.out.println("Nama Kostumer\t\t: "+ktm.getkostumer(nama,1));
		System.out.print("Kode Kamar \t\t: ");
		String kamar = scan.next();
		pemesanan psn = new pemesanan(kamar,0);
		psn.getkamar(kamar,0);
		System.out.println("Jenis Kamar \t\t: "+psn.getkamar(kamar,1));
		System.out.println("Min Inap \t\t: "+psn.getmininap(kamar,3)+" hari");
		System.out.println("Harga Sewa \t\t: Rp. "+psn.gethargakamar(kamar,2));
		System.out.print("Tanggal Masuk (dd/mm/yy): ");
		String msk = scan.next();
		String[] tglmsk=msk.split("/");
		int masuk1=Integer.parseInt(tglmsk[0]);
		int masuk2=Integer.parseInt(tglmsk[1]);
		int masuk3=Integer.parseInt(tglmsk[2]);
		System.out.print("Tanggal keluar(dd/mm/yy): ");
		String klr = scan.next();
		String[] tglklr=klr.split("/");
		int keluar1=Integer.parseInt(tglklr[0]);
		int keluar2=Integer.parseInt(tglklr[1]);
		int keluar3=Integer.parseInt(tglklr[2]);
		Lama = ((keluar3-masuk3)*360)+((keluar2-masuk2)*30)+keluar1-masuk1;
		System.out.println("Lama Inap\t\t: "+psn.getlamainap(Lama)+" hari");
		System.out.println("Total Harga\t\t: Rp. "+psn.gettotalharga());
		System.out.println("Diskon\t\t\t: Rp. "+psn.getdiskon(kamar,3));
		System.out.println("Total Bayar\t\t: Rp. "+psn.gettotalbayar());
		System.out.print("Bayar\t\t\t: Rp. ");
			int Bayar = scan.nextInt();
			psn.getbayar(Bayar);
			if (psn.getbayar(Bayar) >= psn.gettotalbayar()){
				System.out.print("Kembalian\t\t: Rp. "+psn.getkembalian());
			}
			else{
				System.out.print("Uang anda tidak cukup !");
			}
	}
}