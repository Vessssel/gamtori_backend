package vessel.gamtori.domain.entity;

public enum ChatMessageType {
	JOIN("입장"), CHAT("채팅"), OUT("퇴장");

	private String description;

	ChatMessageType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
