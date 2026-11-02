package com.sma.smartv3.p610ui.translate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sma.smartv3.databinding.ItemAuraBinauralLeftBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemAuraBinauralLeftBinding> {
    public static final TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1 INSTANCE = new TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1();

    public TranslateMultiDeviceAdapter$onCreateViewHolder$binding$1() {
        super(3, ItemAuraBinauralLeftBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemAuraBinauralLeftBinding;", 0);
    }

    public final ItemAuraBinauralLeftBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.X0O(p0, "p0");
        return ItemAuraBinauralLeftBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ ItemAuraBinauralLeftBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
