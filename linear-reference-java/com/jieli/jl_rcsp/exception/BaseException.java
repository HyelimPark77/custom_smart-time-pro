package com.jieli.jl_rcsp.exception;

/* JADX INFO: loaded from: classes17.dex */
abstract class BaseException extends Exception {
    public BaseException() {
    }

    public abstract int getErrorCode();

    public BaseException(String r1) {
        super(r1);
    }
}
