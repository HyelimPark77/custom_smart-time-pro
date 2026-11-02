package com.sma.smartv3.ui.status.fragment;

import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.blankj.utilcode.util.SPUtils;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDistanceDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistanceDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceDayFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,132:1\n19#2:133\n15#2:134\n*S KotlinDebug\n*F\n+ 1 DistanceDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/DistanceDayFragment\n*L\n20#1:133\n20#1:134\n*E\n"})
public final class DistanceDayFragment extends ActivityBaseDayFragment {

    @aa1
    private final String formatDecimal;

    @aa1
    private final AppUser userProfile;

    public DistanceDayFragment() {
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        if (q62.OXO1.iIX0i() == false) goto L9;
        String r4 = "%.2f";
    L10:
        this.formatDecimal = r4;
        return;
    L9:
        r4 = "%.1f";
        goto L10
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void filterData(@aa1 List<Activity> r18) {
        Intrinsics.X0O(r18, "data");
        super.filterData(r18);
        if (r18.isEmpty() == false) goto L5;
        DINCondBold r2 = getTwoValue();
        StringCompanionObject r8 = StringCompanionObject.OXO1;
        String r9 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(cp5.X1ii(0, this.userProfile.getUnit(), false, 4, null))}, 1));
        Intrinsics.O10IXXX0X(r9, "format(...)");
        r2.setText(UtilsKt.Ii1iii0(r9));
    L6:
        Iterator<Activity> r3 = r18.iterator();
    L8:
        if (r3.hasNext() == false) goto L15;
        Activity r10 = r3.next();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r11 = getFilterData().entrySet().iterator();
    L11:
        if (r11.hasNext() == false) goto L8;
        Map.Entry<Long, ArrayList<Activity>> r12 = r11.next();
        long r13 = r12.getKey().longValue();
        ArrayList<Activity> r14 = r12.getValue();
        if (r10.getMTime() > r13) goto L11;
        r14.add(r10);
        goto L8
    L15:
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r4 = getFilterData().entrySet().iterator();
        int r15 = 0;
        int r16 = 0;
    L17:
        if (r4.hasNext() == false) goto L35;
        ArrayList<Activity> r17 = r4.next().getValue();
        if (r17.isEmpty() == false) goto L21;
        float r19 = 0.0f;
    L34:
        getValues().add(new BarEntry(r15, r19));
        r15 = r15 + 1;
        goto L17
    L21:
        Iterator<Activity> r110 = r17.iterator();
        Intrinsics.O10IXXX0X(r110, "iterator(...)");
        int r111 = 0;
        int r112 = 0;
    L23:
        if (r110.hasNext() == false) goto L33;
        Activity r113 = r110.next();
        Intrinsics.O10IXXX0X(r113, "next(...)");
        int r114 = r113.getMDistance() / 10000;
        if (r112 > r114) goto L32;
        if (r112 != 0) goto L30;
        if (r16 == 0) goto L30;
        if (r114 < r16) goto L30;
        int r115 = r114 - r16;
    L31:
        r111 = r111 + r115;
    L30:
        r115 = r114 - r112;
    L32:
        r112 = r114;
        goto L23
    L33:
        float r20 = cp5.X1ii(r111, this.userProfile.getUnit(), false, 4, null);
        int r116 = ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(r17)).getMDistance() / 10000;
        r19 = r20;
        r16 = r116;
        goto L34
    L35:
        Iterator<Activity> r1 = r18.iterator();
        int r5 = 0;
        int r21 = 0;
    L37:
        if (r1.hasNext() == false) goto L42;
        int r22 = r1.next().getMDistance() / 10000;
        if (r21 > r22) goto L41;
        r5 = r5 + (r22 - r21);
    L41:
        r21 = r22;
        goto L37
    L42:
        DINCondBold r6 = getOneValue();
        StringCompanionObject r23 = StringCompanionObject.OXO1;
        String r7 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(cp5.X1ii(r5, this.userProfile.getUnit(), false, 4, null))}, 1));
        Intrinsics.O10IXXX0X(r7, "format(...)");
        r6.setText(UtilsKt.Ii1iii0(r7));
        return;
    L5:
        Activity r24 = r18.get(r18.size() - 1);
        DINCondBold r25 = getTwoValue();
        StringCompanionObject r26 = StringCompanionObject.OXO1;
        String r27 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(cp5.X1ii(r24.getMDistance() / 10000, this.userProfile.getUnit(), false, 4, null))}, 1));
        Intrinsics.O10IXXX0X(r27, "format(...)");
        r25.setText(r27);
        goto L6
    }

    @aa1
    public final String getFormatDecimal() {
        return this.formatDecimal;
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_distance_info);
        getValueUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        getOneTV().setText(R.string.total_distance);
        getTotalUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        getTwoTV().setText(R.string.current_device_total_distance);
        getTwoUnit().setText(cp5.XX0(this.userProfile.getUnit()));
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.distance_show_1), ContextCompat.getColor(getMActivity(), R.color.distance_show_2));
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    @aa1
    public String setDataLabel() {
        return "Distance day Data";
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void updateItemData(@aa1 Entry r4) {
        Intrinsics.X0O(r4, "e");
        DINCondBold r0 = getNowValue();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r5 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(r4.O00())}, 1));
        Intrinsics.O10IXXX0X(r5, "format(...)");
        r0.setText(UtilsKt.Ii1iii0(r5));
    }
}
