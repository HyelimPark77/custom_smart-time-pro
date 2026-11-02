package com.sma.smartv3.ui.device.dialpay.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.OOX1XIiOI;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iXiIO0i;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q62;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.goodix.ble.libcomx.util.AccessLock;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountCreateOrder;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.dial.DialPickerPopup;
import com.sma.smartv3.ui.device.dialpay.WatchFaceDialPayDetailActivityKt;
import com.sma.smartv3.ui.me.GoogleWebViewActivity;
import com.sma.smartv3.view.ProgressButtonV2;
import com.szabh.smable3.component.BleConnector;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.device.dialpay.fragment.PayOnlineMoveFragment$initItem$2$1", f = "PayOnlineMoveFragment.kt", i = {}, l = {AccessLock.EVT_LOCK_ACQUIRED}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nPayOnlineMoveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n99#2,7:604\n106#2,3:612\n79#2,7:615\n109#2:622\n99#2,7:623\n106#2,3:631\n79#2,7:634\n109#2:641\n1#3:611\n1#3:630\n*S KotlinDebug\n*F\n+ 1 PayOnlineMoveFragment.kt\ncom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment$initItem$2$1\n*L\n366#1:604,7\n366#1:612,3\n366#1:615,7\n366#1:622\n387#1:623,7\n387#1:631,3\n387#1:634,7\n387#1:641\n366#1:611\n387#1:630\n*E\n"})
public final class PayOnlineMoveFragment$initItem$2$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $dialId;
    final /* synthetic */ WatchFaceCategoryV2 $item;
    final /* synthetic */ int $position;
    final /* synthetic */ ProgressButtonV2 $progressButton;
    int label;
    final /* synthetic */ PayOnlineMoveFragment this$0;

    public static final class OXO1 implements iXiIO0i {
        public final /* synthetic */ WatchFaceCategoryV2 O00;
        public final /* synthetic */ PayOnlineMoveFragment OXO1;
        public final /* synthetic */ int XIi00iiXO;
        public final /* synthetic */ ProgressButtonV2 XO0O10;
        public final /* synthetic */ int iO;

        public OXO1(PayOnlineMoveFragment r1, int r2, int r3, ProgressButtonV2 r4, WatchFaceCategoryV2 r5) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
            this.iO = r3;
            this.XO0O10 = r4;
            this.O00 = r5;
        }

        @Override // com.android.mltcode.paycertificationapi.iXiIO0i
        public void OXO1(int r9) {
            PayOnlineMoveFragment.access$setMCurSyncDialId$p(this.OXO1, this.XIi00iiXO);
            PayOnlineMoveFragment.access$setMCurSyncPosition$p(this.OXO1, this.iO);
            PayOnlineMoveFragment.access$setMCurSyncDevicePosition$p(this.OXO1, r9);
            this.OXO1.setMCurProgressButton(this.XO0O10);
            this.OXO1.setMCurItem(this.O00);
            PayOnlineMoveFragment r2 = this.OXO1;
            int r3 = this.XIi00iiXO;
            int r4 = this.iO;
            ProgressButtonV2 r6 = this.XO0O10;
            Intrinsics.XXI(r6);
            PayOnlineMoveFragment.access$syncDial(r2, r3, r4, r9, r6, this.O00);
        }
    }

    public PayOnlineMoveFragment$initItem$2$1(PayOnlineMoveFragment r1, WatchFaceCategoryV2 r2, int r3, int r4, ProgressButtonV2 r5, Continuation<? super PayOnlineMoveFragment$initItem$2$1> r6) {
        this.this$0 = r1;
        this.$item = r2;
        this.$dialId = r3;
        this.$position = r4;
        this.$progressButton = r5;
        super(2, r6);
    }

    public static /* synthetic */ Unit IiI10X(PayOnlineMoveFragment r0, int r1, int r2, ProgressButtonV2 r3, WatchFaceCategoryV2 r4, BleConnector r5) {
        return invokeSuspend$lambda$1(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ Unit O00(PayOnlineMoveFragment r0, int r1, int r2, ProgressButtonV2 r3, WatchFaceCategoryV2 r4, AccountCreateOrder r5) {
        return invokeSuspend$lambda$0(r0, r1, r2, r3, r4, r5);
    }

    private static final Unit invokeSuspend$lambda$0(PayOnlineMoveFragment r6, int r7, int r8, ProgressButtonV2 r9, WatchFaceCategoryV2 r10, AccountCreateOrder r11) {
        if (r11 == null) goto L5;
        PayOnlineMoveFragment.access$setMCurSyncDialId$p(r6, r7);
        PayOnlineMoveFragment.access$setMCurSyncPosition$p(r6, r8);
        PayOnlineMoveFragment.access$setMCurSyncDevicePosition$p(r6, 0);
        r6.setMCurProgressButton(r9);
        r6.setMCurItem(r10);
        r6.setOrderNum(r11.getOrderNum());
        r6.setNeedPayDialog(true);
        String r12 = OrderManager.iIiiO(OrderManager.OXO1, r6.getOrderNum(), "WatchFace", null, 4, null);
        Bundle r13 = new Bundle();
        r13.putString("mArg0", r12);
        r13.putInt("mArg1", 2);
        r13.putParcelable("mArg2", null);
        r13.putSerializable("mArg3", null);
        Intent r14 = new Intent(r6.getActivity(), GoogleWebViewActivity.class);
        r14.putExtras(r13);
        r6.startActivity(r14);
    L7:
        return Unit.OXO1;
    L5:
        ToastUtils.showLong(r6.getString(R.string.fail_order), new Object[0]);
        goto L7
    }

    private static final Unit invokeSuspend$lambda$1(PayOnlineMoveFragment r10, int r11, int r12, ProgressButtonV2 r13, WatchFaceCategoryV2 r14, BleConnector r15) {
        Activity r16 = PayOnlineMoveFragment.access$getMActivity(r10);
        Intrinsics.X1ii(r16, "null cannot be cast to non-null type com.bestmafen.androidbase.base.BaseActivity");
        ((BaseActivity) r16).disableOrientation();
        if (q62.OXO1.i01() == false) goto L13;
        DialPickerPopup r17 = PayOnlineMoveFragment.access$getDialPickerPopup$p(r10);
        if (r17 != null) goto L7;
    L10:
        PayOnlineMoveFragment.access$setDialPickerPopup$p(r10, new DialPickerPopup(PayOnlineMoveFragment.access$getMActivity(r10), PayOnlineMoveFragment.access$getMDialIds$p(r10), 0, new OXO1(r10, r11, r12, r13, r14)));
        DialPickerPopup r18 = PayOnlineMoveFragment.access$getDialPickerPopup$p(r10);
        if (r18 == null) goto L15;
        RecyclerView r19 = r10.getRecyclerView();
        Intrinsics.O10IXXX0X(r19, "<get-recyclerView>(...)");
        r18.I1XOi1(r19);
    L15:
        return Unit.OXO1;
    L7:
        if (r17.isShowing() != true) goto L10;
        return Unit.OXO1;
    L13:
        PayOnlineMoveFragment.access$setMCurSyncDialId$p(r10, r11);
        PayOnlineMoveFragment.access$setMCurSyncPosition$p(r10, r12);
        PayOnlineMoveFragment.access$setMCurSyncDevicePosition$p(r10, 0);
        r10.setMCurProgressButton(r13);
        r10.setMCurItem(r14);
        Intrinsics.XXI(r13);
        PayOnlineMoveFragment.access$syncDial(r10, r11, r12, 0, r13, r14);
        goto L15
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r8, Continuation<?> r9) {
        return new PayOnlineMoveFragment$initItem$2$1(this.this$0, this.$item, this.$dialId, this.$position, this.$progressButton, r9);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((PayOnlineMoveFragment$initItem$2$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r11) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r11);
    L12:
        if (((Boolean) r11).booleanValue() == true) goto L20;
        if (q62.OXO1.IX0() == false) goto L16;
        new OOX1XIiOI(PayOnlineMoveFragment.access$getMActivity(this.this$0)).IIX1OXO();
    L18:
        return Unit.OXO1;
    L16:
        ToastUtils.showLong(R.string.dial_error_failure_2_2);
        goto L18
    L20:
        if (Intrinsics.XOO0ii0(this.$item.getMemberAttr(), "1") == false) goto L25;
        if (i72.OXO1.Ii() == true) goto L25;
        PayOnlineMoveFragment r12 = this.this$0;
        OrderManager r2 = OrderManager.OXO1;
        String r3 = OrderManager.X11iII1O1(r2, null, r2.iOO1ii1(), 1, null);
        Bundle r4 = new Bundle();
        r4.putString("mArg0", r3);
        r4.putInt("mArg1", 2);
        r4.putParcelable("mArg2", null);
        r4.putSerializable("mArg3", null);
        Intent r5 = new Intent(r12.getActivity(), GoogleWebViewActivity.class);
        r5.putExtras(r4);
        r12.startActivity(r5);
    L40:
        return Unit.OXO1;
    L25:
        if (i72.OXO1.OX() == false) goto L27;
        float r13 = this.$item.getDollar();
    L29:
        if (r13 != 0.0f) goto L32;
    L38:
        final PayOnlineMoveFragment r6 = this.this$0;
        final int r7 = this.$dialId;
        final int r8 = this.$position;
        final ProgressButtonV2 r9 = this.$progressButton;
        final WatchFaceCategoryV2 r10 = this.$item;
        Boxing.OXO1(X0IOiX1O.XIi00iiXO(false, new XIi00iiXO(r6, r7, r8, r9, r10), 1, null));
        goto L40
    L32:
        if (XXiO.XO0O10(this.$item.getPayStatus()) == true) goto L38;
        if (this.$item.getLimitFreeFlag() == true) goto L38;
        if (Intrinsics.XOO0ii0(this.$item.getMemberAttr(), "1") == true) goto L38;
        OrderManager r14 = OrderManager.OXO1;
        String r15 = String.valueOf(this.$item.getId());
        Activity r16 = PayOnlineMoveFragment.access$getMActivity(this.this$0);
        final PayOnlineMoveFragment r17 = this.this$0;
        final int r18 = this.$dialId;
        final int r19 = this.$position;
        final ProgressButtonV2 r20 = this.$progressButton;
        final WatchFaceCategoryV2 r21 = this.$item;
        r14.OXO1("WatchFace", r15, r16, new com.sma.smartv3.ui.device.dialpay.fragment.OXO1(r17, r18, r19, r20, r21));
        goto L40
    L27:
        r13 = this.$item.getAmount();
        goto L29
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r11);
        this.label = 1;
        r11 = WatchFaceDialPayDetailActivityKt.OXO1(this);
        if (r11 != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
