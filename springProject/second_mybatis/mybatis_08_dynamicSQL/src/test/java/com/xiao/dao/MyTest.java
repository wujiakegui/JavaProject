package com.xiao.dao;

import com.xiao.pojo.Blog;
import com.xiao.utils.IDUtils;
import com.xiao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {

    @Test
    public void addInitBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("mybatis没那么简单");
        blog.setAuthor("可归");
        blog.setCreateTime(new Date());
        blog.setViews(999);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("java简单吗？");
        blog.setAuthor("吴佳");
        blog.setCreateTime(new Date());
        blog.setViews(888);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("JDBC真的简单");
        blog.setAuthor("高雅");
        blog.setCreateTime(new Date());
        blog.setViews(77777);

        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
//        map.put("title","java简单吗？");
//        map.put("author","吴佳");
        List<Blog> blogs = mapper.queryBlog(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
//        map.put("title","java简单吗？");
//        map.put("author","吴佳");
        map.put("views", 999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title", "java简单2");
        map.put("author", "吴佳2");
        map.put("id", "f61401ea48054207912f7698d8f2257b");
        mapper.updateBlog(map);
        sqlSession.close();
    }

    @Test
    public void queryBlogForeach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids", ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
