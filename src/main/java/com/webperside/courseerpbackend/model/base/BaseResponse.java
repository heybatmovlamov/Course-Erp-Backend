package com.webperside.courseerpbackend.model.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.net.http.HttpResponse;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse<T> {
    HttpStatus status;
    String msg;
    T data;
    public static <T> BaseResponse <T> success(T data){
        return BaseResponse.<T>builder().
                status(HttpStatus.OK).
                msg("Succes").
                data(data).build();

    }
}
