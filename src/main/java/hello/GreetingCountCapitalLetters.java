package hello;

public class GreetingCountCapitalLetters extends Greeting {

    private final String content;
    private int capitalLetters;

    public GreetingCountCapitalLetters(String content, int capitalLetters) {
    	super(content);
        this.content = content;
        this.capitalLetters = capitalLetters;
    }

    public String getContent() {
        return content;
    }

	public int getCapitalLetters() {
		return capitalLetters;
	}
    

}
