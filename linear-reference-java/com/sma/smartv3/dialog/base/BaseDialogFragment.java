package com.sma.smartv3.dialog.base;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.viewbinding.ViewBinding;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseDialogFragment<VB extends ViewBinding> extends DialogFragment {

    @tb1
    private VB _binding;

    @aa1
    private final Function3<LayoutInflater, ViewGroup, Boolean, VB> inflate;

    @tb1
    private Function0<Unit> onDismissAction;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDialogFragment(@aa1 Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> r2) {
        Intrinsics.X0O(r2, "inflate");
        this.inflate = r2;
    }

    public void configureDialog() {
    }

    @aa1
    public final VB getBinding() {
        VB r0 = this._binding;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("Binding BaseDialogFragment accessed after onDestroyView");
    }

    @tb1
    public final Function0<Unit> getOnDismissAction() {
        return this.onDismissAction;
    }

    public void initData() {
    }

    public void initListener() {
    }

    @Override // androidx.fragment.app.Fragment
    @tb1
    public View onCreateView(@aa1 LayoutInflater r2, @tb1 ViewGroup r3, @tb1 Bundle r4) {
        Intrinsics.X0O(r2, "inflater");
        this._binding = invoke(r2, r3, Boolean.FALSE);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@aa1 DialogInterface r2) {
        Intrinsics.X0O(r2, "dialog");
        super.onDismiss(r2);
        Function0<Unit> r3 = this.onDismissAction;
        if (r3 == null) goto L5;
        r3.invoke();
    L5:
        this.onDismissAction = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        configureDialog();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@aa1 View r2, @tb1 Bundle r3) {
        Intrinsics.X0O(r2, "view");
        super.onViewCreated(r2, r3);
        initListener();
        initData();
    }

    public final void setDialogAttr(@aa1 Function1<? super Dialog, Unit> r2) {
        Intrinsics.X0O(r2, "actions");
        Dialog r0 = getDialog();
        if (r0 == null) goto L6;
        r2.invoke(r0);
        return;
    }

    public final void setOnDismissAction(@tb1 Function0<Unit> r1) {
        this.onDismissAction = r1;
    }
}
