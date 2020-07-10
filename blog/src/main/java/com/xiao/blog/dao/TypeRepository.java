package com.xiao.blog.dao;

import com.xiao.blog.pojo.Type;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TypeRepository extends JpaRepository<Type,Long> {
        Type findByName(String name);
}
