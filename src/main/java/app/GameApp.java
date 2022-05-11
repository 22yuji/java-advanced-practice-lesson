package app;

public class GameApp {
	public String item;
	
	public GameApp() {
		this.item = "何か";
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	public String start(String item) {
		String str = item + "さんと" + this.item + "でゲームを開始します";
		return str;
		
	}
}
