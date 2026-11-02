package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1ii10X0;
import com.android.mltcode.paycertificationapi.Oi0XO00;
import com.android.mltcode.paycertificationapi.X01iO1Oii;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i0O111;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.OrderManager;
import com.sma.smartv3.model.UserMember;
import com.sma.smartv3.pro.R;
import com.tenmeter.smlibrary.fragment.GameListFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nGameStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameStoreActivity.kt\ncom/sma/smartv3/ui/device/GameStoreActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,96:1\n93#2,2:97\n90#2:99\n*S KotlinDebug\n*F\n+ 1 GameStoreActivity.kt\ncom/sma/smartv3/ui/device/GameStoreActivity\n*L\n52#1:97,2\n52#1:99\n*E\n"})
public final class GameStoreActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;
    private GameListFragment gameListFragment;

    @aa1
    private Handler mHandler;

    public GameStoreActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new O1ii10X0(this));
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void I0iXXO(GameStoreActivity r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(GameStoreActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean XXI(GameStoreActivity r0) {
        return showAILackingTip$lambda$0$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(GameStoreActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private static final void initView$lambda$0(GameStoreActivity r0) {
        r0.showAILackingTip();
    }

    private static final boolean showAILackingTip$lambda$0$0(GameStoreActivity r1) {
        i0O111.OXO1.iIiiO(r1);
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.game_list_title);
        this.gameListFragment = new GameListFragment();
        FragmentTransaction r0 = getSupportFragmentManager().beginTransaction();
        GameListFragment r1 = this.gameListFragment;
        if (r1 != null) goto L5;
        Intrinsics.XXO("gameListFragment");
        r1 = null;
    L5:
        r0.add(R.id.content, r1).commit();
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_game_right);
        this.mHandler.postDelayed(new X01iO1Oii(this), 100);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_game_store;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i0O111.OXO1.i010I(this);
    }

    public final void showAILackingTip() {
        a01 r0 = a01.OXO1;
        long r5 = r0.IiI10X().getLong(b01.iO11i, 0);
        SPUtils r1 = r0.IiI10X();
        Object r2 = new Gson().fromJson(r1.getString(I01XX0.O101 + '_' + UserMember.class.getName()), UserMember.class);
        if (r2 != null) goto L5;
        r2 = UserMember.class.newInstance();
    L5:
        UserMember r3 = (UserMember) r2;
        LogUtils.d(new Object[]{"GameStoreActivity showAILackingTip  mIsShowTime = " + r5 + " mUserMember = " + r3});
        if (r3.getLatestGameMemberDateTime() <= 0) goto L20;
        OrderManager r8 = OrderManager.OXO1;
        if (r8.IiI10X(r5, 1) == true) goto L10;
        return;
    L10:
        if (OrderManager.O00(r8, r3.getLatestGameMemberDateTime(), 0, 2, null) == false) goto L13;
        String r4 = getString(R.string.game_store_to_expired_tip);
    L16:
        Intrinsics.XXI(r4);
        LogUtils.d(new Object[]{"GameStoreActivity showAILackingTip  tipString = " + r4 + " , currentTimeMillis() = " + System.currentTimeMillis() + "  , latestGameMemberDateTime = " + r3.getLatestGameMemberDateTime() + " "});
        if (r4.length() <= 0) goto L22;
        r0.IiI10X().put(b01.iO11i, System.currentTimeMillis());
        go0 r6 = new go0(this, 0, 2, null);
        r6.O1O(R.string.tip);
        r6.iOO1ii1(r4);
        r6.IXXOO(1);
        go0.X11iII1O1(r6, Integer.valueOf(R.string.cancel), null, 2, null);
        r6.X1IX(R.string.confirm, new Oi0XO00(this));
        r6.IIX1OXO();
        return;
    L22:
        return;
    L13:
        if ((System.currentTimeMillis() - r3.getLatestGameMemberDateTime()) <= 0) goto L15;
        r4 = getString(R.string.game_store_expired_tip);
        goto L16
    L15:
        r4 = "";
        goto L16
    }
}
