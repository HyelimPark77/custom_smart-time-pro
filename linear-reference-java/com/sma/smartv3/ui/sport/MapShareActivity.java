package com.sma.smartv3.ui.sport;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.h40;
import com.android.mltcode.paycertificationapi.h94;
import com.android.mltcode.paycertificationapi.i40;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.j40;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.UriUtils;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMapShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapShareActivity.kt\ncom/sma/smartv3/ui/sport/MapShareActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,310:1\n1#2:311\n1#2:319\n1#2:338\n173#3,7:312\n180#3,3:320\n143#3,7:323\n183#3:330\n173#3,7:331\n180#3,3:339\n143#3,7:342\n183#3:349\n*S KotlinDebug\n*F\n+ 1 MapShareActivity.kt\ncom/sma/smartv3/ui/sport/MapShareActivity\n*L\n258#1:319\n262#1:338\n258#1:312,7\n258#1:320,3\n258#1:323,7\n258#1:330\n262#1:331,7\n262#1:339,3\n262#1:342,7\n262#1:349\n*E\n"})
public final class MapShareActivity extends BaseActivity {
    public static final int CODE_CARD_IMAGE = 2;
    public static final int CODE_LONG_IMAGE = 1;
    public static final int CODE_VIDEO = 3;

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    private final Lazy abhTitleCenter$delegate;
    private int mActivityType;

    @aa1
    private final SimpleDateFormat mFormat;

    @aa1
    private File mIntentFile;

    @aa1
    private File mIntentFileVideo;

    @aa1
    private String mIntentType;

    @aa1
    private final Lazy shareMapImage$delegate;

    @aa1
    private final Lazy shareMapWxLayout$delegate;

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

