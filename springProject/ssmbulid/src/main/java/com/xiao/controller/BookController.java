package com.xiao.controller;


import com.xiao.pojo.Books;
import com.xiao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    // Controller调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    // 查询全部的书籍，并且返回allbook到一个书籍展示页面
    @RequestMapping("/allbook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    // 跳转到增加书籍页面
    @RequestMapping("/toaddbook")
    public String toAddPaper() {
        return "addBook";
    }

    // 添加书籍的请求
    @RequestMapping("/addbook")
    public String addBook(Books books) {
        System.out.println("addBook--->" + books);
        bookService.addBook(books);
        return "redirect:/book/allbook";
    }

    // 跳转到修改页面
    @RequestMapping("/toupdate")
    public String toUpdatePaper(int id, Model model) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook", books);
        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("/updatebook")
    public String updateBook(Books books) {
        System.out.println("updateBook---->" + books);
        bookService.updateBook(books);
        return "redirect:/book/allbook";
    }

    // 删除书籍
    @RequestMapping("/deletebook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allbook";
    }

    // 搜索书籍
    @RequestMapping("/querybook")
    public String queryBook(String queryBookName, Model model) {
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if (books == null) {
            list = bookService.queryAllBook();
            model.addAttribute("error", "未查到");
        }
        model.addAttribute("list", list);
        return "allBook";

    }
}
