package CompletionAdvice;

import ENUMs.CardDataReading1Code;
import ENUMs.CardholderVerificationCapability1Code;
import ENUMs.OnLineCapability1Code;
import CompletionAdvice.DisplayCapabilities1;

public class PointOfInteractionCapabilities1 {
	private CardDataReading1Code CardRdngCpblties;
	private CardholderVerificationCapability1Code CrdhldrVrfctnCpblties;
	private OnLineCapability1Code OnLineCpblties;
	private DisplayCapabilities1 DispCpblties;
	private String PrtLineWidth;
	public CardDataReading1Code getCardRdngCpblties() {
		return CardRdngCpblties;
	}
	public void setCardRdngCpblties(CardDataReading1Code cardRdngCpblties) {
		CardRdngCpblties = cardRdngCpblties;
	}
	public CardholderVerificationCapability1Code getCrdhldrVrfctnCpblties() {
		return CrdhldrVrfctnCpblties;
	}
	public void setCrdhldrVrfctnCpblties(CardholderVerificationCapability1Code crdhldrVrfctnCpblties) {
		CrdhldrVrfctnCpblties = crdhldrVrfctnCpblties;
	}
	public OnLineCapability1Code getOnLineCpblties() {
		return OnLineCpblties;
	}
	public void setOnLineCpblties(OnLineCapability1Code onLineCpblties) {
		OnLineCpblties = onLineCpblties;
	}
	public DisplayCapabilities1 getDispCpblties() {
		return DispCpblties;
	}
	public void setDispCpblties(DisplayCapabilities1 dispCpblties) {
		DispCpblties = dispCpblties;
	}
	public String getPrtLineWidth() {
		return PrtLineWidth;
	}
	public void setPrtLineWidth(String prtLineWidth) {
		PrtLineWidth = prtLineWidth;
	}
	
}
