package com.jieli.jl_rcsp.task;

/* JADX INFO: loaded from: classes17.dex */
public interface ITask {
    void cancel(byte r1);

    boolean isRun();

    void setListener(TaskListener r1);

    void start();
}
