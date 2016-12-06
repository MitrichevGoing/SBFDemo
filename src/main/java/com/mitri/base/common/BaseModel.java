package com.mitri.base.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by mitrichev on 2016/12/6.
 */
// 忽略不需要的属性
@JsonIgnoreProperties(ignoreUnknown = true)
// 为空的值不返回
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Data
public class BaseModel implements Serializable{

    private BasePage page;
    private Integer limit;
    private Integer no;
    private String keywords;

    private Long id;
    private String token;
}
