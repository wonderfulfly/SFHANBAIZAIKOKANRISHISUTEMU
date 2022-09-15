package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @project
 *     SF販売在庫管理システム
 * @comment
 *      class: FirstController
 *      Page: 
 * @version
 */

@Controller
public class FirstController {

	/**
	 * Login method
	 * 
	 */
	@RequestMapping("/")
	public String index() {
		return "Login";
	}
	
	/**
	 * logoutButton method
	 * 
	 */	
	@RequestMapping("logoutButton.do")
	public String logoutButton() {
		return "Logout";
	}
	
	/**
	 * logoutGamenn method
	 * 
	 */	
	@RequestMapping("logoutGamenn.do")
	public String logoutGamenn() {
		return "Login";
	}
	
	/**
	 * homePage method
	 * 
	 */		
	@RequestMapping("homePage.do")
	public String homePage() {
		return "A010";
	}
	
	/**
	 * A002を遷移 method
	 * 
	 */
	@RequestMapping("A002.do")
	public String A002Page() {
		return "A002";
	}
	/**
	 * A014を遷移 method
	 * 
	 */
	@RequestMapping("A014.do")
	public String A014Page() {
		return "A014";
	}
	/**
	 * A015を遷移 method
	 * 
	 */
	@RequestMapping("A015.do")
	public String A015Page() {
		return "A015";
	}
	/**
	 * A006を遷移 method
	 * 
	 */
	@RequestMapping("A006.do")
	public String A006Page() {
		return "A006";
	}
	/**
	 * A007を遷移 method
	 * 
	 */
	@RequestMapping("A007.do")
	public String A007Page() {
		return "A007";
	}
	/**
	 * A010を遷移 method
	 * 
	 */
	@RequestMapping("A010.do")
	public String A010Page() {
		return "A010";
	}
	/**
	 * A008を遷移 method
	 * 
	 */
	@RequestMapping("A008.do")
	public String A008Page() {
		return "A008";
	}

}