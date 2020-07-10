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
@Table(name = "t_tag")
public class Tag {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // 对应关系：blog和tag为多对多关系
    @ManyToMany(mappedBy = "tags")
    private List<Blog> blogs = new ArrayList<>();

}