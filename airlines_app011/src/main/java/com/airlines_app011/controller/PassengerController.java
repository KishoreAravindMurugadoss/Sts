package com.airlines_app011.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.airlines_app011.entity.Passenger;
import com.airlines_app011.services.PassengerService;

@Controller
public class PassengerController {

	@Autowired
	public PassengerService passServ;
	@RequestMapping("/newpass")
	public String newPass() {
		return "newpassreg";
	}
	@RequestMapping("/savedata")
	public String savePass(Passenger pass) {
		passServ.savePassInfo(pass);
		return "newpassreg";
	}
	@RequestMapping("/listall")
	public String listall(Passenger pass, Model model) {
		List<Passenger> passengers = passServ.listallData(pass);
		model.addAttribute("passengers", passengers);
		return "listallJSP";
	}
	@RequestMapping("/update")
	public String updatePass(@RequestParam("id") long id, Model model) {
		Passenger passenger = passServ.updateOnePass(id);
		model.addAttribute("passenger", passenger);
		return "update_pass";
	}
	@RequestMapping("/updatepass")
	public String updatepass(Passenger pass, Model model) {
		passServ.updateOneData(pass);
		List<Passenger> passengers = passServ.listallData(pass);
		model.addAttribute("passengers", passengers);
		return "listallJSP";
	}
	@RequestMapping("/deletepass")
	public String deletepass(@RequestParam("id") long id, Passenger pass, Model model) {
		passServ.deleteOnePass(id);
		List<Passenger> passengers = passServ.listallData(pass);
		model.addAttribute("passengers", passengers);
		return "listallJSP";
	}
}
