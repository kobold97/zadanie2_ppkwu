package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private int upperCase;
    private int lowerCase;
    private int numbers;
    private int notAlphaNumber;
    private String content;

    @RequestMapping("/reverse")
    public Object greeting(@RequestParam(value="name", defaultValue="World") String name,
    						 @RequestParam(value="parameter", defaultValue="default") String parameter) {
    	
    	content = name;
    	upperCase = 0;
    	lowerCase = 0;
    	numbers = 0;
    	notAlphaNumber = 0;
    	
    	for (int i = 0, len = name.length(); i < len; i++) {
    		if(!Character.isLetterOrDigit(name.charAt(i))) {
    			notAlphaNumber++;
    		}
    	}
    	
    	for (int i = 0, len = name.length(); i < len; i++) {
    	    if (Character.isDigit(name.charAt(i))) {
    	        numbers++;
    	    }
    	}
    	
    	for (int k = 0; k < name.length(); k++) {

    	    if (Character.isUpperCase(name.charAt(k))) upperCase++;
    	    if (Character.isLowerCase(name.charAt(k))) lowerCase++;
    	}
    	
    	if(parameter.equalsIgnoreCase("uppercase")) {
        return new GreetingCountCapitalLetters(name, upperCase);
    	} else if(parameter.equalsIgnoreCase("lowercase")) {
            return new GreetingCountLowerLetters(name, lowerCase);
        } else if(parameter.equalsIgnoreCase("both")) {
        	return new GreetingCountBoth(name, lowerCase, upperCase);
        } else if(parameter.equalsIgnoreCase("numbers")) {
        	return new GreetingCountNumbers(name, numbers);
        } else if (parameter.equalsIgnoreCase("numbersandletters")) {
        	return new GreetingCountNumbersAndLetters(name, lowerCase, upperCase, numbers);
        } else if (parameter.equalsIgnoreCase("notalphanumeric")) {
        	return new GreetingCountNotAlphanumeric(name, notAlphaNumber);
        }
    	else return new GreetingCountEverything(name, upperCase, lowerCase, numbers, notAlphaNumber);
    }
}
