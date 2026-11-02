package com.sma.smartv3.ui.device;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ca2;
import com.android.mltcode.paycertificationapi.da2;
import com.android.mltcode.paycertificationapi.ea2;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.PrayTimeType;
import com.sma.smartv3.model.PrayerTime;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaTimeCorrectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n18#2,2:121\n15#2:123\n*S KotlinDebug\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity\n*L\n109#1:121,2\n109#1:123\n*E\n"})
public final class QiblaTimeCorrectActivity extends BaseActivity {

    @aa1
    private CustomLocation mLocation;
    private Map<Long, ? extends List<PrayerTime>> mPrayerTimeData;

    @aa1
    private final Lazy recycleView$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.QiblaTimeCorrectActivity$showPrayerTime$1, reason: invalid class name */
    @SourceDebugExtension({"SMAP\nQiblaTimeCorrectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n1#2:121\n18#3,2:122\n15#3:124\n11#3,2:125\n*S KotlinDebug\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1\n*L\n79#1:122,2\n79#1:124\n89#1:125,2\n*E\n"})
    public static final class AnonymousClass1 extends CommonAdapter<PrayerTime> {
        final /* synthetic */ QiblaTimeCorrectActivity this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.QiblaTimeCorrectActivity$showPrayerTime$1$OXO1 */
        public static final /* synthetic */ class OXO1 {
            public static final /* synthetic */ int[] OXO1 = null;

            static {
                int[] r0 = new int[PrayTimeType.values().length];
                r0[PrayTimeType.FAJR.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
            L19:
                r0[PrayTimeType.SUNRISE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
            L27:
                r0[PrayTimeType.DHUHR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
            L21:
                r0[PrayTimeType.ASR.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
            L23:
                r0[PrayTimeType.MAGHRIB.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
            L17:
                r0[PrayTimeType.ISHA.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
            L9:
                OXO1 = r0;
            }
        }

        public AnonymousClass1(QiblaTimeCorrectActivity r2, List<PrayerTime> r3) {
            this.this$0 = r2;
            super(r2, R.layout.item_qibla_time, r3);
        }

        public static /* synthetic */ boolean OXO1(PrayerTime r0, QiblaTimeCorrectActivity r1, int r2) {
            return convert$lambda$1$1$0(r0, r1, r2);
        }

        public static /* synthetic */ void XIi00iiXO(QiblaTimeCorrectActivity r0, int r1, PrayerTime r2, View r3) {
            convert$lambda$1(r0, r1, r2, r3);
        }

        private static final void convert$lambda$1(final QiblaTimeCorrectActivity r3, int r4, final PrayerTime r5, View r6) {
            ArrayList r7 = new ArrayList(121);
            int r1 = 0;
        L3:
            if (r1 >= 121) goto L5;
            r7.add(String.valueOf(r1 - 60));
            r1 = r1 + 1;
            goto L3
        L5:
            qv1 r0 = new qv1(r3, r7);
            r0.IXXOO(R.string.prayer_time_correct);
            r0.iOO1ii1(R.string.minute);
            r0.iX(new ea2(r5, r3));
            r0.O1O(r4 + 60);
            r0.IIX1OXO();
        }

        private static final boolean convert$lambda$1$1$0(PrayerTime r5, QiblaTimeCorrectActivity r6, int r7) {
            a01 r0 = a01.OXO1;
            Object r1 = new Gson().fromJson(r0.OXO1().getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
            if (r1 != null) goto L5;
            r1 = PrayerTimeSettings.class.newInstance();
        L5:
            PrayerTimeSettings r2 = (PrayerTimeSettings) r1;
            int r8 = r7 - 60;
            switch(OXO1.OXO1[r5.getType().ordinal()]) {
                case 1: goto L14;
                case 2: goto L13;
                case 3: goto L12;
                case 4: goto L11;
                case 5: goto L10;
                case 6: goto L9;
                default: goto L8;
            };
        L9:
            r2.setIshaAdjustment(r8);
        L15:
            r0.OXO1().put(PrayerTimeSettings.class.getName(), new Gson().toJson(r2));
            r6.onInfoChange(new Object());
            return true;
        L10:
            r2.setMaghribAdjustment(r8);
            goto L15
        L11:
            r2.setAsrAdjustment(r8);
            goto L15
        L12:
            r2.setDhuhrAdjustment(r8);
            goto L15
        L13:
            r2.setSunriseAdjustment(r8);
            goto L15
        L14:
            r2.setFajrAdjustment(r8);
            goto L15
        L8:
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public /* bridge */ /* synthetic */ void convert(ViewHolder r1, PrayerTime r2, int r3) {
            convert2(r1, r2, r3);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public void convert2(ViewHolder r4, final PrayerTime r5, int r6) {
            Intrinsics.X0O(r4, "holder");
            Intrinsics.X0O(r5, MapController.ITEM_LAYER_TAG);
            TextView r7 = (TextView) r4.getView(R.id.tv_name);
            Context r0 = this.mContext;
            Intrinsics.O10IXXX0X(r0, "mContext");
            r7.setText(r5.getTimeName(r0));
            ((TextView) r4.getView(R.id.tv_time)).setText(r5.getTimeString());
            final int r8 = r5.getAdjustmentMin();
            TextView r1 = (TextView) r4.getView(R.id.tv_min);
            if (r8 == 0) goto L5;
            String r2 = O0X11OiO.IiI10X(r8, R.string.minute);
        L6:
            r1.setText(r2);
            View r3 = r4.getView(R.id.ll_content);
            Intrinsics.O10IXXX0X(r3, "getView(...)");
            UtilsKt.IX1XiI(r3, 200.0f);
            View r9 = r4.getView(R.id.container);
            Intrinsics.XXI(r9);
            UtilsKt.IX1XiI(r9, 200.0f);
            r9.setBackgroundDrawable(null);
            Context r10 = this.mContext;
            Intrinsics.O10IXXX0X(r10, "mContext");
            r4.setImageResource(R.id.iv_icon, r5.getTimeIcon(r10));
            View r11 = r4.getConvertView();
            final QiblaTimeCorrectActivity r12 = this.this$0;
            r11.setOnClickListener(new da2(r12, r8, r5));
            return;
        L5:
            r2 = "";
            goto L6
        }
    }

    public QiblaTimeCorrectActivity() {
        this.recycleView$delegate = LazyKt__LazyJVMKt.iO(new ca2(this));
        this.mLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0, null, 0.0f, 0.0f, 0.0f, 1023, null);
    }

    public static /* synthetic */ RecyclerView OIX0iXi(QiblaTimeCorrectActivity r0) {
        return recycleView_delegate$lambda$0(r0);
    }

    private final RecyclerView getRecycleView() {
        return (RecyclerView) getValue();
    }

    private static final RecyclerView recycleView_delegate$lambda$0(QiblaTimeCorrectActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.recyclerView);
    }

    private final void showPrayerTime(long r4) {
        Map<Long, ? extends List<PrayerTime>> r0 = this.mPrayerTimeData;
        if (r0 != null) goto L5;
        Intrinsics.XXO("mPrayerTimeData");
        r0 = null;
    L5:
        List<PrayerTime> r1 = r0.get(Long.valueOf(r4));
        i1O0OXO1O.OXO1.OXO1("showPrayerTime " + O0X11OiO.IO0iXO0O().format(Long.valueOf(r4)) + " - " + r1);
        getRecycleView().setLayoutManager(new LinearLayoutManager(this));
        getRecycleView().setAdapter(new AnonymousClass1(this, r1));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @RequiresApi(26)
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.prayer_time_correct);
        onInfoChange(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_qibla_time_correct;
    }

    @sf5(tag = b01.XX1Oi)
    public final void onInfoChange(@aa1 Object r12) {
        Intrinsics.X0O(r12, "data");
        this.mLocation = UtilsKt.XXIIO1i11();
        Calendar r13 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r13, "getInstance(...)");
        long r6 = O0X11OiO.XiOIii1(r13);
        SPUtils r14 = a01.OXO1.OXO1();
        Object r15 = new Gson().fromJson(r14.getString(PrayerTimeSettings.class.getName()), PrayerTimeSettings.class);
        if (r15 != null) goto L5;
        r15 = PrayerTimeSettings.class.newInstance();
    L5:
        this.mPrayerTimeData = PrayerTimesKt.getPrayerTimeMap$default((PrayerTimeSettings) r15, this.mLocation.XO0O10(), this.mLocation.IiI10X(), r6, 0, 16, null);
        showPrayerTime(r6);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
