package com.sma.smartv3.ui.translate.sparkchain;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public final class SparkChainMultiDeviceViewModelFactory implements ViewModelProvider.Factory {

    @aa1
    private final LocalSparkChainAsrTranslateUseCase useCase;

    public SparkChainMultiDeviceViewModelFactory(@aa1 LocalSparkChainAsrTranslateUseCase r2) {
        Intrinsics.X0O(r2, "useCase");
        this.useCase = r2;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @aa1
    public /* bridge */ <T extends ViewModel> T create(@aa1 Class<T> r1, @aa1 CreationExtras r2) {
        return (T) super.create(r1, r2);
    }

    @aa1
    public final LocalSparkChainAsrTranslateUseCase getUseCase() {
        return this.useCase;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @aa1
    public /* bridge */ <T extends ViewModel> T create(@aa1 KClass<T> r1, @aa1 CreationExtras r2) {
        return (T) super.create(r1, r2);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @aa1
    public <T extends ViewModel> T create(@aa1 Class<T> r2) {
        Intrinsics.X0O(r2, "modelClass");
        return new SparkChainMultiDeviceViewModel(this.useCase);
    }
}
