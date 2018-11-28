/*
 * title: Event.java
 * copyright:©2018-2020 gackey. All Rights Reserved.
 */

package com.gackey.patterns.delegation;

import java.lang.reflect.Method;

/**
 * Desc: 事件对象的封装类
 * ClassName: Event
 * author: gackey
 * date: 2018-11-28 22:47
 */
class Event {

    // 要执行的方法对象
    private Object object;
    // 要执行的方法名称
    private String methodName;
    // 要执行的方法参数
    private Object[] params;
    // 要执行的方法参数类型
    private Class[] paramTypes;

    public Event() {
    }

    public Event(Object object, String methodName, Object... params) {
        super();
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(this.params);
    }

    // 根据参数数组生成参数类型数组
    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.getMethodName(), this.getParamTypes());
        if (null == method) {
            return;
        }
        method.invoke(object, params);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }

}
