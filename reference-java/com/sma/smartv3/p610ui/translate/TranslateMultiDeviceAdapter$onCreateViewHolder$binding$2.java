package com.sma.smartv3.p610ui.translate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.sma.smartv3.databinding.ItemAuraBinauralRightBinding;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, ItemAuraBinauralRightBinding> {
    public static final TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2 INSTANCE = new TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2();

    public TranslateMultiDeviceAdapter$onCreateViewHolder$binding$2() {
        super(3, ItemAuraBinauralRightBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/ItemAuraBinauralRightBinding;", 0);
    }

    public final ItemAuraBinauralRightBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.X0O(p0, "p0");
        return ItemAuraBinauralRightBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ ItemAuraBinauralRightBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
