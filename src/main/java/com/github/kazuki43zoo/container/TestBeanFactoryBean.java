package com.github.kazuki43zoo.container;

import org.springframework.beans.factory.FactoryBean;

public class TestBeanFactoryBean implements FactoryBean<TestBean> {

    private TestBean testBean = new TestBean();

    public TestBean getObject() {
        return testBean;
    }

    public Class<?> getObjectType() {
        return TestBean.class;
    }

    public boolean isSingleton() {
        return true;
    }

}
