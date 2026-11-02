package com.jieli.jl_rcsp.model.device;

import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class AlarmListInfo {
    private List<AlarmBean> alarmBeans;
    private int version;

    public AlarmListInfo(List<AlarmBean> r1) {
        setAlarmBeans(r1);
    }

    public List<AlarmBean> getAlarmBeans() {
        return this.alarmBeans;
    }

    public int getVersion() {
        return this.version;
    }

    public void setAlarmBeans(List<AlarmBean> r1) {
        this.alarmBeans = r1;
    }

    public void setVersion(int r1) {
        this.version = r1;
    }

    public AlarmListInfo(int r1, List<AlarmBean> r2) {
        this.version = r1;
        this.alarmBeans = r2;
    }
}
