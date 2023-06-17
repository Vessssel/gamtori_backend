package vessel.gamtori.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vessel.gamtori.domain.entity.User;

/**
 *packageName    : vessel.gamtori.domain.user.repository
 * fileName       : UserRepository
 * author         : dongk
 * date           : 2023-06-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-06-03        dongk       최초 생성
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
