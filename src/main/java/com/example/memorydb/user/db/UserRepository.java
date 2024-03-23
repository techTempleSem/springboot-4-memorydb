package com.example.memorydb.user.db;

import com.example.memorydb.repository.SimpleDataRepository;
import com.example.memorydb.user.model.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRepository extends SimpleDataRepository<UserEntity, Long> {
    public List<UserEntity> findAllScoreGreaterThan(int score){
        return this.findAll().stream()
                .filter(
                        it -> {
                            return it.getScore() >= score;
                        }
                ).collect(Collectors.toList());
    }
}
