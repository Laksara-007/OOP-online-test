package MockPaperQ3;

public class dev {

	public static void main(String[] args) {
		IDE ide = new IDE();
		save save = new save();
		saveAll saveAll = new saveAll();
		
		ide.setSaveMethod(save);
		System.out.println("save button pressed..");
		ide.ExecuteAction();

		ide.setSaveMethod(saveAll);
		System.out.println("saveAll button pressed..");
		ide.ExecuteAction();
			 
	}

}
