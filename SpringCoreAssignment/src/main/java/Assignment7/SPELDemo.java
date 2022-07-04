package Assignment7;

import java.beans.Expression;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SPELDemo {
    public static void main(String[] args) {

        /**
         * SpEL is an exression language supporting the features of querying and manipulating an object graph at runtime.
         */
        ExpressionParser parser = new SpelExpressionParser();

        org.springframework.expression.Expression exp = parser.parseExpression("'Hello SPEL'");
        String msg = (String)exp.getValue();
        System.out.println(msg);


        ExpressionParser parser1 = new SpelExpressionParser();
        org.springframework.expression.Expression exp1 = parser1.parseExpression("'Welcome SPEL'.concat('!')");
        String message = (String) exp1.getValue();
        System.out.println(message);
    }
}
