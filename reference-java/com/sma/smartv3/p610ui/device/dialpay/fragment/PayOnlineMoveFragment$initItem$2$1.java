package com.sma.smartv3.p610ui.device.dialpay.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.OOX1XIiOI;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.XXiO;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iXiIO0i;
import com.android.mltcode.paycertificationapi.q62;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.goodix.ble.libcomx.util.AccessLock;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AccountCreateOrder;
import com.sma.smartv3.model.WatchFaceCategoryV2;
import com.sma.smartv3.p610ui.device.dial.DialPickerPopup;
import com.sma.smartv3.p610ui.device.dialpay.WatchFaceDialPayDetailActivityKt;
import com.sma.smartv3.p610ui.p612me.GoogleWebViewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButtonV2;
import com.szabh.smable3.component.BleConnector;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.device.dialpay.fragment.PayOnlineMoveFragment$initItem$2$1", m39466f = "PayOnlineMoveFragment.kt", m39467i = {}, m39468l = {AccessLock.EVT_LOCK_ACQUIRED}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
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

        /* JADX INFO: renamed from: iO */
        public final /* synthetic */ int f54561iO;

        public OXO1(PayOnlineMoveFragment payOnlineMoveFragment, int i, int i2, ProgressButtonV2 progressButtonV2, WatchFaceCategoryV2 watchFaceCategoryV2) {
            this.OXO1 = payOnlineMoveFragment;
            this.XIi00iiXO = i;
            this.f54561iO = i2;
            this.XO0O10 = progressButtonV2;
            this.O00 = watchFaceCategoryV2;
        }

        @Override // com.android.mltcode.paycertificationapi.iXiIO0i
        public void OXO1(int i) throws Throwable {
            this.OXO1.mCurSyncDialId = this.XIi00iiXO;
            this.OXO1.mCurSyncPosition = this.f54561iO;
            this.OXO1.mCurSyncDevicePosition = i;
            this.OXO1.setMCurProgressButton(this.XO0O10);
            this.OXO1.setMCurItem(this.O00);
            PayOnlineMoveFragment payOnlineMoveFragment = this.OXO1;
            int i2 = this.XIi00iiXO;
            int i3 = this.f54561iO;
            ProgressButtonV2 progressButtonV2 = this.XO0O10;
            Intrinsics.XXI(progressButtonV2);
            payOnlineMoveFragment.syncDial(i2, i3, i, progressButtonV2, this.O00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayOnlineMoveFragment$initItem$2$1(PayOnlineMoveFragment payOnlineMoveFragment, WatchFaceCategoryV2 watchFaceCategoryV2, int i, int i2, ProgressButtonV2 progressButtonV2, Continuation<? super PayOnlineMoveFragment$initItem$2$1> continuation) {
        super(2, continuation);
        this.this$0 = payOnlineMoveFragment;
        this.$item = watchFaceCategoryV2;
        this.$dialId = i;
        this.$position = i2;
        this.$progressButton = progressButtonV2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(PayOnlineMoveFragment payOnlineMoveFragment, int i, int i2, ProgressButtonV2 progressButtonV2, WatchFaceCategoryV2 watchFaceCategoryV2, AccountCreateOrder accountCreateOrder) {
        if (accountCreateOrder != null) {
            payOnlineMoveFragment.mCurSyncDialId = i;
            payOnlineMoveFragment.mCurSyncPosition = i2;
            payOnlineMoveFragment.mCurSyncDevicePosition = 0;
            payOnlineMoveFragment.setMCurProgressButton(progressButtonV2);
            payOnlineMoveFragment.setMCurItem(watchFaceCategoryV2);
            payOnlineMoveFragment.setOrderNum(accountCreateOrder.getOrderNum());
            payOnlineMoveFragment.setNeedPayDialog(true);
            String strIIiiO = OrderManager.iIiiO(OrderManager.OXO1, payOnlineMoveFragment.getOrderNum(), "WatchFace", null, 4, null);
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", strIIiiO);
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(payOnlineMoveFragment.getActivity(), (Class<?>) GoogleWebViewActivity.class);
            intent.putExtras(bundle);
            payOnlineMoveFragment.startActivity(intent);
        } else {
            ToastUtils.showLong(payOnlineMoveFragment.getString(R.string.fail_order), new Object[0]);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(PayOnlineMoveFragment payOnlineMoveFragment, int i, int i2, ProgressButtonV2 progressButtonV2, WatchFaceCategoryV2 watchFaceCategoryV2, BleConnector bleConnector) throws Throwable {
        Activity mActivity = payOnlineMoveFragment.getMActivity();
        Intrinsics.X1ii(mActivity, "null cannot be cast to non-null type com.bestmafen.androidbase.base.BaseActivity");
        ((BaseActivity) mActivity).disableOrientation();
        if (q62.OXO1.i01()) {
            DialPickerPopup dialPickerPopup = payOnlineMoveFragment.dialPickerPopup;
            if (dialPickerPopup != null && dialPickerPopup.isShowing()) {
                return Unit.OXO1;
            }
            payOnlineMoveFragment.dialPickerPopup = new DialPickerPopup(payOnlineMoveFragment.getMActivity(), payOnlineMoveFragment.mDialIds, 0, new OXO1(payOnlineMoveFragment, i, i2, progressButtonV2, watchFaceCategoryV2));
            DialPickerPopup dialPickerPopup2 = payOnlineMoveFragment.dialPickerPopup;
            if (dialPickerPopup2 != null) {
                RecyclerView recyclerView = payOnlineMoveFragment.getRecyclerView();
                Intrinsics.O10IXXX0X(recyclerView, "<get-recyclerView>(...)");
                dialPickerPopup2.I1XOi1(recyclerView);
            }
        } else {
            payOnlineMoveFragment.mCurSyncDialId = i;
            payOnlineMoveFragment.mCurSyncPosition = i2;
            payOnlineMoveFragment.mCurSyncDevicePosition = 0;
            payOnlineMoveFragment.setMCurProgressButton(progressButtonV2);
            payOnlineMoveFragment.setMCurItem(watchFaceCategoryV2);
            Intrinsics.XXI(progressButtonV2);
            payOnlineMoveFragment.syncDial(i, i2, 0, progressButtonV2, watchFaceCategoryV2);
        }
        return Unit.OXO1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayOnlineMoveFragment$initItem$2$1(this.this$0, this.$item, this.$dialId, this.$position, this.$progressButton, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((PayOnlineMoveFragment$initItem$2$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            this.label = 1;
            obj = WatchFaceDialPayDetailActivityKt.OXO1(this);
            if (obj == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            if (q62.OXO1.IX0()) {
                new OOX1XIiOI(this.this$0.getMActivity()).IIX1OXO();
            } else {
                ToastUtils.showLong(R.string.dial_error_failure_2_2);
            }
            return Unit.OXO1;
        }
        if (!Intrinsics.XOO0ii0(this.$item.getMemberAttr(), "1") || i72.OXO1.m2044Ii()) {
            if ((i72.OXO1.m2049OX() ? this.$item.getDollar() : this.$item.getAmount()) == 0.0f || XXiO.XO0O10(this.$item.getPayStatus()) || this.$item.getLimitFreeFlag() || Intrinsics.XOO0ii0(this.$item.getMemberAttr(), "1")) {
                final PayOnlineMoveFragment payOnlineMoveFragment = this.this$0;
                final int i2 = this.$dialId;
                final int i3 = this.$position;
                final ProgressButtonV2 progressButtonV2 = this.$progressButton;
                final WatchFaceCategoryV2 watchFaceCategoryV2 = this.$item;
                Boxing.OXO1(X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.sma.smartv3.ui.device.dialpay.fragment.XIi00iiXO
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PayOnlineMoveFragment$initItem$2$1.invokeSuspend$lambda$1(payOnlineMoveFragment, i2, i3, progressButtonV2, watchFaceCategoryV2, (BleConnector) obj2);
                    }
                }, 1, null));
            } else {
                OrderManager orderManager = OrderManager.OXO1;
                String strValueOf = String.valueOf(this.$item.getId());
                Activity mActivity = this.this$0.getMActivity();
                final PayOnlineMoveFragment payOnlineMoveFragment2 = this.this$0;
                final int i4 = this.$dialId;
                final int i5 = this.$position;
                final ProgressButtonV2 progressButtonV3 = this.$progressButton;
                final WatchFaceCategoryV2 watchFaceCategoryV3 = this.$item;
                orderManager.OXO1("WatchFace", strValueOf, mActivity, new Function1() { // from class: com.sma.smartv3.ui.device.dialpay.fragment.OXO1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PayOnlineMoveFragment$initItem$2$1.invokeSuspend$lambda$0(payOnlineMoveFragment2, i4, i5, progressButtonV3, watchFaceCategoryV3, (AccountCreateOrder) obj2);
                    }
                });
            }
        } else {
            PayOnlineMoveFragment payOnlineMoveFragment3 = this.this$0;
            OrderManager orderManager2 = OrderManager.OXO1;
            String strX11iII1O1 = OrderManager.X11iII1O1(orderManager2, null, orderManager2.iOO1ii1(), 1, null);
            Bundle bundle = new Bundle();
            bundle.putString("mArg0", strX11iII1O1);
            bundle.putInt("mArg1", 2);
            bundle.putParcelable("mArg2", null);
            bundle.putSerializable("mArg3", null);
            Intent intent = new Intent(payOnlineMoveFragment3.getActivity(), (Class<?>) GoogleWebViewActivity.class);
            intent.putExtras(bundle);
            payOnlineMoveFragment3.startActivity(intent);
        }
        return Unit.OXO1;
    }
}
