package com.moxi.mougblog.base.validator.constraint;

import com.moxi.mougblog.base.validator.annotion.BooleanNotNULL;
import com.moxi.mougblog.base.validator.annotion.IntegerNotNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author 陌溪
 * @date 2019年12月4日13:16:06
 */
public class BooleanValidator implements ConstraintValidator<BooleanNotNULL, Boolean> {

    @Override
    public void initialize(BooleanNotNULL constraintAnnotation) {

    }

    @Override
    public boolean isValid(Boolean value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        return true;
    }
}
