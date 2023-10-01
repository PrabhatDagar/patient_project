package com.project.patient;

//import java.io.IOException;
import java.util.List;

//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.project.patient.model.Post;
import com.project.patient.model.PostRepository;


//import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/")
public class Controller {
	
	//http://localhost:8080/
	
	@Autowired
	PostRepository repo;


	//@ApiIgnore
	
//	    public void redirect(HttpServletResponse response) throws IOException {
//	     
//	        response.sendRedirect("/swagger-ui.html");
//	    }


	
	 @GetMapping("/allPosts")
	    public List<Post> getAllPosts()
	    {
	        return repo.findAll();
	    }
	 @PostMapping("/post") 
	    public Post addPost(@RequestBody Post post)
	    {
	        return repo.save(post);
	    }
}
