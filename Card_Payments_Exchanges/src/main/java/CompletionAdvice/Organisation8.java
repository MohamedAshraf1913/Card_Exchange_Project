package CompletionAdvice;

import General.GenericIdentification32;
import ENUMs.LocationCategory1Code;

public class Organisation8 {
	private GenericIdentification32 Id;
	private String CmonNm;
	private LocationCategory1Code LctnCtgy;
	private String Adr;
	private float CtryCd;
	private String SchmeData;
	
	public GenericIdentification32 getId() {
		return Id;
	}
	public void setId(GenericIdentification32 id) {
		Id = id;
	}
	public String getCmonNm() {
		return CmonNm;
	}
	public void setCmonNm(String cmonNm) {
		CmonNm = cmonNm;
	}
	public LocationCategory1Code getLctnCtgy() {
		return LctnCtgy;
	}
	public void setLctnCtgy(LocationCategory1Code lctnCtgy) {
		LctnCtgy = lctnCtgy;
	}
	public String getAdr() {
		return Adr;
	}
	public void setAdr(String adr) {
		Adr = adr;
	}
	public float getCtryCd() {
		return CtryCd;
	}
	public void setCtryCd(float ctryCd) {
		CtryCd = ctryCd;
	}
	public String getSchmeData() {
		return SchmeData;
	}
	public void setSchmeData(String schmeData) {
		SchmeData = schmeData;
	}
	
}
