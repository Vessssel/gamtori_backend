package vessel.gamtori.domain.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *packageName    : vessel.gamtori.domain.entity
 * fileName       : TermsHistoryId
 * author         : dongk
 * date           : 2023-06-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-03        dongk       최초 생성
 */
@Embeddable
public class TermsHistoryId implements Serializable {
	@Column(name = "user_id", nullable = false)
	private long userId;

	@Column(name = "terms_id", nullable = false)
	private long termsId;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		TermsHistoryId that = (TermsHistoryId)o;
		return userId == that.userId && termsId == that.termsId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, termsId);
	}
}
