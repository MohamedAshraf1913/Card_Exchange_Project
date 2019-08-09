package General;
import java.util.*;

import General.GenericIdentification31;

public class Traceability1 {
	private GenericIdentification31 RlayId;
	private Date TracDtTmIn;
	private Date TracDtTmOut;
	
	public GenericIdentification31 getRlayId() {
		return RlayId;
	}
	public void setRlayId(GenericIdentification31 rlayId) {
		RlayId = rlayId;
	}
	public Date getTracDtTmIn() {
		return TracDtTmIn;
	}
	public void setTracDtTmIn(Date tracDtTmIn) {
		TracDtTmIn = tracDtTmIn;
	}
	public Date getTracDtTmOut() {
		return TracDtTmOut;
	}
	public void setTracDtTmOut(Date tracDtTmOut) {
		TracDtTmOut = tracDtTmOut;
	}
}
