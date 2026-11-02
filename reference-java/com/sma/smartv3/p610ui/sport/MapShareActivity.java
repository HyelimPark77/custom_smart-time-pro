package com.sma.smartv3.p610ui.sport;

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
import androidx.fragment.app.FragmentActivity;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.h94;
import com.android.mltcode.paycertificationapi.i72;
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
import com.sma.smartv3.p610ui.sport.MapShareActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
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
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    private File mIntentFile;

    @aa1
    private File mIntentFileVideo;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h40
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MapShareActivity.abhTitleCenter_delegate$lambda$0(this.f7040IO);
        }
    });

    @aa1
    private final Lazy shareMapImage$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i40
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MapShareActivity.shareMapImage_delegate$lambda$0(this.f7737IO);
        }
    });

    @aa1
    private final Lazy shareMapWxLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.j40
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return MapShareActivity.shareMapWxLayout_delegate$lambda$0(this.f8874IO);
        }
    });

    @aa1
    private final SimpleDateFormat mFormat = O0X11OiO.X11I();
    private int mActivityType = 1;

    @aa1
    private String mIntentType = "image/*";

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public MapShareActivity() {
        sz0 sz0Var = sz0.OXO1;
        this.mIntentFile = uz0.XOX0O0(sz0Var);
        this.mIntentFileVideo = uz0.XOX0O0(sz0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(MapShareActivity mapShareActivity) {
        return (PFMedium) mapShareActivity.findViewById(R.id.abh_title_center);
    }

    private final boolean copyMp4File() {
        try {
            File fileIiiXiI0I = uz0.IiiXiI0I(sz0.OXO1, "MapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
            if (!FileUtils.copy(this.mIntentFileVideo, fileIiiXiI0I)) {
                return false;
            }
            FileUtils.notifySystemToScan(fileIiiXiI0I);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bc A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:15:0x007e, B:17:0x0094, B:22:0x00a5, B:28:0x00bc, B:29:0x00c7), top: B:42:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8 A[Catch: IOException -> 0x00b5, TRY_ENTER, TryCatch #2 {IOException -> 0x00b5, blocks: (B:23:0x00ae, B:31:0x00d8, B:32:0x00db), top: B:42:0x0069 }] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void shareFile(String str, Bitmap bitmap, String str2) throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        File fileIiiXiI0I = uz0.IiiXiI0I(sz0.OXO1, str);
        if (Build.VERSION.SDK_INT < 29) {
            ImageUtils.save(bitmap, fileIiiXiI0I, Bitmap.CompressFormat.JPEG);
            FileUtils.notifySystemToScan(fileIiiXiI0I);
            ToastUtils.showLong(getString(R.string.success_save), new Object[0]);
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", Environment.DIRECTORY_DCIM + "/" + AppUtils.getAppName());
        contentValues.put("is_pending", (Integer) 1);
        Uri uriInsert = Utils.getApp().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        OX0 ox0 = 0;
        try {
            try {
                if (uriInsert != null) {
                    try {
                        outputStreamOpenOutputStream = Utils.getApp().getContentResolver().openOutputStream(uriInsert);
                    } catch (Exception e) {
                        e = e;
                        outputStreamOpenOutputStream = null;
                        if (uriInsert != null) {
                            Utils.getApp().getContentResolver().delete(uriInsert, null, null);
                        }
                        e.printStackTrace();
                        ToastUtils.showLong(getString(R.string.fail), new Object[0]);
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                        }
                        bitmap.recycle();
                    } catch (Throwable th) {
                        th = th;
                        if (ox0 != 0) {
                            try {
                                ox0.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                throw th;
                            }
                        }
                        bitmap.recycle();
                        throw th;
                    }
                } else {
                    outputStreamOpenOutputStream = null;
                }
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    Intrinsics.XXI(outputStreamOpenOutputStream);
                    bitmap.compress(compressFormat, 100, outputStreamOpenOutputStream);
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    if (uriInsert != null) {
                        Utils.getApp().getContentResolver().update(uriInsert, contentValues, null, null);
                    }
                    ToastUtils.showLong(getString(R.string.success_save), new Object[0]);
                    outputStreamOpenOutputStream.close();
                    bitmap.recycle();
                } catch (Exception e3) {
                    e = e3;
                    if (uriInsert != null) {
                        Utils.getApp().getContentResolver().delete(uriInsert, null, null);
                    }
                    e.printStackTrace();
                    ToastUtils.showLong(getString(R.string.fail), new Object[0]);
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    bitmap.recycle();
                }
            } catch (Throwable th2) {
                th = th2;
                ox0 = 29;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public static /* synthetic */ void shareFile$default(MapShareActivity mapShareActivity, String str, Bitmap bitmap, String str2, int i, Object obj) throws Throwable {
        if ((i & 4) != 0) {
            str2 = "image/*";
        }
        mapShareActivity.shareFile(str, bitmap, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView shareMapImage_delegate$lambda$0(MapShareActivity mapShareActivity) {
        return (ImageView) mapShareActivity.findViewById(R.id.share_map_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View shareMapWxLayout_delegate$lambda$0(MapShareActivity mapShareActivity) {
        return mapShareActivity.findViewById(R.id.share_map_wx_pyq_layout);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
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
        return (ImageView) this.shareMapImage$delegate.getValue();
    }

    public final View getShareMapWxLayout() {
        return (View) this.shareMapWxLayout$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    public final void initBitmap() {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.mIntentFile.getAbsolutePath());
        ViewGroup.LayoutParams layoutParams = getShareMapImage().getLayoutParams();
        layoutParams.height = bitmapDecodeFile.getHeight();
        getShareMapImage().setLayoutParams(layoutParams);
        Glide.with((FragmentActivity) this).load(bitmapDecodeFile).into(getShareMapImage());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        i72 i72Var = i72.OXO1;
        if (!i72Var.m2045O0()) {
            findViewById(R.id.share_map_image_ll2).setVisibility(0);
            findViewById(R.id.share_map_video_ll2).setVisibility(0);
            findViewById(R.id.share_map_btn_ll).setVisibility(8);
        }
        getAbhTitleCenter().setText(getString(R.string.share));
        if (Intrinsics.XOO0ii0(getMArg0(), "1")) {
            findViewById(R.id.share_map_video_ll).setVisibility(4);
            findViewById(R.id.share_map_video_ll2).setVisibility(8);
        } else if (Intrinsics.XOO0ii0(getMArg0(), "3")) {
            this.mActivityType = 3;
            this.mIntentType = "video/*";
            sz0 sz0Var = sz0.OXO1;
            this.mIntentFileVideo = new File(uz0.m3188OO(sz0Var), "mapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
            this.mIntentFile = uz0.XOX0O0(sz0Var);
            videoHideView();
        }
        initBitmap();
        if (i72Var.m2045O0()) {
            return;
        }
        findViewById(R.id.share_map_wx_layout).setVisibility(8);
        findViewById(R.id.share_map_wx_pyq_layout).setVisibility(8);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_share_map;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            this.mActivityType = i;
            LogUtils.m11128d("onActivityResult requestCode=" + i);
            String str = "image/*";
            if (i == 2) {
                this.mIntentFile = uz0.iOiXi11II(sz0.OXO1);
                findViewById(R.id.share_map_btn_ll).setVisibility(8);
                findViewById(R.id.share_map_image_ll2).setVisibility(8);
                findViewById(R.id.share_map_video_ll2).setVisibility(8);
            } else if (i != 3) {
                this.mIntentFile = uz0.XOX0O0(sz0.OXO1);
            } else {
                sz0 sz0Var = sz0.OXO1;
                this.mIntentFileVideo = new File(uz0.m3188OO(sz0Var), "mapVideo" + getMArg1() + IiXI1X1OO.O00 + Utils.getApp().getResources().getConfiguration().locale.getLanguage() + ".mp4");
                this.mIntentFile = uz0.XOX0O0(sz0Var);
                videoHideView();
                str = "video/*";
            }
            this.mIntentType = str;
            initBitmap();
        }
    }

    public final void onSaveImage(@aa1 View view) throws Throwable {
        Intrinsics.X0O(view, "view");
        if (this.mActivityType == 3) {
            if (copyMp4File()) {
                ToastUtils.showLong(getString(R.string.success_save), new Object[0]);
                return;
            } else {
                ToastUtils.showLong(getString(R.string.fail), new Object[0]);
                return;
            }
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.mIntentFile.getPath());
        String str = this.mFormat.format(new Date()) + ".jpg";
        Intrinsics.XXI(bitmapDecodeFile);
        shareFile$default(this, str, bitmapDecodeFile, (String) null, 4, (Object) null);
    }

    public final void onShareCardImage(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int mArg1 = getMArg1();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) ShareCardActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 2);
    }

    public final void onShareMore(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "");
        if (this.mActivityType == 3) {
            intent.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(this.mIntentFileVideo));
        } else {
            intent.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(this.mIntentFile));
        }
        intent.setType(this.mIntentType);
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        Intrinsics.O10IXXX0X(intentCreateChooser, "createChooser(...)");
        intentCreateChooser.addFlags(268435456);
        startActivity(intentCreateChooser);
    }

    public final void onShareVideo(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        int mArg1 = getMArg1();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", mArg1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) ShareVideoActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 3);
    }

    public final void onShareWeChat(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        ComponentName componentName = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI");
        if (this.mActivityType == 3) {
            shareFile$default(this, componentName, this.mIntentFileVideo, (String) null, 4, (Object) null);
            return;
        }
        h94 h94Var = h94.OXO1;
        String absolutePath = this.mIntentFile.getAbsolutePath();
        Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
        h94.I0IIOi(h94Var, absolutePath, 0, 2, null);
    }

    public final void onShareWechatMoments(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        ComponentName componentName = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI");
        if (this.mActivityType != 3) {
            shareFile$default(this, componentName, (File) null, (String) null, 6, (Object) null);
            return;
        }
        copyMp4File();
        ComponentName componentName2 = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        intent.setComponent(componentName2);
        startActivity(intent);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void setMIntentFile(@aa1 File file) {
        Intrinsics.X0O(file, "<set-?>");
        this.mIntentFile = file;
    }

    public final void setMIntentFileVideo(@aa1 File file) {
        Intrinsics.X0O(file, "<set-?>");
        this.mIntentFileVideo = file;
    }

    public final void setMIntentType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mIntentType = str;
    }

    public final void videoHideView() {
        findViewById(R.id.share_map_btn_ll).setVisibility(8);
        findViewById(R.id.share_map_wx_layout).setVisibility(8);
        findViewById(R.id.share_map_wx_pyq_layout).setVisibility(8);
        findViewById(R.id.share_map_image_ll2).setVisibility(8);
        findViewById(R.id.share_map_video_ll2).setVisibility(8);
    }

    public static /* synthetic */ void shareFile$default(MapShareActivity mapShareActivity, ComponentName componentName, File file, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            file = mapShareActivity.mIntentFile;
        }
        if ((i & 4) != 0) {
            str = mapShareActivity.mIntentType;
        }
        mapShareActivity.shareFile(componentName, file, str);
    }

    public final void shareFile(@aa1 ComponentName comp, @aa1 File mFile, @aa1 String mType) {
        Intrinsics.X0O(comp, "comp");
        Intrinsics.X0O(mFile, "mFile");
        Intrinsics.X0O(mType, "mType");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(mFile));
        intent.setType(mType);
        intent.setComponent(comp);
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        Intrinsics.O10IXXX0X(intentCreateChooser, "createChooser(...)");
        intentCreateChooser.addFlags(268435456);
        startActivity(intentCreateChooser);
    }
}
