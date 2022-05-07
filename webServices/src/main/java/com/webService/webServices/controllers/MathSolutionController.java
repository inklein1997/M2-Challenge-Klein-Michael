package com.webService.webServices.controllers;

import com.webService.webServices.models.MathSolution;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MathSolutionController {

    @PostMapping("/add")
    public MathSolution addInts(@Valid @RequestBody MathSolution operands) {
        MathSolution mathSolution = new MathSolution(
                operands.getOperand1(),
                operands.getOperand2(),
                "add",
                operands.getOperand1() + operands.getOperand2()
        );
        return mathSolution;
    }

    @PostMapping("/subtract")
    public MathSolution subtractInts(@Valid @RequestBody MathSolution operands) {
        MathSolution mathSolution = new MathSolution(
                operands.getOperand1(),
                operands.getOperand2(),
                "subtract",
                operands.getOperand1() - operands.getOperand2()
        );
        return mathSolution;
    }

    @PostMapping("/multiply")
    public MathSolution multiplyInts(@Valid @RequestBody MathSolution operands) {
        MathSolution mathSolution = new MathSolution(
                operands.getOperand1(),
                operands.getOperand2(),
                "multiply",
                operands.getOperand1() - operands.getOperand2()
        );
        return mathSolution;
    }

    @PostMapping("/divide")
    public MathSolution divideInts(@Valid @RequestBody MathSolution operands) {
        MathSolution mathSolution = new MathSolution(
                operands.getOperand1(),
                operands.getOperand2(),
                "divide",
                operands.getOperand1() - operands.getOperand2()
        );
        return mathSolution;
    }
}
