package co.kr.ideacube.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.kr.ideacube.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
