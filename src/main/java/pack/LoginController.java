package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value = "kic/login", params = "type=admin")
	public ModelAndView login_admin() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("msg", "관리자");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "kic/login", params = "type=user")
	public ModelAndView login_user() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("msg", "일반회원");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "kic/login", params = "!type")
	public ModelAndView login_guest() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("msg", "기타");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "ent/{co}/singer/{singer}")
	public ModelAndView en_singer(
			@RequestParam("title") String title,
			@PathVariable String co,
			@PathVariable String singer) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		
		String info = "소속사 : " + co + ", 가수 : " + singer + ", 노래 제목 : " + title;
		
		modelAndView.addObject("msg", info);
		
		return modelAndView;
	}
}