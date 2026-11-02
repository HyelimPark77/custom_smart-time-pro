package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ParameterizedTypeImpl implements ParameterizedType {

    @aa1
    private final Type[] args;

    @aa1
    private final Class<?> raw;

    public ParameterizedTypeImpl(@aa1 Class<?> r2, @aa1 Type[] r3) {
        Intrinsics.X0O(r2, "raw");
        Intrinsics.X0O(r3, "args");
        this.raw = r2;
        this.args = r3;
    }

    @Override // java.lang.reflect.ParameterizedType
    @aa1
    public Type[] getActualTypeArguments() {
        return this.args;
    }

    @Override // java.lang.reflect.ParameterizedType
    @tb1
    public Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    @aa1
    public Type getRawType() {
        return this.raw;
    }
}
