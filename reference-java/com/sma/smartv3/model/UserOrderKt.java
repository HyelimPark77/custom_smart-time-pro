package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class UserOrderKt {
    @aa1
    public static final List<VipBenefit> getVipBenefitList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VipBenefit(UtilsKt.XXO(R.string.member_aiqa), R.drawable.vip_member_aiqa_icon, VipBenefitType.AI.getType()));
        if (!q62.OXO1.OiO()) {
            arrayList.add(new VipBenefit(UtilsKt.XXO(R.string.member_aigc), R.drawable.vip_member_aigc_icon, VipBenefitType.AIGC.getType()));
            arrayList.add(new VipBenefit(UtilsKt.XXO(R.string.member_vip_dial), R.drawable.vip_member_vip_dial_icon, VipBenefitType.DIAL.getType()));
        }
        String strXXO = UtilsKt.XXO(R.string.member_ad_free);
        VipBenefitType vipBenefitType = VipBenefitType.BUY_VIP;
        arrayList.add(new VipBenefit(strXXO, R.drawable.vip_member_ad_free_icon, vipBenefitType.getType()));
        arrayList.add(new VipBenefit(UtilsKt.XXO(R.string.member_prestigious_logo), R.drawable.vip_member_prestigious_logo_icon, vipBenefitType.getType()));
        return arrayList;
    }
}
