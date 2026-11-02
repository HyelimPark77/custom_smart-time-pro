package com.sma.smartv3.p610ui.status.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ag3;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.TemperatureDao;
import com.sma.smartv3.p608db.entity.Temperature;
import com.sma.smartv3.p610ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.TemperatureDayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.TempProgressBar;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.component.BleConnector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTemperatureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureDayFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,197:1\n19#2:198\n15#2:199\n1#3:200\n1#3:208\n99#4,7:201\n106#4,3:209\n79#4,7:212\n109#4:219\n*S KotlinDebug\n*F\n+ 1 TemperatureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureDayFragment\n*L\n51#1:198\n51#1:199\n67#1:208\n67#1:201,7\n67#1:209,3\n67#1:212,7\n67#1:219\n*E\n"})
public class TemperatureDayFragment extends BaseDetailDaysFragment<Temperature> implements ag3<Temperature> {
    private boolean isImperial;

    @aa1
    private final AppUser mAppUser;
    private float mMaxNormalTemp;
    private float mMinNormalTemp;

    @tb1
    private CommonAdapter<Temperature> mRecyclerAdapter;

    @aa1
    private final Lazy tempPb$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mn5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TemperatureDayFragment.tempPb_delegate$lambda$0(this.f9747IO);
        }
    });

    @aa1
    private final Lazy rv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nn5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TemperatureDayFragment.rv_delegate$lambda$0(this.f9975IO);
        }
    });

    @aa1
    private final Lazy noData$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.on5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TemperatureDayFragment.noData_delegate$lambda$0(this.f10180IO);
        }
    });

    @aa1
    private final TemperatureDao mTemperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();

    @aa1
    private ArrayList<Temperature> mAllList = new ArrayList<>();

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pn5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TemperatureDayFragment.measurePanel_delegate$lambda$0(this.f10404IO);
        }
    });

    @aa1
    private final Lazy btnMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qn5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TemperatureDayFragment.btnMeasure_delegate$lambda$0(this.f10641IO);
        }
    });

    public TemperatureDayFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mMinNormalTemp = 36.0f;
        this.mMaxNormalTemp = 37.4f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnMeasure_delegate$lambda$0(TemperatureDayFragment temperatureDayFragment) {
        return temperatureDayFragment.getMView().findViewById(R.id.btn_measure);
    }

    private final View getBtnMeasure() {
        return (View) this.btnMeasure$delegate.getValue();
    }

    private final View getMeasurePanel() {
        return (View) this.measurePanel$delegate.getValue();
    }

    private final RelativeLayout getNoData() {
        return (RelativeLayout) this.noData$delegate.getValue();
    }

    private final RecyclerView getRv() {
        return (RecyclerView) this.rv$delegate.getValue();
    }

    private final TempProgressBar getTempPb() {
        return (TempProgressBar) this.tempPb$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final TemperatureDayFragment temperatureDayFragment, View view) {
        i1O0OXO1O.OXO1.IiI10X("start measure");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.sn5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return TemperatureDayFragment.initView$lambda$0$0(this.f11090IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0(TemperatureDayFragment temperatureDayFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 4);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(temperatureDayFragment.getActivity(), (Class<?>) RealTimeMeasurementActivity.class);
        intent.putExtras(bundle);
        temperatureDayFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(TemperatureDayFragment temperatureDayFragment) {
        return temperatureDayFragment.getMView().findViewById(R.id.measure_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RelativeLayout noData_delegate$lambda$0(TemperatureDayFragment temperatureDayFragment) {
        return (RelativeLayout) temperatureDayFragment.getMView().findViewById(R.id.noData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_delegate$lambda$0(TemperatureDayFragment temperatureDayFragment) {
        return (RecyclerView) temperatureDayFragment.getMView().findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TempProgressBar tempPb_delegate$lambda$0(TemperatureDayFragment temperatureDayFragment) {
        return (TempProgressBar) temperatureDayFragment.getMView().findViewById(R.id.tempPb);
    }

    private final void updateChartData() {
        LogUtils.m11128d(this.mAllList);
        if (this.mAllList.isEmpty()) {
            getNoData().setVisibility(0);
            getRv().setVisibility(8);
            getNowValue().setText(UtilsKt.iXiiiO(0));
            getNowTimeDetails().setText(UtilsKt.iXiiiO(0));
            getTempPb().m38915iO(0, this.isImperial);
        } else {
            getNoData().setVisibility(8);
            getRv().setVisibility(0);
            getNowValue().setText(String.valueOf(cp5.iIiiO(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(this.mAllList)).getMTemperature(), this.isImperial)));
            DINCondBold nowTimeDetails = getNowTimeDetails();
            SimpleDateFormat simpleDateFormatXO0X10iO = O0X11OiO.XO0X10iO(false, 1, null);
            Date date = new Date();
            date.setTime(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(this.mAllList)).getMTime());
            Unit unit = Unit.OXO1;
            nowTimeDetails.setText(simpleDateFormatXO0X10iO.format(date));
            getTempPb().m38915iO(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(this.mAllList)).getMTemperature(), this.isImperial);
        }
        getValueUnit().setText(this.isImperial ? R.string.fahrenheit : R.string.degree_centigrade);
        CommonAdapter<Temperature> commonAdapter = this.mRecyclerAdapter;
        if (commonAdapter != null) {
            commonAdapter.notifyDataSetChanged();
        }
    }

    public final int getCount() {
        return this.mAllList.size();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    @aa1
    public List<Temperature> initList() {
        return new ArrayList();
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        q62 q62Var = q62.OXO1;
        if (q62Var.iOi1010()) {
            View measurePanel = getMeasurePanel();
            if (measurePanel != null) {
                measurePanel.setVisibility(0);
            }
            View btnMeasure = getBtnMeasure();
            if (btnMeasure != null) {
                btnMeasure.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.rn5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TemperatureDayFragment.initView$lambda$0(this.f10851IO, view);
                    }
                });
            }
        } else {
            View measurePanel2 = getMeasurePanel();
            if (measurePanel2 != null) {
                measurePanel2.setVisibility(8);
            }
        }
        this.isImperial = cp5.II1Xi0(this.mAppUser.getUnit()) == 1;
        super.initView();
        CommonAdapter<Temperature> commonAdapter = new CommonAdapter<Temperature>(getMActivity(), itemLayoutId(), this.mAllList) { // from class: com.sma.smartv3.ui.status.fragment.TemperatureDayFragment.initView.2
            @Override // com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return TemperatureDayFragment.this.getCount();
            }

            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public void convert(ViewHolder viewHolder, Temperature item, int i) {
                Intrinsics.X0O(viewHolder, "viewHolder");
                Intrinsics.X0O(item, "item");
                TemperatureDayFragment.this.initItem(viewHolder, item, i);
            }
        };
        getRv().setAdapter(commonAdapter);
        this.mRecyclerAdapter = commonAdapter;
        getRv().setLayoutManager(new LinearLayoutManager(getMActivity()));
        CommonAdapter<Temperature> commonAdapter2 = this.mRecyclerAdapter;
        if (commonAdapter2 != null) {
            commonAdapter2.notifyDataSetChanged();
        }
        if (q62Var.XI1OX0IO()) {
            getImage().setImageResource(R.drawable.icon_skin_temperature);
            this.mMinNormalTemp = 28.0f;
            this.mMaxNormalTemp = 34.0f;
        } else {
            getImage().setImageResource(R.drawable.icon_temperature);
            this.mMinNormalTemp = 36.0f;
            this.mMaxNormalTemp = 37.4f;
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2686mc
    public int itemLayoutId() {
        return R.layout.temp_day_item;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_temp_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Temperature> data) {
        Intrinsics.X0O(data, "data");
        this.mAllList.clear();
        this.mAllList.addAll(data);
        updateChartData();
    }

    @sf5(tag = I01XX0.XOO0ii0)
    public final void onTemperatureChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        changeTime();
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Temperature> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        LogUtils.m11128d(getRange());
        return this.mTemperatureDao.getListDesc(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "temp day Data";
    }

    @Override // com.android.mltcode.paycertificationapi.ag3
    public void initItem(@aa1 ViewHolder holder, @aa1 Temperature item, int i) {
        int color;
        int i2;
        Intrinsics.X0O(holder, "holder");
        Intrinsics.X0O(item, "item");
        float fIIiiO = cp5.iIiiO(item.getMTemperature(), false);
        float f = this.mMinNormalTemp;
        if (fIIiiO < f) {
            color = getResources().getColor(R.color.temp_day_item_center_4);
            i2 = R.string.low;
        } else if (fIIiiO < f || fIIiiO >= this.mMaxNormalTemp) {
            color = getResources().getColor(R.color.temp_day_item_center_6);
            i2 = R.string.high;
        } else {
            color = getResources().getColor(R.color.temp_day_item_center_5);
            i2 = R.string.normal;
        }
        float fIIiiO2 = cp5.iIiiO(item.getMTemperature(), this.isImperial);
        DINCondBold dINCondBold = (DINCondBold) holder.getView(R.id.tempItemValue);
        dINCondBold.setText(String.valueOf(fIIiiO2));
        dINCondBold.setTextColor(color);
        DINCondBold dINCondBold2 = (DINCondBold) holder.getView(R.id.tempItemUnit);
        dINCondBold2.setTextColor(color);
        dINCondBold2.setText(this.isImperial ? R.string.fahrenheit : R.string.degree_centigrade);
        DINCondBold dINCondBold3 = (DINCondBold) holder.getView(R.id.tempItemTime);
        SimpleDateFormat simpleDateFormatXO0X10iO = O0X11OiO.XO0X10iO(false, 1, null);
        Date date = new Date();
        date.setTime(item.getMTime());
        Unit unit = Unit.OXO1;
        dINCondBold3.setText(simpleDateFormatXO0X10iO.format(date));
        getNowValue().setTextColor(color);
        PFMedium pFMedium = (PFMedium) holder.getView(R.id.tempItemStatus);
        pFMedium.setText(i2);
        pFMedium.setTextColor(color);
    }
}
