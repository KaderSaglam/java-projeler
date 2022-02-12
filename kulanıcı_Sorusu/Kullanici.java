package kulanýcý_Sorusu;

import java.time.LocalDateTime;

public class Kullanici {
	 String name;
	    LocalDateTime kayitZamani;
	    public Kullanici(){// p'siz cons.
	    }
	
	    
	    public Kullanici(String name, LocalDateTime kayitZamani) {//parametreli constructor
			super();
			this.name = name;
			this.kayitZamani = kayitZamani;
		}
	   


}