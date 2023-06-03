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
@Table(name = "category")
@DynamicUpdate
public class Category extends BaseTimeEntity {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Column(name = "category", nullable = false)
	private String category;
	@NotNull
	@Column(name = "category_url", nullable = false)
	private String categoryUrl;

	@Column(name = "view_count", nullable = false)
	private long viewCount;

	@Column(name = "is_deleted", nullable = false)
	private boolean isDeleted;
}
