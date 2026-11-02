package com.sma.smartv3.ui.device.dial;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I0OIO1i;
import com.android.mltcode.paycertificationapi.I10IIOII;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.iXiIO0i;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.gson.Gson;
import com.sma.smartv3.model.WatchFaceCategory;
import com.sma.smartv3.model.WatchFaceInfo;
import com.szabh.smable3.component.BleCache;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nDialPickerPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n90#2:111\n90#2:112\n1#3:113\n*S KotlinDebug\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup\n*L\n47#1:111\n49#1:112\n*E\n"})
public final class DialPickerPopup extends I0OIO1i {

    @aa1
    public final RecyclerView I0IIOi;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.DialPickerPopup$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nDialPickerPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class AnonymousClass1 extends CommonAdapter<Integer> {
        final /* synthetic */ iXiIO0i $callback;
        final /* synthetic */ WatchFaceInfo[] $list;
        final /* synthetic */ DialPickerPopup this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.DialPickerPopup$1$OXO1 */
        public static final class OXO1 extends SimpleTarget<Bitmap> {
            public final /* synthetic */ ImageView IO;

            public OXO1(ImageView r1) {
                this.IO = r1;
            }

            public void OXO1(Bitmap r1, Transition<? super Bitmap> r2) {
                Intrinsics.X0O(r1, "resource");
                this.IO.setImageBitmap(r1);
                this.IO.setBackgroundResource(R.color.transparent);
            }

            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object r1, Transition r2) {
                OXO1((Bitmap) r1, r2);
            }
        }

        public AnonymousClass1(Activity r1, List<Integer> r2, DialPickerPopup r3, WatchFaceInfo[] r4, iXiIO0i r5) {
            this.this$0 = r3;
            this.$list = r4;
            this.$callback = r5;
            super(r1, com.sma.smartv3.pro.R.layout.item_dial_picker, r2);
        }

        public static /* synthetic */ void OXO1(iXiIO0i r0, int r1, DialPickerPopup r2, View r3) {
            convert$lambda$1(r0, r1, r2, r3);
        }

        private static final void convert$lambda$1(iXiIO0i r0, int r1, DialPickerPopup r2, View r3) {
            r0.OXO1(r1);
            r2.dismiss();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, Integer r2, int r3) {
            convert(r1, r2.intValue(), r3);
        }

