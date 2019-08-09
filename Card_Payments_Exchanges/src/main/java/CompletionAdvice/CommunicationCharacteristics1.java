package CompletionAdvice;

import ENUMs.PartyType7Code;
import ENUMs.POICommunicationType1Code;

public class CommunicationCharacteristics1 {
	private POICommunicationType1Code ComTp;
	private PartyType7Code RmotPty;
	private boolean Actv;
	public POICommunicationType1Code getComTp() {
		return ComTp;
	}
	public void setComTp(POICommunicationType1Code comTp) {
		ComTp = comTp;
	}
	public PartyType7Code getRmotPty() {
		return RmotPty;
	}
	public void setRmotPty(PartyType7Code rmotPty) {
		RmotPty = rmotPty;
	}
	public boolean isActv() {
		return Actv;
	}
	public void setActv(boolean actv) {
		Actv = actv;
	}
}
