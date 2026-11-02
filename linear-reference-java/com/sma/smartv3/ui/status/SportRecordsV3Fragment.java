package com.sma.smartv3.ui.status;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a15;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.hu4;
import com.android.mltcode.paycertificationapi.o45;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.model.SportRecordItemCommonData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment;
import com.sma.smartv3.util.TimePeriod;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportRecordsV3Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsV3Fragment.kt\ncom/sma/smartv3/ui/status/SportRecordsV3Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,150:1\n19#2:151\n15#2:152\n*S KotlinDebug\n*F\n+ 1 SportRecordsV3Fragment.kt\ncom/sma/smartv3/ui/status/SportRecordsV3Fragment\n*L\n77#1:151\n77#1:152\n*E\n"})
public final class SportRecordsV3Fragment extends SportRecordsV2Fragment {

    @aa1
    public static final OXO1 Companion = null;

    @aa1
    private static final String TAG = "SportRecordsV3Fragment";

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

    public SportRecordsV3Fragment() {
    }

    private static final void getSportRecordList$lambda$0(SportRecordsV3Fragment r0, View r1) {
        r0.showCalendarPopop();
    }

    public static /* synthetic */ void i010I(SportRecordsV3Fragment r0, View r1) {
        getSportRecordList$lambda$0(r0, r1);
    }

    @Override // com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment
    public int getItemLayout() {
        return R.layout.status_item_sport_record_detail_v3;
    }

    @Override // com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment
    /* JADX INFO: renamed from: getSportRecordList */
    public void mo6764getSportRecordList() {
        if (getMTimePeriod() != TimePeriod.ALL) goto L6;
        getBtnPre().setVisibility(4);
        getBtnNext().setVisibility(4);
        super.mo6764getSportRecordList();
        getTvCurrent().setText(getString(R.string.all));
        getTvCurrent().setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        return;
    L6:
        update(getMCalendar(), getMOffset(), getMTimePeriod());
        getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod()));
        getTvCurrent().setOnClickListener(new o45(this));
    }

    @Override // com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment, com.sma.smartv3.ui.status.base.BaseStatusFragment, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
        super.init(r1);
        O11XO1X.XO0O10().X1ii(this);
    }

    @Override // com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment, com.sma.smartv3.ui.status.base.BaseRecyclerRecordsFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
    }

    @Override // com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_rv_records_v3;
    }

    @Override // com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment, com.sma.smartv3.ui.status.base.BaseStatusFragment, com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        O11XO1X.XO0O10().OiIIX101O(this);
    }

    @Override // com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<SportRecordData> onTimePeriodChange(@aa1 Calendar r8, int r9, @aa1 TimePeriod r10) {
        Intrinsics.X0O(r8, "calendar");
        Intrinsics.X0O(r10, "timePeriod");
        getSportRecordList().clear();
        setCompetitionSelectionTime(true);
        long[] r11 = O0X11OiO.I1(r8, r10, r9);
        if (getMArg1() <= (-1)) goto L5;
        ArrayList<SportRecordData> r12 = SportRecordDataKt.getSportRecordList(r11[0], r11[1], 116);
    L6:
        setSportRecordList(r12);
        return getSportRecordList();
    L5:
        r12 = SportRecordDataKt.getSportRecordList$default(r11[0], r11[1], 0, 4, null);
        goto L6
    }

    @Override // com.sma.smartv3.ui.status.fragment.SportRecordsV2Fragment
    public void setItemView(@aa1 DslViewHolder r41, @aa1 SportRecordItemCommonData r42, @aa1 SportRecordData r43) {
        Intrinsics.X0O(r41, "itemHolder");
        Intrinsics.X0O(r42, "itemData");
        Intrinsics.X0O(r43, "sportRecordData");
        ImageView r3 = r41.img(R.id.record_sports_icon);
        if (r3 == null) goto L6;
        RequestManager r4 = Glide.with(r3.getContext());
        Context r5 = r3.getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        r4.load(Integer.valueOf(SportRecordDataKt.getWorkoutImage(r5, r43))).into(r3);
    L6:
        if (a15.iO(r43.getMMode()) == false) goto L9;
        if (r3 == null) goto L11;
        r3.setBackgroundResource(R.drawable.shape_sport_oval_orange_bg);
    L11:
        TextView r6 = r41.tv(R.id.record_sports_title);
        if (r6 == null) goto L14;
        r6.setText(q62.OXO1.i01OOiI(r43.getMMode()));
    L14:
        TextView r7 = r41.tv(R.id.record_sports_time);
        if (r7 == null) goto L18;
        r7.setText(O0X11OiO.X1(false, 1, null).format(Long.valueOf(r43.getMStartTime())));
    L18:
        if (hu4.OXO1.O10IXXX0X(r43.getMMode()) == false) goto L29;
        SPUtils r8 = a01.OXO1.IiI10X();
        Object r10 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r9 = new Gson().fromJson(r8.getString(AppUser.class.getName()), AppUser.class);
        if (r9 == null) goto L23;
        r10 = r9;
    L23:
        AppUser r11 = (AppUser) r10;
        String r12 = String.valueOf(cp5.X1ii(r43.getMDistance(), r11.getUnit(), false, 4, null));
        TextView r13 = r41.tv(R.id.record_sports_value);
        if (r13 == null) goto L26;
        r13.setText(r12 + getString(cp5.XX0(r11.getUnit())));
    L26:
        TextView r14 = r41.tv(R.id.record_sports_duration);
        if (r14 == null) goto L35;
        r14.setText((r43.getMCalorie() / 1000) + getString(R.string.kcal) + " | " + O0X11OiO.iXiX011(r43.getMDuration() * 1000));
    L35:
        ImageView r1 = r41.img(R.id.abh_sport_source_icon);
        if (r1 == null) goto L43;
        RequestManager r15 = Glide.with(r1.getContext());
        if (r43.getMSource() != 1) goto L40;
        int r2 = R.drawable.sport_watch_icon;
    L41:
        r15.load(Integer.valueOf(r2)).into(r1);
        return;
    L40:
        r2 = R.drawable.sport_phone_icon;
        goto L41
    L43:
        return;
    L29:
        TextView r16 = r41.tv(R.id.record_sports_value);
        if (r16 == null) goto L32;
        r16.setText((r43.getMCalorie() / 1000) + getString(R.string.kcal));
    L32:
        TextView r17 = r41.tv(R.id.record_sports_duration);
        if (r17 == null) goto L35;
        r17.setText(String.valueOf(O0X11OiO.iXiX011(r43.getMDuration() * 1000)));
        goto L35
    L9:
        if (r3 == null) goto L11;
        r3.setBackgroundResource(R.drawable.shape_sport_oval_green_bg);
        goto L11
    }
}
