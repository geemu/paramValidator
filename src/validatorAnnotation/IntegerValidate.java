package validatorAnnotation;

import java.lang.annotation.*;

/**
 * Copyright (C), 2011-2017 温州贷
 * Author: Chen Fangming
 * Email: chenfangming@91zdan.com
 * Date: 2017/7/26
 * Description: Integer参数的验证
 * History:
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IntegerValidate {

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
     * 最小值  默认Integer.MIN_VALUE
     * @return
     */
    public int minValue() default Integer.MIN_VALUE;

    /**
     * 最大值  默认Integer.MAX_VALUE
     * @return
     */
    public int maxValue() default Integer.MAX_VALUE;

}
