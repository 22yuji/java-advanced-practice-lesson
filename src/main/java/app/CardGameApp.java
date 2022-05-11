package app;

public class CardGameApp extends GameApp{
	
	
	public CardGameApp() {
		super();
	}
	
	public CardGameApp(String name) {
		super(name);
	}
	
	@Override
	public String start(String item) {
		String str = item + "さんと" + this.item + "でゲームを開始します。ババ抜きを行います。";
		return str;
		
	}

}