        public void convert(ViewHolder r9, int r10, final int r11) {
            Intrinsics.X0O(r9, "holder");
            ImageView r1 = (ImageView) r9.getView(com.sma.smartv3.pro.R.id.iv);
            int r2 = 0;
            if (r10 != 0) goto L6;
            DialPickerPopup r12 = this.this$0;
            Intrinsics.XXI(r1);
            WatchFaceInfo[] r3 = this.$list;
            Intrinsics.XXI(r3);
            r12.XiOIii1(r1, r3[0].getPreviewPath());
        L26:
            ImageView r13 = (ImageView) r9.getView(com.sma.smartv3.pro.R.id.iv);
            final iXiIO0i r14 = this.$callback;
            final DialPickerPopup r0 = this.this$0;
            r13.setOnClickListener(new I10IIOII(r14, r11, r0));
            return;
        L6:
            if (r10 < 1000000) goto L11;
            File r4 = uz0.X11iII1O1(sz0.OXO1);
            BleCache r5 = BleCache.INSTANCE;
            File r6 = new File(r4, r5.getMPrototype() + IiXI1X1OO.O00 + r5.getMBleName() + IiXI1X1OO.O00 + r10 + ".png");
            if (FileUtils.isFileExists(r6) == false) goto L10;
            r1.setImageURI(Uri.fromFile(r6));
            goto L26
        L10:
            DialPickerPopup r15 = this.this$0;
            Intrinsics.XXI(r1);
            WatchFaceInfo[] r7 = this.$list;
            Intrinsics.XXI(r7);
            r15.XiOIii1(r1, r7[0].getPreviewPath());
            goto L26
        L11:
            WatchFaceInfo[] r8 = this.$list;
            Intrinsics.XXI(r8);
            int r16 = r8.length;
        L12:
            String r17 = null;
            if (r2 >= r16) goto L18;
            WatchFaceInfo r18 = r8[r2];
            if (r18.getId() == r10) goto L19;
            r2 = r2 + 1;
        L19:
            if (r18 == null) goto L21;
            String r19 = r18.getPreviewPath();
        L22:
            LogUtils.d(new Object[]{r19});
            r1.setBackgroundResource(com.sma.smartv3.pro.R.color.line_color);
            RequestBuilder<Bitmap> r110 = Glide.with(this.this$0.XO0O10()).asBitmap();
            if (r18 == null) goto L25;
            r17 = r18.getPreviewPath();
        L25:
            Intrinsics.XXI(r110.load(r17).into(new OXO1(r1)));
            goto L26
        L21:
            r19 = null;
            goto L22
        L18:
            r18 = null;
            goto L19
        }
    }

    public static final class OXO1 extends SimpleTarget<Bitmap> {
        public final /* synthetic */ DialPickerPopup I1;
        public final /* synthetic */ ImageView IO;

        public OXO1(ImageView r1, DialPickerPopup r2) {
            this.IO = r1;
            this.I1 = r2;
        }

        public void OXO1(Bitmap r2, Transition<? super Bitmap> r3) {
            Intrinsics.X0O(r2, "resource");
            this.IO.setImageBitmap(ImageUtils.toGray(r2));
            this.IO.setImageTintList(this.I1.XO0O10().getResources().getColorStateList(R.color.darker_gray));
            this.IO.setBackgroundResource(R.color.transparent);
        }

        @Override // com.bumptech.glide.request.target.Target
        public /* bridge */ /* synthetic */ void onResourceReady(Object r1, Transition r2) {
            OXO1((Bitmap) r1, r2);
        }
    }

    public DialPickerPopup(@aa1 Activity r7, @aa1 List<Integer> r8, int r9, @aa1 iXiIO0i r10) {
        Intrinsics.X0O(r7, "activity");
        Intrinsics.X0O(r8, "ids");
        Intrinsics.X0O(r10, "callback");
        super(r7);
        if (r9 != 0) goto L6;
        SPUtils r11 = a01.OXO1.iO();
        WatchFaceInfo[] r12 = (WatchFaceInfo[]) new Gson().fromJson(r11.getString(b01.X00XIX1 + '_' + WatchFaceInfo[].class.getName()), WatchFaceInfo[].class);
    L5:
        WatchFaceInfo[] r4 = r12;
    L18:
        LayoutInflater.from(XO0O10()).inflate(com.sma.smartv3.pro.R.layout.pop_dial_picker, IiI10X());
        View r13 = IiI10X().findViewById(com.sma.smartv3.pro.R.id.rv);
        Intrinsics.O10IXXX0X(r13, "findViewById(...)");
        RecyclerView r14 = (RecyclerView) r13;
        this.I0IIOi = r14;
        Activity r1 = XO0O10();
        if (r8.size() <= 2) goto L21;
        int r2 = 3;
    L22:
        r14.setLayoutManager(new GridLayoutManager(r1, r2));
        r14.setAdapter(new AnonymousClass1(r7, r8, this, r4, r10));
        return;
    L21:
        r2 = r8.size();
        goto L22
    L6:
        SPUtils r3 = a01.OXO1.iO();
        WatchFaceCategory[] r0 = (WatchFaceCategory[]) new Gson().fromJson(r3.getString(b01.iOiXi11II + '_' + WatchFaceCategory[].class.getName()), WatchFaceCategory[].class);
        if (r0 == null) goto L17;
        int r5 = r0.length;
        int r6 = 0;
    L9:
        if (r6 >= r5) goto L14;
        WatchFaceCategory r15 = r0[r6];
        if (r15.getType() == r9) goto L15;
        r6 = r6 + 1;
    L15:
        if (r15 == null) goto L17;
        r12 = r15.getList();
        goto L5
    L14:
        r15 = null;
    L17:
        r4 = null;
        goto L18
    }

    @aa1
    public final RecyclerView OiIIX101O() {
        return this.I0IIOi;
    }

    public final void XiOIii1(@aa1 ImageView r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "imageView");
        Intrinsics.X0O(r3, "url");
        r2.setBackgroundResource(com.sma.smartv3.pro.R.color.line_color);
        Glide.with(XO0O10()).asBitmap().load(r3).into(new OXO1(r2, this));
    }

    public /* synthetic */ DialPickerPopup(Activity r1, List r2, int r3, iXiIO0i r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        this(r1, r2, r3, r4);
    }
}
