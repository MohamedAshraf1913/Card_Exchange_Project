package General;

import ENUMs.ContentType1Code;

public class EncapsulatedContent1 {
	private ContentType1Code CnttTp;
	private byte[] Cntt;
	
	public ContentType1Code getCnttTp() {
		return CnttTp;
	}
	public void setCnttTp(ContentType1Code cnttTp) {
		CnttTp = cnttTp;
	}
	public byte[] getCntt() {
		return Cntt;
	}
	public void setCntt(byte[] cntt) {
		Cntt = cntt;
	}
}
