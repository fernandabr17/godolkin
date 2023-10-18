/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.godolkin.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.godolkin.entidades.Comment;
import mx.itson.godolkin.entidades.Post;
import mx.itson.godolkin.entidades.User;

/**
 * Imprime los contenidos de los posts.
 * @author Fernanda Barrón
 */
public class Main {
   
    public static void main(String[] args) throws ParseException {
        
        Post post = new Post();
        User user = new User();
        
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");
        
        user.setName("MarieMoreau");
        user.setEmail("mariebm18@gmail.com");
        user.setPassword("bmshseven08");
        
        Post post1 = new Post();
        Date date = dateFormat.parse("27-09-2023");
        post1.setTitle("My first day at GU.");
        post1.setBody("Today is my first day at college, I'm so excited to meet more people like me...");
        post1.setUser(user);
        post1.setDate(date);
        
        Post post2 = new Post();
        post2.setTitle("Update: My roomate it's really cool!");
        post2.setBody("Sooo, my roomie it's really nice and her powers are something else...");
        post2.setUser(user);
        post2.setDate(date);
        
        Post post3 = new Post();
        post3.setTitle("Another update: Golden Boy tried to kill me.");
        post3.setBody("I don't know if I should talk about this, but you already saw what happened...");
        post3.setUser(user);
        post3.setDate(date);
        
        List<Comment> comments = new ArrayList<>();
        
        User user1 = new User();
        Comment comment1 = new Comment();
        user1.setName("JordanLi");
        comment1.setUser(user1);
        Date date1 = dateFormat.parse("27-09-2023");
        comment1.setDate(date1);
        comment1.setBody("Welcome, and good luck, freshman.");
        comments.add(comment1);
        
        User user2 = new User();
        Comment comment2 = new Comment();
        user2.setName("LittleCricket");
        comment2.setUser(user2);
        Date date2 = dateFormat.parse("27-09-2023");
        comment2.setDate(date2);
        comment2.setBody("Welcome roommate!! It's rlly nice to meet you, let's have an amazing year.");
        comments.add(comment2);
       
        post.setComments(comments);
        
        System.out.println("--- GODOLKIN'S UNIVERSITY STUDENTS BLOG ---" );
        System.out.println("By: "+post1.getUser().getName());
        System.out.println(post1.getTitle() + " " + post1.getDate());
        System.out.println(post1.getBody());
        
        System.out.println("--- COMMENTS ---" );
        for(Comment c : post.getComments()){
            System.out.println(c.getUser().getName());
            System.out.println("-"+c.getBody());
            System.out.println("Date: "+c.getDate());
            System.out.println("");
        }
  
        List<Comment> comments2 = new ArrayList<>();
        
        User user3 = new User();
        Comment comment3 = new Comment();
        user3.setName("LittleCricket");
        comment3.setUser(user3);
        Date date3 = dateFormat.parse("27-09-2023");
        comment3.setDate(date3);
        comment3.setBody("Awww, you are so sweet, I hope we can have a really good friendship.");
        comments2.add(comment3);
        
        User user4 = new User();
        Comment comment4 = new Comment();
        user4.setName("AndréTheGoat");
        comment4.setUser(user4);
        Date date4 = dateFormat.parse("27-09-2023");
        comment4.setDate(date4);
        comment4.setBody("Imagine being little cricket's roommate, that must be interesting dude lol.");
        comments2.add(comment4);
        
        post.setComments(comments2);
        
        System.out.println("--- GODOLKIN'S UNIVERSITY STUDENTS BLOG ---" );
        System.out.println("By: "+post2.getUser().getName());
        System.out.println(post2.getTitle() + " " + post2.getDate());
        System.out.println(post2.getBody());
        
        System.out.println("--- COMMENTS ---" );
        for(Comment c : post.getComments()){
            System.out.println(c.getUser().getName());
            System.out.println("-"+c.getBody());
            System.out.println("Date: "+c.getDate());
            System.out.println("");     
        }
   
        List<Comment> comments3 = new ArrayList<>();
        
        User user5 = new User();
        Comment comment5 = new Comment();
        user5.setName("JordanLi");
        comment5.setUser(user5);
        Date date5 = dateFormat.parse("27-09-2023");
        comment5.setDate(date5);
        comment5.setBody("Just say the whole truth.");
        comments3.add(comment5);
        
        User user6 = new User();
        Comment comment6 = new Comment();
        user6.setName("CateDunlap");
        comment6.setUser(user6);
        Date date6 = dateFormat.parse("27-09-2023");
        comment6.setDate(date6);
        comment6.setBody("Why are you posting this? It's very insensitive of you. ");
        comments3.add(comment6);
        
        post.setComments(comments3);
        
        System.out.println("--- GODOLKIN'S UNIVERSITY STUDENTS BLOG ---" );
        System.out.println("By: "+post3.getUser().getName());
        System.out.println(post3.getTitle() + " " + post3.getDate());
        System.out.println(post3.getBody());
        
        System.out.println("--- COMMENTS ---" );
        for(Comment c : post.getComments()){
            System.out.println(c.getUser().getName());
            System.out.println("-"+c.getBody());
            System.out.println("Date: "+c.getDate());
            System.out.println("");     
        }
        
    }
}
