package validatorAnnotation;

import java.lang.annotation.*;

/**
 * Copyright (C), 2011-2017 温州贷
 * Author: Chen Fangming
 * Email: chenfangming@91zdan.com
 * Date: 2017/7/27
 * Description: String参数的验证
 * History:
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StringValidate {

    /**
     * 是否必传  默认true
     * @return
     */
    public boolean required() default true;

    /**
     * 成员名称 默认""
     * @return
     */
    public String fieldName() default "";

    /**
     * 最小长度  默认-1
     * @return
     */
    public int minLength() default -1;

    /**
     * 最大长度  默认-1
     * @return
     */
    public int maxLength() default -1;

}
