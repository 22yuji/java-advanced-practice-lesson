
public class Japanese extends Human {
	public Japanese() {
		super("", "日本語");
	}
	
	public Japanese(String name, String language) {
		super(name, language);
	}
	
	public String returnBirthPlaceInfo() {
        // 出身地用の文字列
        String msg = "出身地:日本";

        // 作成した文字列を返却
        return msg;
    }
}
