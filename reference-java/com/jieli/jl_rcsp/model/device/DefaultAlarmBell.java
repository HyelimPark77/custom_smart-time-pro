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

    public void setIndex(int i) {
        this.index = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public String toString() {
        return "DefaultAlarmBell{name='" + this.name + "', index=" + this.index + ", selected=" + this.selected + i0XO1.f7442IO;
    }

    public DefaultAlarmBell(int i, String str, boolean z) {
        this.name = str;
        this.index = i;
        this.selected = z;
    }
}
