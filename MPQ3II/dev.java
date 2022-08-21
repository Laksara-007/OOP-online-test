package MPQ3II;

public class dev {
	public static void main(String[] args) {
		IDE ide = new IDE();
		Receiver intendedreceiver = new Receiver();

		System.out.println("Pressed save button!");
		SaveAction saveaction = new SaveAction(intendedreceiver);
		ide.SetAction(saveaction);
		ide.executeAction();

		System.out.println("Pressed saveAll button!");
		SaveallAction saveallaction = new SaveallAction(intendedreceiver);
		ide.SetAction(saveallaction);
		ide.executeAction();

	}

}

class Receiver {
	public void Save() {
	}

	public void SaveAll() {
	}
}

class IDE {
	IAction action;

	public void SetAction(IAction action) {
		this.action = action;

	}

	public void executeAction() {
		action.execute();

	}

}

interface IAction {
	public void execute();
}

class SaveAction implements IAction {
	Receiver receiver;

	public SaveAction(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		System.out.println("save file..");

	}

}

class SaveallAction implements IAction {
	Receiver receiver;

	public SaveallAction(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("saving all files..");
	}

}
