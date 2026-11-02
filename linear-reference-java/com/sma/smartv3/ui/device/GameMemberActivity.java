package com.sma.smartv3.ui.device;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DividerItemDecoration;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0XiO1;
import com.android.mltcode.paycertificationapi.I1O0O;
import com.android.mltcode.paycertificationapi.IO101O1;
import com.android.mltcode.paycertificationapi.O0O1I1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIX1iXXi;
import com.android.mltcode.paycertificationapi.X00Oi0;
import com.android.mltcode.paycertificationapi.X0iXXI11;
import com.android.mltcode.paycertificationapi.X1XI0I0X;
import com.android.mltcode.paycertificationapi.XXOX0O0O1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.i0ii0XIIX;
import com.android.mltcode.paycertificationapi.i10XX;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iIOXXXOO;
import com.android.mltcode.paycertificationapi.iIi0X1II;
import com.android.mltcode.paycertificationapi.iOI1ii;
import com.android.mltcode.paycertificationapi.iOiiiiI1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.UserMember;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nGameMemberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n19#2:222\n15#2:223\n93#2,2:224\n90#2:226\n93#2,2:227\n90#2:229\n1869#3:230\n1869#3,2:231\n1870#3:233\n1563#3:234\n1634#3,3:235\n*S KotlinDebug\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity\n*L\n45#1:222\n45#1:223\n98#1:224,2\n98#1:226\n110#1:227,2\n110#1:229\n159#1:230\n174#1:231,2\n159#1:233\n138#1:234\n138#1:235,3\n*E\n"})
public final class GameMemberActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final String TAG;

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
        this.TAG = "GameMemberActivity";
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.appUser = (AppUser) r2;
        this.mUserAvatar$delegate = LazyKt__LazyJVMKt.iO(new O0O1I1(this));
        this.mUserName$delegate = LazyKt__LazyJVMKt.iO(new iIOXXXOO(this));
        this.mUserMemberTime$delegate = LazyKt__LazyJVMKt.iO(new i0ii0XIIX(this));
        this.mMemberBtn$delegate = LazyKt__LazyJVMKt.iO(new X0iXXI11(this));
    }

    public static /* synthetic */ Unit I0iXXO(SMIconListParent r0, GameMemberActivity r1, View r2) {
        return findData$lambda$0$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit I1(SMIconListParent r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return findData$lambda$0$0$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit I1XOi1(SMIconListParent r0, GameMemberActivity r1, SMGameInfo r2, DslAdapterItem r3) {
        return findData$lambda$0$1$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ TextView IIX1OXO(GameMemberActivity r0) {
        return mUserMemberTime_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit O10IXXX0X(GameMemberActivity r0, List r1) {
        return showList$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ Unit OII(List r0, GameMemberActivity r1, DslAdapter r2) {
        return showList$lambda$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit OX(GameMemberActivity r0, SMGameInfo r1, View r2) {
        return findData$lambda$0$1$0$1(r0, r1, r2);
    }

    public static /* synthetic */ Unit OiIIX101O(GameMemberActivity r0, Boolean r1) {
        return getServerData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit X0O(SMIconListParent r0, GameMemberActivity r1, DslAdapterItem r2) {
        return findData$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ TextView X1ii(GameMemberActivity r0) {
        return mUserName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XX0(GameMemberActivity r0, SMGameInfo r1, DslViewHolder r2, int r3, DslAdapterItem r4, List r5) {
        return findData$lambda$0$1$0$0(r0, r1, r2, r3, r4, r5);
    }

    public static /* synthetic */ ImageView XXI(GameMemberActivity r0) {
        return mUserAvatar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIO(GameMemberActivity r0, SMGameInfo r1, View r2) {
        findData$lambda$0$1$0$0$0(r0, r1, r2);
    }

    public static /* synthetic */ Unit XiOIii1(GameMemberActivity r0, List r1, DslAdapter r2) {
        return showList$lambda$0(r0, r1, r2);
    }

    public static final /* synthetic */ String access$getTAG$p(GameMemberActivity r0) {
        return r0.TAG;
    }

    private static final Unit findData$lambda$0$0(final SMIconListParent r1, final GameMemberActivity r2, DslAdapterItem r3) {
        Intrinsics.X0O(r3, "$this$dslItem");
        r3.setItemIsGroupHead(true);
        r3.setItemIsHover(false);
        r3.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getIconName()}));
        r3.setItemBindOverride(new iOI1ii(r1));
        r3.setItemTag(r1.getIconName());
        r3.setItemClick(new I1O0O(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0$0(SMIconListParent r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv_name);
        if (r5 == null) goto L6;
        r5.setText(r0.getIconName());
    L6:
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$0$1(SMIconListParent r1, GameMemberActivity r2, View r3) {
        Intrinsics.X0O(r3, "it");
        i0O111.OXO1.XiOIO(r1, r2);
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$1$0(SMIconListParent r1, final GameMemberActivity r2, final SMGameInfo r3, DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r1.getIconName()}));
        r4.setItemBindOverride(new X00Oi0(r2, r3));
        r4.setItemClick(new X1XI0I0X(r2, r3));
        return Unit.OXO1;
    }

    private static final Unit findData$lambda$0$1$0$0(final GameMemberActivity r1, final SMGameInfo r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "adapterItem");
        Intrinsics.X0O(r6, "payloads");
        ImageView r7 = (ImageView) r3.v(R.id.item_game_icon);
        if (r7 == null) goto L5;
        RequestOptions r8 = new RequestOptions().transform(new RoundedCorners(20));
        Intrinsics.O10IXXX0X(r8, "transform(...)");
        RequestBuilder<Drawable> r9 = Glide.with(r1).load(r2.getBackground());
        r9.apply(r8).into(r7);
        r7.setOnClickListener(new iOiiiiI1(r1, r2));
    L5:
        TextView r10 = r3.tv(R.id.item_game_title);
        if (r10 == null) goto L8;
        r10.setText(r2.getGname());
    L8:
        TextView r11 = r3.tv(R.id.item_game_content);
        if (r11 == null) goto L11;
        r11.setText(r2.getDetails());
    L11:
        TextView r12 = r3.tv(R.id.item_game_play_num);
        if (r12 == null) goto L15;
        r12.setText(r1.getString(R.string.game_play_num, new Object[]{Long.valueOf(r2.getPlayNum())}));
    L15:
        return Unit.OXO1;
    }

    private static final void findData$lambda$0$1$0$0$0(GameMemberActivity r0, SMGameInfo r1, View r2) {
        i0O111 r3 = i0O111.OXO1;
        Intrinsics.XXI(r1);
        r3.IIX1OXO(r0, r1);
    }

    private static final Unit findData$lambda$0$1$0$1(GameMemberActivity r1, SMGameInfo r2, View r3) {
        Intrinsics.X0O(r3, "it");
        i0O111 r4 = i0O111.OXO1;
        Intrinsics.XXI(r2);
        r4.IIX1OXO(r1, r2);
        return Unit.OXO1;
    }

    private final Button getMMemberBtn() {
        return (Button) getValue();
    }

    private final ImageView getMUserAvatar() {
        return (ImageView) getValue();
    }

    private final TextView getMUserMemberTime() {
        return (TextView) getValue();
    }

    private final TextView getMUserName() {
        return (TextView) getValue();
    }

    private final void getServerData() {
        OrderManager.OXO1.O1O(new I0XiO1(this));
    }

    private static final Unit getServerData$lambda$0(GameMemberActivity r0, Boolean r1) {
        r0.initView();
        return Unit.OXO1;
    }

    public static /* synthetic */ Button iIiiO(GameMemberActivity r0) {
        return mMemberBtn_delegate$lambda$0(r0);
    }

    private static final Button mMemberBtn_delegate$lambda$0(GameMemberActivity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom);
    }

    private static final ImageView mUserAvatar_delegate$lambda$0(GameMemberActivity r1) {
        return (ImageView) r1.findViewById(R.id.game_member_iv_avatar);
    }

    private static final TextView mUserMemberTime_delegate$lambda$0(GameMemberActivity r1) {
        return (TextView) r1.findViewById(R.id.game_member_user_member_time);
    }

    private static final TextView mUserName_delegate$lambda$0(GameMemberActivity r1) {
        return (TextView) r1.findViewById(R.id.game_member_user_name);
    }

    private static final Unit showList$lambda$0(final GameMemberActivity r1, final List r2, DslAdapter r3) {
        Intrinsics.X0O(r3, "$this$renderAdapter");
        r1.getDslViewHolder().postDelay(300, new i10XX(r1, r2));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0(final GameMemberActivity r1, final List r2) {
        r1.renderAdapter(new XXOX0O0O1(r2, r1));
        return Unit.OXO1;
    }

    private static final Unit showList$lambda$0$0$0(List r6, GameMemberActivity r7, DslAdapter r8) {
        Intrinsics.X0O(r8, "$this$renderAdapter");
        DslAdapter.setAdapterStatus$default(r8, 0, null, 2, null);
        List r9 = r6;
        if (r9 != null) goto L5;
    L22:
        r7.getRecyclerView().setVisibility(8);
    L24:
        return Unit.OXO1;
    L5:
        if (r9.isEmpty() == true) goto L22;
        List r10 = r6;
        ArrayList r3 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r10, 10));
        Iterator r11 = r10.iterator();
        boolean r4 = true;
    L9:
        if (r11.hasNext() == false) goto L18;
        List<SMGameInfo> r5 = ((SMIconListParent) r11.next()).getGameList();
        if (r5 == null) goto L13;
        Integer r12 = Integer.valueOf(r5.size());
    L14:
        Intrinsics.XXI(r12);
        if (r12.intValue() <= 0) goto L17;
        r4 = false;
    L17:
        r3.add(Unit.OXO1);
        goto L9
    L13:
        r12 = null;
        goto L14
    L18:
        if (r4 == false) goto L20;
        r7.getRecyclerView().setVisibility(8);
    L21:
        i1O0OXO1O.OXO1.OXO1(r7.TAG + " isEmptyData = " + r4);
        goto L24
    L20:
        r7.getRecyclerView().setVisibility(0);
        r7.findData(r6);
        goto L21
    }

    public final void findData(@aa1 List<? extends SMIconListParent> r6) {
        Intrinsics.X0O(r6, "result");
        Iterator<T> r7 = r6.iterator();
    L4:
        if (r7.hasNext() == false) goto L9;
        final SMIconListParent r0 = (SMIconListParent) r7.next();
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.layout_online_watchface_category_head, new IO101O1(r0, this));
        List<SMGameInfo> r1 = r0.getGameList();
        Intrinsics.O10IXXX0X(r1, "getGameList(...)");
        Iterator r2 = CollectionsKt___CollectionsKt.IO0OOi(r1, 4).iterator();
    L7:
        if (r2.hasNext() == false) goto L4;
        final SMGameInfo r3 = (SMGameInfo) r2.next();
        DslAdapterExKt.O10IXXX0X(getDslAdapter(), R.layout.item_game_member, new iIi0X1II(r0, this, r3));
        goto L7
    L9:
        getDslAdapter().notifyDataSetChanged();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        setStatusBarColor(this, gk4.iO(getMContext(), R.color.game_member_status_color));
        if (this.appUser.getAvatarUrl().length() <= 0) goto L5;
        Glide.with(this).load(this.appUser.getAvatarUrl()).error(R.drawable.pic_avatar_default).into(getMUserAvatar());
    L5:
        getMUserName().setText(this.appUser.getNickname());
        a01 r0 = a01.OXO1;
        SPUtils r1 = r0.IiI10X();
        Object r2 = new Gson().fromJson(r1.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r2 != null) goto L8;
        r2 = UserMember.class.newInstance();
    L8:
        UserMember r3 = (UserMember) r2;
        TextView r4 = getMUserMemberTime();
        i0O111 r5 = i0O111.OXO1;
        if (r5.OII(r3) == false) goto L12;
        String r6 = getString(R.string.valid_until) + O0X11OiO.I0IIOi().format(new Date(r3.getLatestGameMemberDateTime()));
    L16:
        r4.setText(r6);
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.game_member_title);
        SPUtils r7 = r0.IiI10X();
        Object r8 = new Gson().fromJson(r7.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r8 != null) goto L19;
        r8 = UserMember.class.newInstance();
    L19:
        UserMember r9 = (UserMember) r8;
        Button r10 = getMMemberBtn();
        if (r9.getLatestGameMemberDateTime() > 0) goto L22;
        String r11 = getString(R.string.game_member_open_btn);
    L26:
        r10.setText(r11);
        if (getRecyclerView().getItemDecorationCount() != 0) goto L30;
        getRecyclerView().addItemDecoration(new DividerItemDecoration(getMContext(), 0));
        return;
    L30:
        return;
    L22:
        if (r5.OII(r9) == false) goto L24;
        r11 = getString(R.string.game_member_renewal_btn);
        goto L26
    L24:
        r11 = getString(R.string.renew_now);
        goto L26
    L12:
        if (r3.getLatestGameMemberDateTime() <= 0) goto L14;
        r6 = getString(R.string.game_member_expired_tip);
    L15:
        Intrinsics.XXI(r6);
        goto L16
    L14:
        r6 = getString(R.string.game_member_no_have);
        goto L15
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_game_member;
    }

    public final void onBottomClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i0O111.OXO1.iIiiO(this);
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public void onInitBaseLayoutAfter() {
        super.onInitBaseLayoutAfter();
        i0O111.OXO1.I0iXXO(new AnonymousClass1(this));
    }

    @sf5(tag = I01XX0.XXI0XOIX)
    public final void onOrderPayStatusChange(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.OXO1(this.TAG + " onOrderPayStatusChange");
        getServerData();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
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

    public final void showList(@tb1 final List<? extends SMIconListParent> r2) {
        renderAdapter(new OIX1iXXi(this, r2));
    }
}
