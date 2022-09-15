 package com.wonderrobot.sfhanbaizaikokanrishisutemu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TurnToImportController {
 @RequestMapping("turnTouinout001.do")
 public String turnTouinout001() {
  return "uinout001";
 }
}