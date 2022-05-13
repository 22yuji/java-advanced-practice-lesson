package jp.co.axiz.app;

public class DartsGameApp extends GameApp{
	
	public DartsGameApp() {
		super();
	}
	
	public DartsGameApp(String item) {
		super.setItem(item);
		super.setPlayTime(10);
	}
	
	@Override
	protected String play() {
		String str = "10回投げて合計点を競います。";
		return str;
		
	}
}
