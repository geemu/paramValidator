package params;

import validatorAnnotation.IntegerValidate;
import validatorAnnotation.LongValidate;
import validatorAnnotation.StringValidate;

/**
 * Copyright (C), 2011-2017 温州贷
 * Author: Chen Fangming
 * Email: chenfangming@91zdan.com
 * Date: 2017/7/26
 * Description:
 * History:
 */
public class RequestVO {


   // @StringValidate(required = true,fieldName = "这是a",minLength = 1)
    private String a  = "   dadadasd";
    @StringValidate(required = true,fieldName = "用户id",maxLength = 100000)
    private String b  = "haoren                ";
   // @StringValidate(required = true,fieldName = "这是c")
    private String c = "dadadas";

  //  @StringValidate(required = false,fieldName = "这是f",maxLength = 1)
    private String f = "   fsfddsf    " ;

   // @StringValidate(required = false,fieldName = "这是g")
    private String g = "121fafafaf2";


    public RequestVO() {
    }

    public RequestVO(String a, String b, String c, String d, String e, String f, String g, Integer h) {
        this.a = a;
        this.b = b;
        this.c = c;

        this.f = f;
        this.g = g;

    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }



    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }


}
