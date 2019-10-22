package hello;

public class GreetingCountNumbersAndLetters extends Greeting {

    private final String content;
    private int lowerLetters;
    private int upperLetters;
    private int numbers;


    public GreetingCountNumbersAndLetters(String content, int lowerLetters, int upperLetters, int numbers) {
    	super(content);
        this.content = content;
        this.lowerLetters = lowerLetters;
        this.upperLetters = upperLetters;
        this.numbers = numbers;
    }

    public String getContent() {
        return content;
    }

	public int getLowerLetters() {
		return lowerLetters;
	}
	
	public int getUpperLetters() {
		return upperLetters;
	}
    
	public int getNumbers() {
		return numbers;
	}

}
