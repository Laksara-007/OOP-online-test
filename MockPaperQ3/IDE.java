package MockPaperQ3;

public class IDE {
	saveMethod saveMethod;
	
	public void setSaveMethod(saveMethod saveMethod) {
		this.saveMethod = saveMethod;
	}
	public void ExecuteAction() {
		saveMethod.save();
	}

}
