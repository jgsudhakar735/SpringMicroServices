/**
 * 
 */
package com.jgsudhakar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sudhakar Tangellapalli
 */
@RestController
public class RestfulController {

	@RequestMapping(value="/test")
    public String auditLog(@RequestParam(value="fromAcc") String fromAcc,@RequestParam(name="toAcc") String toAcc,@RequestParam(name="txnAmt")String txnAmt,@RequestParam(name="remarks") String remarks) {
        String response = "";
        System.out.println("<<<<<<<<<<<<<Auditing the Log in to DB>>>>>>>>>>>>"+remarks);
        response = "AUDIT LOGGED";
        return response;
    }
	
}
