package General;

import General.KEKIdentifier1;
import General.AlgorithmIdentification2;

public class KEK2 {
	private float Vrsn;
	private KEKIdentifier1 KEKId;
	private AlgorithmIdentification2 KeyNcrptnAlgo;
	private byte[] NcrptdKey;
	
	public float getVrsn() {
		return Vrsn;
	}
	public void setVrsn(float vrsn) {
		Vrsn = vrsn;
	}
	public KEKIdentifier1 getKEKId() {
		return KEKId;
	}
	public void setKEKId(KEKIdentifier1 kEKId) {
		KEKId = kEKId;
	}
	public AlgorithmIdentification2 getKeyNcrptnAlgo() {
		return KeyNcrptnAlgo;
	}
	public void setKeyNcrptnAlgo(AlgorithmIdentification2 keyNcrptnAlgo) {
		KeyNcrptnAlgo = keyNcrptnAlgo;
	}
	public byte[] getNcrptdKey() {
		return NcrptdKey;
	}
	public void setNcrptdKey(byte[] ncrptdKey) {
		NcrptdKey = ncrptdKey;
	}
	
}
