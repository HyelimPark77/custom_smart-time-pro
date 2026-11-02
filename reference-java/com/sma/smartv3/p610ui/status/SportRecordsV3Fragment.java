package com.sma.smartv3.p610ui.status;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSportRecordsV3Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsV3Fragment.kt\ncom/sma/smartv3/ui/status/SportRecordsV3Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,150:1\n19#2:151\n15#2:152\n*S KotlinDebug\n*F\n+ 1 SportRecordsV3Fragment.kt\ncom/sma/smartv3/ui/status/SportRecordsV3Fragment\n*L\n77#1:151\n77#1:152\n*E\n"})
public final class SportRecordsV3Fragment extends SportRecordsV2Fragment {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @aa1
    private static final String TAG = "SportRecordsV3Fragment";

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    @Override // com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment
    public int getItemLayout() {
        return R.layout.status_item_sport_record_detail_v3;
    }

    @Override // com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment
    /* JADX INFO: renamed from: getSportRecordList */
    public void mo48123getSportRecordList() {
        if (getMTimePeriod() != TimePeriod.ALL) {
            update(getMCalendar(), getMOffset(), getMTimePeriod());
            getTvCurrent().setText(O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod()));
            getTvCurrent().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.o45
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10069IO.showCalendarPopop();
                }
            });
        } else {
            getBtnPre().setVisibility(4);
            getBtnNext().setVisibility(4);
            super.mo48123getSportRecordList();
            getTvCurrent().setText(getString(R.string.all));
            getTvCurrent().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment, com.sma.smartv3.p610ui.status.base.BaseStatusFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        super.init(bundle);
        O11XO1X.XO0O10().X1ii(this);
    }

    @Override // com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment, com.sma.smartv3.p610ui.status.base.BaseRecyclerRecordsFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
    }

    @Override // com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_rv_records_v3;
    }

    @Override // com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment, com.sma.smartv3.p610ui.status.base.BaseStatusFragment, com.bestmafen.androidbase.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        O11XO1X.XO0O10().OiIIX101O(this);
    }

    @Override // com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<SportRecordData> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        getSportRecordList().clear();
        setCompetitionSelectionTime(true);
        long[] jArrM787I1 = O0X11OiO.m787I1(calendar, timePeriod, i);
        setSportRecordList(getMArg1() > -1 ? SportRecordDataKt.getSportRecordList(jArrM787I1[0], jArrM787I1[1], 116) : SportRecordDataKt.getSportRecordList$default(jArrM787I1[0], jArrM787I1[1], 0, 4, null));
        return getSportRecordList();
    }

    @Override // com.sma.smartv3.p610ui.status.fragment.SportRecordsV2Fragment
    public void setItemView(@aa1 DslViewHolder itemHolder, @aa1 SportRecordItemCommonData itemData, @aa1 SportRecordData sportRecordData) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(itemData, "itemData");
        Intrinsics.X0O(sportRecordData, "sportRecordData");
        ImageView imageViewImg = itemHolder.img(R.id.record_sports_icon);
        if (imageViewImg != null) {
            RequestManager requestManagerWith = Glide.with(imageViewImg.getContext());
            Context context = imageViewImg.getContext();
            Intrinsics.O10IXXX0X(context, "getContext(...)");
            requestManagerWith.load(Integer.valueOf(SportRecordDataKt.getWorkoutImage(context, sportRecordData))).into(imageViewImg);
        }
        if (a15.m1445iO(sportRecordData.getMMode())) {
            if (imageViewImg != null) {
                imageViewImg.setBackgroundResource(R.drawable.shape_sport_oval_orange_bg);
            }
        } else if (imageViewImg != null) {
            imageViewImg.setBackgroundResource(R.drawable.shape_sport_oval_green_bg);
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.record_sports_title);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(q62.OXO1.i01OOiI(sportRecordData.getMMode()));
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.record_sports_time);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(O0X11OiO.m792X1(false, 1, null).format(Long.valueOf(sportRecordData.getMStartTime())));
        }
        if (hu4.OXO1.O10IXXX0X(sportRecordData.getMMode())) {
            SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
            Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
            Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson != null) {
                appUser = objFromJson;
            }
            AppUser appUser2 = (AppUser) appUser;
            String strValueOf = String.valueOf(cp5.X1ii(sportRecordData.getMDistance(), appUser2.getUnit(), false, 4, null));
            TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.record_sports_value);
            if (textViewM3482tv3 != null) {
                textViewM3482tv3.setText(strValueOf + getString(cp5.XX0(appUser2.getUnit())));
            }
            TextView textViewM3482tv4 = itemHolder.m3482tv(R.id.record_sports_duration);
            if (textViewM3482tv4 != null) {
                textViewM3482tv4.setText((sportRecordData.getMCalorie() / 1000) + getString(R.string.kcal) + " | " + O0X11OiO.iXiX011(sportRecordData.getMDuration() * 1000));
            }
        } else {
            TextView textViewM3482tv5 = itemHolder.m3482tv(R.id.record_sports_value);
            if (textViewM3482tv5 != null) {
                textViewM3482tv5.setText((sportRecordData.getMCalorie() / 1000) + getString(R.string.kcal));
            }
            TextView textViewM3482tv6 = itemHolder.m3482tv(R.id.record_sports_duration);
            if (textViewM3482tv6 != null) {
                textViewM3482tv6.setText(String.valueOf(O0X11OiO.iXiX011(sportRecordData.getMDuration() * 1000)));
            }
        }
        ImageView imageViewImg2 = itemHolder.img(R.id.abh_sport_source_icon);
        if (imageViewImg2 != null) {
            Glide.with(imageViewImg2.getContext()).load(Integer.valueOf(sportRecordData.getMSource() == 1 ? R.drawable.sport_watch_icon : R.drawable.sport_phone_icon)).into(imageViewImg2);
        }
    }
}
