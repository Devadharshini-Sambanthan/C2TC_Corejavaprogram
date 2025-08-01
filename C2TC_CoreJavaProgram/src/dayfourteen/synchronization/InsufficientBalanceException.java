package dayfourteen.synchronization;

public class InsufficientBalanceException extends Excception {
	public InsufficientBalanceException() {
		super("Insufficient balance in your account");
	}
	public InsuffientBalanceException(String message) {
		super(message);
	}

}
