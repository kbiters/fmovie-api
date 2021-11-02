package com.kbiters.fmovieapi.common;

import com.kbiters.fmovieapi.model.ActorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public abstract class GenericService<T> implements IGenericService<T> {


    @Override
    public ResponseEntity<List<T>> getAll() {
        return new ResponseEntity<>(getRepository().findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<T> getOne(Long id) {
        return new ResponseEntity<>(getRepository().findById(id).get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<T> create(T model) {
        return new ResponseEntity<>(getRepository().save(model), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<T> update(T model) {
        return new ResponseEntity<>(getRepository().save(model), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<HttpStatus> delete(Long id) {
        getRepository().deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    public abstract JpaRepository<T, Long> getRepository();
}
