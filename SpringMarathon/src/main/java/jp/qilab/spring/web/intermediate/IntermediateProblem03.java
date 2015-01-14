package jp.qilab.spring.web.intermediate;

import java.util.List;

import jp.qilab.spring.dao.SexDao;
import jp.qilab.spring.domain.intermediate.Sex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Transactional
public class IntermediateProblem03 {
	
	@Autowired
	SexDao sexDao;
	
//	@Autowired
//	public IntermediateProblem03(SexDao sexDao) {
//		this.sexDao = sexDao;
//	}

	@RequestMapping("/intermediate/problem03/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("intermediate/problem03/index");
		
//		DomaConfig domaConfig = new DomaConfig();
//		TransactionManager tm = (TransactionManager) domaConfig.transactionManager();
//		SexDao dao = new SexDaoImpl();
//		List<Sex> sexList;
//	    tm.required(() -> {
//	        sexList = dao.selectAll();
//	    });
		
		List<Sex> sexList = sexDao.selectAll();
		modelAndView.addObject("sexList", sexList);
		
		return modelAndView;
	}
}
