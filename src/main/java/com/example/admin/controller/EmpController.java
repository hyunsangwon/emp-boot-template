package com.example.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.admin.dto.EmpDTO;


@Controller
public class EmpController {

    private static final String VIEW_PREFIX = "emp/";

    /** 사원페이지 조회*/
    @GetMapping("/emp")
    public String loadEmpPage(ModelMap model, HttpServletRequest request) throws Exception{
		
    	model.addAttribute("msg","hello world");	
        return VIEW_PREFIX+"emp";
    }

    /** 사원데이터 조회, json으로 return */
    @GetMapping("/emp/list")
    public @ResponseBody List<EmpDTO> callEmpApi() {
        return null;
    }
    
}
