package com.sma.smartv3.p610ui.translate.sparkchain;

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

    public SparkChainMultiDeviceViewModelFactory(@aa1 LocalSparkChainAsrTranslateUseCase useCase) {
        Intrinsics.X0O(useCase, "useCase");
        this.useCase = useCase;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @aa1
    public /* bridge */ <T extends ViewModel> T create(@aa1 Class<T> cls, @aa1 CreationExtras creationExtras) {
        return (T) super.create(cls, creationExtras);
    }

    @aa1
    public final LocalSparkChainAsrTranslateUseCase getUseCase() {
        return this.useCase;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @aa1
    public /* bridge */ <T extends ViewModel> T create(@aa1 KClass<T> kClass, @aa1 CreationExtras creationExtras) {
        return (T) super.create(kClass, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @aa1
    public <T extends ViewModel> T create(@aa1 Class<T> modelClass) {
        Intrinsics.X0O(modelClass, "modelClass");
        return new SparkChainMultiDeviceViewModel(this.useCase);
    }
}
