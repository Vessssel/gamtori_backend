package vessel.gamtori.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.sun.istack.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *packageName    : vessel.gamtori.domain.entity
 * fileName       : User
 * author         : dongk
 * date           : 2023-06-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-03        dongk       최초 생성
 */
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Table(name = "address")
@DynamicUpdate
public class Address extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;

	@Column(name="si", length = 64, nullable = false)
	@NotNull
	private String si;

	@Column(name="gugun", length = 64, nullable = false)
	@NotNull
	private String gugun;

	@Column(name="dong", length = 64, nullable = false)
	@NotNull
	private String dong;

	@Column(name="code", length = 16, nullable = false, columnDefinition = "CHAR")
	@NotNull
	private String code;

	@Column(name = "is_deleted", nullable = false)
	private boolean isDeleted;
}
