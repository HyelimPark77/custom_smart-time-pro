package com.sma.smartv3.dialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.IXO1X1OIi;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.yb6;
import com.android.mltcode.paycertificationapi.zb6;
import com.sma.smartv3.databinding.DialogUserNoLoginBinding;
import com.sma.smartv3.dialog.base.BaseDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UserNoLoginDialogFragment extends BaseDialogFragment<DialogUserNoLoginBinding> {

    /* JADX INFO: renamed from: com.sma.smartv3.dialog.UserNoLoginDialogFragment$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, DialogUserNoLoginBinding> {
        public static final AnonymousClass1 INSTANCE = null;

        static {
            INSTANCE = new AnonymousClass1();
        }

        public AnonymousClass1() {
            super(3, DialogUserNoLoginBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/DialogUserNoLoginBinding;", 0);
        }

        public final DialogUserNoLoginBinding invoke(LayoutInflater r2, ViewGroup r3, boolean r4) {
            Intrinsics.X0O(r2, "p0");
            return DialogUserNoLoginBinding.inflate(r2, r3, r4);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ DialogUserNoLoginBinding invoke(LayoutInflater r1, ViewGroup r2, Boolean r3) {
            return invoke(r1, r2, r3.booleanValue());
        }
    }

    public UserNoLoginDialogFragment() {
        super(AnonymousClass1.INSTANCE);
    }

    public static /* synthetic */ void XIi00iiXO(UserNoLoginDialogFragment r0, View r1) {
        initListener$lambda$0(r0, r1);
    }

    private static final Unit configureDialog$lambda$0(Dialog r3) {
        Intrinsics.X0O(r3, "$this$setDialogAttr");
        IXO1X1OIi.XOO0ii0(r3, 0.0f, 1, null);
        IXO1X1OIi.I0IIOi(r3);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iO(Dialog r0) {
        return configureDialog$lambda$0(r0);
    }

    private static final void initListener$lambda$0(UserNoLoginDialogFragment r2, View r3) {
        i72 r4 = i72.OXO1;
        FragmentActivity r0 = r2.requireActivity();
        Intrinsics.O10IXXX0X(r0, "requireActivity(...)");
        r4.Oi1I(r0);
        r2.dismiss();
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void configureDialog() {
        super.configureDialog();
        setDialogAttr(new zb6());
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void initListener() {
        super.initListener();
        getBinding().confirmBt.setOnClickListener(new yb6(this));
    }
}
