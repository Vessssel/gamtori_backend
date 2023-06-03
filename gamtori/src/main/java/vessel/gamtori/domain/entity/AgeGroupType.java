package vessel.gamtori.domain.entity;

/**
 *packageName    : vessel.gamtori.domain.entity
 * fileName       : Age
 * author         : jongseong
 * date           : 2023-06-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-03        jongseong       최초 생성
 */
public enum AgeGroupType {
	TEN("10대"), TWENTY("20대"), THIRTY("30대"), FORTY("40대"), FIFTY("50대"), OVER_SIXTY("60대 이상");

	private String age;

	AgeGroupType(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}
}
