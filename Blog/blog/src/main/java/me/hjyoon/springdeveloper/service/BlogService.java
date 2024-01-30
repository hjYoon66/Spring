package me.hjyoon.springdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.hjyoon.springdeveloper.domain.Article;
import me.hjyoon.springdeveloper.dto.AddArticleRequest;
import me.hjyoon.springdeveloper.dto.UpdateArticleRequest;
import me.hjyoon.springdeveloper.repository.BlogRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor  //final이 붙거나 @NotNull이 붙인 필드의 생성자 추가
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request, String userName){
        return blogRepository.save(request.toEntity(userName));
    }
    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    public Article findById(long id){
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }

    public void delete(long id){
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : "+id));
        authorizeArticleAuthor(article);
        blogRepository.delete(article);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request){
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));

        authorizeArticleAuthor(article);
        article.update(request.getTitle(), request.getContent());

        return article;
    }

    //게시글을 작성한 유저인지 확인
    private static void authorizeArticleAuthor(Article article){
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        if(!article.getAuthor().equals(userName)){
            throw new IllegalArgumentException("not authorized");
        }
    }

}

