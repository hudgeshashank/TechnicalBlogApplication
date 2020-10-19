package technicalblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;
import technicalblog.repository.PostRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.getAllPosts();
    }

    public Post getOnePost() {
        return postRepository.getOnePost();
    }

    public void createPost(Post newPost) {
        newPost.setDate(new Date());
        postRepository.createPost(newPost);
        System.out.println("New Post " + newPost);
    }

    public Post getPost(Integer postId) {
        return postRepository.getPost(postId);
    }

    public void updatePost(Post updatedPost) {
        updatedPost.setDate(new Date());
        postRepository.updatePost(updatedPost);
    }

    public void deletePost(Integer postId) {
        postRepository.deletePost(postId);
    }

    public void deletePost(String postTitle) {
        postRepository.deletePost(postTitle);
    }
}

/*
package technicalblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;
import technicalblog.repository.PostRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public PostService() {

        System.out.println("*** PostService ***");
    }

    public List<Post> getAllPosts() {
        return repository.getAllPosts();
    }

    public Post getOnePost() {
        return repository.getLatestPost();

    }

    public void createPost (Post newPost){
        newPost.setDate(new Date());
        repository.createPost(newPost);
        System.out.println("New Post"+newPost);
    }
}
*/
