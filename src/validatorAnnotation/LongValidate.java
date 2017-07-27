package validatorAnnotation;

import java.lang.annotation.*;

/**
 * Copyright (C), 2011-2017 温州贷
 * Author: Chen Fangming
 * Email: chenfangming@91zdan.com
 * Date: 2017/7/27
 * Description: Long参数的验证
 * History:
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LongValidate {

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
     * 最小值  默认Long.MIN_VALUE
     * @return
     */
    public long minValue() default Long.MIN_VALUE;

    /**
     * 最大值  默认Long.MAX_VALUE
     * @return
     */
    public long maxValue() default Long.MAX_VALUE;

}
