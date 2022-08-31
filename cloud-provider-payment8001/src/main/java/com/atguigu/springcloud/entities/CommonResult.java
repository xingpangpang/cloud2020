package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Description:返回通用前端实体类json封装实体类
 *
 * @Author: XINGXINGZI
 * @date 2022/08/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String massage;
    private T data;
    //传入不含实体类的构造函数
    public CommonResult(Integer code, String massage){
        this(code,massage,null);
    }

}
