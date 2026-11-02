package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
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
import com.sma.smartv3.p610ui.sport.SportDetailActivity;
import com.sma.smartv3.p610ui.sport.SportDetailV2Activity;
import com.sma.smartv3.p610ui.status.SportRecordsActivity;
import com.sma.smartv3.p610ui.status.SportRecordsDetailActivity;
import com.sma.smartv3.p610ui.status.item.MainSportRecord2Item;
import com.sma.smartv3.pro.R;
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
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.initEvent = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(MainSportRecord2Item mainSportRecord2Item, View view) {
        if (mainSportRecord2Item.sportRecordData != null && w85.OXO1.OXO1()) {
            SportRecordData sportRecordData = mainSportRecord2Item.sportRecordData;
            Integer numValueOf = sportRecordData != null ? Integer.valueOf(sportRecordData.getMSource()) : null;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                if (i72.OXO1.iIXX0i()) {
                    Context mContext = mainSportRecord2Item.getMContext();
                    Intent intent = new Intent(mainSportRecord2Item.getMContext(), (Class<?>) SportDetailV2Activity.class);
                    SportRecordData sportRecordData2 = mainSportRecord2Item.sportRecordData;
                    mContext.startActivity(intent.putExtra("mArg1", sportRecordData2 != null ? Integer.valueOf(sportRecordData2.getMWorkoutId()) : null));
                    return;
                }
                Context mContext2 = mainSportRecord2Item.getMContext();
                Intent intent2 = new Intent(mainSportRecord2Item.getMContext(), (Class<?>) SportDetailActivity.class);
                SportRecordData sportRecordData3 = mainSportRecord2Item.sportRecordData;
                mContext2.startActivity(intent2.putExtra("mArg1", sportRecordData3 != null ? Integer.valueOf(sportRecordData3.getMWorkoutId()) : null));
                return;
            }
            if (numValueOf == null || numValueOf.intValue() != 1) {
                mainSportRecord2Item.getMContext().startActivity(new Intent(mainSportRecord2Item.getMContext(), (Class<?>) SportRecordsDetailActivity.class).putExtra("mArg2", mainSportRecord2Item.sportRecordData));
                return;
            }
            i72 i72Var = i72.OXO1;
            if (i72Var.iIXX0i()) {
                Context mContext3 = mainSportRecord2Item.getMContext();
                Intent intent3 = new Intent(mainSportRecord2Item.getMContext(), (Class<?>) SportDetailV2Activity.class);
                SportRecordData sportRecordData4 = mainSportRecord2Item.sportRecordData;
                mContext3.startActivity(intent3.putExtra("mArg1", sportRecordData4 != null ? Integer.valueOf(sportRecordData4.getMWorkoutId()) : null));
                return;
            }
            if (!i72Var.XII01OO1I()) {
                mainSportRecord2Item.getMContext().startActivity(new Intent(mainSportRecord2Item.getMContext(), (Class<?>) SportRecordsDetailActivity.class).putExtra("mArg2", mainSportRecord2Item.sportRecordData));
                return;
            }
            Context mContext4 = mainSportRecord2Item.getMContext();
            Intent intent4 = new Intent(mainSportRecord2Item.getMContext(), (Class<?>) SportDetailActivity.class);
            SportRecordData sportRecordData5 = mainSportRecord2Item.sportRecordData;
            mContext4.startActivity(intent4.putExtra("mArg1", sportRecordData5 != null ? Integer.valueOf(sportRecordData5.getMWorkoutId()) : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(MainSportRecord2Item mainSportRecord2Item, View view) {
        if (w85.OXO1.OXO1()) {
            mainSportRecord2Item.getMContext().startActivity(new Intent(mainSportRecord2Item.getMContext(), (Class<?>) SportRecordsActivity.class));
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.sportTypeIv);
        Intrinsics.XXI(viewM3483v);
        this.sportTypeIv = (ImageView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.sportName);
        Intrinsics.XXI(viewM3483v2);
        this.sportName = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.sportStartTime);
        Intrinsics.XXI(viewM3483v3);
        this.sportStartTimeTv = (TextView) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.tv_value);
        Intrinsics.XXI(viewM3483v4);
        this.tvValue = (TextView) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.tv_unit);
        Intrinsics.XXI(viewM3483v5);
        this.tvUnit = (TextView) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.tv_time);
        Intrinsics.XXI(viewM3483v6);
        this.tvTime = (TextView) viewM3483v6;
        View viewM3483v7 = itemHolder.m3483v(R.id.sportItemDetail);
        Intrinsics.XXI(viewM3483v7);
        LinearLayout linearLayout = (LinearLayout) viewM3483v7;
        this.sportItemDetail = linearLayout;
        if (linearLayout == null) {
            Intrinsics.XXO("sportItemDetail");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.a20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainSportRecord2Item.bindView$lambda$0(this.f5397IO, view);
            }
        });
        View view = itemHolder.view(R.id.sportRecordList);
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.b20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MainSportRecord2Item.bindView$lambda$1(this.f5649IO, view2);
                }
            });
        }
        Context context = itemHolder.getContext();
        Intrinsics.O10IXXX0X(context, "<get-context>(...)");
        setMContext(context);
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

    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        String tv;
        String tv2;
        List<SportRecordItemData> contentList;
        SportRecordItemData sportRecordItemData;
        List<SportRecordItemData> contentList2;
        SportRecordItemData sportRecordItemData2;
        int i = 0;
        ArrayList<SportRecordData> sportRecordList = SportRecordDataKt.getSportRecordList(0, 20);
        if (sportRecordList.isEmpty()) {
            this.sportRecordData = null;
            return;
        }
        this.sportRecordData = sportRecordList.get(0);
        this.sportRecordItemCommonData = parseSportRecordItemCommonDataMethod();
        ImageView imageView = this.sportTypeIv;
        if (imageView == null) {
            Intrinsics.XXO("sportTypeIv");
            imageView = null;
        }
        SportRecordItemCommonData sportRecordItemCommonData = this.sportRecordItemCommonData;
        Intrinsics.XXI(sportRecordItemCommonData);
        imageView.setImageResource(sportRecordItemCommonData.getWorkoutImg());
        TextView textView = this.sportName;
        if (textView == null) {
            Intrinsics.XXO("sportName");
            textView = null;
        }
        Context applicationContext = getMContext().getApplicationContext();
        SportRecordItemCommonData sportRecordItemCommonData2 = this.sportRecordItemCommonData;
        Intrinsics.XXI(sportRecordItemCommonData2);
        textView.setText(applicationContext.getString(sportRecordItemCommonData2.getWorkoutModeName()));
        TextView textView2 = this.sportStartTimeTv;
        if (textView2 == null) {
            Intrinsics.XXO("sportStartTimeTv");
            textView2 = null;
        }
        SportRecordItemCommonData sportRecordItemCommonData3 = this.sportRecordItemCommonData;
        textView2.setText(sportRecordItemCommonData3 != null ? sportRecordItemCommonData3.getSportStartTime() : null);
        TextView textView3 = this.tvTime;
        if (textView3 == null) {
            Intrinsics.XXO("tvTime");
            textView3 = null;
        }
        SportRecordItemCommonData sportRecordItemCommonData4 = this.sportRecordItemCommonData;
        if (sportRecordItemCommonData4 == null || (contentList2 = sportRecordItemCommonData4.getContentList()) == null || (sportRecordItemData2 = contentList2.get(1)) == null || (tv = sportRecordItemData2.getTv()) == null) {
            tv = "";
        }
        textView3.setText(tv);
        TextView textView4 = this.tvValue;
        if (textView4 == null) {
            Intrinsics.XXO("tvValue");
            textView4 = null;
        }
        SportRecordItemCommonData sportRecordItemCommonData5 = this.sportRecordItemCommonData;
        if (sportRecordItemCommonData5 == null || (contentList = sportRecordItemCommonData5.getContentList()) == null || (sportRecordItemData = contentList.get(2)) == null || (tv2 = sportRecordItemData.getTv()) == null) {
            tv2 = "";
        }
        textView4.setText(tv2);
        TextView textView5 = this.tvUnit;
        if (textView5 == null) {
            Intrinsics.XXO("tvUnit");
            textView5 = null;
        }
        textView5.setText("");
        TextView textView6 = this.tvUnit;
        if (textView6 == null) {
            Intrinsics.XXO("tvUnit");
            textView6 = null;
        }
        SportRecordData sportRecordData = this.sportRecordData;
        Integer numValueOf = sportRecordData != null ? Integer.valueOf(sportRecordData.getMMode()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 8) || (numValueOf != null && numValueOf.intValue() == 12)) {
            i = R.string.steps;
        } else if (numValueOf != null && numValueOf.intValue() == 9) {
            i = R.string.f54356km;
        } else if (numValueOf != null && numValueOf.intValue() == 7) {
            i = R.string.kcal;
        } else if (numValueOf != null && numValueOf.intValue() == 10) {
            if (BleCache.INSTANCE.getMAGpsType() != 0 || q62.OXO1.XOXOIX0Oi()) {
                i = R.string.f54356km;
            } else {
                i = R.string.kcal;
            }
        }
        textView6.setText(i);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_sport_record;
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
        Context mContext = getMContext();
        AppUser appUser = this.userProfile;
        SportRecordData sportRecordData = this.sportRecordData;
        Intrinsics.XXI(sportRecordData);
        return SportRecordDataKt.parseSportRecordItemCommonData(mContext, appUser, sportRecordData);
    }

    public final void setMContext(@aa1 Context context) {
        Intrinsics.X0O(context, "<set-?>");
        this.mContext = context;
    }

    public final void setSportRecordData(@tb1 SportRecordData sportRecordData) {
        this.sportRecordData = sportRecordData;
    }

    public final void setSportRecordItemCommonData(@tb1 SportRecordItemCommonData sportRecordItemCommonData) {
        this.sportRecordItemCommonData = sportRecordItemCommonData;
    }
}
