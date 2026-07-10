import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zeus.dto.Member;

public class Textpractice {
// 1번 방식
	@RequestMapping(value = "/spring/form1", method = @RequestMethod.GET)
	public String method1(Model model) {
		log.info("spring/form1");
		return "spring/form1";
	}

	// 2번 방식
	@RequestMapping(value = "/spring/form1", method = @RequestMethod.GET)
	public void method2(Model model) {
		log.info("spring/form1");
	}

	// 3번 방식 -1
	@RequestMapping(value = "/spring/form1", method = @RequestMethod.GET)
	@ResponseBody
	public String method3(Model model) {
		Member member = new Member();
		log.info("spring/form1");
		return "spring/form1";
	}

	// 3번 방식 -2
	@RequestMapping(value = "/spring/form1", method = @RequestMethod.GET)
	public String method1(Model model) {
		log.info("spring/form1");
		
		return "spring/form1";
	}

}
