package jp.qilab.spring.web.intermediate;

import java.util.List;

import javax.validation.Valid;

import jp.qilab.spring.domain.intermediate.Hotel;
import jp.qilab.spring.form.intermediate.Problem02Form;
import jp.qilab.spring.repository.intermediate.HotelsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntermediateProblem02 {

	@Autowired
	HotelsRepository hotelsRepository;
	
	@RequestMapping("/intermediate/problem02/")
	public ModelAndView index(@Valid Problem02Form problem02Form) {
		ModelAndView modelAndView = new ModelAndView("intermediate/problem02/index");
		if (problem02Form.getUpperPrice() == null) {
			return modelAndView;
		}
		
		List<Hotel> hotelList = hotelsRepository.findByPriceLessThanEqual(problem02Form.getUpperPrice());
		modelAndView.addObject("hotelList", hotelList);
		
		return modelAndView;
	}
}
