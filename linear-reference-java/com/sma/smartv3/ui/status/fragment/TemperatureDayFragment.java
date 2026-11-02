package com.sma.smartv3.ui.status.fragment;

import android.app.Activity;
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
import com.android.mltcode.paycertificationapi.mn5;
import com.android.mltcode.paycertificationapi.nn5;
import com.android.mltcode.paycertificationapi.on5;
import com.android.mltcode.paycertificationapi.pn5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qn5;
import com.android.mltcode.paycertificationapi.rn5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sn5;
import com.android.mltcode.paycertificationapi.tb1;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.TemperatureDao;
import com.sma.smartv3.db.entity.Temperature;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nTemperatureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureDayFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,197:1\n19#2:198\n15#2:199\n1#3:200\n1#3:208\n99#4,7:201\n106#4,3:209\n79#4,7:212\n109#4:219\n*S KotlinDebug\n*F\n+ 1 TemperatureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureDayFragment\n*L\n51#1:198\n51#1:199\n67#1:208\n67#1:201,7\n67#1:209,3\n67#1:212,7\n67#1:219\n*E\n"})
public class TemperatureDayFragment extends BaseDetailDaysFragment<Temperature> implements ag3<Temperature> {

    @aa1
    private final Lazy btnMeasure$delegate;
    private boolean isImperial;

    @aa1
    private ArrayList<Temperature> mAllList;

    @aa1
    private final AppUser mAppUser;
    private float mMaxNormalTemp;
    private float mMinNormalTemp;

    @tb1
    private CommonAdapter<Temperature> mRecyclerAdapter;

    @aa1
    private final TemperatureDao mTemperatureDao;

    @aa1
    private final Lazy measurePanel$delegate;

    @aa1
    private final Lazy noData$delegate;

    @aa1
    private final Lazy rv$delegate;

    @aa1
    private final Lazy tempPb$delegate;

