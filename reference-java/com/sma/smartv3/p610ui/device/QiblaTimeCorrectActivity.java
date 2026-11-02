package com.sma.smartv3.p610ui.device;

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
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.qv1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.google.gson.Gson;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.PrayTimeType;
import com.sma.smartv3.model.PrayerTime;
import com.sma.smartv3.model.PrayerTimeSettings;
import com.sma.smartv3.model.PrayerTimesKt;
import com.sma.smartv3.p610ui.device.QiblaTimeCorrectActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nQiblaTimeCorrectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n18#2,2:121\n15#2:123\n*S KotlinDebug\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity\n*L\n109#1:121,2\n109#1:123\n*E\n"})
public final class QiblaTimeCorrectActivity extends BaseActivity {
    private Map<Long, ? extends List<PrayerTime>> mPrayerTimeData;

    @aa1
    private final Lazy recycleView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ca2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return QiblaTimeCorrectActivity.recycleView_delegate$lambda$0(this.f5935IO);
        }
    });

    @aa1
    private CustomLocation mLocation = new CustomLocation(0.0d, 0.0d, 0.0d, 0.0f, 0, 0, null, 0.0f, 0.0f, 0.0f, 1023, null);

    /* JADX INFO: renamed from: com.sma.smartv3.ui.device.QiblaTimeCorrectActivity$showPrayerTime$1 */
    @SourceDebugExtension({"SMAP\nQiblaTimeCorrectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n1#2:121\n18#3,2:122\n15#3:124\n11#3,2:125\n*S KotlinDebug\n*F\n+ 1 QiblaTimeCorrectActivity.kt\ncom/sma/smartv3/ui/device/QiblaTimeCorrectActivity$showPrayerTime$1\n*L\n79#1:122,2\n79#1:124\n89#1:125,2\n*E\n"})
    public static final class C187681 extends CommonAdapter<PrayerTime> {

        /* JADX INFO: renamed from: com.sma.smartv3.ui.device.QiblaTimeCorrectActivity$showPrayerTime$1$OXO1 */
        public static final /* synthetic */ class OXO1 {
            public static final /* synthetic */ int[] OXO1;

            static {
                int[] iArr = new int[PrayTimeType.values().length];
                try {
                    iArr[PrayTimeType.FAJR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PrayTimeType.SUNRISE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PrayTimeType.DHUHR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PrayTimeType.ASR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PrayTimeType.MAGHRIB.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PrayTimeType.ISHA.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                OXO1 = iArr;
            }
        }

        public C187681(List<PrayerTime> list) {
            super(QiblaTimeCorrectActivity.this, R.layout.item_qibla_time, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void convert$lambda$1(final QiblaTimeCorrectActivity qiblaTimeCorrectActivity, int i, final PrayerTime prayerTime, View view) {
            ArrayList arrayList = new ArrayList(121);
            for (int i2 = 0; i2 < 121; i2++) {
                arrayList.add(String.valueOf(i2 - 60));
            }
            qv1 qv1Var = new qv1(qiblaTimeCorrectActivity, arrayList);
            qv1Var.IXXOO(R.string.prayer_time_correct);
            qv1Var.iOO1ii1(R.string.minute);
            qv1Var.m2938iX(new Function1() { // from class: com.android.mltcode.paycertificationapi.ea2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(QiblaTimeCorrectActivity.C187681.convert$lambda$1$1$0(prayerTime, qiblaTimeCorrectActivity, ((Integer) obj).intValue()));
                }
            });
            qv1Var.O1O(i + 60);
            qv1Var.IIX1OXO();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean convert$lambda$1$1$0(PrayerTime prayerTime, QiblaTimeCorrectActivity qiblaTimeCorrectActivity, int i) throws IllegalAccessException, InstantiationException {
            a01 a01Var = a01.OXO1;
            Object objFromJson = new Gson().fromJson(a01Var.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
            if (objFromJson == null) {
                objFromJson = PrayerTimeSettings.class.newInstance();
            }
            PrayerTimeSettings prayerTimeSettings = (PrayerTimeSettings) objFromJson;
            int i2 = i - 60;
            switch (OXO1.OXO1[prayerTime.getType().ordinal()]) {
                case 1:
                    prayerTimeSettings.setFajrAdjustment(i2);
                    break;
                case 2:
                    prayerTimeSettings.setSunriseAdjustment(i2);
                    break;
                case 3:
                    prayerTimeSettings.setDhuhrAdjustment(i2);
                    break;
                case 4:
                    prayerTimeSettings.setAsrAdjustment(i2);
                    break;
                case 5:
                    prayerTimeSettings.setMaghribAdjustment(i2);
                    break;
                case 6:
                    prayerTimeSettings.setIshaAdjustment(i2);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            a01Var.OXO1().put(PrayerTimeSettings.class.getName(), new Gson().toJson(prayerTimeSettings));
            qiblaTimeCorrectActivity.onInfoChange(new Object());
            return true;
        }

        @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
        public void convert(ViewHolder holder, final PrayerTime item, int i) throws IllegalAccessException, InstantiationException {
            Intrinsics.X0O(holder, "holder");
            Intrinsics.X0O(item, "item");
            TextView textView = (TextView) holder.getView(R.id.tv_name);
            Context mContext = ((CommonAdapter) this).mContext;
            Intrinsics.O10IXXX0X(mContext, "mContext");
            textView.setText(item.getTimeName(mContext));
            ((TextView) holder.getView(R.id.tv_time)).setText(item.getTimeString());
            final int adjustmentMin = item.getAdjustmentMin();
            ((TextView) holder.getView(R.id.tv_min)).setText(adjustmentMin != 0 ? O0X11OiO.IiI10X(adjustmentMin, R.string.minute) : "");
            View view = holder.getView(R.id.ll_content);
            Intrinsics.O10IXXX0X(view, "getView(...)");
            UtilsKt.IX1XiI(view, 200.0f);
            View view2 = holder.getView(R.id.container);
            Intrinsics.XXI(view2);
            UtilsKt.IX1XiI(view2, 200.0f);
            view2.setBackgroundDrawable(null);
            Context mContext2 = ((CommonAdapter) this).mContext;
            Intrinsics.O10IXXX0X(mContext2, "mContext");
            holder.setImageResource(R.id.iv_icon, item.getTimeIcon(mContext2));
            View convertView = holder.getConvertView();
            final QiblaTimeCorrectActivity qiblaTimeCorrectActivity = QiblaTimeCorrectActivity.this;
            convertView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.da2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    QiblaTimeCorrectActivity.C187681.convert$lambda$1(qiblaTimeCorrectActivity, adjustmentMin, item, view3);
                }
            });
        }
    }

    private final RecyclerView getRecycleView() {
        return (RecyclerView) this.recycleView$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView recycleView_delegate$lambda$0(QiblaTimeCorrectActivity qiblaTimeCorrectActivity) {
        return (RecyclerView) qiblaTimeCorrectActivity.findViewById(R.id.recyclerView);
    }

    private final void showPrayerTime(long j) {
        Map<Long, ? extends List<PrayerTime>> map = this.mPrayerTimeData;
        if (map == null) {
            Intrinsics.XXO("mPrayerTimeData");
            map = null;
        }
        List<PrayerTime> list = map.get(Long.valueOf(j));
        i1O0OXO1O.OXO1.OXO1("showPrayerTime " + O0X11OiO.IO0iXO0O().format(Long.valueOf(j)) + " - " + list);
        getRecycleView().setLayoutManager(new LinearLayoutManager(this));
        getRecycleView().setAdapter(new C187681(list));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @RequiresApi(26)
    public void initView() throws IllegalAccessException, InstantiationException {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.prayer_time_correct);
        onInfoChange(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_qibla_time_correct;
    }

    @sf5(tag = b01.XX1Oi)
    public final void onInfoChange(@aa1 Object data) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(data, "data");
        this.mLocation = UtilsKt.XXIIO1i11();
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        long jXiOIii1 = O0X11OiO.XiOIii1(calendar);
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(PrayerTimeSettings.class.getName()), (Class<Object>) PrayerTimeSettings.class);
        if (objFromJson == null) {
            objFromJson = PrayerTimeSettings.class.newInstance();
        }
        this.mPrayerTimeData = PrayerTimesKt.getPrayerTimeMap((PrayerTimeSettings) objFromJson, this.mLocation.XO0O10(), this.mLocation.IiI10X(), jXiOIii1, (16 & 16) != 0 ? 31 : 0);
        showPrayerTime(jXiOIii1);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
