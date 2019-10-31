package com.lh.course.user.controller;

import com.lh.course.user.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
@Controller
public class BookController {
    @RequestMapping("/toBookList")
    public String toBookList(Model model) {
        List<Book> list= new ArrayList<Book>();
        //模拟数据
        Book book1 = new Book();
        book1.setId(1001);
        book1.setName("Spring实战");
        book1.setPublisher("人民邮电出版社");
        book1.setPrice(89.20);
        Book book2 = new Book();
        book2.setId(1002);
        book2.setName("Oracle数据库技术");
        book2.setPublisher("高等教育出版社");
        book2.setPrice(39.20);
        Book book3 = new Book();
        book3.setId(1003);
        book3.setName("Hadoop权威指南");
        book3.setPublisher("清华大学出版社");
        book3.setPrice(100.80);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        //放进model，传递给jsp页面
        model.addAttribute("booklist", list);
        return "/jsp/booklist";
    }
    //使用Request对象获得id
//    @RequestMapping("/bookDelete")
//    public String bookDelete(HttpServletRequest request, Model model) {
//        String id= request.getParameter("id");
//        StringBuilder msg = new StringBuilder();
//        msg.append("选择的图书ID为：<br />");
//        msg.append("id=" + id);
//        model.addAttribute("msg", msg.toString());
//        return "/jsp/success";
//    }
    @RequestMapping("/bookDelete")
    public String bookDelete(Integer id,Model model){
    StringBuilder msg = new StringBuilder();
    msg.append("选择图书ID为：<br />");
    msg.append("id:"+id);
    model.addAttribute("msg",msg.toString());
    return "/jsp/success";
    }
    //跳转到添加图书的页面
    @RequestMapping("/toBookAdd")
    public String toBookAdd(Model model){
        return "/jsp/bookadd";
    }
    //添加图书
    @RequestMapping("/bookAdd")
    public String bookAdd(Book book,Model model){
        StringBuilder msg = new StringBuilder();
        msg.append("添加的图书信息为：<br/>");
        msg.append("图书名称=" + book.getName()+"<br/>");
        msg.append("出版社=" + book.getPublisher()+"<br/>");
        msg.append("价格=" + book.getPrice()+"<br/>");
        model.addAttribute("msg", msg.toString());
        return "/jsp/success";
    }
    //跳转到修改图书信息页面
    @RequestMapping("/toBookEdit")
    public String toBookEdit(Integer id, Model model){
        //模拟数据
        Book book = new Book();
        book.setId(1001);
        book.setName("Spring实战");
        book.setPublisher("人民邮电出版社");
        book.setPrice(89.20);
        //放进model
        model.addAttribute("book",book);
        //到视图：jsp页面
        return "/jsp/bookedit";
    }
    //修改图书信息
    @RequestMapping("/bookEdit")
    public String bookEdit(Book book, Model model){
        StringBuilder msg = new StringBuilder();
        msg.append("修改的图书信息为：<br/>");
        msg.append("图书id=" + book.getId()+"<br/>");
        msg.append("图书名称=" + book.getName()+"<br/>");
        msg.append("出版社=" + book.getPublisher()+"<br/>");
        msg.append("价格=" + book.getPrice()+"<br/>");
        model.addAttribute("msg", msg.toString());
        //到视图：jsp页面
        return "/jsp/success";
    }
}
