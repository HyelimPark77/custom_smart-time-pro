package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I0XOXi0I;
import com.android.mltcode.paycertificationapi.IIii0I;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1iI0Ii1;
import com.android.mltcode.paycertificationapi.X0X1i1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00XOX0;
import com.android.mltcode.paycertificationapi.i1OiiO;
import com.android.mltcode.paycertificationapi.iOIOO1IO1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.EnergyRatingDao;
import com.sma.smartv3.db.entity.EnergyRating;
import com.sma.smartv3.model.EnergyRatingDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.ProgressCalendarView;
import com.sma.smartv3.view.text.PFMedium;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EnergyRatingRecordActivity extends BaseActivity implements ProgressCalendarView.OXO1 {

    @aa1
    private final Lazy abhTitleCenter$delegate;
    public Calendar mCalendar;

    @aa1
    private final Lazy mCalendarView$delegate;

    @aa1
    private final EnergyRatingDao mEnergyRatingDao;

    @aa1
    private final Lazy tvLest$delegate;

    @aa1
    private final Lazy tvNext$delegate;

    @aa1
    private final Lazy tvTitle$delegate;

    public EnergyRatingRecordActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new IIii0I(this));
        this.tvLest$delegate = LazyKt__LazyJVMKt.iO(new i1OiiO(this));
        this.tvNext$delegate = LazyKt__LazyJVMKt.iO(new X0X1i1(this));
        this.tvTitle$delegate = LazyKt__LazyJVMKt.iO(new I0XOXi0I(this));
        this.mCalendarView$delegate = LazyKt__LazyJVMKt.iO(new i00XOX0(this));
        this.mEnergyRatingDao = MyDb.INSTANCE.getMDatabase().energyRating();
    }

    public static /* synthetic */ ProgressCalendarView I0iXXO(EnergyRatingRecordActivity r0) {
        return mCalendarView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageButton I1XOi1(EnergyRatingRecordActivity r0) {
        return tvNext_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageButton O10IXXX0X(EnergyRatingRecordActivity r0) {
        return tvLest_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OIX0iXi(EnergyRatingRecordActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(EnergyRatingRecordActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void X1ii(EnergyRatingRecordActivity r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView XXI(EnergyRatingRecordActivity r0) {
        return tvTitle_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(EnergyRatingRecordActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private final void addCurMonthHashMap(Calendar r8) {
        long[] r9 = O0X11OiO.iOOX010X(r8, TimePeriod.MONTH, 0, 4, null);
        List<EnergyRating> r10 = this.mEnergyRatingDao.getEnergyRating(r9[0], r9[1]);
        HashMap r0 = new HashMap();
        List<Integer> r1 = EnergyRatingDataKt.getEnergyRatingColorLevel(this);
        Iterator<EnergyRating> r11 = r10.iterator();
    L4:
        if (r11.hasNext() == false) goto L21;
        EnergyRating r2 = r11.next();
        long r3 = getDayStartTimestamp(r2.getMTime());
        ProgressCalendarView.XIi00iiXO r5 = r0.get(Long.valueOf(r3));
        if (r5 != null) goto L8;
        int r6 = EnergyRatingDataKt.getEnergyRatingLevel(r2.getMScore());
        if (r6 >= r1.size()) goto L19;
        Object r7 = r1.get(r6);
    L18:
        int r12 = ((Number) r7).intValue();
        r0.put(Long.valueOf(r3), new ProgressCalendarView.XIi00iiXO(r2.getMScore(), r12));
        goto L4
    L19:
        r7 = CollectionsKt___CollectionsKt.Xi1XO00(r1);
        goto L18
    L8:
        if (r5.OXO1 >= r2.getMScore()) goto L4;
        int r13 = EnergyRatingDataKt.getEnergyRatingLevel(r2.getMScore());
        if (r13 >= r1.size()) goto L13;
        Object r14 = r1.get(r13);
    L12:
        int r15 = ((Number) r14).intValue();
        r0.put(Long.valueOf(r3), new ProgressCalendarView.XIi00iiXO(r2.getMScore(), r15));
        goto L4
    L13:
        r14 = CollectionsKt___CollectionsKt.Xi1XO00(r1);
        goto L12
    L21:
        getMCalendarView().iO(r0);
    }

    private final String formatCalendar(Calendar r3, String r4) {
        String r5 = new SimpleDateFormat(r4, Locale.getDefault()).format(r3.getTime());
        Intrinsics.O10IXXX0X(r5, "format(...)");
        return r5;
    }

    private final long getDayStartTimestamp(long r2) {
        Calendar r0 = Calendar.getInstance();
        r0.setTimeInMillis(r2);
        r0.set(11, 0);
        r0.set(12, 0);
        r0.set(13, 0);
        r0.set(14, 0);
        return r0.getTimeInMillis();
    }

    private final ProgressCalendarView getMCalendarView() {
        return (ProgressCalendarView) getValue();
    }

    private final ImageButton getTvLest() {
        return (ImageButton) getValue();
    }

    private final ImageButton getTvNext() {
        return (ImageButton) getValue();
    }

    private final TextView getTvTitle() {
        return (TextView) getValue();
    }

    private static final void initView$lambda$0(EnergyRatingRecordActivity r0, View r1) {
        r0.getMCalendarView().I0iXXO();
    }

    private static final void initView$lambda$1(EnergyRatingRecordActivity r0, View r1) {
        r0.getMCalendarView().XXI();
    }

    private static final ProgressCalendarView mCalendarView_delegate$lambda$0(EnergyRatingRecordActivity r1) {
        return (ProgressCalendarView) r1.findViewById(R.id.ac_calendar_view);
    }

    private static final ImageButton tvLest_delegate$lambda$0(EnergyRatingRecordActivity r1) {
        return (ImageButton) r1.findViewById(R.id.beforeTime);
    }

    private static final ImageButton tvNext_delegate$lambda$0(EnergyRatingRecordActivity r1) {
        return (ImageButton) r1.findViewById(R.id.nextTime);
    }

    private static final TextView tvTitle_delegate$lambda$0(EnergyRatingRecordActivity r1) {
        return (TextView) r1.findViewById(R.id.nowTime);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    @aa1
    public final Calendar getMCalendar() {
        Calendar r0 = this.mCalendar;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mCalendar");
        return null;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        Calendar r3 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r3, "getInstance(...)");
        setMCalendar(r3);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        long r0 = getIntent().getLongExtra("curTime", 0);
        if (r0 == 0) goto L5;
        getMCalendar().setTimeInMillis(r0);
        getMCalendarView().setDate(getMCalendar());
        addCurMonthHashMap(getMCalendar());
    L5:
        getAbhTitleCenter().setText(getString(R.string.status_body_energy));
        getMCalendarView().setOnDateSelectedListener(this);
        getTvLest().setOnClickListener(new iOIOO1IO1(this));
        getTvNext().setOnClickListener(new O1iI0Ii1(this));
        getTvTitle().setText(formatCalendar(getMCalendar(), "yyyy-MM"));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_energy_rating_record;
    }

    @Override // com.sma.smartv3.view.ProgressCalendarView.OXO1
    public void onDateSelected(@aa1 Calendar r2, int r3, int r4, int r5) {
        Intrinsics.X0O(r2, "calendar");
        long[] r6 = O0X11OiO.iOOX010X(r2, TimePeriod.DAY, 0, 4, null);
        Intent r7 = new Intent();
        r7.putExtra("startTime", r6[0]);
        r7.putExtra(SDKConstants.PARAM_END_TIME, r6[1]);
        setResult(-1, r7);
        finish();
    }

    @Override // com.sma.smartv3.view.ProgressCalendarView.OXO1
    public void onInteractivePrompts(@aa1 String r2) {
        Intrinsics.X0O(r2, "msg");
        ToastUtils.showLong(r2, new Object[0]);
    }

    @Override // com.sma.smartv3.view.ProgressCalendarView.OXO1
    public void onMonthChange(@aa1 Calendar r1, int r2, int r3, int r4) {
        Intrinsics.X0O(r1, "calendar");
        getTvTitle().setText(formatCalendar(r1, "yyyy-MM"));
        setMCalendar(r1);
        addCurMonthHashMap(getMCalendar());
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void setMCalendar(@aa1 Calendar r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mCalendar = r2;
    }
}
