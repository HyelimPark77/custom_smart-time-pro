package com.sma.smartv3.dialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.mltcode.paycertificationapi.IXO1X1OIi;
import com.android.mltcode.paycertificationapi.O1OOOX;
import com.android.mltcode.paycertificationapi.OO1i0I;
import com.sma.smartv3.databinding.DialogGiftTranslationTimeBinding;
import com.sma.smartv3.dialog.base.BaseDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class GiftTranslationDialogFragment extends BaseDialogFragment<DialogGiftTranslationTimeBinding> {
    private int freeTime;

    /* JADX INFO: renamed from: com.sma.smartv3.dialog.GiftTranslationDialogFragment$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, DialogGiftTranslationTimeBinding> {
        public static final AnonymousClass1 INSTANCE = null;

        static {
            INSTANCE = new AnonymousClass1();
        }

        public AnonymousClass1() {
            super(3, DialogGiftTranslationTimeBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sma/smartv3/databinding/DialogGiftTranslationTimeBinding;", 0);
        }

        public final DialogGiftTranslationTimeBinding invoke(LayoutInflater r2, ViewGroup r3, boolean r4) {
            Intrinsics.X0O(r2, "p0");
            return DialogGiftTranslationTimeBinding.inflate(r2, r3, r4);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ DialogGiftTranslationTimeBinding invoke(LayoutInflater r1, ViewGroup r2, Boolean r3) {
            return invoke(r1, r2, r3.booleanValue());
        }
    }

    public GiftTranslationDialogFragment() {
        super(AnonymousClass1.INSTANCE);
    }

    public static /* synthetic */ void XIi00iiXO(GiftTranslationDialogFragment r0, View r1) {
        initListener$lambda$0(r0, r1);
    }

    private static final Unit configureDialog$lambda$0(Dialog r1) {
        Intrinsics.X0O(r1, "$this$setDialogAttr");
        IXO1X1OIi.I0IIOi(r1);
        r1.setCancelable(true);
        IXO1X1OIi.OIi0(r1);
        IXO1X1OIi.OXO1(r1);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iO(Dialog r0) {
        return configureDialog$lambda$0(r0);
    }

    private static final void initListener$lambda$0(GiftTranslationDialogFragment r0, View r1) {
        r0.dismiss();
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void configureDialog() {
        setDialogAttr(new O1OOOX());
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void initData() {
        super.initData();
        getBinding().freeTimeValueTv.setText(String.valueOf(this.freeTime));
    }

    @Override // com.sma.smartv3.dialog.base.BaseDialogFragment
    public void initListener() {
        getBinding().giftTranslationConfirmRl.setOnClickListener(new OO1i0I(this));
    }

    public final void setFreeTime(float r1) {
        this.freeTime = (int) r1;
    }
}
