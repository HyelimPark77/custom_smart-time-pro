package com.sma.smartv3.dialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.IXO1X1OIi;
import com.android.mltcode.paycertificationapi.i72;
import com.sma.smartv3.databinding.DialogUserNoLoginBinding;
import com.sma.smartv3.dialog.UserNoLoginDialogFragment;
import com.sma.smartv3.dialog.base.BaseDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UserNoLoginDialogFragment extends BaseDialogFragment<DialogUserNoLoginBinding> {

    /* JADX INFO: renamed from: com.sma.smartv3.dialog.UserNoLoginDialogFragment$1 */
    public static final /* synthetic */ class C185761 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, DialogUserNoLoginBinding> {
        public static final C185761 INSTANCE = new C185761();

        public C185761() {
            super(3, DialogUserNoLoginBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/DialogUserNoLoginBinding;", 0);
        }

        public final DialogUserNoLoginBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
            Intrinsics.X0O(p0, "p0");
            return DialogUserNoLoginBinding.inflate(p0, viewGroup, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ DialogUserNoLoginBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public UserNoLoginDialogFragment() {
        super(C185761.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureDialog$lambda$0(Dialog setDialogAttr) {
        Intrinsics.X0O(setDialogAttr, "$this$setDialogAttr");
        IXO1X1OIi.XOO0ii0(setDialogAttr, 0.0f, 1, null);
        IXO1X1OIi.I0IIOi(setDialogAttr);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$0(UserNoLoginDialogFragment userNoLoginDialogFragment, View view) {
        i72 i72Var = i72.OXO1;
        FragmentActivity fragmentActivityRequireActivity = userNoLoginDialogFragment.requireActivity();
        Intrinsics.O10IXXX0X(fragmentActivityRequireActivity, "requireActivity(...)");
        i72Var.Oi1I(fragmentActivityRequireActivity);
        userNoLoginDialogFragment.dismiss();
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void configureDialog() {
        super.configureDialog();
        setDialogAttr(new Function1() { // from class: com.android.mltcode.paycertificationapi.zb6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return UserNoLoginDialogFragment.configureDialog$lambda$0((Dialog) obj);
            }
        });
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void initListener() {
        super.initListener();
        getBinding().confirmBt.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.yb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserNoLoginDialogFragment.initListener$lambda$0(this.f12347IO, view);
            }
        });
    }
}
