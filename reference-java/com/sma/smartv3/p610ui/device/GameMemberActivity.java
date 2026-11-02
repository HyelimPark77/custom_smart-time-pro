package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX1IIO10;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.p610ui.device.GameMemberActivity;
import com.sma.smartv3.pro.R;
import com.tenmeter.smlibrary.entity.SMGameInfo;
import com.tenmeter.smlibrary.entity.SMIconListParent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nGameMemberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n19#2:222\n15#2:223\n93#2,2:224\n90#2:226\n93#2,2:227\n90#2:229\n1869#3:230\n1869#3,2:231\n1870#3:233\n1563#3:234\n1634#3,3:235\n*S KotlinDebug\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity\n*L\n45#1:222\n45#1:223\n98#1:224,2\n98#1:226\n110#1:227,2\n110#1:229\n159#1:230\n174#1:231,2\n159#1:233\n138#1:234\n138#1:235,3\n*E\n"})
public final class GameMemberActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG = "GameMemberActivity";

    @aa1
    private final AppUser appUser;

    @aa1
    private final Lazy mMemberBtn$delegate;

    @aa1
    private final Lazy mUserAvatar$delegate;

    @aa1
    private final Lazy mUserMemberTime$delegate;

    @aa1
    private final Lazy mUserName$delegate;

    public GameMemberActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.appUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mUserAvatar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0O1I1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return GameMemberActivity.mUserAvatar_delegate$lambda$0(this.f2492IO);
            }
        });
        this.mUserName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIOXXXOO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return GameMemberActivity.mUserName_delegate$lambda$0(this.f7886IO);
            }
        });
        this.mUserMemberTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i0ii0XIIX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return GameMemberActivity.mUserMemberTime_delegate$lambda$0(this.f7491IO);
            }
        });
        this.mMemberBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0iXXI11
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return GameMemberActivity.mMemberBtn_delegate$lambda$0(this.f4108IO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0(final SMIconListParent sMIconListParent, final GameMemberActivity gameMemberActivity, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemIsGroupHead(true);
        dslItem.setItemIsHover(false);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(sMIconListParent.getIconName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iOI1ii
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GameMemberActivity.findData$lambda$0$0$0(sMIconListParent, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag(sMIconListParent.getIconName());
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.I1O0O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameMemberActivity.findData$lambda$0$0$1(sMIconListParent, gameMemberActivity, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$0(SMIconListParent sMIconListParent, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_name);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(sMIconListParent.getIconName());
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$0$1(SMIconListParent sMIconListParent, GameMemberActivity gameMemberActivity, View it) {
        Intrinsics.X0O(it, "it");
        i0O111.OXO1.XiOIO(sMIconListParent, gameMemberActivity);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$1$0(SMIconListParent sMIconListParent, final GameMemberActivity gameMemberActivity, final SMGameInfo sMGameInfo, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(sMIconListParent.getIconName()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.X00Oi0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GameMemberActivity.findData$lambda$0$1$0$0(this.f3878IO, sMGameInfo, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemClick(new Function1() { // from class: com.android.mltcode.paycertificationapi.X1XI0I0X
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameMemberActivity.findData$lambda$0$1$0$1(this.f4338IO, sMGameInfo, (View) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$1$0$0(final GameMemberActivity gameMemberActivity, final SMGameInfo sMGameInfo, DslViewHolder itemHolder, int i, DslAdapterItem adapterItem, List payloads) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(adapterItem, "adapterItem");
        Intrinsics.X0O(payloads, "payloads");
        ImageView imageView = (ImageView) itemHolder.m3483v(R.id.item_game_icon);
        if (imageView != null) {
            RequestOptions requestOptionsTransform = new RequestOptions().transform(new RoundedCorners(20));
            Intrinsics.O10IXXX0X(requestOptionsTransform, "transform(...)");
            Glide.with((FragmentActivity) gameMemberActivity).load(sMGameInfo.getBackground()).apply((BaseRequestOptions<?>) requestOptionsTransform).into(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iOiiiiI1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GameMemberActivity.findData$lambda$0$1$0$0$0(this.f8212IO, sMGameInfo, view);
                }
            });
        }
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.item_game_title);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(sMGameInfo.getGname());
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.item_game_content);
        if (textViewM3482tv2 != null) {
            textViewM3482tv2.setText(sMGameInfo.getDetails());
        }
        TextView textViewM3482tv3 = itemHolder.m3482tv(R.id.item_game_play_num);
        if (textViewM3482tv3 != null) {
            textViewM3482tv3.setText(gameMemberActivity.getString(R.string.game_play_num, Long.valueOf(sMGameInfo.getPlayNum())));
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findData$lambda$0$1$0$0$0(GameMemberActivity gameMemberActivity, SMGameInfo sMGameInfo, View view) {
        i0O111 i0o111 = i0O111.OXO1;
        Intrinsics.XXI(sMGameInfo);
        i0o111.IIX1OXO(gameMemberActivity, sMGameInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit findData$lambda$0$1$0$1(GameMemberActivity gameMemberActivity, SMGameInfo sMGameInfo, View it) {
        Intrinsics.X0O(it, "it");
        i0O111 i0o111 = i0O111.OXO1;
        Intrinsics.XXI(sMGameInfo);
        i0o111.IIX1OXO(gameMemberActivity, sMGameInfo);
        return Unit.OXO1;
    }

    private final Button getMMemberBtn() {
        return (Button) this.mMemberBtn$delegate.getValue();
    }

    private final ImageView getMUserAvatar() {
        return (ImageView) this.mUserAvatar$delegate.getValue();
    }

    private final TextView getMUserMemberTime() {
        return (TextView) this.mUserMemberTime$delegate.getValue();
    }

    private final TextView getMUserName() {
        return (TextView) this.mUserName$delegate.getValue();
    }

    private final void getServerData() {
        OrderManager.OXO1.O1O(new Function1() { // from class: com.android.mltcode.paycertificationapi.I0XiO1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameMemberActivity.getServerData$lambda$0(this.f1245IO, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getServerData$lambda$0(GameMemberActivity gameMemberActivity, Boolean bool) throws IllegalAccessException, InstantiationException {
        gameMemberActivity.initView();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button mMemberBtn_delegate$lambda$0(GameMemberActivity gameMemberActivity) {
        return (Button) gameMemberActivity.findViewById(R.id.btn_bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView mUserAvatar_delegate$lambda$0(GameMemberActivity gameMemberActivity) {
        return (ImageView) gameMemberActivity.findViewById(R.id.game_member_iv_avatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mUserMemberTime_delegate$lambda$0(GameMemberActivity gameMemberActivity) {
        return (TextView) gameMemberActivity.findViewById(R.id.game_member_user_member_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mUserName_delegate$lambda$0(GameMemberActivity gameMemberActivity) {
        return (TextView) gameMemberActivity.findViewById(R.id.game_member_user_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0(final GameMemberActivity gameMemberActivity, final List list, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        gameMemberActivity.getDslViewHolder().postDelay(300L, new Function0() { // from class: com.android.mltcode.paycertificationapi.i10XX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return GameMemberActivity.showList$lambda$0$0(this.f7519IO, list);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0(final GameMemberActivity gameMemberActivity, final List list) {
        gameMemberActivity.renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.XXOX0O0O1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameMemberActivity.showList$lambda$0$0$0(list, gameMemberActivity, (DslAdapter) obj);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showList$lambda$0$0$0(List list, GameMemberActivity gameMemberActivity, DslAdapter renderAdapter) {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(renderAdapter, 0, null, 2, null);
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            gameMemberActivity.getRecyclerView().setVisibility(8);
        } else {
            List list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list3, 10));
            Iterator it = list3.iterator();
            boolean z = true;
            while (it.hasNext()) {
                List<SMGameInfo> gameList = ((SMIconListParent) it.next()).getGameList();
                Integer numValueOf = gameList != null ? Integer.valueOf(gameList.size()) : null;
                Intrinsics.XXI(numValueOf);
                if (numValueOf.intValue() > 0) {
                    z = false;
                }
                arrayList.add(Unit.OXO1);
            }
            if (z) {
                gameMemberActivity.getRecyclerView().setVisibility(8);
            } else {
                gameMemberActivity.getRecyclerView().setVisibility(0);
                gameMemberActivity.findData(list);
            }
            i1O0OXO1O.OXO1.OXO1(gameMemberActivity.TAG + " isEmptyData = " + z);
        }
        return Unit.OXO1;
    }

    public final void findData(@aa1 List<? extends SMIconListParent> result) {
        Intrinsics.X0O(result, "result");
        for (final SMIconListParent sMIconListParent : result) {
            DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.layout_online_watchface_category_head, new Function1() { // from class: com.android.mltcode.paycertificationapi.IO101O1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return GameMemberActivity.findData$lambda$0$0(sMIconListParent, this, (DslAdapterItem) obj);
                }
            });
            List<SMGameInfo> gameList = sMIconListParent.getGameList();
            Intrinsics.O10IXXX0X(gameList, "getGameList(...)");
            for (final SMGameInfo sMGameInfo : CollectionsKt___CollectionsKt.IO0OOi(gameList, 4)) {
                DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_game_member, new Function1() { // from class: com.android.mltcode.paycertificationapi.iIi0X1II
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return GameMemberActivity.findData$lambda$0$1$0(sMIconListParent, this, sMGameInfo, (DslAdapterItem) obj);
                    }
                });
            }
        }
        getDslAdapter().notifyDataSetChanged();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() throws IllegalAccessException, InstantiationException {
        String string;
        String string2;
        super.initView();
        setStatusBarColor(this, gk4.m1859iO(getMContext(), R.color.game_member_status_color));
        if (this.appUser.getAvatarUrl().length() > 0) {
            Glide.with((FragmentActivity) this).load(this.appUser.getAvatarUrl()).error(R.drawable.pic_avatar_default).into(getMUserAvatar());
        }
        getMUserName().setText(this.appUser.getNickname());
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.O101 + '_' + UserMember.class.getName()), (Class<Object>) UserMember.class);
        if (objFromJson == null) {
            objFromJson = UserMember.class.newInstance();
        }
        UserMember userMember = (UserMember) objFromJson;
        TextView mUserMemberTime = getMUserMemberTime();
        i0O111 i0o111 = i0O111.OXO1;
        if (i0o111.OII(userMember)) {
            string = getString(R.string.valid_until) + O0X11OiO.I0IIOi().format(new Date(userMember.getLatestGameMemberDateTime()));
        } else {
            string = userMember.getLatestGameMemberDateTime() > 0 ? getString(R.string.game_member_expired_tip) : getString(R.string.game_member_no_have);
            Intrinsics.XXI(string);
        }
        mUserMemberTime.setText(string);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.game_member_title);
        SPUtils sPUtilsIiI10X2 = a01Var.IiI10X();
        Object objFromJson2 = new Gson().fromJson(sPUtilsIiI10X2.getString(I01XX0.O101 + '_' + UserMember.class.getName()), (Class<Object>) UserMember.class);
        if (objFromJson2 == null) {
            objFromJson2 = UserMember.class.newInstance();
        }
        UserMember userMember2 = (UserMember) objFromJson2;
        Button mMemberBtn = getMMemberBtn();
        if (userMember2.getLatestGameMemberDateTime() > 0) {
            string2 = i0o111.OII(userMember2) ? getString(R.string.game_member_renewal_btn) : getString(R.string.renew_now);
        } else {
            string2 = getString(R.string.game_member_open_btn);
        }
        mMemberBtn.setText(string2);
        if (getRecyclerView().getItemDecorationCount() == 0) {
            getRecyclerView().addItemDecoration(new DividerItemDecoration(getMContext(), 0));
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_game_member;
    }

    public final void onBottomClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i0O111.OXO1.iIiiO(this);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        i0O111.OXO1.I0iXXO(new O1XIiIO<List<SMIconListParent>>() { // from class: com.sma.smartv3.ui.device.GameMemberActivity.onInitBaseLayoutAfter.1
            /* JADX WARN: Code duplicated, block: B:13:0x003d  */
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(List<SMIconListParent> list) {
                ArrayList arrayList;
                if (Intrinsics.XOO0ii0(Api.INSTANCE.getBASE_URL(), iX1IIO10.OXO1)) {
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Object obj : list) {
                            SMIconListParent sMIconListParent = (SMIconListParent) obj;
                            if (sMIconListParent.getIconId() == 84 || sMIconListParent.getIconId() == 85) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        SMIconListParent sMIconListParent2 = (SMIconListParent) obj2;
                        if (sMIconListParent2.getIconId() == 50 || sMIconListParent2.getIconId() == 52) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                i1O0OXO1O.OXO1.OXO1(GameMemberActivity.this.TAG + " getIconLists = " + (arrayList != null ? Integer.valueOf(arrayList.size()) : null));
                GameMemberActivity.this.showList(arrayList);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                ToastUtils.showLong(error, new Object[0]);
            }
        });
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onOrderPayStatusChange");
        getServerData();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.game_member_rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    public final void showList(@tb1 final List<? extends SMIconListParent> list) {
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.OIX1iXXi
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GameMemberActivity.showList$lambda$0(this.f3040IO, list, (DslAdapter) obj);
            }
        });
    }
}
