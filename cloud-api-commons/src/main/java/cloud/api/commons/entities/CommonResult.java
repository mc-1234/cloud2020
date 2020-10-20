package cloud.api.commons.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T      data;


    //自定义有参构造器
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
