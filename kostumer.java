class kostumer{
String id_kostumer;
String datakostumer[][] = {
				{"44001","Agis Kiswari","08524513412"},
				{"44002","Deni Anton","08851324314"},
				{"44003","Amel Hasanah","08991234124"},
				{"44004","Andri Yanto","08785128656"}
				};
		
		
		public String getkostumer(String id_kostumer, int kode){
		int indeks1=-1;
		for(int i=0; i<5; i++)
			{
			if(id_kostumer.equals(datakostumer[i][0])){
				indeks1=i;
				break;
				}
			}
		return datakostumer[indeks1][kode];
		}
}