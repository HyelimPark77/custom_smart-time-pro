package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.PermissionUtils;
import com.sma.smartv3.p610ui.device.BaseListFunctionActivity;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseListFunctionActivity<T> extends BaseListActivity<T> {

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    public static final int REQUEST_ENABLE_BLUETOOTH = 1;
    public static final int REQUEST_LOCATION_SERVER = 2;
    public static final int REQUEST_PERMISSION_SERVER = 3;

    @tb1
    private go0 mLocationServerPopup;

    @tb1
    private go0 mPermissionBackgroundPopup;

    @tb1
    private go0 mPermissionPopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.Oii1IXOO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BaseListFunctionActivity.rootView_delegate$lambda$0(this.f3814IO);
        }
    });

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean locationServerRemind$lambda$0$0(BaseListFunctionActivity baseListFunctionActivity) {
        baseListFunctionActivity.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean permissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(BaseListFunctionActivity baseListFunctionActivity) {
        return baseListFunctionActivity.findViewById(R.id.root_view);
    }

    @tb1
    public final go0 getMPermissionBackgroundPopup() {
        return this.mPermissionBackgroundPopup;
    }

    public final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    public final void locationServerRemind() {
        if (this.mLocationServerPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.location_server_notification);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.iIO0I0
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseListFunctionActivity.locationServerRemind$lambda$0$0(this.f7862IO));
                }
            });
            this.mLocationServerPopup = go0Var;
        }
        go0 go0Var2 = this.mLocationServerPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void permissionRemind() {
        if (this.mPermissionPopup == null) {
            go0 go0Var = new go0(this, 0, 2, null);
            go0Var.O1O(R.string.permission_set_remind);
            go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
            go0Var.X1IX(R.string.settings, new Function0() { // from class: com.android.mltcode.paycertificationapi.i1i01iOO
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BaseListFunctionActivity.permissionRemind$lambda$0$0());
                }
            });
            this.mPermissionPopup = go0Var;
        }
        go0 go0Var2 = this.mPermissionPopup;
        if (go0Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            go0Var2.I1XOi1(rootView);
        }
    }

    public final void setMPermissionBackgroundPopup(@tb1 go0 go0Var) {
        this.mPermissionBackgroundPopup = go0Var;
    }
}
