package vessel.gamtori.domain.entity;

public enum GenderType {
	UNISEX("남여무관"), MALE("남"), FEMALE("여");
	private String description;

	GenderType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
