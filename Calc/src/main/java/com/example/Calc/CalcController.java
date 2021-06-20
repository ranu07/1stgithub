package com.example.Calc;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalcController {
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public int addition(@RequestBody CalculateMain addOpt) {
		int add = addOpt.getVal1() + addOpt.getVal2();
		return add;

	}

	@RequestMapping(value = "/sub", method = RequestMethod.POST)
	public int subtraction(@RequestBody CalculateMain subOpt) {
		int sub = subOpt.getVal1() - subOpt.getVal2();
		return sub;

	}

	@RequestMapping(value = "/multi", method = RequestMethod.POST)
	public int multiplication(@RequestBody CalculateMain mulOpt) {
		int multi = mulOpt.getVal1() * mulOpt.getVal2();
		return multi;
	}

	@RequestMapping(value = "/div", method = RequestMethod.POST)
	public int division(@RequestBody CalculateMain divOpt) {
		int div = divOpt.getVal1() / divOpt.getVal2();
		return div;
	}

	@RequestMapping(value = "/rem/{val1}/{val2}", method = RequestMethod.POST)
	public int remainder(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
		int rem = val1 + val2;
		return rem;

	}
	
	@RequestMapping(value = "/rem2", method = RequestMethod.POST)
	public int remainder1(@RequestParam("val1") int val1, @RequestParam("val2") int val2) {
		int rem1 = val1 + val2;
		return rem1;

	}
}
