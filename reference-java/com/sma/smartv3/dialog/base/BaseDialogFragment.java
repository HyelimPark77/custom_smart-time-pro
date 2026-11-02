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
    public BaseDialogFragment(@aa1 Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends VB> inflate) {
        Intrinsics.X0O(inflate, "inflate");
        this.inflate = inflate;
    }

    public void configureDialog() {
    }

    @aa1
    public final VB getBinding() {
        VB vb = this._binding;
        if (vb != null) {
            return vb;
        }
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
    public View onCreateView(@aa1 LayoutInflater inflater, @tb1 ViewGroup viewGroup, @tb1 Bundle bundle) {
        Intrinsics.X0O(inflater, "inflater");
        this._binding = this.inflate.invoke(inflater, viewGroup, Boolean.FALSE);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@aa1 DialogInterface dialog) {
        Intrinsics.X0O(dialog, "dialog");
        super.onDismiss(dialog);
        Function0<Unit> function0 = this.onDismissAction;
        if (function0 != null) {
            function0.invoke2();
        }
        this.onDismissAction = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        configureDialog();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@aa1 View view, @tb1 Bundle bundle) {
        Intrinsics.X0O(view, "view");
        super.onViewCreated(view, bundle);
        initListener();
        initData();
    }

    public final void setDialogAttr(@aa1 Function1<? super Dialog, Unit> actions) {
        Intrinsics.X0O(actions, "actions");
        Dialog dialog = getDialog();
        if (dialog != null) {
            actions.invoke2(dialog);
        }
    }

    public final void setOnDismissAction(@tb1 Function0<Unit> function0) {
        this.onDismissAction = function0;
    }
}
