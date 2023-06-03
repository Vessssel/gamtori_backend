package vessel.gamtori.domain.entity;

public enum DuesType {
	NONE("없음"), DECIDED("있음"), UNDECIDED("미정");

	private String description;

	DuesType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
