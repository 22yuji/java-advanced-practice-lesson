package app;

public class DartsGameApp extends GameApp{
	
	public DartsGameApp() {
		super();
	}
	
	public DartsGameApp(String item) {
		super("ダーツ");
	}
	
	@Override
	public String play() {
		String str = "10回投げて合計点を競います。";
		return str;
		
	}
}
