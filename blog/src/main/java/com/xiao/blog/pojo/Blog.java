package com.xiao.blog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "t_blog")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean published;
    private boolean recommend;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    // 对应关系：blog和type为多对一关系
    @ManyToOne
    private Type type;

    // 对应关系：blog和tag为多对多关系
    @ManyToMany(cascade = {CascadeType.PERSIST})
    private List<Tag> tags = new ArrayList<>();

    // 对应关系：blog和user为多对一关系
    @ManyToOne
    private User user;

    // 对应关系：blog和comment为多对多关系
    @OneToMany(mappedBy = "blog")
    private List<Comment> comments = new ArrayList<>();

}