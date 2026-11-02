package com.sma.smartv3.ui.translate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sma.smartv3.databinding.ItemAuraBinauralLeftBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemAuraBinauralLeftBinding> {
    public static final TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1 INSTANCE = null;

    static {
        INSTANCE = new TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1();
    }

    public TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1() {
        super(3, ItemAuraBinauralLeftBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;", 0);
    }

    public final ItemAuraBinauralLeftBinding invoke(LayoutInflater r2, ViewGroup r3, boolean r4) {
        Intrinsics.X0O(r2, "p0");
        return ItemAuraBinauralLeftBinding.inflate(r2, r3, r4);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ ItemAuraBinauralLeftBinding invoke(LayoutInflater r1, ViewGroup r2, Boolean r3) {
        return invoke(r1, r2, r3.booleanValue());
    }
}
