package hello;

public class GreetingCountNotAlphanumeric extends Greeting {

    private final String content;
    private int notAlphanumeric;

    public GreetingCountNotAlphanumeric(String content, int notAlphanumeric) {
    	super(content);
        this.content = content;
        this.notAlphanumeric = notAlphanumeric;
    }

    public String getContent() {
        return content;
    }

	public int getNotAlphanumeric() {
		return notAlphanumeric;
	}
    

}