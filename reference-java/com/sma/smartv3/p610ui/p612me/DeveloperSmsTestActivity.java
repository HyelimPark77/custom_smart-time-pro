package com.sma.smartv3.p610ui.p612me;

import android.R;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.p612me.DeveloperSmsTestActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nDeveloperSmsTestActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperSmsTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperSmsTestActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1563#2:110\n1634#2,3:111\n*S KotlinDebug\n*F\n+ 1 DeveloperSmsTestActivity.kt\ncom/sma/smartv3/ui/me/DeveloperSmsTestActivity\n*L\n48#1:110\n48#1:111,3\n*E\n"})
public final class DeveloperSmsTestActivity extends BaseActivity {

    @aa1
    private final Lazy mSpSims$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1OXOIXii
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperSmsTestActivity.mSpSims_delegate$lambda$0(this.f4318IO);
        }
    });

    @aa1
    private final Lazy mEtPhone$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O00iiXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperSmsTestActivity.mEtPhone_delegate$lambda$0(this.f2388IO);
        }
    });

    @aa1
    private final Lazy mEtContent$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOIXIO1II
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return DeveloperSmsTestActivity.mEtContent_delegate$lambda$0(this.f3238IO);
        }
    });
    private int subId = -1;

    public static final class OXO1 implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ List<SubscriptionInfo> f54692I1;

        public OXO1(List<SubscriptionInfo> list) {
            this.f54692I1 = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            DeveloperSmsTestActivity.this.subId = this.f54692I1.get(i).getSubscriptionId();
            ToastUtils.showLong(String.valueOf(DeveloperSmsTestActivity.this.subId), new Object[0]);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private final EditText getMEtContent() {
        return (EditText) this.mEtContent$delegate.getValue();
    }

    private final EditText getMEtPhone() {
        return (EditText) this.mEtPhone$delegate.getValue();
    }

    private final AppCompatSpinner getMSpSims() {
        return (AppCompatSpinner) this.mSpSims$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0(DeveloperSmsTestActivity developerSmsTestActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            Object systemService = developerSmsTestActivity.getSystemService("telephony_subscription_service");
            Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.telephony.SubscriptionManager");
            List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) systemService).getActiveSubscriptionInfoList();
            LogUtils.m11128d("subscriptionInfoList => " + activeSubscriptionInfoList);
            Intrinsics.XXI(activeSubscriptionInfoList);
            List<SubscriptionInfo> list = activeSubscriptionInfoList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((SubscriptionInfo) it2.next()).getDisplayName());
            }
            developerSmsTestActivity.getMSpSims().setAdapter((SpinnerAdapter) new ArrayAdapter(developerSmsTestActivity, R.layout.simple_list_item_1, R.id.text1, arrayList));
            developerSmsTestActivity.getMSpSims().setOnItemSelectedListener(developerSmsTestActivity.new OXO1(activeSubscriptionInfoList));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mEtContent_delegate$lambda$0(DeveloperSmsTestActivity developerSmsTestActivity) {
        return (EditText) developerSmsTestActivity.findViewById(com.sma.smartv3.pro.R.id.et_content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditText mEtPhone_delegate$lambda$0(DeveloperSmsTestActivity developerSmsTestActivity) {
        return (EditText) developerSmsTestActivity.findViewById(com.sma.smartv3.pro.R.id.et_phone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatSpinner mSpSims_delegate$lambda$0(DeveloperSmsTestActivity developerSmsTestActivity) {
        return (AppCompatSpinner) developerSmsTestActivity.findViewById(com.sma.smartv3.pro.R.id.sp_sims);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSend$lambda$0(DeveloperSmsTestActivity developerSmsTestActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            String string = developerSmsTestActivity.getMEtPhone().getText().toString();
            String string2 = developerSmsTestActivity.getMEtContent().getText().toString();
            if (string.length() > 0 && string2.length() > 0) {
                if (developerSmsTestActivity.subId == -1) {
                    int defaultSmsSubscriptionId = SmsManager.getDefaultSmsSubscriptionId();
                    developerSmsTestActivity.subId = defaultSmsSubscriptionId;
                    LogUtils.m11128d("Default subId " + defaultSmsSubscriptionId);
                }
                SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(developerSmsTestActivity.subId);
                ArrayList<String> arrayListDivideMessage = smsManagerForSubscriptionId.divideMessage(string2);
                Intrinsics.O10IXXX0X(arrayListDivideMessage, "divideMessage(...)");
                Iterator<String> it2 = arrayListDivideMessage.iterator();
                while (it2.hasNext()) {
                    smsManagerForSubscriptionId.sendTextMessage(string, null, it2.next(), null, null);
                }
                LogUtils.m11128d(developerSmsTestActivity.subId + " " + string + " ========> " + string2);
            }
        }
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission("PHONE", PermissionConstants.SMS);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.X0OiXI1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperSmsTestActivity.initView$lambda$0(this.f4015IO, (PermissionStatus) obj);
            }
        }, 3, null);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_developer_sms_test;
    }

    public final void onSend(@aa1 View v) {
        Intrinsics.X0O(v, "v");
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission("PHONE", PermissionConstants.SMS);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.X10XOX1OO
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeveloperSmsTestActivity.onSend$lambda$0(this.f4163IO, (PermissionStatus) obj);
            }
        }, 3, null);
    }
}
