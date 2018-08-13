package com.thoughtworks;

public class ClickCounter {
    private Integer clickCount;

    public ClickCounter() {
    }

    public ClickCounter(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }
}