    public MapShareActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new h40(this));
        this.shareMapImage$delegate = LazyKt__LazyJVMKt.iO(new i40(this));
        this.shareMapWxLayout$delegate = LazyKt__LazyJVMKt.iO(new j40(this));
        this.mFormat = O0X11OiO.X11I();
        this.mActivityType = 1;
        this.mIntentType = "image/*";
        sz0 r0 = sz0.OXO1;
        this.mIntentFile = uz0.XOX0O0(r0);
        this.mIntentFileVideo = uz0.XOX0O0(r0);
    }

    public static /* synthetic */ View I0iXXO(MapShareActivity r0) {
        return shareMapWxLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(MapShareActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(MapShareActivity r0) {
        return shareMapImage_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(MapShareActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private final boolean copyMp4File() {
        File r1 = uz0.IiiXiI0I(sz0.OXO1, "MapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");     // Catch: Exception -> L8
        if (FileUtils.copy(this.mIntentFileVideo, r1) == false) goto L11;
        FileUtils.notifySystemToScan(r1);     // Catch: Exception -> L8
        return true;
    L11:
        return false;
    L12:
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void shareFile(String r8, Bitmap r9, String r10) {
        File r0 = uz0.IiiXiI0I(sz0.OXO1, r8);
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        ImageUtils.save(r9, r0, Bitmap.CompressFormat.JPEG);
        FileUtils.notifySystemToScan(r0);
        ToastUtils.showLong(getString(R.string.success_save), new Object[0]);
        return;
    L6:
        ContentValues r1 = new ContentValues();
        r1.put("_display_name", r8);
        r1.put("mime_type", r10);
        r1.put("relative_path", Environment.DIRECTORY_DCIM + "/" + AppUtils.getAppName());
        r1.put("is_pending", 1);
        Uri r11 = Utils.getApp().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, r1);
        OX0 r2 = 0;
        if (r11 != null) goto L47;
        OutputStream r3 = null;
    L45:
        Bitmap.CompressFormat r5 = Bitmap.CompressFormat.JPEG;     // Catch: Throwable -> L18 Exception -> L20
        Intrinsics.XXI(r3);     // Catch: Throwable -> L18 Exception -> L20
        r9.compress(r5, 100, r3);     // Catch: Throwable -> L18 Exception -> L20
        r1.clear();     // Catch: Throwable -> L18 Exception -> L20
        r1.put("is_pending", 0);     // Catch: Throwable -> L18 Exception -> L20
        if (r11 == null) goto L22;
        Utils.getApp().getContentResolver().update(r11, r1, null, null);     // Catch: Throwable -> L18 Exception -> L20
    L22:
        ToastUtils.showLong(getString(R.string.success_save), new Object[0]);     // Catch: Throwable -> L18 Exception -> L20
        r3.close();     // Catch: IOException -> L25
        r9.recycle();     // Catch: IOException -> L25
        return;
    L20:
        e = e;
    L27:
        if (r11 == null) goto L29;
        Utils.getApp().getContentResolver().delete(r11, null, null);     // Catch: Throwable -> L18
    L29:
        e.printStackTrace();     // Catch: Throwable -> L18
        ToastUtils.showLong(getString(R.string.fail), new Object[0]);     // Catch: Throwable -> L18
        if (r3 == null) goto L32;
        r3.close();     // Catch: IOException -> L25
    L32:
        r9.recycle();     // Catch: IOException -> L25
        return;
    L47:
        r3 = Utils.getApp().getContentResolver().openOutputStream(r11);     // Catch: Throwable -> L10 Exception -> L12
    L12:
        e = e;
        r3 = null;
    L10:
        th = th;
    L34:
        if (r2 != 0) goto L43;
    L38:
        r9.recycle();     // Catch: IOException -> L36
    L41:
        throw th;
    L36:
        e = move-exception;
        e.printStackTrace();
        goto L41
    L43:
        r2.close();     // Catch: IOException -> L36
    L18:
        th = th;
        r2 = 29;
    L25:
        e = move-exception;
        e.printStackTrace();
    }

    public static /* synthetic */ void shareFile$default(MapShareActivity r0, String r1, Bitmap r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = "image/*";
    L5:
        r0.shareFile(r1, r2, r3);
    }

    private static final ImageView shareMapImage_delegate$lambda$0(MapShareActivity r1) {
        return (ImageView) r1.findViewById(R.id.share_map_image);
    }

    private static final View shareMapWxLayout_delegate$lambda$0(MapShareActivity r1) {
        return r1.findViewById(R.id.share_map_wx_pyq_layout);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    @aa1
    public final File getMIntentFile() {
        return this.mIntentFile;
    }

    @aa1
    public final File getMIntentFileVideo() {
        return this.mIntentFileVideo;
    }

    @aa1
    public final String getMIntentType() {
        return this.mIntentType;
    }

    public final ImageView getShareMapImage() {
        return (ImageView) getValue();
    }

    public final View getShareMapWxLayout() {
        return (View) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    public final void initBitmap() {
        Bitmap r0 = BitmapFactory.decodeFile(this.mIntentFile.getAbsolutePath());
        ViewGroup.LayoutParams r1 = getShareMapImage().getLayoutParams();
        r1.height = r0.getHeight();
        getShareMapImage().setLayoutParams(r1);
        Glide.with(this).load(r0).into(getShareMapImage());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        i72 r0 = i72.OXO1;
        if (r0.O0() == true) goto L5;
        findViewById(R.id.share_map_image_ll2).setVisibility(0);
        findViewById(R.id.share_map_video_ll2).setVisibility(0);
        findViewById(R.id.share_map_btn_ll).setVisibility(8);
    L5:
        getAbhTitleCenter().setText(getString(R.string.share));
        if (Intrinsics.XOO0ii0(getMArg0(), "1") == false) goto L9;
        findViewById(R.id.share_map_video_ll).setVisibility(4);
        findViewById(R.id.share_map_video_ll2).setVisibility(8);
    L11:
        initBitmap();
        if (r0.O0() == true) goto L15;
        findViewById(R.id.share_map_wx_layout).setVisibility(8);
        findViewById(R.id.share_map_wx_pyq_layout).setVisibility(8);
        return;
    L15:
        return;
    L9:
        if (Intrinsics.XOO0ii0(getMArg0(), "3") == false) goto L11;
        this.mActivityType = 3;
        this.mIntentType = "video/*";
        sz0 r2 = sz0.OXO1;
        this.mIntentFileVideo = new File(uz0.OO(r2), "mapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
        this.mIntentFile = uz0.XOX0O0(r2);
        videoHideView();
        goto L11
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_share_map;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r5, int r6, @tb1 Intent r7) {
        super.onActivityResult(r5, r6, r7);
        if (r6 != (-1)) goto L13;
        this.mActivityType = r5;
        LogUtils.d(new Object[]{"onActivityResult requestCode=" + r5});
        String r8 = "image/*";
        if (r5 != 2) goto L7;
        this.mIntentFile = uz0.iOiXi11II(sz0.OXO1);
        findViewById(R.id.share_map_btn_ll).setVisibility(8);
        findViewById(R.id.share_map_image_ll2).setVisibility(8);
        findViewById(R.id.share_map_video_ll2).setVisibility(8);
    L11:
        this.mIntentType = r8;
        initBitmap();
        return;
    L7:
        if (r5 == 3) goto L9;
        this.mIntentFile = uz0.XOX0O0(sz0.OXO1);
        goto L11
    L9:
        sz0 r9 = sz0.OXO1;
        this.mIntentFileVideo = new File(uz0.OO(r9), "mapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
        this.mIntentFile = uz0.XOX0O0(r9);
        videoHideView();
        r8 = "video/*";
        goto L11
    }

    public final void onSaveImage(@aa1 View r7) {
        Intrinsics.X0O(r7, "view");
        if (this.mActivityType == 3) goto L5;
        Bitmap r2 = BitmapFactory.decodeFile(this.mIntentFile.getPath());
        String r1 = this.mFormat.format(new Date()) + ".jpg";
        Intrinsics.XXI(r2);
        shareFile$default(this, r1, r2, null, 4, null);
        return;
    L5:
        if (copyMp4File() == false) goto L8;
        ToastUtils.showLong(getString(R.string.success_save), new Object[0]);
        return;
    L8:
        ToastUtils.showLong(getString(R.string.fail), new Object[0]);
    }

    public final void onShareCardImage(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        int r5 = getMArg1();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", r5);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r6 = new Intent(this, ShareCardActivity.class);
        r6.putExtras(r0);
        startActivityForResult(r6, 2);
    }

    public final void onShareMore(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        Intent r6 = new Intent("android.intent.action.SEND");
        r6.putExtra("android.intent.extra.TEXT", "");
        if (this.mActivityType != 3) goto L5;
        r6.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(this.mIntentFileVideo));
    L6:
        r6.setType(this.mIntentType);
        Intent r7 = Intent.createChooser(r6, "");
        Intrinsics.O10IXXX0X(r7, "createChooser(...)");
        r7.addFlags(268435456);
        startActivity(r7);
        return;
    L5:
        r6.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(this.mIntentFile));
        goto L6
    }

    public final void onShareVideo(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        int r5 = getMArg1();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", r5);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r6 = new Intent(this, ShareVideoActivity.class);
        r6.putExtras(r0);
        startActivityForResult(r6, 3);
    }

    public final void onShareWeChat(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        ComponentName r2 = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI");
        if (this.mActivityType != 3) goto L6;
        shareFile$default(this, r2, this.mIntentFileVideo, null, 4, null);
        return;
    L6:
        h94 r9 = h94.OXO1;
        String r0 = this.mIntentFile.getAbsolutePath();
        Intrinsics.O10IXXX0X(r0, "getAbsolutePath(...)");
        h94.I0IIOi(r9, r0, 0, 2, null);
    }

    public final void onShareWechatMoments(@aa1 View r8) {
        Intrinsics.X0O(r8, "view");
        ComponentName r2 = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI");
        if (this.mActivityType != 3) goto L6;
        copyMp4File();
        ComponentName r9 = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
        Intent r0 = new Intent();
        r0.setAction("android.intent.action.MAIN");
        r0.addCategory("android.intent.category.LAUNCHER");
        r0.addFlags(268435456);
        r0.setComponent(r9);
        startActivity(r0);
        return;
    L6:
        shareFile$default(this, r2, null, null, 6, null);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void setMIntentFile(@aa1 File r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIntentFile = r2;
    }

    public final void setMIntentFileVideo(@aa1 File r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIntentFileVideo = r2;
    }

    public final void setMIntentType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mIntentType = r2;
    }

    public final void videoHideView() {
        findViewById(R.id.share_map_btn_ll).setVisibility(8);
        findViewById(R.id.share_map_wx_layout).setVisibility(8);
        findViewById(R.id.share_map_wx_pyq_layout).setVisibility(8);
        findViewById(R.id.share_map_image_ll2).setVisibility(8);
        findViewById(R.id.share_map_video_ll2).setVisibility(8);
    }

    public static /* synthetic */ void shareFile$default(MapShareActivity r0, ComponentName r1, File r2, String r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r0.mIntentFile;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = r0.mIntentType;
    L8:
        r0.shareFile(r1, r2, r3);
    }

    public final void shareFile(@aa1 ComponentName r4, @aa1 File r5, @aa1 String r6) {
        Intrinsics.X0O(r4, "comp");
        Intrinsics.X0O(r5, "mFile");
        Intrinsics.X0O(r6, "mType");
        Intent r0 = new Intent("android.intent.action.SEND");
        r0.putExtra("android.intent.extra.TEXT", "");
        r0.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(r5));
        r0.setType(r6);
        r0.setComponent(r4);
        Intent r7 = Intent.createChooser(r0, "");
        Intrinsics.O10IXXX0X(r7, "createChooser(...)");
        r7.addFlags(268435456);
        startActivity(r7);
    }
}
