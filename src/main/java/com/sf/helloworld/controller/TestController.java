package com.sf.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

//	http://localhost:8080/listAll 
@RequestMapping(value="/list1")
public String test1() {

return "login";
}

//	http://localhost:8080/listAll 
@RequestMapping(value="/list2")
public String test2() {

return "404";
}

//	http://localhost:8080/listAll 
@RequestMapping(value="/list3")
public String test3() {

return "dashboard";
}

//	http://localhost:8080/listAll 
@RequestMapping(value="/list4")
public String test4() {

return "list";
}



}