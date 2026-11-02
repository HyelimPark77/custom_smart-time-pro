package com.sma.smartv3.ui.me;

import android.R;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatSpinner;
import com.android.mltcode.paycertificationapi.O00iiXi;
import com.android.mltcode.paycertificationapi.OOIXIO1II;
import com.android.mltcode.paycertificationapi.X0OiXI1;
import com.android.mltcode.paycertificationapi.X10XOX1OO;
import com.android.mltcode.paycertificationapi.X1OXOIXii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperSmsTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperSmsTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperSmsTestActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1563#2:110\n1634#2,3:111\n*S KotlinDebug\n*F\n+ 1 DeveloperSmsTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperSmsTestActivity\n*L\n48#1:110\n48#1:111,3\n*E\n"})
public final class DeveloperSmsTestActivity extends BaseActivity {

    @aa1
    private final Lazy mEtContent$delegate;

    @aa1
    private final Lazy mEtPhone$delegate;

    @aa1
    private final Lazy mSpSims$delegate;
    private int subId;

    public static final class OXO1 implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ List<SubscriptionInfo> I1;
        public final /* synthetic */ DeveloperSmsTestActivity IO;

        public OXO1(DeveloperSmsTestActivity r1, List<SubscriptionInfo> r2) {
            this.IO = r1;
            this.I1 = r2;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> r1, View r2, int r3, long r4) {
            DeveloperSmsTestActivity.access$setSubId$p(this.IO, this.I1.get(r3).getSubscriptionId());
            ToastUtils.showLong(String.valueOf(DeveloperSmsTestActivity.access$getSubId$p(this.IO)), new Object[0]);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> r1) {
        }
    }

    public DeveloperSmsTestActivity() {
        this.mSpSims$delegate = LazyKt__LazyJVMKt.iO(new X1OXOIXii(this));
        this.mEtPhone$delegate = LazyKt__LazyJVMKt.iO(new O00iiXi(this));
        this.mEtContent$delegate = LazyKt__LazyJVMKt.iO(new OOIXIO1II(this));
        this.subId = -1;
    }

    public static /* synthetic */ Unit I0iXXO(DeveloperSmsTestActivity r0, PermissionStatus r1) {
        return onSend$lambda$0(r0, r1);
    }

    public static /* synthetic */ AppCompatSpinner O10IXXX0X(DeveloperSmsTestActivity r0) {
        return mSpSims_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText OIX0iXi(DeveloperSmsTestActivity r0) {
        return mEtPhone_delegate$lambda$0(r0);
    }

    public static /* synthetic */ EditText X1ii(DeveloperSmsTestActivity r0) {
        return mEtContent_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(DeveloperSmsTestActivity r0, PermissionStatus r1) {
        return initView$lambda$0(r0, r1);
    }

    public static final /* synthetic */ int access$getSubId$p(DeveloperSmsTestActivity r0) {
        return r0.subId;
    }

    public static final /* synthetic */ void access$setSubId$p(DeveloperSmsTestActivity r0, int r1) {
        r0.subId = r1;
    }

    private final EditText getMEtContent() {
        return (EditText) getValue();
    }

    private final EditText getMEtPhone() {
        return (EditText) getValue();
    }

    private final AppCompatSpinner getMSpSims() {
        return (AppCompatSpinner) getValue();
    }

    private static final Unit initView$lambda$0(DeveloperSmsTestActivity r4, PermissionStatus r5) {
        Intrinsics.X0O(r5, "it");
        if (r5 != PermissionStatus.GRANTED) goto L10;
        Object r6 = r4.getSystemService("telephony_subscription_service");
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type android.telephony.SubscriptionManager");
        List<SubscriptionInfo> r7 = ((SubscriptionManager) r6).getActiveSubscriptionInfoList();
        LogUtils.d(new Object[]{"subscriptionInfoList => " + r7});
        Intrinsics.XXI(r7);
        List<SubscriptionInfo> r0 = r7;
        ArrayList r1 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r0, 10));
        Iterator<T> r2 = r0.iterator();
    L6:
        if (r2.hasNext() == false) goto L8;
        r1.add(((SubscriptionInfo) r2.next()).getDisplayName());
        goto L6
    L8:
        r4.getMSpSims().setAdapter(new ArrayAdapter(r4, R.layout.simple_list_item_1, R.id.text1, r1));
        r4.getMSpSims().setOnItemSelectedListener(new OXO1(r4, r7));
    L10:
        return Unit.OXO1;
    }

    private static final EditText mEtContent_delegate$lambda$0(DeveloperSmsTestActivity r1) {
        return (EditText) r1.findViewById(com.sma.smartv3.pro.R.id.et_content);
    }

    private static final EditText mEtPhone_delegate$lambda$0(DeveloperSmsTestActivity r1) {
        return (EditText) r1.findViewById(com.sma.smartv3.pro.R.id.et_phone);
    }

    private static final AppCompatSpinner mSpSims_delegate$lambda$0(DeveloperSmsTestActivity r1) {
        return (AppCompatSpinner) r1.findViewById(com.sma.smartv3.pro.R.id.sp_sims);
    }

    private static final Unit onSend$lambda$0(DeveloperSmsTestActivity r7, PermissionStatus r8) {
        Intrinsics.X0O(r8, "it");
        if (r8 != PermissionStatus.GRANTED) goto L17;
        String r1 = r7.getMEtPhone().getText().toString();
        String r9 = r7.getMEtContent().getText().toString();
        if (r1.length() <= 0) goto L17;
        if (r9.length() <= 0) goto L17;
        if (r7.subId != (-1)) goto L11;
        int r0 = SmsManager.getDefaultSmsSubscriptionId();
        r7.subId = r0;
        LogUtils.d(new Object[]{"Default subId " + r0});
    L11:
        SmsManager r2 = SmsManager.getSmsManagerForSubscriptionId(r7.subId);
        ArrayList<String> r3 = r2.divideMessage(r9);
        Intrinsics.O10IXXX0X(r3, "divideMessage(...)");
        Iterator<String> r6 = r3.iterator();
    L13:
        if (r6.hasNext() == false) goto L15;
        r2.sendTextMessage(r1, null, r6.next(), null, null);
        goto L13
    L15:
        LogUtils.d(new Object[]{r7.subId + " " + r1 + " ========> " + r9});
    L17:
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        PermissionUtils r1 = PermissionUtils.permission(new String[]{"PHONE", PermissionConstants.SMS});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new X0OiXI1(this), 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_developer_sms_test;
    }

    public final void onSend(@aa1 View r7) {
        Intrinsics.X0O(r7, "v");
        PermissionUtils r0 = PermissionUtils.permission(new String[]{"PHONE", PermissionConstants.SMS});
        Intrinsics.O10IXXX0X(r0, "permission(...)");
        ds1.iO(r0, null, null, new X10XOX1OO(this), 3, null);
    }
}