    public TemperatureDayFragment() {
        this.tempPb$delegate = LazyKt__LazyJVMKt.iO(new mn5(this));
        this.rv$delegate = LazyKt__LazyJVMKt.iO(new nn5(this));
        this.noData$delegate = LazyKt__LazyJVMKt.iO(new on5(this));
        this.mTemperatureDao = MyDb.INSTANCE.getMDatabase().temperatureDao();
        this.mAllList = new ArrayList();
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new pn5(this));
        this.btnMeasure$delegate = LazyKt__LazyJVMKt.iO(new qn5(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        this.mMinNormalTemp = 36.0f;
        this.mMaxNormalTemp = 37.4f;
    }

    public static /* synthetic */ Unit I1XOi1(TemperatureDayFragment r0, BleConnector r1) {
        return initView$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ View IIX1OXO(TemperatureDayFragment r0) {
        return btnMeasure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView O10IXXX0X(TemperatureDayFragment r0) {
        return rv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(TemperatureDayFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TempProgressBar X1ii(TemperatureDayFragment r0) {
        return tempPb_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XXI(TemperatureDayFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RelativeLayout XiOIO(TemperatureDayFragment r0) {
        return noData_delegate$lambda$0(r0);
    }

    private static final View btnMeasure_delegate$lambda$0(TemperatureDayFragment r1) {
        return r1.getMView().findViewById(R.id.btn_measure);
    }

    private final View getBtnMeasure() {
        return (View) getValue();
    }

    private final View getMeasurePanel() {
        return (View) getValue();
    }

    private final RelativeLayout getNoData() {
        return (RelativeLayout) getValue();
    }

    private final RecyclerView getRv() {
        return (RecyclerView) getValue();
    }

    private final TempProgressBar getTempPb() {
        return (TempProgressBar) getValue();
    }

    private static final void initView$lambda$0(final TemperatureDayFragment r2, View r3) {
        i1O0OXO1O.OXO1.IiI10X("start measure");
        X0IOiX1O.XIi00iiXO(false, new sn5(r2), 1, null);
    }

    private static final Unit initView$lambda$0$0(TemperatureDayFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 4);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), RealTimeMeasurementActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final View measurePanel_delegate$lambda$0(TemperatureDayFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private static final RelativeLayout noData_delegate$lambda$0(TemperatureDayFragment r1) {
        return (RelativeLayout) r1.getMView().findViewById(R.id.noData);
    }

    private static final RecyclerView rv_delegate$lambda$0(TemperatureDayFragment r1) {
        return (RecyclerView) r1.getMView().findViewById(R.id.rv);
    }

    private static final TempProgressBar tempPb_delegate$lambda$0(TemperatureDayFragment r1) {
        return (TempProgressBar) r1.getMView().findViewById(R.id.tempPb);
    }

    private final void updateChartData() {
        LogUtils.d(new Object[]{this.mAllList});
        if (this.mAllList.isEmpty() == false) goto L5;
        getNoData().setVisibility(0);
        getRv().setVisibility(8);
        getNowValue().setText(UtilsKt.iXiiiO(0));
        getNowTimeDetails().setText(UtilsKt.iXiiiO(0));
        getTempPb().iO(0, this.isImperial);
    L6:
        PFMedium r0 = getValueUnit();
        if (this.isImperial == false) goto L9;
        int r1 = R.string.fahrenheit;
    L10:
        r0.setText(r1);
        CommonAdapter<Temperature> r2 = this.mRecyclerAdapter;
        if (r2 == null) goto L14;
        r2.notifyDataSetChanged();
        return;
    L14:
        return;
    L9:
        r1 = R.string.degree_centigrade;
        goto L10
    L5:
        getNoData().setVisibility(8);
        getRv().setVisibility(0);
        float r3 = cp5.iIiiO(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(this.mAllList)).getMTemperature(), this.isImperial);
        getNowValue().setText(String.valueOf(r3));
        DINCondBold r4 = getNowTimeDetails();
        SimpleDateFormat r5 = O0X11OiO.XO0X10iO(false, 1, null);
        Date r6 = new Date();
        r6.setTime(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(this.mAllList)).getMTime());
        Unit r7 = Unit.OXO1;
        r4.setText(r5.format(r6));
        getTempPb().iO(((Temperature) CollectionsKt___CollectionsKt.IIII0iI(this.mAllList)).getMTemperature(), this.isImperial);
        goto L6
    }

    public final int getCount() {
        return this.mAllList.size();
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.ag3
    public /* bridge */ /* synthetic */ void initItem(ViewHolder r1, Temperature r2, int r3) {
        initItem2(r1, r2, r3);
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    @aa1
    public List<Temperature> initList() {
        return new ArrayList();
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        q62 r0 = q62.OXO1;
        boolean r2 = false;
        if (r0.iOi1010() == false) goto L10;
        View r1 = getMeasurePanel();
        if (r1 == null) goto L7;
        r1.setVisibility(0);
    L7:
        View r3 = getBtnMeasure();
        if (r3 == null) goto L14;
        r3.setOnClickListener(new rn5(this));
    L14:
        if (cp5.II1Xi0(this.mAppUser.getUnit()) != 1) goto L16;
        r2 = true;
    L16:
        this.isImperial = r2;
        super.initView();
        final Activity r4 = getMActivity();
        final int r5 = itemLayoutId();
        final ArrayList<Temperature> r6 = this.mAllList;
        CommonAdapter<Temperature> r7 = new AnonymousClass2(this, r4, r5, r6);
        getRv().setAdapter(r7);
        this.mRecyclerAdapter = r7;
        getRv().setLayoutManager(new LinearLayoutManager(getMActivity()));
        CommonAdapter<Temperature> r8 = this.mRecyclerAdapter;
        if (r8 == null) goto L20;
        r8.notifyDataSetChanged();
    L20:
        if (r0.XI1OX0IO() == false) goto L23;
        getImage().setImageResource(R.drawable.icon_skin_temperature);
        this.mMinNormalTemp = 28.0f;
        this.mMaxNormalTemp = 34.0f;
        return;
    L23:
        getImage().setImageResource(R.drawable.icon_temperature);
        this.mMinNormalTemp = 36.0f;
        this.mMaxNormalTemp = 37.4f;
        return;
    L10:
        View r9 = getMeasurePanel();
        if (r9 == null) goto L14;
        r9.setVisibility(8);
        goto L14
    }

    @Override // com.android.mltcode.paycertificationapi.mc
    public int itemLayoutId() {
        return R.layout.temp_day_item;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_temp_day;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Temperature> r2) {
        Intrinsics.X0O(r2, "data");
        this.mAllList.clear();
        this.mAllList.addAll(r2);
        updateChartData();
    }

    @sf5(tag = I01XX0.XOO0ii0)
    public final void onTemperatureChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        changeTime();
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Temperature> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        setRange(O0X11OiO.I1(r5, r7, r6));
        LogUtils.d(new Object[]{getRange()});
        return this.mTemperatureDao.getListDesc(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "temp day Data";
    }

    /* JADX INFO: renamed from: initItem, reason: avoid collision after fix types in other method */
    public void initItem2(@aa1 ViewHolder r7, @aa1 Temperature r8, int r9) {
        Intrinsics.X0O(r7, "holder");
        Intrinsics.X0O(r8, MapController.ITEM_LAYER_TAG);
        float r10 = cp5.iIiiO(r8.getMTemperature(), false);
        float r1 = this.mMinNormalTemp;
        if (r10 >= r1) goto L6;
        int r11 = getResources().getColor(R.color.temp_day_item_center_4);
        int r2 = R.string.low;
    L11:
        float r3 = cp5.iIiiO(r8.getMTemperature(), this.isImperial);
        DINCondBold r4 = (DINCondBold) r7.getView(R.id.tempItemValue);
        r4.setText(String.valueOf(r3));
        r4.setTextColor(r11);
        DINCondBold r5 = (DINCondBold) r7.getView(R.id.tempItemUnit);
        r5.setTextColor(r11);
        if (this.isImperial == false) goto L14;
        int r6 = R.string.fahrenheit;
    L15:
        r5.setText(r6);
        DINCondBold r12 = (DINCondBold) r7.getView(R.id.tempItemTime);
        SimpleDateFormat r0 = O0X11OiO.XO0X10iO(false, 1, null);
        Date r13 = new Date();
        r13.setTime(r8.getMTime());
        Unit r14 = Unit.OXO1;
        r12.setText(r0.format(r13));
        getNowValue().setTextColor(r11);
        PFMedium r15 = (PFMedium) r7.getView(R.id.tempItemStatus);
        r15.setText(r2);
        r15.setTextColor(r11);
        return;
    L14:
        r6 = R.string.degree_centigrade;
        goto L15
    L6:
        if (r10 >= r1) goto L8;
    L10:
        r11 = getResources().getColor(R.color.temp_day_item_center_6);
        r2 = R.string.high;
        goto L11
    L8:
        if (r10 >= this.mMaxNormalTemp) goto L10;
        r11 = getResources().getColor(R.color.temp_day_item_center_5);
        r2 = R.string.normal;
        goto L11
    }
}
