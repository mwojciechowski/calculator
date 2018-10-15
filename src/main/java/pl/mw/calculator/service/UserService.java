package pl.mw.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.LinkedList;
import java.util.List;

@Service
@SessionScope
public class UserService {

    List<String> expressions = new LinkedList<String>();

    public void saveExpression(String expression) {
        expressions.add(expression);
    }

    public List<String> getExpressions() {
        return expressions;
    }
}
