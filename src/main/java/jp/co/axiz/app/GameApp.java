package jp.co.axiz.app;

public abstract class GameApp implements App {
	//フィールド
	private String item;
	private int playTime;
	
	//itemアクセサー
	public String getItem() {
		return this.item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	//playTimeアクセサー
	public int getPlayTime() {
		return this.playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	protected abstract String play();
	
	public String start(String name) {
		String str = name + "さんと" + this.item + "でゲームを開始します。" + this.play();
		return str;
		
	}
}
