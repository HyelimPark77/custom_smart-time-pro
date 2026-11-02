package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a20;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b20;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.w85;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.SportRecordData;
import com.sma.smartv3.model.SportRecordDataKt;
import com.sma.smartv3.model.SportRecordItemCommonData;
import com.sma.smartv3.model.SportRecordItemData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.SportDetailActivity;
import com.sma.smartv3.ui.sport.SportDetailV2Activity;
import com.sma.smartv3.ui.status.SportRecordsActivity;
import com.sma.smartv3.ui.status.SportRecordsDetailActivity;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainSportRecord2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSportRecord2Item.kt\ncom/sma/smartv3/ui/status/item/MainSportRecord2Item\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,197:1\n19#2:198\n15#2:199\n*S KotlinDebug\n*F\n+ 1 MainSportRecord2Item.kt\ncom/sma/smartv3/ui/status/item/MainSportRecord2Item\n*L\n51#1:198\n51#1:199\n*E\n"})
public final class MainSportRecord2Item extends BaseDslItem {
    private final boolean initEvent;
    public Context mContext;
    private LinearLayout sportItemDetail;
    private TextView sportName;

    @tb1
    private SportRecordData sportRecordData;

    @tb1
    private SportRecordItemCommonData sportRecordItemCommonData;
    private TextView sportStartTimeTv;
    private ImageView sportTypeIv;
    private TextView tvTime;
    private TextView tvUnit;
    private TextView tvValue;

    @aa1
    private final AppUser userProfile;

    public MainSportRecord2Item() {
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.userProfile = (AppUser) r2;
        this.initEvent = true;
    }

