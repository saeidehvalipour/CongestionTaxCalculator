package com.vcc.congestionTaxCalculator.congestionTaxCalculator.controller;

import com.vcc.congestionTaxCalculator.congestionTaxCalculator.CongestionTaxCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tax")
public class TaxCalculatorApplicationControllor {

    @Autowired
    CongestionTaxCalculator congestionTaxCalculator;


//    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
//    public ResponseEntity<> taxCalculate(
//            required = true) @RequestBody  request) {
//         response;
//        try {
//            int tax = congestionTaxCalculator.getTax(request.getVehicle_type(), request.getDates());
//
//            response = new TaxCalculatorResponse(null, tax,
//                    "Tax calculated successfully, Vehicle :" + request.getVehicle_type().name() + " Amount : " + tax);
//            return new ResponseEntity<TaxCalculatorResponse>(response, HttpStatus.OK);
//        } catch (Exception e) {
//            response = new TaxCalculatorResponse(e.getLocalizedMessage(), 0,
//                    "Tax calculation failed.");
//            return new ResponseEntity<TaxCalculatorResponse>(response, HttpStatus.BAD_REQUEST);
//        }
//    }
}
