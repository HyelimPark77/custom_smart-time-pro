package com.sma.smartv3.dialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.mltcode.paycertificationapi.IXO1X1OIi;
import com.sma.smartv3.databinding.DialogGiftTranslationTimeBinding;
import com.sma.smartv3.dialog.GiftTranslationDialogFragment;
import com.sma.smartv3.dialog.base.BaseDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GiftTranslationDialogFragment extends BaseDialogFragment<DialogGiftTranslationTimeBinding> {
    private int freeTime;

    /* JADX INFO: renamed from: com.sma.smartv3.dialog.GiftTranslationDialogFragment$1 */
    public static final /* synthetic */ class C185751 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, DialogGiftTranslationTimeBinding> {
        public static final C185751 INSTANCE = new C185751();

        public C185751() {
            super(3, DialogGiftTranslationTimeBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/DialogGiftTranslationTimeBinding;", 0);
        }

        public final DialogGiftTranslationTimeBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
            Intrinsics.X0O(p0, "p0");
            return DialogGiftTranslationTimeBinding.inflate(p0, viewGroup, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ DialogGiftTranslationTimeBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return invoke(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public GiftTranslationDialogFragment() {
        super(C185751.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureDialog$lambda$0(Dialog setDialogAttr) {
        Intrinsics.X0O(setDialogAttr, "$this$setDialogAttr");
        IXO1X1OIi.I0IIOi(setDialogAttr);
        setDialogAttr.setCancelable(true);
        IXO1X1OIi.OIi0(setDialogAttr);
        IXO1X1OIi.OXO1(setDialogAttr);
        return Unit.OXO1;
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void configureDialog() {
        setDialogAttr(new Function1() { // from class: com.android.mltcode.paycertificationapi.O1OOOX
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GiftTranslationDialogFragment.configureDialog$lambda$0((Dialog) obj);
            }
        });
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void initData() {
        super.initData();
        getBinding().freeTimeValueTv.setText(String.valueOf(this.freeTime));
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void initListener() {
        getBinding().giftTranslationConfirmRl.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.OO1i0I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3201IO.dismiss();
            }
        });
    }

    public final void setFreeTime(float f) {
        this.freeTime = (int) f;
    }
}
