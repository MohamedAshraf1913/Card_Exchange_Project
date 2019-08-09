package General;

import General.CertificateIssuer1; 

public class IssuerAndSerialNumber1 {
	private CertificateIssuer1 Issr;
	private byte[] SrlNb;
	
	public CertificateIssuer1 getIssr() {
		return Issr;
	}
	public void setIssr(CertificateIssuer1 issr) {
		Issr = issr;
	}
	public byte[] getSrlNb() {
		return SrlNb;
	}
	public void setSrlNb(byte[] srlNb) {
		SrlNb = srlNb;
	}
	
}
