package com.sma.smartv3.p610ui.device.dial;

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
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.gson.Gson;
import com.sma.smartv3.model.WatchFaceCategory;
import com.sma.smartv3.model.WatchFaceInfo;
import com.sma.smartv3.p610ui.device.dial.DialPickerPopup;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.DialPickerPopup$1 */
    @SourceDebugExtension({"SMAP\nDialPickerPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialPickerPopup.kt\ncom/sma/smartv3/ui/device/dial/DialPickerPopup$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class C188021 extends CommonAdapter<Integer> {
        final /* synthetic */ iXiIO0i $callback;
        final /* synthetic */ WatchFaceInfo[] $list;
        final /* synthetic */ DialPickerPopup this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.dial.DialPickerPopup$1$OXO1 */
        public static final class OXO1 extends SimpleTarget<Bitmap> {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ ImageView f54543IO;

            public OXO1(ImageView imageView) {
                this.f54543IO = imageView;
            }

            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                Intrinsics.X0O(resource, "resource");
                this.f54543IO.setImageBitmap(resource);
                this.f54543IO.setBackgroundResource(R.color.transparent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C188021(Activity activity, List<Integer> list, DialPickerPopup dialPickerPopup, WatchFaceInfo[] watchFaceInfoArr, iXiIO0i ixiio0i) {
            super(activity, com.sma.smartv3.pro.R.layout.item_dial_picker, list);
            this.this$0 = dialPickerPopup;
            this.$list = watchFaceInfoArr;
            this.$callback = ixiio0i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$1(iXiIO0i ixiio0i, int i, DialPickerPopup dialPickerPopup, View view) {
            ixiio0i.OXO1(i);
            dialPickerPopup.dismiss();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder viewHolder, Integer num, int i) {
            convert(viewHolder, num.intValue(), i);
        }

        public void convert(ViewHolder holder, int i, final int i2) {
            WatchFaceInfo watchFaceInfo;
            Intrinsics.X0O(holder, "holder");
            ImageView imageView = (ImageView) holder.getView(com.sma.smartv3.pro.R.id.f51417iv);
            int i3 = 0;
            if (i == 0) {
                DialPickerPopup dialPickerPopup = this.this$0;
                Intrinsics.XXI(imageView);
                WatchFaceInfo[] watchFaceInfoArr = this.$list;
                Intrinsics.XXI(watchFaceInfoArr);
                dialPickerPopup.XiOIii1(imageView, watchFaceInfoArr[0].getPreviewPath());
            } else if (i >= 1000000) {
                File fileX11iII1O1 = uz0.X11iII1O1(sz0.OXO1);
                BleCache bleCache = BleCache.INSTANCE;
                File file = new File(fileX11iII1O1, bleCache.getMPrototype() + IiXI1X1OO.O00 + bleCache.getMBleName() + IiXI1X1OO.O00 + i + ".png");
                if (FileUtils.isFileExists(file)) {
                    imageView.setImageURI(Uri.fromFile(file));
                } else {
                    DialPickerPopup dialPickerPopup2 = this.this$0;
                    Intrinsics.XXI(imageView);
                    WatchFaceInfo[] watchFaceInfoArr2 = this.$list;
                    Intrinsics.XXI(watchFaceInfoArr2);
                    dialPickerPopup2.XiOIii1(imageView, watchFaceInfoArr2[0].getPreviewPath());
                }
            } else {
                WatchFaceInfo[] watchFaceInfoArr3 = this.$list;
                Intrinsics.XXI(watchFaceInfoArr3);
                int length = watchFaceInfoArr3.length;
                while (true) {
                    if (i3 >= length) {
                        watchFaceInfo = null;
                        break;
                    }
                    watchFaceInfo = watchFaceInfoArr3[i3];
                    if (watchFaceInfo.getId() == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
                LogUtils.m11128d(watchFaceInfo != null ? watchFaceInfo.getPreviewPath() : null);
                imageView.setBackgroundResource(com.sma.smartv3.pro.R.color.line_color);
                Intrinsics.XXI(Glide.with(this.this$0.XO0O10()).asBitmap().load(watchFaceInfo != null ? watchFaceInfo.getPreviewPath() : null).into(new OXO1(imageView)));
            }
            ImageView imageView2 = (ImageView) holder.getView(com.sma.smartv3.pro.R.id.f51417iv);
            final iXiIO0i ixiio0i = this.$callback;
            final DialPickerPopup dialPickerPopup3 = this.this$0;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I10IIOII
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialPickerPopup.C188021.convert$lambda$1(ixiio0i, i2, dialPickerPopup3, view);
                }
            });
        }
    }

    public static final class OXO1 extends SimpleTarget<Bitmap> {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ DialPickerPopup f54544I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ ImageView f54545IO;

        public OXO1(ImageView imageView, DialPickerPopup dialPickerPopup) {
            this.f54545IO = imageView;
            this.f54544I1 = dialPickerPopup;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
            Intrinsics.X0O(resource, "resource");
            this.f54545IO.setImageBitmap(ImageUtils.toGray(resource));
            this.f54545IO.setImageTintList(this.f54544I1.XO0O10().getResources().getColorStateList(R.color.darker_gray));
            this.f54545IO.setBackgroundResource(R.color.transparent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:20:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c7  */
    public DialPickerPopup(@aa1 Activity activity, @aa1 List<Integer> ids, int i, @aa1 iXiIO0i callback) {
        WatchFaceInfo[] watchFaceInfoArr;
        WatchFaceCategory watchFaceCategory;
        int size;
        WatchFaceInfo[] list;
        super(activity);
        Intrinsics.X0O(activity, "activity");
        Intrinsics.X0O(ids, "ids");
        Intrinsics.X0O(callback, "callback");
        if (i != 0) {
            SPUtils sPUtilsM1440iO = a01.OXO1.m1440iO();
            WatchFaceCategory[] watchFaceCategoryArr = (WatchFaceCategory[]) new Gson().fromJson(sPUtilsM1440iO.getString(b01.iOiXi11II + '_' + WatchFaceCategory[].class.getName()), WatchFaceCategory[].class);
            if (watchFaceCategoryArr != null) {
                int length = watchFaceCategoryArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        watchFaceCategory = null;
                        break;
                    }
                    watchFaceCategory = watchFaceCategoryArr[i2];
                    if (watchFaceCategory.getType() == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
                list = watchFaceCategory != null ? watchFaceCategory.getList() : list;
                LayoutInflater.from(XO0O10()).inflate(com.sma.smartv3.pro.R.layout.pop_dial_picker, IiI10X());
                View viewFindViewById = IiI10X().findViewById(com.sma.smartv3.pro.R.id.f51422rv);
                Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
                RecyclerView recyclerView = (RecyclerView) viewFindViewById;
                this.I0IIOi = recyclerView;
                Activity activityXO0O10 = XO0O10();
                if (ids.size() > 2) {
                    size = 3;
                } else {
                    size = ids.size();
                }
                recyclerView.setLayoutManager(new GridLayoutManager(activityXO0O10, size));
                recyclerView.setAdapter(new C188021(activity, ids, this, watchFaceInfoArr, callback));
            }
            watchFaceInfoArr = null;
            LayoutInflater.from(XO0O10()).inflate(com.sma.smartv3.pro.R.layout.pop_dial_picker, IiI10X());
            View viewFindViewById2 = IiI10X().findViewById(com.sma.smartv3.pro.R.id.f51422rv);
            Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
            RecyclerView recyclerView2 = (RecyclerView) viewFindViewById2;
            this.I0IIOi = recyclerView2;
            Activity activityXO0O11 = XO0O10();
            if (ids.size() > 2) {
                size = 3;
            } else {
                size = ids.size();
            }
            recyclerView2.setLayoutManager(new GridLayoutManager(activityXO0O11, size));
            recyclerView2.setAdapter(new C188021(activity, ids, this, watchFaceInfoArr, callback));
        }
        SPUtils sPUtilsM1440iO2 = a01.OXO1.m1440iO();
        list = (WatchFaceInfo[]) new Gson().fromJson(sPUtilsM1440iO2.getString(b01.X00XIX1 + '_' + WatchFaceInfo[].class.getName()), WatchFaceInfo[].class);
        watchFaceInfoArr = list;
        LayoutInflater.from(XO0O10()).inflate(com.sma.smartv3.pro.R.layout.pop_dial_picker, IiI10X());
        View viewFindViewById3 = IiI10X().findViewById(com.sma.smartv3.pro.R.id.f51422rv);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        RecyclerView recyclerView3 = (RecyclerView) viewFindViewById3;
        this.I0IIOi = recyclerView3;
        Activity activityXO0O12 = XO0O10();
        if (ids.size() > 2) {
            size = 3;
        } else {
            size = ids.size();
        }
        recyclerView3.setLayoutManager(new GridLayoutManager(activityXO0O12, size));
        recyclerView3.setAdapter(new C188021(activity, ids, this, watchFaceInfoArr, callback));
    }

    @aa1
    public final RecyclerView OiIIX101O() {
        return this.I0IIOi;
    }

    public final void XiOIii1(@aa1 ImageView imageView, @aa1 String url) {
        Intrinsics.X0O(imageView, "imageView");
        Intrinsics.X0O(url, "url");
        imageView.setBackgroundResource(com.sma.smartv3.pro.R.color.line_color);
        Glide.with(XO0O10()).asBitmap().load(url).into(new OXO1(imageView, this));
    }

    public /* synthetic */ DialPickerPopup(Activity activity, List list, int i, iXiIO0i ixiio0i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, list, (i2 & 4) != 0 ? 0 : i, ixiio0i);
    }
}
