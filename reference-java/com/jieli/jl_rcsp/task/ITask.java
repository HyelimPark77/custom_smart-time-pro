package com.jieli.jl_rcsp.task;

/* JADX INFO: loaded from: classes17.dex */
public interface ITask {
    void cancel(byte b);

    boolean isRun();

    void setListener(TaskListener taskListener);

    void start();
}
