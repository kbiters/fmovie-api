package com.kbiters.fmovieapi.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IGenericService<T> {

    ResponseEntity<List<T>> getAll();

    ResponseEntity<T> getOne(Long id);

    ResponseEntity<T> create(T model);

    ResponseEntity<T> update(T model);

    ResponseEntity<HttpStatus> delete(Long id);

}
