package com.QuizGames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {
	/*
	 * @Autowired private EasyService easyService;
	 * 
	 * @Autowired private HardService hardService;
	 * 
	 * @Autowired private MediumService mediumService;
	 */
	//this handler is work for home page
	@RequestMapping("/")
	public String homeHandler()
	{
		return "home";
	}
	
	/*
	 * //this handler work to show question for easy quiz
	 * 
	 * @RequestMapping("/easy") public String easyHandler(Model model) { List<Easy>
	 * easy= this.easyService.getAllEasyQuestion();
	 * model.addAttribute("easyQuestion", easy); return "easy"; } //this handler
	 * validates all questions of easy quiz
	 * 
	 * @RequestMapping(path = "/easyform", method = RequestMethod.POST ) public
	 * String easyHandler(Model model,
	 * 
	 * @RequestParam("a1") String a1,
	 * 
	 * @RequestParam("a2") String a2,
	 * 
	 * @RequestParam("a3") String a3,
	 * 
	 * @RequestParam("a4") String a4,
	 * 
	 * @RequestParam("a5") String a5) { //this is for select only default value or
	 * user selected value String[] p1=a1.split(","); String[] p2=a2.split(",");
	 * String[] p3=a3.split(","); String[] p4=a4.split(","); String[]
	 * p5=a5.split(","); String b1 = p1[0]; String b2 = p2[0]; String b3 = p3[0];
	 * String b4 = p4[0]; String b5 = p5[0];
	 * 
	 * String[] s1= {b1,b2,b3,b4,b5}; model.addAttribute("level", "easy");
	 * 
	 * int count = 0; Easy easy = null; int id=1;
	 * 
	 * for(int i=0; i<5; i++) {
	 * 
	 * easy = this.easyService.getEasyQuestion(id);
	 * System.out.println(easy.getCorrect()+" "+s1[i]);
	 * 
	 * 
	 * if(easy.getCorrect().toString().equals(s1[i])) { count++; } id = id + 1;
	 * 
	 * } String result = null; switch(count){ case 1: result = "poor"; break; case
	 * 2: result = "bad"; break; case 3: result = "good"; break; case 4: result =
	 * "strong"; break; case 5: result = "very Strong"; break; }
	 * model.addAttribute("count", count); model.addAttribute("result", result);
	 * return "results"; }
	 * 
	 * //this handler work to show question for hard quiz
	 * 
	 * @RequestMapping("/hard") public String hardHandler(Model model) { List<Hard>
	 * hard= this.hardService.getAllHardQuestion();
	 * model.addAttribute("hardQuestion", hard); return "hard"; } //this handler
	 * validates all questions of hard quiz
	 * 
	 * @RequestMapping(path = "/hardform", method = RequestMethod.POST ) public
	 * String hardHandler(Model model,
	 * 
	 * @RequestParam("a1") String a1,
	 * 
	 * @RequestParam("a2") String a2,
	 * 
	 * @RequestParam("a3") String a3,
	 * 
	 * @RequestParam("a4") String a4,
	 * 
	 * @RequestParam("a5") String a5) {
	 * 
	 * //this is for select only default value or user selected value String[]
	 * p1=a1.split(","); String[] p2=a2.split(","); String[] p3=a3.split(",");
	 * String[] p4=a4.split(","); String[] p5=a5.split(","); String b1 = p1[0];
	 * String b2 = p2[0]; String b3 = p3[0]; String b4 = p4[0]; String b5 = p5[0];
	 * 
	 * String[] s1= {b1,b2,b3,b4,b5}; model.addAttribute("level", "hard");
	 * 
	 * int count = 0; Hard hard = null; int id=1;
	 * 
	 * for(int i=0; i<5; i++) {
	 * 
	 * hard = this.hardService.getHardQuestion(id);
	 * System.out.println(hard.getCorrect()+" "+s1[i]);
	 * 
	 * 
	 * if(hard.getCorrect().toString().equals(s1[i])) { count++; } id = id + 1;
	 * 
	 * } String result = null; switch(count){ case 1: result = "poor"; break; case
	 * 2: result = "bad"; break; case 3: result = "good"; break; case 4: result =
	 * "strong"; break; case 5: result = "very Strong"; break; }
	 * model.addAttribute("count", count); model.addAttribute("result", result);
	 * return "results"; }
	 * 
	 * //this handler work to show question for Medium quiz
	 * 
	 * @RequestMapping("/medium") public String mediumHandler(Model model) {
	 * List<Medium> medium= this.mediumService.getAllmediumQuestion();
	 * model.addAttribute("mediumQuestion", medium); return "medium"; } //this
	 * handler validates all questions of medium quiz
	 * 
	 * @RequestMapping(path = "/mediumform", method = RequestMethod.POST ) public
	 * String mediumHandler(Model model,
	 * 
	 * @RequestParam("a1") String a1,
	 * 
	 * @RequestParam("a2") String a2,
	 * 
	 * @RequestParam("a3") String a3,
	 * 
	 * @RequestParam("a4") String a4,
	 * 
	 * @RequestParam("a5") String a5) { //this is for select only default value or
	 * user selected value String[] p1=a1.split(","); String[] p2=a2.split(",");
	 * String[] p3=a3.split(","); String[] p4=a4.split(","); String[]
	 * p5=a5.split(","); String b1 = p1[0]; String b2 = p2[0]; String b3 = p3[0];
	 * String b4 = p4[0]; String b5 = p5[0];
	 * 
	 * String[] s1= {b1,b2,b3,b4,b5}; model.addAttribute("level", "medium");
	 * 
	 * int count = 0; Medium medium = null; int id=1;
	 * 
	 * for(int i=0; i<5; i++) {
	 * 
	 * medium = this.mediumService.getmediumQuestion(id);
	 * System.out.println(medium.getCorrect()+" "+s1[i]);
	 * 
	 * 
	 * if(medium.getCorrect().toString().equals(s1[i])) { count++; } id = id + 1;
	 * 
	 * } String result = null; switch(count){ case 1: result = "poor"; break; case
	 * 2: result = "bad"; break; case 3: result = "good"; break; case 4: result =
	 * "strong"; break; case 5: result = "very Strong"; break; }
	 * model.addAttribute("count", count); model.addAttribute("result", result);
	 * return "results"; }
	 */
}
