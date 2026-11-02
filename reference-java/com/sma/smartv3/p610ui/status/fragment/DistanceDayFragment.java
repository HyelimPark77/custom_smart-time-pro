package com.sma.smartv3.p610ui.status.fragment;

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
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.pro.R;
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
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.formatDecimal = q62.OXO1.iIX0i() ? "%.2f" : "%.1f";
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void filterData(@aa1 List<Activity> data) {
        float f;
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        if (data.isEmpty()) {
            DINCondBold twoValue = getTwoValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(cp5.X1ii(0, this.userProfile.getUnit(), false, 4, null))}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            twoValue.setText(UtilsKt.Ii1iii0(str));
        } else {
            Activity activity = data.get(data.size() - 1);
            DINCondBold twoValue2 = getTwoValue();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
            String str2 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(cp5.X1ii(activity.getMDistance() / 10000, this.userProfile.getUnit(), false, 4, null))}, 1));
            Intrinsics.O10IXXX0X(str2, "format(...)");
            twoValue2.setText(str2);
        }
        for (Activity activity2 : data) {
            for (Map.Entry<Long, ArrayList<Activity>> entry : getFilterData().entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Activity> value = entry.getValue();
                if (activity2.getMTime() <= jLongValue) {
                    value.add(activity2);
                    break;
                }
            }
        }
        Iterator<Map.Entry<Long, ArrayList<Activity>>> it = getFilterData().entrySet().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ArrayList<Activity> value2 = it.next().getValue();
            if (value2.isEmpty()) {
                f = 0.0f;
            } else {
                Iterator<Activity> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                int i3 = 0;
                int i4 = 0;
                while (it2.hasNext()) {
                    Activity next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    int mDistance = next.getMDistance() / 10000;
                    if (i4 <= mDistance) {
                        i3 += (i4 != 0 || i2 == 0 || mDistance < i2) ? mDistance - i4 : mDistance - i2;
                    }
                    i4 = mDistance;
                }
                float fX1ii = cp5.X1ii(i3, this.userProfile.getUnit(), false, 4, null);
                int mDistance2 = ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(value2)).getMDistance() / 10000;
                f = fX1ii;
                i2 = mDistance2;
            }
            getValues().add(new BarEntry(i, f));
            i++;
        }
        Iterator<Activity> it3 = data.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it3.hasNext()) {
            int mDistance3 = it3.next().getMDistance() / 10000;
            if (i6 <= mDistance3) {
                i5 += mDistance3 - i6;
            }
            i6 = mDistance3;
        }
        DINCondBold oneValue = getOneValue();
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.OXO1;
        String str3 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(cp5.X1ii(i5, this.userProfile.getUnit(), false, 4, null))}, 1));
        Intrinsics.O10IXXX0X(str3, "format(...)");
        oneValue.setText(UtilsKt.Ii1iii0(str3));
    }

    @aa1
    public final String getFormatDecimal() {
        return this.formatDecimal;
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_distance_info);
        getValueUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        getOneTV().setText(R.string.total_distance);
        getTotalUnit().setText(cp5.XX0(this.userProfile.getUnit()));
        getTwoTV().setText(R.string.current_device_total_distance);
        getTwoUnit().setText(cp5.XX0(this.userProfile.getUnit()));
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.distance_show_1), ContextCompat.getColor(getMActivity(), R.color.distance_show_2));
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    @aa1
    public String setDataLabel() {
        return "Distance day Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        DINCondBold nowValue = getNowValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(e.O00())}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        nowValue.setText(UtilsKt.Ii1iii0(str));
    }
}
