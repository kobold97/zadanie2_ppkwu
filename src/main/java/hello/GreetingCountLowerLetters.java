package hello;

public class GreetingCountLowerLetters extends Greeting {

    private final String content;
    private int lowerLetters;

    public GreetingCountLowerLetters(String content, int lowerLetters) {
    	super(content);
        this.content = content;
        this.lowerLetters = lowerLetters;
    }

    public String getContent() {
        return content;
    }

	public int getLowerLetters() {
		return lowerLetters;
	}
    

}