public class Mahasiswa extends Person{
	
	public int nilai;

	public Mahasiswa(String nama, int nilai){
		super(nama);		
		this.nilai = nilai;
	}

	public Mahasiswa(String nama){
		super(nama);
	}


	public void showNilai(){
		System.out.println(nilai);
	}

}