    public static /* synthetic */ void IiI10X(MainSportRecord2Item r0, View r1) {
        bindView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void O00(MainSportRecord2Item r0, View r1) {
        bindView$lambda$1(r0, r1);
    }

    private static final void bindView$lambda$0(MainSportRecord2Item r7, View r8) {
        if (r7.sportRecordData != null) goto L6;
        return;
    L6:
        if (w85.OXO1.OXO1() == false) goto L51;
        SportRecordData r9 = r7.sportRecordData;
        Integer r0 = null;
        if (r9 == null) goto L10;
        Integer r10 = Integer.valueOf(r9.getMSource());
    L12:
        if (r10 == null) goto L29;
        if (r10.intValue() != 2) goto L29;
        if (i72.OXO1.iIXX0i() == false) goto L23;
        Context r11 = r7.getMContext();
        Intent r1 = new Intent(r7.getMContext(), SportDetailV2Activity.class);
        SportRecordData r12 = r7.sportRecordData;
        if (r12 == null) goto L21;
        r0 = Integer.valueOf(r12.getMWorkoutId());
    L21:
        r11.startActivity(r1.putExtra("mArg1", r0));
        return;
    L23:
        Context r13 = r7.getMContext();
        Intent r2 = new Intent(r7.getMContext(), SportDetailActivity.class);
        SportRecordData r14 = r7.sportRecordData;
        if (r14 == null) goto L26;
        r0 = Integer.valueOf(r14.getMWorkoutId());
    L26:
        r13.startActivity(r2.putExtra("mArg1", r0));
        return;
    L29:
        if (r10 != null) goto L32;
    L49:
        r7.getMContext().startActivity(new Intent(r7.getMContext(), SportRecordsDetailActivity.class).putExtra("mArg2", r7.sportRecordData));
        return;
    L32:
        if (r10.intValue() != 1) goto L49;
        i72 r15 = i72.OXO1;
        if (r15.iIXX0i() == false) goto L41;
        Context r16 = r7.getMContext();
        Intent r3 = new Intent(r7.getMContext(), SportDetailV2Activity.class);
        SportRecordData r17 = r7.sportRecordData;
        if (r17 == null) goto L38;
        r0 = Integer.valueOf(r17.getMWorkoutId());
    L38:
        r16.startActivity(r3.putExtra("mArg1", r0));
        return;
    L41:
        if (r15.XII01OO1I() == false) goto L47;
        Context r18 = r7.getMContext();
        Intent r4 = new Intent(r7.getMContext(), SportDetailActivity.class);
        SportRecordData r19 = r7.sportRecordData;
        if (r19 == null) goto L45;
        r0 = Integer.valueOf(r19.getMWorkoutId());
    L45:
        r18.startActivity(r4.putExtra("mArg1", r0));
        return;
    L47:
        r7.getMContext().startActivity(new Intent(r7.getMContext(), SportRecordsDetailActivity.class).putExtra("mArg2", r7.sportRecordData));
        return;
    L10:
        r10 = null;
        goto L12
    }

    private static final void bindView$lambda$1(MainSportRecord2Item r2, View r3) {
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.getMContext().startActivity(new Intent(r2.getMContext(), SportRecordsActivity.class));
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        View r0 = r3.v(R.id.sportTypeIv);
        Intrinsics.XXI(r0);
        this.sportTypeIv = (ImageView) r0;
        View r1 = r3.v(R.id.sportName);
        Intrinsics.XXI(r1);
        this.sportName = (TextView) r1;
        View r2 = r3.v(R.id.sportStartTime);
        Intrinsics.XXI(r2);
        this.sportStartTimeTv = (TextView) r2;
        View r4 = r3.v(R.id.tv_value);
        Intrinsics.XXI(r4);
        this.tvValue = (TextView) r4;
        View r5 = r3.v(R.id.tv_unit);
        Intrinsics.XXI(r5);
        this.tvUnit = (TextView) r5;
        View r6 = r3.v(R.id.tv_time);
        Intrinsics.XXI(r6);
        this.tvTime = (TextView) r6;
        View r7 = r3.v(R.id.sportItemDetail);
        Intrinsics.XXI(r7);
        LinearLayout r8 = (LinearLayout) r7;
        this.sportItemDetail = r8;
        if (r8 != null) goto L5;
        Intrinsics.XXO("sportItemDetail");
        r8 = null;
    L5:
        r8.setOnClickListener(new a20(this));
        View r9 = r3.view(R.id.sportRecordList);
        if (r9 == null) goto L8;
        r9.setOnClickListener(new b20(this));
    L8:
        Context r10 = r3.getContext();
        Intrinsics.O10IXXX0X(r10, "<get-context>(...)");
        setMContext(r10);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context r0 = this.mContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("mContext");
        return null;
    }

    @tb1
    public final SportRecordData getSportRecordData() {
        return this.sportRecordData;
    }

    @tb1
    public final SportRecordItemCommonData getSportRecordItemCommonData() {
        return this.sportRecordItemCommonData;
    }

    @aa1
    public final AppUser getUserProfile() {
        return this.userProfile;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        int r1 = 0;
        ArrayList<SportRecordData> r0 = SportRecordDataKt.getSportRecordList(0, 20);
        Integer r3 = null;
        if (r0.isEmpty() == false) goto L6;
        this.sportRecordData = null;
        return;
    L6:
        this.sportRecordData = r0.get(0);
        this.sportRecordItemCommonData = parseSportRecordItemCommonDataMethod();
        ImageView r2 = this.sportTypeIv;
        if (r2 != null) goto L9;
        Intrinsics.XXO("sportTypeIv");
        r2 = null;
    L9:
        SportRecordItemCommonData r4 = this.sportRecordItemCommonData;
        Intrinsics.XXI(r4);
        r2.setImageResource(r4.getWorkoutImg());
        TextView r5 = this.sportName;
        if (r5 != null) goto L12;
        Intrinsics.XXO("sportName");
        r5 = null;
    L12:
        Context r6 = getMContext().getApplicationContext();
        SportRecordItemCommonData r7 = this.sportRecordItemCommonData;
        Intrinsics.XXI(r7);
        r5.setText(r6.getString(r7.getWorkoutModeName()));
        TextView r8 = this.sportStartTimeTv;
        if (r8 != null) goto L15;
        Intrinsics.XXO("sportStartTimeTv");
        r8 = null;
    L15:
        SportRecordItemCommonData r9 = this.sportRecordItemCommonData;
        if (r9 == null) goto L18;
        String r10 = r9.getSportStartTime();
    L19:
        r8.setText(r10);
        TextView r11 = this.tvTime;
        if (r11 != null) goto L22;
        Intrinsics.XXO("tvTime");
        r11 = null;
    L22:
        SportRecordItemCommonData r12 = this.sportRecordItemCommonData;
        if (r12 == null) goto L31;
        List<SportRecordItemData> r13 = r12.getContentList();
        if (r13 == null) goto L31;
        SportRecordItemData r14 = r13.get(1);
        if (r14 == null) goto L31;
        String r15 = r14.getTv();
        if (r15 == null) goto L31;
    L32:
        r11.setText(r15);
        TextView r16 = this.tvValue;
        if (r16 != null) goto L35;
        Intrinsics.XXO("tvValue");
        r16 = null;
    L35:
        SportRecordItemCommonData r17 = this.sportRecordItemCommonData;
        if (r17 == null) goto L44;
        List<SportRecordItemData> r18 = r17.getContentList();
        if (r18 == null) goto L44;
        SportRecordItemData r19 = r18.get(2);
        if (r19 == null) goto L44;
        String r20 = r19.getTv();
        if (r20 == null) goto L44;
    L45:
        r16.setText(r20);
        TextView r21 = this.tvUnit;
        if (r21 != null) goto L48;
        Intrinsics.XXO("tvUnit");
        r21 = null;
    L48:
        r21.setText("");
        TextView r22 = this.tvUnit;
        if (r22 != null) goto L51;
        Intrinsics.XXO("tvUnit");
        r22 = null;
    L51:
        SportRecordData r23 = this.sportRecordData;
        if (r23 == null) goto L54;
        r3 = Integer.valueOf(r23.getMMode());
    L54:
        if (r3 != null) goto L57;
    L58:
        if (r3 == null) goto L64;
        if (r3.intValue() != 12) goto L64;
    L84:
        r1 = R.string.steps;
    L85:
        r22.setText(r1);
        return;
    L64:
        if (r3 == null) goto L70;
        if (r3.intValue() != 9) goto L70;
    L68:
        r1 = R.string.km;
    L70:
        if (r3 != null) goto L73;
    L75:
        if (r3 == null) goto L85;
        if (r3.intValue() != 10) goto L85;
        if (BleCache.INSTANCE.getMAGpsType() != 0) goto L68;
        if (q62.OXO1.XOXOIX0Oi() == true) goto L68;
    L74:
        r1 = R.string.kcal;
        goto L85
    L73:
        if (r3.intValue() != 7) goto L75;
    L57:
        if (r3.intValue() == 8) goto L84;
    L44:
        r20 = "";
    L31:
        r15 = "";
        goto L32
    L18:
        r10 = null;
        goto L19
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_sport_record;
    }

    @sf5(tag = I01XX0.OXO1)
    public final void onActivityChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onActivityChanged"});
        initView();
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onHeartRateChanged"});
        initView();
    }

    @sf5(tag = I01XX0.OIX0iXi)
    public final void onLocationChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onLocationChanged"});
        initView();
    }

    @sf5(tag = I01XX0.O00)
    public final void onWorkoutChanged(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        LogUtils.v(new Object[]{"onWorkoutChanged"});
        initView();
    }

    @aa1
    public SportRecordItemCommonData parseSportRecordItemCommonDataMethod() {
        Context r0 = getMContext();
        AppUser r1 = this.userProfile;
        SportRecordData r2 = this.sportRecordData;
        Intrinsics.XXI(r2);
        return SportRecordDataKt.parseSportRecordItemCommonData(r0, r1, r2);
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public final void setSportRecordData(@tb1 SportRecordData r1) {
        this.sportRecordData = r1;
    }

    public final void setSportRecordItemCommonData(@tb1 SportRecordItemCommonData r1) {
        this.sportRecordItemCommonData = r1;
    }
}
