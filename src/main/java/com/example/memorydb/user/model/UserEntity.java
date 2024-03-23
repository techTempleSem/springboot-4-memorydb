package com.example.memorydb.user.model;

import com.example.memorydb.entity.Entity;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity extends Entity {
    private String name;
    private int score;
}
