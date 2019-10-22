package hello;

public class GreetingCountBoth extends Greeting {

    private final String content;
    private int lowerLetters;
    private int upperLetters;


    public GreetingCountBoth(String content, int lowerLetters, int upperLetters) {
    	super(content);
        this.content = content;
        this.lowerLetters = lowerLetters;
        this.upperLetters = upperLetters;
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
    

}
