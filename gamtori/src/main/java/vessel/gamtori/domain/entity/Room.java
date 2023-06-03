package vessel.gamtori.domain.entity;

import static javax.persistence.GenerationType.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
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
@Table(name = "room")
@DynamicUpdate
public class Room extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;

	@NotNull
	@Column(name = "meet_date", nullable = false)
	private LocalDateTime meetDate;

	@NotNull
	@Column(name = "is_dues", nullable = false, columnDefinition = "CHAR (16)")
	@Enumerated(EnumType.STRING)
	private DuesType isDues;

	@Column(name = "dues", nullable = false)
	@ColumnDefault("0")
	private int dues;

	@NotNull
	@Column(name = "title", nullable = false, columnDefinition = "VARCHAR (50)")
	private String title;

	@NotNull
	@Column(name = "content", nullable = false, columnDefinition = "TEXT")
	private String content;

	@Column(name = "max_people", nullable = false)
	private int maxPeople;

	@Column(name = "current_people", nullable = false)
	private int currentPeople;

	@NotNull
	@Column(name = "gender", nullable = false, columnDefinition = "CHAR (16)")
	@Enumerated(EnumType.STRING)
	private GenderType gender;

	@Column(name = "lat", nullable = false)
	private double lat;

	@Column(name = "lng", nullable = false)
	private double lng;

	@NotNull
	@Column(name = "status", nullable = false, columnDefinition = "VARCHAR (10)")
	@Enumerated(EnumType.STRING)
	private StatusType status;

	@Column(name = "is_deleted", nullable = false)
	private boolean isDeleted;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", nullable = false)
	private Address address;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

}
