package com.webperside.courseerpbackend.services;

public interface TokenGenerator <T>{
    String generate(T obj);
}
