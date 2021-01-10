package com.bytedance.java.project.Project03.domain;

/**
 * @author yuhang.sun
 * @date 2021/1/10 - 16:06
 * @Description
 */
public class PC implements Equipment {
    private String model;//机器型号
    private String display;//显示器名称

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public PC() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
