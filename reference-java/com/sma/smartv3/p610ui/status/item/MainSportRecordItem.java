package com.sma.smartv3.p610ui.status.item;

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
import com.sma.smartv3.p610ui.sport.SportDetailActivity;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.status.SportRecordsActivity;
import com.sma.smartv3.p610ui.status.SportRecordsDetailActivity;
import com.sma.smartv3.p610ui.status.item.MainSportRecordItem;
import com.sma.smartv3.pro.R;
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
    private boolean isEmptyData;
    public Context mContext;

    /* JADX INFO: renamed from: rv */
    public RecyclerView f54804rv;
    public LinearLayout sportItemDetail;
    public PFMedium sportName;

    @tb1
    private SportRecordItemCommonData sportRecordItemCommonData;
    public ImageView sportSourceIv;
    public DINCondBold sportStartTimeTv;
    public ImageView sportTypeIv;
    public AppUser userProfile;
    private final boolean initEvent = true;

    @aa1
    private SportRecordData sportRecordData = new SportRecordData();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindView$lambda$0$0(MainSportRecordItem mainSportRecordItem, View view, MotionEvent motionEvent) {
        return mainSportRecordItem.getSportItemDetail().onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(MainSportRecordItem mainSportRecordItem, View view) {
        if (!mainSportRecordItem.isEmptyData && w85.OXO1.OXO1()) {
            LogUtils.m11130i("sportRecordData.mSource" + mainSportRecordItem.sportRecordData.getMSource());
            int mSource = mainSportRecordItem.sportRecordData.getMSource();
            if (mSource != 1) {
                if (mSource != 2) {
                    mainSportRecordItem.getMContext().startActivity(new Intent(mainSportRecordItem.getMContext(), (Class<?>) SportRecordsDetailActivity.class).putExtra("mArg2", mainSportRecordItem.sportRecordData));
                    return;
                } else if (i72.OXO1.iIXX0i()) {
                    mainSportRecordItem.getMContext().startActivity(new Intent(mainSportRecordItem.getMContext(), (Class<?>) SportDetailV2Activity.class).putExtra("mArg1", mainSportRecordItem.sportRecordData.getMWorkoutId()));
                    return;
                } else {
                    mainSportRecordItem.getMContext().startActivity(new Intent(mainSportRecordItem.getMContext(), (Class<?>) SportDetailActivity.class).putExtra("mArg1", mainSportRecordItem.sportRecordData.getMWorkoutId()));
                    return;
                }
            }
            i72 i72Var = i72.OXO1;
            if (i72Var.iIXX0i()) {
                mainSportRecordItem.getMContext().startActivity(new Intent(mainSportRecordItem.getMContext(), (Class<?>) SportDetailV2Activity.class).putExtra("mArg1", mainSportRecordItem.sportRecordData.getMWorkoutId()));
            } else if (i72Var.XII01OO1I()) {
                mainSportRecordItem.getMContext().startActivity(new Intent(mainSportRecordItem.getMContext(), (Class<?>) SportDetailActivity.class).putExtra("mArg1", mainSportRecordItem.sportRecordData.getMWorkoutId()));
            } else {
                mainSportRecordItem.getMContext().startActivity(new Intent(mainSportRecordItem.getMContext(), (Class<?>) SportRecordsDetailActivity.class).putExtra("mArg2", mainSportRecordItem.sportRecordData));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(MainSportRecordItem mainSportRecordItem, View view) {
        if (w85.OXO1.OXO1()) {
            mainSportRecordItem.getMContext().startActivity(new Intent(mainSportRecordItem.getMContext(), (Class<?>) SportRecordsActivity.class));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.sportSourceIv);
        Intrinsics.XXI(viewM3483v);
        setSportSourceIv((ImageView) viewM3483v);
        View viewM3483v2 = itemHolder.m3483v(R.id.sportTypeIv);
        Intrinsics.XXI(viewM3483v2);
        setSportTypeIv((ImageView) viewM3483v2);
        View viewM3483v3 = itemHolder.m3483v(R.id.gpsStatusIv);
        Intrinsics.XXI(viewM3483v3);
        setGpsStatusIv((ImageView) viewM3483v3);
        View viewM3483v4 = itemHolder.m3483v(R.id.sportName);
        Intrinsics.XXI(viewM3483v4);
        setSportName((PFMedium) viewM3483v4);
        View viewM3483v5 = itemHolder.m3483v(R.id.sportStartTime);
        Intrinsics.XXI(viewM3483v5);
        setSportStartTimeTv((DINCondBold) viewM3483v5);
        View viewM3483v6 = itemHolder.m3483v(R.id.sportItemDetail);
        Intrinsics.XXI(viewM3483v6);
        setSportItemDetail((LinearLayout) viewM3483v6);
        View viewM3483v7 = itemHolder.m3483v(R.id.f51422rv);
        Intrinsics.XXI(viewM3483v7);
        setRv((RecyclerView) viewM3483v7);
        getRv().setOnTouchListener(new View.OnTouchListener() { // from class: com.android.mltcode.paycertificationapi.c20
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MainSportRecordItem.bindView$lambda$0$0(this.f5882IO, view, motionEvent);
            }
        });
        getSportItemDetail().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.d20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainSportRecordItem.bindView$lambda$1(this.f6113IO, view);
            }
        });
        View view = itemHolder.view(R.id.sportRecordList);
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.e20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MainSportRecordItem.bindView$lambda$2(this.f6322IO, view2);
                }
            });
        }
        Context context = getRv().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        setMContext(context);
    }

    @aa1
    public final ImageView getGpsStatusIv() {
        ImageView imageView = this.gpsStatusIv;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("gpsStatusIv");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public boolean getInitEvent() {
        return this.initEvent;
    }

    @aa1
    public final Context getMContext() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.XXO("mContext");
        return null;
    }

    @aa1
    public RecyclerView getRv() {
        RecyclerView recyclerView = this.f54804rv;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.XXO("rv");
        return null;
    }

    @aa1
    public final LinearLayout getSportItemDetail() {
        LinearLayout linearLayout = this.sportItemDetail;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.XXO("sportItemDetail");
        return null;
    }

    @aa1
    public final PFMedium getSportName() {
        PFMedium pFMedium = this.sportName;
        if (pFMedium != null) {
            return pFMedium;
        }
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
        ImageView imageView = this.sportSourceIv;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("sportSourceIv");
        return null;
    }

    @aa1
    public final DINCondBold getSportStartTimeTv() {
        DINCondBold dINCondBold = this.sportStartTimeTv;
        if (dINCondBold != null) {
            return dINCondBold;
        }
        Intrinsics.XXO("sportStartTimeTv");
        return null;
    }

    @aa1
    public final ImageView getSportTypeIv() {
        ImageView imageView = this.sportTypeIv;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.XXO("sportTypeIv");
        return null;
    }

    @aa1
    public final AppUser getUserProfile() {
        AppUser appUser = this.userProfile;
        if (appUser != null) {
            return appUser;
        }
        Intrinsics.XXO("userProfile");
        return null;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        setUserProfile((AppUser) appUser);
        ArrayList<SportRecordData> sportRecordList = SportRecordDataKt.getSportRecordList(0, 20);
        if (sportRecordList.isEmpty()) {
            this.isEmptyData = true;
            noData();
            return;
        }
        this.isEmptyData = false;
        setItemHidden(false);
        SportRecordData sportRecordData = sportRecordList.get(0);
        Intrinsics.O10IXXX0X(sportRecordData, "get(...)");
        this.sportRecordData = sportRecordData;
        this.sportRecordItemCommonData = parseSportRecordItemCommonDataMethod();
        getSportSourceIv().setImageResource(this.sportRecordData.getMSource() == 2 ? R.drawable.icon_phone : R.drawable.icon_watch);
        ImageView sportTypeIv = getSportTypeIv();
        SportRecordItemCommonData sportRecordItemCommonData = this.sportRecordItemCommonData;
        Intrinsics.XXI(sportRecordItemCommonData);
        sportTypeIv.setImageResource(sportRecordItemCommonData.getWorkoutImg());
        ImageView gpsStatusIv = getGpsStatusIv();
        SportRecordItemCommonData sportRecordItemCommonData2 = this.sportRecordItemCommonData;
        Intrinsics.XXI(sportRecordItemCommonData2);
        gpsStatusIv.setImageResource(sportRecordItemCommonData2.getGpsState());
        PFMedium sportName = getSportName();
        SportRecordItemCommonData sportRecordItemCommonData3 = this.sportRecordItemCommonData;
        Intrinsics.XXI(sportRecordItemCommonData3);
        sportName.setText(sportRecordItemCommonData3.getWorkoutModeName());
        DINCondBold sportStartTimeTv = getSportStartTimeTv();
        SportRecordItemCommonData sportRecordItemCommonData4 = this.sportRecordItemCommonData;
        sportStartTimeTv.setText(sportRecordItemCommonData4 != null ? sportRecordItemCommonData4.getSportStartTime() : null);
        setAdapterMethod(getRv());
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
    public final void onActivityChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onActivityChanged");
        initView();
    }

    @sf5(tag = I01XX0.XIi00iiXO)
    public final void onHeartRateChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onHeartRateChanged");
        initView();
    }

    @sf5(tag = I01XX0.OIX0iXi)
    public final void onLocationChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onLocationChanged");
        initView();
    }

    @sf5(tag = I01XX0.O00)
    public final void onWorkoutChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onWorkoutChanged");
        initView();
    }

    @aa1
    public SportRecordItemCommonData parseSportRecordItemCommonDataMethod() {
        return SportRecordDataKt.parseSportRecordItemCommonData(getMContext(), getUserProfile(), this.sportRecordData);
    }

    public void setAdapterMethod(@aa1 RecyclerView recyclerView) {
        Intrinsics.X0O(recyclerView, "<this>");
        Context context = recyclerView.getContext();
        SportRecordItemCommonData sportRecordItemCommonData = this.sportRecordItemCommonData;
        Intrinsics.XXI(sportRecordItemCommonData);
        recyclerView.setLayoutManager(new GridLayoutManager(context, sportRecordItemCommonData.getSpanCount()));
        SportRecordItemCommonData sportRecordItemCommonData2 = this.sportRecordItemCommonData;
        Intrinsics.XXI(sportRecordItemCommonData2);
        List<SportRecordItemData> contentList = sportRecordItemCommonData2.getContentList();
        Context context2 = recyclerView.getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        recyclerView.setAdapter(new SportRecordItemAdapter(contentList, context2));
    }

    public final void setGpsStatusIv(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.gpsStatusIv = imageView;
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public void setRv(@aa1 RecyclerView recyclerView) {
        Intrinsics.X0O(recyclerView, "<set-?>");
        this.f54804rv = recyclerView;
    }

    public final void setSportItemDetail(@aa1 LinearLayout linearLayout) {
        Intrinsics.X0O(linearLayout, "<set-?>");
        this.sportItemDetail = linearLayout;
    }

    public final void setSportName(@aa1 PFMedium pFMedium) {
        Intrinsics.X0O(pFMedium, "<set-?>");
        this.sportName = pFMedium;
    }

    public final void setSportRecordData(@aa1 SportRecordData sportRecordData) {
        Intrinsics.X0O(sportRecordData, "<set-?>");
        this.sportRecordData = sportRecordData;
    }

    public final void setSportRecordItemCommonData(@tb1 SportRecordItemCommonData sportRecordItemCommonData) {
        this.sportRecordItemCommonData = sportRecordItemCommonData;
    }

    public final void setSportSourceIv(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.sportSourceIv = imageView;
    }

    public final void setSportStartTimeTv(@aa1 DINCondBold dINCondBold) {
        Intrinsics.X0O(dINCondBold, "<set-?>");
        this.sportStartTimeTv = dINCondBold;
    }

    public final void setSportTypeIv(@aa1 ImageView imageView) {
        Intrinsics.X0O(imageView, "<set-?>");
        this.sportTypeIv = imageView;
    }

    public final void setUserProfile(@aa1 AppUser appUser) {
        Intrinsics.X0O(appUser, "<set-?>");
        this.userProfile = appUser;
    }
}
