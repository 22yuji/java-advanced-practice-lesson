package app;

public class CardGameApp extends GameApp{
	
	public CardGameApp() {
		super();
	}
	
	public CardGameApp(String item) {
		super("トランプ");
	}
	
	@Override
	public String play() {
		String str = "ババ抜きをします。";
		return str;
		
	}

}
