package me.hjyoon.springdeveloper.config.error.exception;

import me.hjyoon.springdeveloper.config.error.ErrorCode;

public class ArticleNotFoundException extends NotFoundException{
    public ArticleNotFoundException(){
        super(ErrorCode.ARTICLE_NOT_FOUND);
    }
}
