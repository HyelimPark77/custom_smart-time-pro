package com.sma.smartv3.p610ui.device;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ds1;
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
import com.sma.smartv3.p610ui.device.AddQrcodeActivity;
import com.sma.smartv3.pro.R;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class AddQrcodeActivity extends BaseActivity {
    private QrcodeTypeInfo mQrcodeTypeInfo;

    @tb1
    private xz3 mSelectPopup;

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIX1O1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AddQrcodeActivity.rootView_delegate$lambda$0(this.f7903IO);
        }
    });

    @aa1
    public static final OXO1 Companion = new OXO1(null);
    private static final int REQUEST_CODE = 1;
    private static final int REQUEST_ADD_QRCODE = 2;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int OXO1() {
            return AddQrcodeActivity.REQUEST_ADD_QRCODE;
        }

        public OXO1() {
        }
    }

    private final void createQrcodeTypeInfo(String str) {
        QrcodeTypeInfo qrcodeTypeInfo = this.mQrcodeTypeInfo;
        QrcodeTypeInfo qrcodeTypeInfo2 = null;
        if (qrcodeTypeInfo == null) {
            Intrinsics.XXO("mQrcodeTypeInfo");
            qrcodeTypeInfo = null;
        }
        LogUtils.m11128d("createQrcode -> mQrcodeTypeInfo=" + qrcodeTypeInfo + ", content=" + str);
        ta2 ta2Var = ta2.OXO1;
        Pair<Integer, byte[]> pairIiI10X = ta2Var.IiI10X(str);
        if (pairIiI10X != null) {
            Integer num = (Integer) pairIiI10X.first;
            byte[] bArr = (byte[]) pairIiI10X.second;
            if (num.intValue() > 57) {
                ToastUtils.showLong(getString(R.string.conten_too_long) + " , " + getString(R.string.qrcode_tip), new Object[0]);
                return;
            }
            QrcodeTypeInfo qrcodeTypeInfo3 = this.mQrcodeTypeInfo;
            if (qrcodeTypeInfo3 == null) {
                Intrinsics.XXO("mQrcodeTypeInfo");
                qrcodeTypeInfo3 = null;
            }
            Intrinsics.XXI(num);
            qrcodeTypeInfo3.setWidth(num.intValue());
            Intrinsics.XXI(bArr);
            qrcodeTypeInfo3.setData(bArr);
            qrcodeTypeInfo3.setDateTime(System.currentTimeMillis());
            File fileIi1iii0 = uz0.Ii1iii0(sz0.OXO1);
            QrcodeTypeInfo qrcodeTypeInfo4 = this.mQrcodeTypeInfo;
            if (qrcodeTypeInfo4 == null) {
                Intrinsics.XXO("mQrcodeTypeInfo");
                qrcodeTypeInfo4 = null;
            }
            ta2Var.m3095iO(str, 512, 512, new File(fileIi1iii0, qrcodeTypeInfo4.getDateTime() + ".jpg"));
            Intent intent = new Intent();
            QrcodeTypeInfo qrcodeTypeInfo5 = this.mQrcodeTypeInfo;
            if (qrcodeTypeInfo5 == null) {
                Intrinsics.XXO("mQrcodeTypeInfo");
            } else {
                qrcodeTypeInfo2 = qrcodeTypeInfo5;
            }
            setResult(-1, intent.putExtra("qrcode", qrcodeTypeInfo2));
            finish();
        }
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onActivityResult$lambda$0(final AddQrcodeActivity addQrcodeActivity, Intent intent) {
        try {
            File file = new File(uz0.iX1O1(sz0.OXO1), "qrtmp.jpg");
            ImageUtils.save(MediaStore.Images.Media.getBitmap(addQrcodeActivity.getContentResolver(), intent != null ? intent.getData() : null), file, Bitmap.CompressFormat.JPEG);
            Bitmap bitmapO00 = iOii0.O00(file.getPath());
            ta2 ta2Var = ta2.OXO1;
            Intrinsics.XXI(bitmapO00);
            String strOIi0 = ta2Var.OIi0(bitmapO00);
            LogUtils.m11128d("syncQrcode -> parseQrcodeResult:" + strOIi0);
            if (strOIi0 == null) {
                ToastUtils.showLong(R.string.qrcode_failed);
            } else {
                addQrcodeActivity.createQrcodeTypeInfo(strOIi0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            addQrcodeActivity.runOnUiThread(new Runnable() { // from class: com.android.mltcode.paycertificationapi.O0OXii1X1
                @Override // java.lang.Runnable
                public final void run() {
                    AddQrcodeActivity.onActivityResult$lambda$0$1(this.f2517IO);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResult$lambda$0$1(AddQrcodeActivity addQrcodeActivity) {
        xz3 xz3Var = addQrcodeActivity.mSelectPopup;
        if (xz3Var != null) {
            xz3Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelect$lambda$0$0(final AddQrcodeActivity addQrcodeActivity) {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.STORAGE, PermissionConstants.CAMERA);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.Oiii1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddQrcodeActivity.onSelect$lambda$0$0$0(this.f3836IO, (PermissionStatus) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelect$lambda$0$0$0(final AddQrcodeActivity addQrcodeActivity, PermissionStatus it) throws IOException {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            ta2.OXO1.m3094IO(addQrcodeActivity, false, new Function1() { // from class: com.android.mltcode.paycertificationapi.OOI
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AddQrcodeActivity.onSelect$lambda$0$0$0$0(this.f3205IO, (String) obj);
                }
            });
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelect$lambda$0$0$0$0(AddQrcodeActivity addQrcodeActivity, String str) {
        if (str != null) {
            addQrcodeActivity.createQrcodeTypeInfo(str);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelect$lambda$0$1(final AddQrcodeActivity addQrcodeActivity) {
        PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.STORAGE, PermissionConstants.CAMERA);
        Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
        ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.XOOOI0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddQrcodeActivity.onSelect$lambda$0$1$0(this.f4818IO, (PermissionStatus) obj);
            }
        }, 3, null);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSelect$lambda$0$1$0(AddQrcodeActivity addQrcodeActivity, PermissionStatus it) {
        Intrinsics.X0O(it, "it");
        if (it == PermissionStatus.GRANTED) {
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            Intent intent = new Intent("android.intent.action.PICK", uri);
            intent.setDataAndType(uri, "image/*");
            addQrcodeActivity.startActivityForResult(intent, REQUEST_CODE);
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(AddQrcodeActivity addQrcodeActivity) {
        return addQrcodeActivity.findViewById(R.id.root_view);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        Serializable mArg3 = getMArg3();
        Intrinsics.X1ii(mArg3, "null cannot be cast to non-null type com.sma.smartv3.model.QrcodeTypeInfo");
        QrcodeTypeInfo qrcodeTypeInfo = (QrcodeTypeInfo) mArg3;
        this.mQrcodeTypeInfo = qrcodeTypeInfo;
        if (qrcodeTypeInfo == null) {
            Intrinsics.XXO("mQrcodeTypeInfo");
            qrcodeTypeInfo = null;
        }
        LogUtils.m11128d("mQrcodeTypeInfo -> " + qrcodeTypeInfo);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        TextView textView = (TextView) findViewById(R.id.abh_title_center);
        QrcodeTypeInfo qrcodeTypeInfo = this.mQrcodeTypeInfo;
        QrcodeTypeInfo qrcodeTypeInfo2 = null;
        if (qrcodeTypeInfo == null) {
            Intrinsics.XXO("mQrcodeTypeInfo");
            qrcodeTypeInfo = null;
        }
        textView.setText(qrcodeTypeInfo.getName());
        TextView textView2 = (TextView) findViewById(R.id.tv_tip1);
        QrcodeTypeInfo qrcodeTypeInfo3 = this.mQrcodeTypeInfo;
        if (qrcodeTypeInfo3 == null) {
            Intrinsics.XXO("mQrcodeTypeInfo");
        } else {
            qrcodeTypeInfo2 = qrcodeTypeInfo3;
        }
        textView2.setText(getString(R.string.qrcode_sycn_tip1, qrcodeTypeInfo2.getName()));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_qrcode_add;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 final Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == REQUEST_CODE) {
            xz3 xz3Var = this.mSelectPopup;
            if (xz3Var != null) {
                xz3Var.dismiss();
            }
            ThreadsKt.m39451iO(false, false, null, null, 0, new Function0() { // from class: com.android.mltcode.paycertificationapi.OXiXO
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return AddQrcodeActivity.onActivityResult$lambda$0(this.f3586IO, intent);
                }
            }, 31, null);
        }
    }

    public final void onSelect(@aa1 View v) {
        Intrinsics.X0O(v, "v");
        if (this.mSelectPopup == null) {
            xz3 xz3Var = new xz3(getMContext());
            xz3Var.m3321iX(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0I0X
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return AddQrcodeActivity.onSelect$lambda$0$0(this.f7345IO);
                }
            });
            xz3Var.i010I(new Function0() { // from class: com.android.mltcode.paycertificationapi.X01XO
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return AddQrcodeActivity.onSelect$lambda$0$1(this.f3930IO);
                }
            });
            this.mSelectPopup = xz3Var;
        }
        xz3 xz3Var2 = this.mSelectPopup;
        if (xz3Var2 != null) {
            View rootView = getRootView();
            Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
            xz3Var2.I1XOi1(rootView);
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
