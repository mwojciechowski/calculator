package pl.mw.calculator.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mw.calculator.model.History;
import pl.mw.calculator.model.HistoryElement;
import pl.mw.calculator.model.Result;
import pl.mw.calculator.service.CalculatorService;
import pl.mw.calculator.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CalculatorController {
    @Autowired
    CalculatorService service;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/calculate/{expression}", produces = "application/json")
    public Result calculate(@PathVariable(name = "expression") String expression) {
        userService.saveExpression(expression);
        return new Result(service.calculateExpression(expression), "OK");
    }

    @RequestMapping("/history")
    public History history() {
        List<HistoryElement> expressions = userService.getExpressions().stream()
                .map(HistoryElement::new).collect(Collectors.toList());
        return new History(expressions);
    }

}
