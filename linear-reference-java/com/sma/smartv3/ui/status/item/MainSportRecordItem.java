package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.c20;
import com.android.mltcode.paycertificationapi.d20;
import com.android.mltcode.paycertificationapi.e20;
import com.android.mltcode.paycertificationapi.i72;
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
import com.sma.smartv3.model.SportRecordItemAdapter;
import com.sma.smartv3.model.SportRecordItemCommonData;
import com.sma.smartv3.model.SportRecordItemData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.SportDetailActivity;
import com.sma.smartv3.ui.sport.SportDetailV2Activity;
import com.sma.smartv3.ui.status.SportRecordsActivity;
import com.sma.smartv3.ui.status.SportRecordsDetailActivity;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMainSportRecordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSportRecordItem.kt\ncom/sma/smartv3/ui/status/item/MainSportRecordItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,250:1\n19#2:251\n15#2:252\n*S KotlinDebug\n*F\n+ 1 MainSportRecordItem.kt\ncom/sma/smartv3/ui/status/item/MainSportRecordItem\n*L\n133#1:251\n133#1:252\n*E\n"})
public class MainSportRecordItem extends BaseDslItem {
    public ImageView gpsStatusIv;
    private final boolean initEvent;
    private boolean isEmptyData;
    public Context mContext;
    public RecyclerView rv;
    public LinearLayout sportItemDetail;
    public PFMedium sportName;

    @aa1
    private SportRecordData sportRecordData;

    @tb1
    private SportRecordItemCommonData sportRecordItemCommonData;
    public ImageView sportSourceIv;
    public DINCondBold sportStartTimeTv;
    public ImageView sportTypeIv;
    public AppUser userProfile;

    public MainSportRecordItem() {
        this.initEvent = true;
        this.sportRecordData = new SportRecordData();
    }

