package hello;

public class GreetingCountEverything extends Greeting {

    private final String content;
    private int lowerLetters;
    private int upperLetters;
    private int numbers;
    private int notAlphanumeric;

    public GreetingCountEverything(String content, int upperLetters, int lowerLetters, int numbers, int notAlphanumeric) {
    	super(content);
        this.content = content;
        this.lowerLetters = lowerLetters;
        this.upperLetters = upperLetters;
        this.numbers = numbers;
        this.notAlphanumeric = notAlphanumeric;
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
	
	public int getNotAlphanumeric() {
		return notAlphanumeric;
	}

}
