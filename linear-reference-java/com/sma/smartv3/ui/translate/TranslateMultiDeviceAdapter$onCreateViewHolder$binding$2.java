package com.sma.smartv3.ui.translate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sma.smartv3.databinding.ItemAuraBinauralRightBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemAuraBinauralRightBinding> {
    public static final TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2 INSTANCE = null;

    static {
        INSTANCE = new TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2();
    }

    public TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2() {
        super(3, ItemAuraBinauralRightBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemAuraBinauralRightBinding;", 0);
    }

    public final ItemAuraBinauralRightBinding invoke(LayoutInflater r2, ViewGroup r3, boolean r4) {
        Intrinsics.X0O(r2, "p0");
        return ItemAuraBinauralRightBinding.inflate(r2, r3, r4);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ ItemAuraBinauralRightBinding invoke(LayoutInflater r1, ViewGroup r2, Boolean r3) {
        return invoke(r1, r2, r3.booleanValue());
    }
}