    public static /* synthetic */ void IiI10X(MainSportRecordItem r0, View r1) {
        bindView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void O00(MainSportRecordItem r0, View r1) {
        bindView$lambda$2(r0, r1);
    }

    public static /* synthetic */ boolean XOO0ii0(MainSportRecordItem r0, View r1, MotionEvent r2) {
        return bindView$lambda$0$0(r0, r1, r2);
    }

    private static final boolean bindView$lambda$0$0(MainSportRecordItem r0, View r1, MotionEvent r2) {
        return r0.getSportItemDetail().onTouchEvent(r2);
    }

    private static final void bindView$lambda$1(MainSportRecordItem r6, View r7) {
        if (r6.isEmptyData == false) goto L6;
        return;
    L6:
        if (w85.OXO1.OXO1() == false) goto L29;
        LogUtils.i(new Object[]{"sportRecordData.mSource" + r6.sportRecordData.getMSource()});
        int r8 = r6.sportRecordData.getMSource();
        if (r8 != 1) goto L10;
        i72 r9 = i72.OXO1;
        if (r9.iIXX0i() == false) goto L24;
        r6.getMContext().startActivity(new Intent(r6.getMContext(), SportDetailV2Activity.class).putExtra("mArg1", r6.sportRecordData.getMWorkoutId()));
        return;
    L24:
        if (r9.XII01OO1I() == false) goto L27;
        r6.getMContext().startActivity(new Intent(r6.getMContext(), SportDetailActivity.class).putExtra("mArg1", r6.sportRecordData.getMWorkoutId()));
        return;
    L27:
        r6.getMContext().startActivity(new Intent(r6.getMContext(), SportRecordsDetailActivity.class).putExtra("mArg2", r6.sportRecordData));
        return;
    L10:
        if (r8 == 2) goto L14;
        r6.getMContext().startActivity(new Intent(r6.getMContext(), SportRecordsDetailActivity.class).putExtra("mArg2", r6.sportRecordData));
        return;
    L14:
        if (i72.OXO1.iIXX0i() == false) goto L17;
        r6.getMContext().startActivity(new Intent(r6.getMContext(), SportDetailV2Activity.class).putExtra("mArg1", r6.sportRecordData.getMWorkoutId()));
        return;
    L17:
        r6.getMContext().startActivity(new Intent(r6.getMContext(), SportDetailActivity.class).putExtra("mArg1", r6.sportRecordData.getMWorkoutId()));
        return;
    }

    private static final void bindView$lambda$2(MainSportRecordItem r2, View r3) {
        if (w85.OXO1.OXO1() == false) goto L6;
        r2.getMContext().startActivity(new Intent(r2.getMContext(), SportRecordsActivity.class));
        return;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r3) {
        Intrinsics.X0O(r3, "itemHolder");
        View r0 = r3.v(R.id.sportSourceIv);
        Intrinsics.XXI(r0);
        setSportSourceIv((ImageView) r0);
        View r1 = r3.v(R.id.sportTypeIv);
        Intrinsics.XXI(r1);
        setSportTypeIv((ImageView) r1);
        View r2 = r3.v(R.id.gpsStatusIv);
        Intrinsics.XXI(r2);
        setGpsStatusIv((ImageView) r2);
        View r4 = r3.v(R.id.sportName);
        Intrinsics.XXI(r4);
        setSportName((PFMedium) r4);
        View r5 = r3.v(R.id.sportStartTime);
        Intrinsics.XXI(r5);
        setSportStartTimeTv((DINCondBold) r5);
        View r6 = r3.v(R.id.sportItemDetail);
        Intrinsics.XXI(r6);
        setSportItemDetail((LinearLayout) r6);
        View r7 = r3.v(R.id.rv);
        Intrinsics.XXI(r7);
        setRv((RecyclerView) r7);
        getRv().setOnTouchListener(new c20(this));
        getSportItemDetail().setOnClickListener(new d20(this));
        View r8 = r3.view(R.id.sportRecordList);
        if (r8 == null) goto L5;
        r8.setOnClickListener(new e20(this));
    L5:
        Context r9 = getRv().getContext();
        Intrinsics.O10IXXX0X(r9, "getContext(...)");
        setMContext(r9);
    }

    @aa1
    public final ImageView getGpsStatusIv() {
        ImageView r0 = this.gpsStatusIv;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("gpsStatusIv");
        return null;
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

    @aa1
    public RecyclerView getRv() {
        RecyclerView r0 = this.rv;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("rv");
        return null;
    }

    @aa1
    public final LinearLayout getSportItemDetail() {
        LinearLayout r0 = this.sportItemDetail;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportItemDetail");
        return null;
    }

    @aa1
    public final PFMedium getSportName() {
        PFMedium r0 = this.sportName;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportName");
        return null;
    }

    @aa1
    public final SportRecordData getSportRecordData() {
        return this.sportRecordData;
    }

    @tb1
    public final SportRecordItemCommonData getSportRecordItemCommonData() {
        return this.sportRecordItemCommonData;
    }

    @aa1
    public final ImageView getSportSourceIv() {
        ImageView r0 = this.sportSourceIv;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportSourceIv");
        return null;
    }

    @aa1
    public final DINCondBold getSportStartTimeTv() {
        DINCondBold r0 = this.sportStartTimeTv;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportStartTimeTv");
        return null;
    }

    @aa1
    public final ImageView getSportTypeIv() {
        ImageView r0 = this.sportTypeIv;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("sportTypeIv");
        return null;
    }

    @aa1
    public final AppUser getUserProfile() {
        AppUser r0 = this.userProfile;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("userProfile");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        setUserProfile((AppUser) r2);
        ArrayList<SportRecordData> r4 = SportRecordDataKt.getSportRecordList(0, 20);
        if (r4.isEmpty() == false) goto L10;
        this.isEmptyData = true;
        noData();
        return;
    L10:
        this.isEmptyData = false;
        setItemHidden(false);
        SportRecordData r5 = r4.get(0);
        Intrinsics.O10IXXX0X(r5, "get(...)");
        this.sportRecordData = r5;
        this.sportRecordItemCommonData = parseSportRecordItemCommonDataMethod();
        ImageView r6 = getSportSourceIv();
        if (this.sportRecordData.getMSource() != 2) goto L13;
        int r7 = R.drawable.icon_phone;
    L14:
        r6.setImageResource(r7);
        ImageView r8 = getSportTypeIv();
        SportRecordItemCommonData r9 = this.sportRecordItemCommonData;
        Intrinsics.XXI(r9);
        r8.setImageResource(r9.getWorkoutImg());
        ImageView r10 = getGpsStatusIv();
        SportRecordItemCommonData r11 = this.sportRecordItemCommonData;
        Intrinsics.XXI(r11);
        r10.setImageResource(r11.getGpsState());
        PFMedium r12 = getSportName();
        SportRecordItemCommonData r13 = this.sportRecordItemCommonData;
        Intrinsics.XXI(r13);
        r12.setText(r13.getWorkoutModeName());
        DINCondBold r14 = getSportStartTimeTv();
        SportRecordItemCommonData r15 = this.sportRecordItemCommonData;
        if (r15 == null) goto L17;
        String r16 = r15.getSportStartTime();
    L18:
        r14.setText(r16);
        setAdapterMethod(getRv());
        return;
    L17:
        r16 = null;
        goto L18
    L13:
        r7 = R.drawable.icon_watch;
        goto L14
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.status_item_sport_record;
    }

    public final void noData() {
        setItemHidden(!i72.OXO1.i01OOiI());
        getSportName().setText(UtilsKt.XXO(R.string.no_data));
        getSportStartTimeTv().setText("");
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
        return SportRecordDataKt.parseSportRecordItemCommonData(getMContext(), getUserProfile(), this.sportRecordData);
    }

    public void setAdapterMethod(@aa1 RecyclerView r5) {
        Intrinsics.X0O(r5, "<this>");
        Context r1 = r5.getContext();
        SportRecordItemCommonData r2 = this.sportRecordItemCommonData;
        Intrinsics.XXI(r2);
        r5.setLayoutManager(new GridLayoutManager(r1, r2.getSpanCount()));
        SportRecordItemCommonData r3 = this.sportRecordItemCommonData;
        Intrinsics.XXI(r3);
        List<SportRecordItemData> r4 = r3.getContentList();
        Context r6 = r5.getContext();
        Intrinsics.O10IXXX0X(r6, "getContext(...)");
        r5.setAdapter(new SportRecordItemAdapter(r4, r6));
    }

    public final void setGpsStatusIv(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.gpsStatusIv = r2;
    }

    public final void setMContext(@aa1 Context r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContext = r2;
    }

    public void setRv(@aa1 RecyclerView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.rv = r2;
    }

    public final void setSportItemDetail(@aa1 LinearLayout r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportItemDetail = r2;
    }

    public final void setSportName(@aa1 PFMedium r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportName = r2;
    }

    public final void setSportRecordData(@aa1 SportRecordData r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportRecordData = r2;
    }

    public final void setSportRecordItemCommonData(@tb1 SportRecordItemCommonData r1) {
        this.sportRecordItemCommonData = r1;
    }

    public final void setSportSourceIv(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportSourceIv = r2;
    }

    public final void setSportStartTimeTv(@aa1 DINCondBold r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportStartTimeTv = r2;
    }

    public final void setSportTypeIv(@aa1 ImageView r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.sportTypeIv = r2;
    }

    public final void setUserProfile(@aa1 AppUser r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.userProfile = r2;
    }
}
