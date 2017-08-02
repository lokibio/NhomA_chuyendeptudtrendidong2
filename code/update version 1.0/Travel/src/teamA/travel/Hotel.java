package teamA.travel;

import java.io.Serializable;

public class Hotel implements Serializable {
		private int id;
		private String Name;
		private String Diachi;
		
		private String Sdt;
		private String Email;
		private String Web;
		private String Mota;
		
		public Hotel(int id, String name, String diachi, String sdt, String email, String web, String mota){
			this.id = id;
			Name = name;
			Diachi = diachi;
			Sdt = sdt;
			Email = email;
			Web = web;
			Mota = mota;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getDiachi() {
			return Diachi;
		}

		public void setDiachi(String diachi) {
			Diachi = diachi;
		}

		public String getSdt() {
			return Sdt;
		}

		public void setSdt(String sdt) {
			Sdt = sdt;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public String getWeb() {
			return Web;
		}

		public void setWeb(String web) {
			Web = web;
		}

		public String getMota() {
			return Mota;
		}

		public void setMota(String mota) {
			Mota = mota;
		}
		
		
		
}
