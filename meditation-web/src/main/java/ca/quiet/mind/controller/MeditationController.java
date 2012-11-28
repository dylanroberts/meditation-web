package ca.quiet.mind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MeditationController {

    @RequestMapping("/")
    public ModelAndView meditate() {
	return new ModelAndView("meditation");
    }
}
