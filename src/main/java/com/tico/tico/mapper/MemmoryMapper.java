package com.tico.tico.mapper;

import com.tico.tico.entities.Memmory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MemmoryMapper {
    List<Memmory> getAll();
}
