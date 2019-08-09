package General;

import General.CertificateIdentifier1;
import General.AlgorithmIdentification7;

public class KeyTransport2 {
	private float Vrsn;
	private CertificateIdentifier1 RcptId;
	private AlgorithmIdentification7 KeyNcrptnAlgo;
	private byte[] NcrptdKey;
	
	public float getVrsn() {
		return Vrsn;
	}
	public void setVrsn(float vrsn) {
		Vrsn = vrsn;
	}
	public CertificateIdentifier1 getRcptId() {
		return RcptId;
	}
	public void setRcptId(CertificateIdentifier1 rcptId) {
		RcptId = rcptId;
	}
	public AlgorithmIdentification7 getKeyNcrptnAlgo() {
		return KeyNcrptnAlgo;
	}
	public void setKeyNcrptnAlgo(AlgorithmIdentification7 keyNcrptnAlgo) {
		KeyNcrptnAlgo = keyNcrptnAlgo;
	}
	public byte[] getNcrptdKey() {
		return NcrptdKey;
	}
	public void setNcrptdKey(byte[] ncrptdKey) {
		NcrptdKey = ncrptdKey;
	}
	
}
