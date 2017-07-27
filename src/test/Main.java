package test;

import params.*;
import validatorUtil.Validator;

public class Main {

    public static void main(String[] args) {
        RequestVO vo = new RequestVO();
        System.out.println("前为：=="+vo.toString());
        Validator.validate(vo,RequestVO.class);
    }
}
