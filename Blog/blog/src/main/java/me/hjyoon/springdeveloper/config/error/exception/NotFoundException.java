package me.hjyoon.springdeveloper.config.error.exception;

import me.hjyoon.springdeveloper.config.error.ErrorCode;

public class NotFoundException extends CustomBaseException{
    public NotFoundException(ErrorCode errorCode){
        super(errorCode.getMessage(), errorCode);
    }

    public NotFoundException(){
        super(ErrorCode.NOT_FOUND);
    }
}
