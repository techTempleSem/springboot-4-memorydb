package com.example.memorydb.repository;

import java.util.List;
import java.util.Optional;

public interface DataRepository <T, ID> extends Repository<T, ID>{
    T save(T data);
    Optional<T> findById(ID id);
    List<T> findAll();

    void delete(ID id);
}
