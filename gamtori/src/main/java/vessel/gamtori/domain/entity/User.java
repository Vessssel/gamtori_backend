package vessel.gamtori.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "user")
@DynamicUpdate
public class User extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;

	@NotNull
	@Column(name = "email", length = 255, nullable = false)
	private String email;

	@NotNull
	@Column(name = "password", length = 255, nullable = true) //oauth를 할 때의 로그인은 비밀번호가 없다.
	private String password;

	@NotNull
	@Column(name = "nickname", length = 255, nullable = false)
	private String nickname;

	@NotNull
	@Column(name = "phone_number", length = 16, nullable = true, columnDefinition = "CHAR")
	private String phoneNumber;

	@NotNull
	@Column(name = "profile_url", length = 255, nullable = false)
	private String profileUrl;

	@NotNull
	@Column(name = "gender", length = 16, nullable = false)
	private String gender;

	@Column(name = "manner_score", nullable = false)
	private int mannerScore;

	@Column(name = "is_delete", nullable = false)
	private boolean isDeleted;

	@NotNull
	@Column(name = "last_login_time", nullable = false)
	private LocalDateTime lastLoginTime;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manner_score_image_id", nullable = false)
	@NotNull
	private MannerScoreImage mannerScoreImage;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", nullable = false)
	@NotNull
	private Address address;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "age_group_id", nullable = false)
	@NotNull
	private AgeGroup ageGroup;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "login_provider_id", nullable = false)
	@NotNull
	private LoginProvider loginProvider;
}
