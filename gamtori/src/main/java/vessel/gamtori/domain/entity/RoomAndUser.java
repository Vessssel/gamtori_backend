package vessel.gamtori.domain.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
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
@Table(name = "room_and_user")
@DynamicUpdate
public class RoomAndUser extends BaseTimeEntity {
	@EmbeddedId
	@NotNull
	private RoomAndUserId id;

	private boolean isLeader;

	private boolean isDeleted;

	private boolean isBan;

	@MapsId("userId") //기본키이자 외래키로 인식, fk를 pk로 지정.
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@NotNull
	private User user;

	@MapsId("roomId")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id")
	@NotNull
	private Room room;
}
