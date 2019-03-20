package com.taotao.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * 
 * 作者: mcrgood
 * 名字:PageController.java
 * 时间:2019年3月20日
 */
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PageController {
 /**
  * 展示首页
  * @return
  */
 @RequestMapping("/")
 public String showIndex()
 {
	 return "index";
 }
 /**
  * 展示其他页面
  * @param page
  * @return
  */
 @RequestMapping("/{page}")
 public String showPage(@PathVariable String page)
 {
	 return page;
 }
}
