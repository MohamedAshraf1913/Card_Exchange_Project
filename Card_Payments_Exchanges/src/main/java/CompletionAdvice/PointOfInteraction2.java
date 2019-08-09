package CompletionAdvice;

import General.GenericIdentification32;
import CompletionAdvice.PointOfInteractionCapabilities1;
import CompletionAdvice.PointOfInteractionComponent3;

public class PointOfInteraction2 {
	private GenericIdentification32 Id;
	private String SysNm;
	private String GrpId;
	private PointOfInteractionCapabilities1 Cpblties;
	private PointOfInteractionComponent3 Cmpnt;
	public GenericIdentification32 getId() {
		return Id;
	}
	public void setId(GenericIdentification32 id) {
		Id = id;
	}
	public String getSysNm() {
		return SysNm;
	}
	public void setSysNm(String sysNm) {
		SysNm = sysNm;
	}
	public String getGrpId() {
		return GrpId;
	}
	public void setGrpId(String grpId) {
		GrpId = grpId;
	}
	public PointOfInteractionCapabilities1 getCpblties() {
		return Cpblties;
	}
	public void setCpblties(PointOfInteractionCapabilities1 cpblties) {
		Cpblties = cpblties;
	}
	public PointOfInteractionComponent3 getCmpnt() {
		return Cmpnt;
	}
	public void setCmpnt(PointOfInteractionComponent3 cmpnt) {
		Cmpnt = cmpnt;
	}
}
