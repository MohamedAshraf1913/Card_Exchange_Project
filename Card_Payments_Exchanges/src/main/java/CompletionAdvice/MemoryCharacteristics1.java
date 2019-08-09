package CompletionAdvice;

import ENUMs.MemoryUnit1Code;

public class MemoryCharacteristics1 {
	private String Id;
	private float TtlSz;
	private float FreeSz;
	private MemoryUnit1Code Unit;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public float getTtlSz() {
		return TtlSz;
	}
	public void setTtlSz(float ttlSz) {
		TtlSz = ttlSz;
	}
	public float getFreeSz() {
		return FreeSz;
	}
	public void setFreeSz(float freeSz) {
		FreeSz = freeSz;
	}
	public MemoryUnit1Code getUnit() {
		return Unit;
	}
	public void setUnit(MemoryUnit1Code unit) {
		Unit = unit;
	}
}
