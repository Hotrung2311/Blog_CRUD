package trung.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import trung.codegym.model.Blog;
import trung.codegym.service.BlogService;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public ModelAndView getAll(){
        ModelAndView trung = new ModelAndView("list");
        trung.addObject("blogs", blogService.findAll());
        return trung;
    }

    @GetMapping("/newBlog")
    public ModelAndView createNewForm(){
        ModelAndView mv = new ModelAndView("detail");
        mv.addObject("blog", new Blog());
        return mv;
    }

    @PostMapping("/save-blog")
    public ModelAndView save(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView doanyeudau = new ModelAndView("detail");
        doanyeudau.addObject("message", "come oh yeah Doan");
        return doanyeudau;
    }

    @GetMapping("/edit-form/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Blog blog = blogService.findOne(id);
        if (blog != null){
            ModelAndView doan = new ModelAndView("detail");
            doan.addObject("blog", blog);
            return doan;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }

    }

    @GetMapping("/delete/{id}")
    public String showDeleteForm(@PathVariable Long id){
        blogService.delete(id);
        return "redirect:/list";
    }

}
