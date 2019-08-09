package General;

import ENUMs.PartyType3Code;
import ENUMs.PartyType4Code;

public class GenericIdentification31 {
	private String Id;
	private PartyType3Code Tp;
	private PartyType4Code Issr;
	private String ShrtNm;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public PartyType3Code getTp() {
		return Tp;
	}
	public void setTp(PartyType3Code tp) {
		Tp = tp;
	}
	public PartyType4Code getIssr() {
		return Issr;
	}
	public void setIssr(PartyType4Code issr) {
		Issr = issr;
	}
	public String getShrtNm() {
		return ShrtNm;
	}
	public void setShrtNm(String shrtNm) {
		ShrtNm = shrtNm;
	}
}
