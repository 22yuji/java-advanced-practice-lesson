package jp.co.axiz.app;

public class CardGameApp extends GameApp{
	
	public CardGameApp() {
		super();
	}
	
	public CardGameApp(String item) {
		super.setItem(item);
		super.setPlayTime(5);
	}
	
	@Override
	protected String play() {
		String str = "ババ抜きをします。";
		return str;
		
	}

}
