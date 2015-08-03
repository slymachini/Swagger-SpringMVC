package com.shykhmat.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;


@Api(value="emfstore")
@Controller
@RequestMapping("/emfstore")
public class EMFStoreController {

	@ApiOperation(value = "Returns EMF Store location", httpMethod="GET", response=String.class)
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public String getEMFStoreLocation() {
		return "http://localhost:8080";
	}
}
	