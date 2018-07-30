/**
 * 
 */
package com.cooligc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sitakant
 *
 */
@Controller
public class HelloController {

	@RequestMapping("/")
	public String landPage() {
		System.out.println("I got called");
		studentModel();
		return "studentModel";
	}

	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String createStudent(Model model, @Valid @ModelAttribute("student") Student student,
			BindingResult bindingResult,Errors errors) {

		System.out.println(errors.getErrorCount());
		
		if (bindingResult.hasErrors()) {
			return "studentModel";
		}

		model.addAttribute("message", "Successfuly created the student object");

		return "studentModel";
	}

	@ModelAttribute("student")
	private Student studentModel() {
		return new Student();
	}

}
