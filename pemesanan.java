class pemesanan extends kamar
{
	public pemesanan (String kode_kamar, int kode)
	{
		super.getkamar(kode_kamar,kode);
	}
	public int gethargakamar(String kode_kamar, int kode)
	{
		hargakamar = Integer.parseInt(getkamar(kode_kamar,2));
		return hargakamar;
	}
	public String getmininap(String kode_kamar, int kode)
	{
		mininap=kode_kamar.substring(2,3);
		return mininap;
	}
	
	public int getlamainap(int Lama)
	{
		lamainap = Lama;
		return lamainap;
	}
	
	public int gettotalharga()
	{
		
		totalharga = hargakamar*lamainap;
		return totalharga;
	}
	public int getdiskon(String kode_kamar, int kode)
	{	
		min=Integer.parseInt(mininap);
		dis=Integer.parseInt(getkamar(kode_kamar,3));
		if (lamainap > min ){
		diskon=(totalharga*dis)/100;
		}
		else{
		diskon=0;
		}
		return diskon;
	}
	public int gettotalbayar()
	{
	totalbayar = totalharga - diskon;
	return totalbayar;
	}
	public int getbayar(int Bayar)
	{
		bayar = Bayar;
		return bayar;
	}
	
	public int getkembalian()
	{
		kembalian = bayar-totalbayar;
		if (kembalian>=0)
		{
			return kembalian;
		}
		return kembalian;
	}
}