package cn.taroco.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 说明：业务异常
 *
 * @author zhangwei
 * @version 2017/11/21 15:57.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends BaseException {

    private static final long serialVersionUID = 3076984003548588117L;

    private IError error = DefaultError.BUSINESS_ERROR;

    private String extMessage;

    public BusinessException(String message) {
        super(message);
        this.error.setErrorMessage(message);
    }

    public BusinessException(String message, String extMessage) {
        super(message + ":" + extMessage);
        this.error.setErrorMessage(message);
        this.extMessage = extMessage;
    }
}
