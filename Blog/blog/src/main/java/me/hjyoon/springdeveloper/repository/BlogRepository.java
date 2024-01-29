package me.hjyoon.springdeveloper.repository;

import me.hjyoon.springdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
