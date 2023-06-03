package vessel.gamtori.domain.entity;

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
@Table(name = "review")
@DynamicUpdate
public class Review extends BaseTimeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;

	@NotNull
	@Column(columnDefinition="TEXT", nullable = false)
	private String content;

	@Column(name = "score", nullable = false)
	private int score;

	@Column(name = "is_delete", nullable = false)
	private boolean isDeleted;

	@JoinColumn(name = "user_id")
	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "reviewer_id", nullable = false)
	private User reviewer;

	@JoinColumn(name = "user_id")
	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "reviewee_id", nullable = false)
	private User reviewee;

	@JoinColumn(name = "room_id")
	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "room_id", nullable = false)
	private Room room;
}
