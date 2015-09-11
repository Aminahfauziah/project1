class kamar{
String kode_kamar;
String [][] datakamar = {
			{"11401","Suit Room Single","120000","10"},
			{"12501","Royal Suite Room Single","289000","15"},
			{"21401","Suilte Room Double","220000","10"},
			{"22301","Royal Suilte Room Double","450000","10"},
			{"31201","President Suite Room","690000","5"}
			};
		protected String kamar="",mininap;
		protected int hargakamar=0,lamainap=0,bayar=0,totalbayar=0,kembalian=0,diskon=0,dis=0,lama,min,totalharga=0,masuk,keluar;
		

		public String getkamar(String kode_kamar, int kode){
		int indeks1=-1;
		for(int i=0; i<5; i++)
			{
			if(kode_kamar.equalsIgnoreCase(datakamar[i][0])){
				indeks1=i;
				break;
				}
			}
		return datakamar[indeks1][kode];
		}
		
				
}

