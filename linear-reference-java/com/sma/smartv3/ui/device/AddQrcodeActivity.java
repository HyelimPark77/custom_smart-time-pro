package com.sma.smartv3.ui.device;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0OXii1X1;
import com.android.mltcode.paycertificationapi.OOI;
import com.android.mltcode.paycertificationapi.OXiXO;
import com.android.mltcode.paycertificationapi.Oiii1;
import com.android.mltcode.paycertificationapi.X01XO;
import com.android.mltcode.paycertificationapi.XOOOI0X;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i0I0X;
import com.android.mltcode.paycertificationapi.iIX1O1i;
import com.android.mltcode.paycertificationapi.iOii0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.ta2;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.xz3;
import com.bestmafen.androidbase.base.BaseActivity;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.QrcodeTypeInfo;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AddQrcodeActivity extends BaseActivity {

    @aa1
    public static final OXO1 Companion = null;
    private static final int REQUEST_ADD_QRCODE = 0;
    private static final int REQUEST_CODE = 0;
    private QrcodeTypeInfo mQrcodeTypeInfo;

    @tb1
    private xz3 mSelectPopup;

    @aa1
    private final Lazy rootView$delegate;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public final int OXO1() {
            return AddQrcodeActivity.access$getREQUEST_ADD_QRCODE$cp();
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
        REQUEST_CODE = 1;
        REQUEST_ADD_QRCODE = 2;
    }

    public AddQrcodeActivity() {
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new iIX1O1i(this));
    }

    public static /* synthetic */ Unit I0iXXO(AddQrcodeActivity r0, PermissionStatus r1) {
        return onSelect$lambda$0$1$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(AddQrcodeActivity r0, PermissionStatus r1) {
        return onSelect$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit IIX1OXO(AddQrcodeActivity r0, Intent r1) {
        return onActivityResult$lambda$0(r0, r1);
    }

    public static /* synthetic */ void O10IXXX0X(AddQrcodeActivity r0) {
        onActivityResult$lambda$0$1(r0);
    }

    public static /* synthetic */ Unit OIX0iXi(AddQrcodeActivity r0) {
        return onSelect$lambda$0$0(r0);
    }

    public static /* synthetic */ View X0O(AddQrcodeActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(AddQrcodeActivity r0, String r1) {
        return onSelect$lambda$0$0$0$0(r0, r1);
    }

    public static /* synthetic */ Unit XXI(AddQrcodeActivity r0) {
        return onSelect$lambda$0$1(r0);
    }

    public static final /* synthetic */ int access$getREQUEST_ADD_QRCODE$cp() {
        return REQUEST_ADD_QRCODE;
    }

    private final void createQrcodeTypeInfo(String r9) {
        QrcodeTypeInfo r0 = this.mQrcodeTypeInfo;
        QrcodeTypeInfo r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mQrcodeTypeInfo");
        r0 = null;
    L5:
        LogUtils.d(new Object[]{"createQrcode -> mQrcodeTypeInfo=" + r0 + ", content=" + r9});
        ta2 r2 = ta2.OXO1;
        Pair<Integer, byte[]> r3 = r2.IiI10X(r9);
        if (r3 == null) goto L23;
        Integer r4 = (Integer) r3.first;
        byte[] r5 = (byte[]) r3.second;
        if (r4.intValue() <= 57) goto L11;
        ToastUtils.showLong(getString(R.string.conten_too_long) + " , " + getString(R.string.qrcode_tip), new Object[0]);
        return;
    L11:
        QrcodeTypeInfo r6 = this.mQrcodeTypeInfo;
        if (r6 != null) goto L14;
        Intrinsics.XXO("mQrcodeTypeInfo");
        r6 = null;
    L14:
        Intrinsics.XXI(r4);
        r6.setWidth(r4.intValue());
        Intrinsics.XXI(r5);
        r6.setData(r5);
        r6.setDateTime(System.currentTimeMillis());
        File r7 = uz0.Ii1iii0(sz0.OXO1);
        QrcodeTypeInfo r8 = this.mQrcodeTypeInfo;
        if (r8 != null) goto L17;
        Intrinsics.XXO("mQrcodeTypeInfo");
        r8 = null;
    L17:
        r2.iO(r9, 512, 512, new File(r7, r8.getDateTime() + ".jpg"));
        Intent r10 = new Intent();
        QrcodeTypeInfo r11 = this.mQrcodeTypeInfo;
        if (r11 != null) goto L20;
        Intrinsics.XXO("mQrcodeTypeInfo");
    L21:
        setResult(-1, r10.putExtra("qrcode", r1));
        finish();
        return;
    L20:
        r1 = r11;
        goto L21
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private static final Unit onActivityResult$lambda$0(final AddQrcodeActivity r3, Intent r4) {
        File r0 = new File(uz0.iX1O1(sz0.OXO1), "qrtmp.jpg");     // Catch: Exception -> L5
        ContentResolver r1 = r3.getContentResolver();     // Catch: Exception -> L5
        if (r4 == null) goto L7;
        Uri r5 = r4.getData();     // Catch: Exception -> L5
    L8:
        ImageUtils.save(MediaStore.Images.Media.getBitmap(r1, r5), r0, Bitmap.CompressFormat.JPEG);     // Catch: Exception -> L5
        Bitmap r6 = iOii0.O00(r0.getPath());     // Catch: Exception -> L5
        ta2 r2 = ta2.OXO1;     // Catch: Exception -> L5
        Intrinsics.XXI(r6);     // Catch: Exception -> L5
        String r7 = r2.OIi0(r6);     // Catch: Exception -> L5
        LogUtils.d(new Object[]{"syncQrcode -> parseQrcodeResult:" + r7});     // Catch: Exception -> L5
        if (r7 != null) goto L11;
        ToastUtils.showLong(R.string.qrcode_failed);     // Catch: Exception -> L5
    L15:
        return Unit.OXO1;
    L11:
        r3.createQrcodeTypeInfo(r7);     // Catch: Exception -> L5
        goto L15
    L7:
        r5 = null;
    L5:
        e = move-exception;
        e.printStackTrace();
        r3.runOnUiThread(new O0OXii1X1(r3));
        goto L15
    }

    private static final void onActivityResult$lambda$0$1(AddQrcodeActivity r0) {
        xz3 r1 = r0.mSelectPopup;
        if (r1 == null) goto L6;
        r1.dismiss();
        return;
    }

    private static final Unit onSelect$lambda$0$0(final AddQrcodeActivity r7) {
        PermissionUtils r1 = PermissionUtils.permission(new String[]{PermissionConstants.STORAGE, PermissionConstants.CAMERA});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new Oiii1(r7), 3, null);
        return Unit.OXO1;
    }

    private static final Unit onSelect$lambda$0$0$0(final AddQrcodeActivity r2, PermissionStatus r3) {
        Intrinsics.X0O(r3, "it");
        if (r3 != PermissionStatus.GRANTED) goto L6;
        ta2.OXO1.IO(r2, false, new OOI(r2));
    L6:
        return Unit.OXO1;
    }

    private static final Unit onSelect$lambda$0$0$0$0(AddQrcodeActivity r0, String r1) {
        if (r1 == null) goto L5;
        r0.createQrcodeTypeInfo(r1);
    L5:
        return Unit.OXO1;
    }

    private static final Unit onSelect$lambda$0$1(final AddQrcodeActivity r7) {
        PermissionUtils r1 = PermissionUtils.permission(new String[]{PermissionConstants.STORAGE, PermissionConstants.CAMERA});
        Intrinsics.O10IXXX0X(r1, "permission(...)");
        ds1.iO(r1, null, null, new XOOOI0X(r7), 3, null);
        return Unit.OXO1;
    }

    private static final Unit onSelect$lambda$0$1$0(AddQrcodeActivity r2, PermissionStatus r3) {
        Intrinsics.X0O(r3, "it");
        if (r3 != PermissionStatus.GRANTED) goto L6;
        Uri r0 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intent r4 = new Intent("android.intent.action.PICK", r0);
        r4.setDataAndType(r0, "image/*");
        r2.startActivityForResult(r4, REQUEST_CODE);
    L6:
        return Unit.OXO1;
    }

    private static final View rootView_delegate$lambda$0(AddQrcodeActivity r1) {
        return r1.findViewById(R.id.root_view);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r3) {
        Serializable r4 = getMArg3();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type com.sma.smartv3.model.QrcodeTypeInfo");
        QrcodeTypeInfo r5 = (QrcodeTypeInfo) r4;
        this.mQrcodeTypeInfo = r5;
        if (r5 != null) goto L5;
        Intrinsics.XXO("mQrcodeTypeInfo");
        r5 = null;
    L5:
        LogUtils.d(new Object[]{"mQrcodeTypeInfo -> " + r5});
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        TextView r0 = (TextView) findViewById(R.id.abh_title_center);
        QrcodeTypeInfo r1 = this.mQrcodeTypeInfo;
        QrcodeTypeInfo r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mQrcodeTypeInfo");
        r1 = null;
    L5:
        r0.setText(r1.getName());
        TextView r3 = (TextView) findViewById(R.id.tv_tip1);
        QrcodeTypeInfo r4 = this.mQrcodeTypeInfo;
        if (r4 != null) goto L8;
        Intrinsics.XXO("mQrcodeTypeInfo");
    L9:
        r3.setText(getString(R.string.qrcode_sycn_tip1, new Object[]{r2.getName()}));
        return;
    L8:
        r2 = r4;
        goto L9
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_qrcode_add;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r9, int r10, @tb1 final Intent r11) {
        super.onActivityResult(r9, r10, r11);
        if (r10 == (-1)) goto L5;
        return;
    L5:
        if (r9 != REQUEST_CODE) goto L12;
        xz3 r12 = this.mSelectPopup;
        if (r12 == null) goto L9;
        r12.dismiss();
    L9:
        ThreadsKt.iO(false, false, null, null, 0, new OXiXO(this, r11), 31, null);
        return;
    }

    public final void onSelect(@aa1 View r3) {
        Intrinsics.X0O(r3, "v");
        if (this.mSelectPopup != null) goto L5;
        xz3 r4 = new xz3(getMContext());
        r4.iX(new i0I0X(this));
        r4.i010I(new X01XO(this));
        this.mSelectPopup = r4;
    L5:
        xz3 r5 = this.mSelectPopup;
        if (r5 == null) goto L9;
        View r0 = getRootView();
        Intrinsics.O10IXXX0X(r0, "<get-rootView>(...)");
        r5.I1XOi1(r0);
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
