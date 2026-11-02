package com.sma.smartv3.p610ui.device;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.android.mltcode.paycertificationapi.I01XX0;
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
import com.sma.smartv3.p610ui.device.GameStoreActivity;
import com.sma.smartv3.pro.R;
import com.tenmeter.smlibrary.fragment.GameListFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nGameStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameStoreActivity.kt\ncom/sma/smartv3/ui/device/GameStoreActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,96:1\n93#2,2:97\n90#2:99\n*S KotlinDebug\n*F\n+ 1 GameStoreActivity.kt\ncom/sma/smartv3/ui/device/GameStoreActivity\n*L\n52#1:97,2\n52#1:99\n*E\n"})
public final class GameStoreActivity extends BaseActivity {
    private GameListFragment gameListFragment;

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1ii10X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return GameStoreActivity.abhTitleRight_delegate$lambda$0(this.f2858IO);
        }
    });

    @aa1
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(GameStoreActivity gameStoreActivity) {
        return (ImageView) gameStoreActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showAILackingTip$lambda$0$0(GameStoreActivity gameStoreActivity) {
        i0O111.OXO1.iIiiO(gameStoreActivity);
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.game_list_title);
        this.gameListFragment = new GameListFragment();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        GameListFragment gameListFragment = this.gameListFragment;
        if (gameListFragment == null) {
            Intrinsics.XXO("gameListFragment");
            gameListFragment = null;
        }
        fragmentTransactionBeginTransaction.add(R.id.content, gameListFragment).commit();
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_game_right);
        this.mHandler.postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.X01iO1Oii
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, InstantiationException {
                this.f3941IO.showAILackingTip();
            }
        }, 100L);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_game_store;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i0O111.OXO1.i010I(this);
    }

    public final void showAILackingTip() throws IllegalAccessException, InstantiationException {
        String string;
        a01 a01Var = a01.OXO1;
        long j = a01Var.IiI10X().getLong(b01.iO11i, 0L);
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(I01XX0.O101 + '_' + UserMember.class.getName()), (Class<Object>) UserMember.class);
        if (objFromJson == null) {
            objFromJson = UserMember.class.newInstance();
        }
        UserMember userMember = (UserMember) objFromJson;
        LogUtils.m11128d("GameStoreActivity showAILackingTip  mIsShowTime = " + j + " mUserMember = " + userMember);
        if (userMember.getLatestGameMemberDateTime() > 0) {
            OrderManager orderManager = OrderManager.OXO1;
            if (orderManager.IiI10X(j, 1)) {
                if (OrderManager.O00(orderManager, userMember.getLatestGameMemberDateTime(), 0, 2, null)) {
                    string = getString(R.string.game_store_to_expired_tip);
                } else {
                    string = System.currentTimeMillis() - userMember.getLatestGameMemberDateTime() > 0 ? getString(R.string.game_store_expired_tip) : "";
                }
                Intrinsics.XXI(string);
                LogUtils.m11128d("GameStoreActivity showAILackingTip  tipString = " + string + " , currentTimeMillis() = " + System.currentTimeMillis() + "  , latestGameMemberDateTime = " + userMember.getLatestGameMemberDateTime() + " ");
                if (string.length() > 0) {
                    a01Var.IiI10X().put(b01.iO11i, System.currentTimeMillis());
                    go0 go0Var = new go0(this, 0, 2, null);
                    go0Var.O1O(R.string.tip);
                    go0Var.iOO1ii1(string);
                    go0Var.IXXOO(1);
                    go0.X11iII1O1(go0Var, Integer.valueOf(R.string.cancel), null, 2, null);
                    go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.Oi0XO00
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2() {
                            return Boolean.valueOf(GameStoreActivity.showAILackingTip$lambda$0$0(this.f3639IO));
                        }
                    });
                    go0Var.IIX1OXO();
                }
            }
        }
    }
}
