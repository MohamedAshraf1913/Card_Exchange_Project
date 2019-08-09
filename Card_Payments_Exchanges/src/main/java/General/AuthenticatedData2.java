package General;

import General.EncapsulatedContent1;
import General.AlgorithmIdentification3;

public class AuthenticatedData2 {
	private float Vrsn;
	private Recipient2Choice Rcpt;
	private AlgorithmIdentification3 MACAlgo;
	private EncapsulatedContent1 NcpsltdCntt;
	private byte[] MAC;
	
	public float getVrsn() {
		return Vrsn;
	}
	public void setVrsn(float vrsn) {
		Vrsn = vrsn;
	}
	public Recipient2Choice getRcpt() {
		return Rcpt;
	}
	public void setRcpt(Recipient2Choice rcpt) {
		Rcpt = rcpt;
	}
	public AlgorithmIdentification3 getMACAlgo() {
		return MACAlgo;
	}
	public void setMACAlgo(AlgorithmIdentification3 mACAlgo) {
		MACAlgo = mACAlgo;
	}
	public EncapsulatedContent1 getNcpsltdCntt() {
		return NcpsltdCntt;
	}
	public void setNcpsltdCntt(EncapsulatedContent1 ncpsltdCntt) {
		NcpsltdCntt = ncpsltdCntt;
	}
	public byte[] getMAC() {
		return MAC;
	}
	public void setMAC(byte[] mAC) {
		MAC = mAC;
	}
}
