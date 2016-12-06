package com.mitri.base.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mitrichev on 2016/12/6.
 */
public abstract class BaseService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 复制属性
     *
     * @param source
     * @param targetClass
     * @return
     */
    public Object copyProperties(Object source, Class<?> targetClass) {
        Object target = null;
        if (source != null) {
            try {
                target = targetClass.newInstance();
                BeanUtils.copyProperties(source, target);
            } catch (Exception e) {
                log.error("BaseService 复制model,target出错  [{}{}]", e);
                e.printStackTrace();
                throw new CommonException("BaseService 复制model,target出错 ", e);
            }
        }
        return target;
    }

    /**
     * list列表复制属性
     *
     * @param sourceList
     * @param targetClass
     * @return
     * @throws CommonException
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public List<?> copyListProperties(List<?> sourceList, Class<?> targetClass) throws CommonException {
        List targetList = null;
        try {
            if (sourceList != null) {
                targetList = new ArrayList<>();
            }
            for (Object source : sourceList) {
                Object obj = copyProperties(source, targetClass);
                targetList.add(obj);
            }
        } catch (Exception e) {
            log.error("BaseService 复制model,target出错  [{}{}]", e);
            e.printStackTrace();
            throw new CommonException("BaseService 复制model,target出错 ", e);
        }
        return targetList;
    }
}
