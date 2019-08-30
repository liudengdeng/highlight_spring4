package com.summer.chl.fortest;

public class TestBean {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;

    public TestBean(String content) {
        this.content = content;
    }
}
