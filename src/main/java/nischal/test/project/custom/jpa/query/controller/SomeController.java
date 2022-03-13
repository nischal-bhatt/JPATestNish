package nischal.test.project.custom.jpa.query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nischal.test.project.custom.jpa.query.entity.Boys;
import nischal.test.project.custom.jpa.query.repository.BoysRepository;

@RestController
@RequestMapping("/testingnish")
public class SomeController {
	
	@Autowired
	BoysRepository boysRepository;
	
	@GetMapping("/hello/{var}/{a}")
	public String printsomething(@PathVariable String var, @PathVariable String a)
	{
		System.out.println(var);
		//Boys boy = boysRepository.findByHobby("singing");
		//Boys boy1 = boysRepository.findByHobby("kayaking");
		//return boy.getName() + boy1.getName();
	    Boys boy = this.boysRepository.findByHobby(var);
	    Boys boy1 = this.boysRepository.findByAlahuStartsWith(a);
	    return Integer.toString(boy.getId()) + boy1.getId();
	}
     
}
