package vessel.gamtori.domain.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class UserAndCategoryId implements Serializable {

	@Column(name = "user_id", nullable = false)
	private long userId;
	@Column(name = "category_id", nullable = false)
	private long categoryId;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserAndCategoryId that = (UserAndCategoryId)o;
		return userId == that.userId && categoryId == that.categoryId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, categoryId);
	}
}
