package me.hjyoon.springdeveloper.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.hjyoon.springdeveloper.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    @NotNull
    @Size(min=1, max =10)
    private String title;

    @NotNull
    private String content;

    public Article toEntity(String author){ //생성자를 사용해 객체 생성, DTO를 엔티티로 만들어주는 메서드
        return Article.builder().
                title(title)
                .content(content)
                .author(author)
                .build();
    }


}
