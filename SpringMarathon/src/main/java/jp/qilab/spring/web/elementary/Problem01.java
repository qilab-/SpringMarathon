package jp.qilab.spring.web.elementary;

import javax.validation.Valid;

import jp.qilab.spring.form.elementary.Person;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Problem01 {

	@RequestMapping("/elementary/problem01/")
	public ModelAndView index(Person person) {
		ModelAndView modelAndView = new ModelAndView("elementary/problem01/index");
		return modelAndView;
	}
	
	@RequestMapping(value="/elementary/problem01/result", method=RequestMethod.POST)
	public ModelAndView result(@Valid Person person, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return new ModelAndView("elementary/problem01/index");
		}
		ModelAndView modelAndView = new ModelAndView("elementary/problem01/result");
		modelAndView.addObject("person", person);
		return modelAndView;
	}
}
