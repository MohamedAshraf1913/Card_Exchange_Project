package General;

import General.GenericIdentification32;
import General.Traceability1;
import ENUMs.MessageFunction1Code;
import java.util.*;

public class Header2 {
	private MessageFunction1Code MsgFctn;
	private String PrtcolVrsn;
	private String XchgId;
	private String ReTrnsmssnCntr;
	private Date CreDtTm;
	private GenericIdentification32 InitgPty;
	private GenericIdentification32 RcptPty;
	private Traceability1 Tracblt;
	
	public MessageFunction1Code getMsgFctn() {
		return MsgFctn;
	}
	public void setMsgFctn(MessageFunction1Code msgFctn) {
		MsgFctn = msgFctn;
	}
	public String getPrtcolVrsn() {
		return PrtcolVrsn;
	}
	public void setPrtcolVrsn(String prtcolVrsn) {
		PrtcolVrsn = prtcolVrsn;
	}
	public String getXchgId() {
		return XchgId;
	}
	public void setXchgId(String xchgId) {
		XchgId = xchgId;
	}
	public String getReTrnsmssnCntr() {
		return ReTrnsmssnCntr;
	}
	public void setReTrnsmssnCntr(String reTrnsmssnCntr) {
		ReTrnsmssnCntr = reTrnsmssnCntr;
	}
	public Date getCreDtTm() {
		return CreDtTm;
	}
	public void setCreDtTm(Date creDtTm) {
		CreDtTm = creDtTm;
	}
	public GenericIdentification32 getInitgPty() {
		return InitgPty;
	}
	public void setInitgPty(GenericIdentification32 initgPty) {
		InitgPty = initgPty;
	}
	public GenericIdentification32 getRcptPty() {
		return RcptPty;
	}
	public void setRcptPty(GenericIdentification32 rcptPty) {
		RcptPty = rcptPty;
	}
	public Traceability1 getTracblt() {
		return Tracblt;
	}
	public void setTracblt(Traceability1 tracblt) {
		Tracblt = tracblt;
	}
}
