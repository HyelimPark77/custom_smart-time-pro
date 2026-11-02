package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class DefaultAlarmBell {
    private int index;
    private String name;
    private boolean selected;

    public DefaultAlarmBell() {
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setIndex(int r1) {
        this.index = r1;
    }

    public void setName(String r1) {
        this.name = r1;
    }

    public void setSelected(boolean r1) {
        this.selected = r1;
    }

    public String toString() {
        return "DefaultAlarmBell{name='" + this.name + "', index=" + this.index + ", selected=" + this.selected + i0XO1.IO;
    }

    public DefaultAlarmBell(int r1, String r2, boolean r3) {
        this.name = r2;
        this.index = r1;
        this.selected = r3;
    }
}
