package validatorException;

public class BusinessException extends RuntimeException {

	private ErrorCodeEnum errorCode;


	public BusinessException(String message) {
		super(message);
	}
	
	public BusinessException(ErrorCodeEnum errorCode) {
		super(errorCode.getDescription());
		this.errorCode = errorCode;
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

}
