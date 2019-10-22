package hello;

public class GreetingCountNumbers extends Greeting {

    private final String content;
    private int numbers;

    public GreetingCountNumbers(String content, int numbers) {
    	super(content);
        this.content = content;
        this.numbers = numbers;
    }

    public String getContent() {
        return content;
    }

	public int getNumbers() {
		return numbers;
	}
    

}