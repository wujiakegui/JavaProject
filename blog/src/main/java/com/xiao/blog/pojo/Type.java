package com.xiao.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_type")
public class Type {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // 对应关系：blog和type为多对一关系
    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();
}
