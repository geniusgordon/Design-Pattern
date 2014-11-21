public class RemoteControl {
	Command slot;

	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonPressed() {
		slot.execute();
	}

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		LightOnCommand lightOn = new LightOnCommand(new Light());

		remote.setCommand(lightOn);
		remote.buttonPressed();
	}
}
