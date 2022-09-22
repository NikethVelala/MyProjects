package com.example.MyWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class HomeController {
/*    @RequestMapping("home")
*//*    @ResponseBody*//*   // this will print home.jsp on the webpage
    public String home(@RequestParam("name") String myName, HttpSession session){  //in the url name parameter is passed. Ex: localhost:8080/home?name=niketh
        System.out.println("hi "+myName);
        session.setAttribute("name", myName); //adding data to session object, so that jsp page can use this data
        //here this will be mapped to home.jsp page by the tomcat jasper dependency
        return "home";  //the suffix and prefix of the jsp page is mentioned in the application.properties
        //this return statement is actually returning to dispatcher servlet

    }*/

    //replacement of above


//    @RequestMapping("home")
//    public ModelAndView home(@RequestParam("name") String myName){
//        ModelAndView mv=new ModelAndView();   //here model is the data which is used in the view (home.jsp) and here view is the jsp page
//        mv.addObject("name",myName);
//        mv.setViewName("home");
//
//        return mv;
//    }


    @RequestMapping("home")
    public ModelAndView home(Alien alien){  // url: http://localhost:8080/home?aid=1&aname=niketh&lang=java
        ModelAndView mv=new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home");

        return mv;
    }
}
