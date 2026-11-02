package com.sma.smartv3.ui.device;

import android.content.Intent;
import android.view.View;
import com.android.mltcode.paycertificationapi.Oii1IXOO1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1i01iOO;
import com.android.mltcode.paycertificationapi.iIO0I0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.list.BaseListActivity;
import com.blankj.utilcode.util.PermissionUtils;
import com.sma.smartv3.pro.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseListFunctionActivity<T> extends BaseListActivity<T> {

    @aa1
    public static final OXO1 Companion = null;
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
    private final Lazy rootView$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    public BaseListFunctionActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new Oii1IXOO1(this));
    }

    public static /* synthetic */ View I0iXXO(BaseListFunctionActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi(BaseListFunctionActivity r0) {
        return locationServerRemind$lambda$0$0(r0);
    }

    public static /* synthetic */ boolean XXI() {
        return permissionRemind$lambda$0$0();
    }

    private static final boolean locationServerRemind$lambda$0$0(BaseListFunctionActivity r2) {
        r2.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 2);
        return true;
    }

    private static final boolean permissionRemind$lambda$0$0() {
        PermissionUtils.launchAppDetailsSettings();
        return true;
    }

    private static final View rootView_delegate$lambda$0(BaseListFunctionActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    @tb1
    public final go0 getMPermissionBackgroundPopup() {
        return this.mPermissionBackgroundPopup;
    }

    public final View getRootView() {
        return (View) getValue();
    }

    public final void locationServerRemind() {
        if (this.mLocationServerPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.location_server_notification);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new iIO0I0(this));
        this.mLocationServerPopup = r0;
    L5:
        go0 r1 = this.mLocationServerPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    public final void permissionRemind() {
        if (this.mPermissionPopup != null) goto L5;
        go0 r0 = new go0(this, 0, 2, null);
        r0.O1O(R.string.permission_set_remind);
        go0.X11iII1O1(r0, Integer.valueOf(R.string.cancel), null, 2, null);
        r0.X1IX(R.string.settings, new i1i01iOO());
        this.mPermissionPopup = r0;
    L5:
        go0 r1 = this.mPermissionPopup;
        if (r1 == null) goto L9;
        View r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r1.I1XOi1(r2);
        return;
    }

    public final void setMPermissionBackgroundPopup(@tb1 go0 r1) {
        this.mPermissionBackgroundPopup = r1;
    }
}
