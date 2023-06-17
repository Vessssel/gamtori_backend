package vessel.gamtori.domain.entity;

public enum StatusType {
	OPEN("방생성"), CLOSE("모집마감"), ONGOING("진행중"), FINISH("모임종료");
	private String description;

	StatusType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
