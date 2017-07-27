package validatorException;


public enum ErrorCodeEnum {
	// 公共的错误信息
	COMMON_NOT_SUPPORT_REQUEST_SOURCE("不支持的请求来源", 1000),;


	private String description;

	private Integer code;

	private ErrorCodeEnum(String description,Integer code) {
		this.description=description;
		this.code=code;
	}

	public String getDescription() {
		return description;
	}

	public Integer getCode() {
		return code;
	}

}
