package com.sma.smartv3.ui.device;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hw5;
import com.android.mltcode.paycertificationapi.iw5;
import com.android.mltcode.paycertificationapi.jw5;
import com.android.mltcode.paycertificationapi.kw5;
import com.android.mltcode.paycertificationapi.lw5;
import com.android.mltcode.paycertificationapi.mw5;
import com.android.mltcode.paycertificationapi.nw5;
import com.android.mltcode.paycertificationapi.ow5;
import com.android.mltcode.paycertificationapi.pw5;
import com.android.mltcode.paycertificationapi.qw5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.FactoryTestType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TouchRepairActivity extends BaseActivity implements Player.Listener {

    @aa1
    private final String GUIDE_VIDEO_EN;

    @aa1
    private final String GUIDE_VIDEO_ZH;

    @aa1
    private final String TAG;
    private boolean isFinishActivityType;

    @aa1
    private final Lazy mBleHandleCallback$delegate;

    @aa1
    private final Lazy mBtnBottom$delegate;

    @aa1
    private final Lazy mCvPlayerView$delegate;

    @aa1
    private final Lazy mLoadPopup$delegate;
    private ExoPlayer mPlayer;

    @aa1
    private final Lazy mPlayerView$delegate;

    @aa1
    private final Lazy mRootView$delegate;

    @aa1
    private final Lazy mVideoReplay$delegate;

    public TouchRepairActivity() {
        this.TAG = "TouchRepairActivity";
        this.GUIDE_VIDEO_ZH = "https://dev-oss.iot-solution.net/var-www/video/zh/ring/ring1-zh.mp4";
        this.GUIDE_VIDEO_EN = "https://dev-oss.iot-solution.net/var-www/video/en/ring/ring1-en.mp4";
        this.mBtnBottom$delegate = LazyKt__LazyJVMKt.iO(new kw5(this));
        this.mPlayerView$delegate = LazyKt__LazyJVMKt.iO(new lw5(this));
        this.mVideoReplay$delegate = LazyKt__LazyJVMKt.iO(new mw5(this));
        this.mRootView$delegate = LazyKt__LazyJVMKt.iO(new nw5(this));
        this.mCvPlayerView$delegate = LazyKt__LazyJVMKt.iO(new ow5(this));
        this.mLoadPopup$delegate = LazyKt__LazyJVMKt.iO(new pw5(this));
        this.mBleHandleCallback$delegate = LazyKt__LazyJVMKt.iO(new qw5(this));
    }

    public static /* synthetic */ uq I0iXXO(TouchRepairActivity r0) {
        return mLoadPopup_delegate$lambda$0(r0);
    }

    public static /* synthetic */ CardView I1XOi1(TouchRepairActivity r0) {
        return mCvPlayerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TouchRepairActivity$mBleHandleCallback$2$1 IIX1OXO(TouchRepairActivity r0) {
        return mBleHandleCallback_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button O10IXXX0X(TouchRepairActivity r0) {
        return mBtnBottom_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OIX0iXi(TouchRepairActivity r0) {
        return mVideoReplay_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(TouchRepairActivity r0) {
        initView$lambda$2(r0);
    }

    public static /* synthetic */ View X1ii(TouchRepairActivity r0) {
        return mRootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XXI(TouchRepairActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void XiOIO(TouchRepairActivity r0) {
        initView$lambda$0(r0);
    }

    public static final /* synthetic */ Button access$getMBtnBottom(TouchRepairActivity r0) {
        return r0.getMBtnBottom();
    }

    public static final /* synthetic */ uq access$getMLoadPopup(TouchRepairActivity r0) {
        return r0.getMLoadPopup();
    }

    public static final /* synthetic */ String access$getTAG$p(TouchRepairActivity r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ void access$setFinishActivityType$p(TouchRepairActivity r0, boolean r1) {
        r0.isFinishActivityType = r1;
    }

    private final TouchRepairActivity$mBleHandleCallback$2$1 getMBleHandleCallback() {
        return (TouchRepairActivity$mBleHandleCallback$2$1) getValue();
    }

    private final Button getMBtnBottom() {
        return (Button) getValue();
    }

    private final CardView getMCvPlayerView() {
        return (CardView) getValue();
    }

    private final uq getMLoadPopup() {
        return (uq) getValue();
    }

    private final PlayerView getMPlayerView() {
        return (PlayerView) getValue();
    }

    private final View getMRootView() {
        return (View) getValue();
    }

    private final View getMVideoReplay() {
        return (View) getValue();
    }

    public static /* synthetic */ PlayerView iIiiO(TouchRepairActivity r0) {
        return mPlayerView_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(TouchRepairActivity r2) {
        ViewGroup.LayoutParams r0 = r2.getMCvPlayerView().getLayoutParams();
        r0.height = (r2.getMCvPlayerView().getWidth() * 9) / 16;
        r2.getMCvPlayerView().requestLayout();
    }

    private static final void initView$lambda$1(TouchRepairActivity r4, View r5) {
        ExoPlayer r6 = r4.mPlayer;
        ExoPlayer r0 = null;
        if (r6 != null) goto L5;
        Intrinsics.XXO("mPlayer");
        r6 = null;
    L5:
        r6.seekTo(0);
        ExoPlayer r7 = r4.mPlayer;
        if (r7 != null) goto L8;
        Intrinsics.XXO("mPlayer");
    L9:
        r0.setPlayWhenReady(true);
        r4.getMVideoReplay().setVisibility(8);
        return;
    L8:
        r0 = r7;
        goto L9
    }

    private static final void initView$lambda$2(TouchRepairActivity r1) {
        r1.getMRootView().setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.sma.smartv3.ui.device.TouchRepairActivity$mBleHandleCallback$2$1] */
    private static final TouchRepairActivity$mBleHandleCallback$2$1 mBleHandleCallback_delegate$lambda$0(final TouchRepairActivity r1) {
        return new TouchRepairActivity$mBleHandleCallback$2$1(r1);
    }

    private static final Button mBtnBottom_delegate$lambda$0(TouchRepairActivity r1) {
        return (Button) r1.findViewById(R.id.btn_bottom);
    }

    private static final CardView mCvPlayerView_delegate$lambda$0(TouchRepairActivity r1) {
        return (CardView) r1.findViewById(R.id.cv_player_view);
    }

    private static final uq mLoadPopup_delegate$lambda$0(TouchRepairActivity r1) {
        uq r0 = new uq(r1);
        r0.X01IiOiIi(R.string.touch_repair__repairing);
        return r0;
    }

    private static final PlayerView mPlayerView_delegate$lambda$0(TouchRepairActivity r1) {
        return (PlayerView) r1.findViewById(R.id.player_view);
    }

    private static final View mRootView_delegate$lambda$0(TouchRepairActivity r1) {
        return r1.findViewById(R.id.root);
    }

    private static final View mVideoReplay_delegate$lambda$0(TouchRepairActivity r1) {
        return r1.findViewById(R.id.video_to_replay);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r2) {
        BleConnector.INSTANCE.addHandleCallback(getMBleHandleCallback());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.touch_repair__touch_correction);
        getMCvPlayerView().post(new hw5(this));
        getMVideoReplay().setVisibility(8);
        if (UtilsKt.IiiXiI0I(this) == false) goto L5;
        String r0 = this.GUIDE_VIDEO_ZH;
    L6:
        ExoPlayer r1 = new ExoPlayer.Builder(this).build();
        Intrinsics.O10IXXX0X(r1, "build(...)");
        this.mPlayer = r1;
        ExoPlayer r2 = null;
        if (r1 != null) goto L9;
        Intrinsics.XXO("mPlayer");
        r1 = null;
    L9:
        r1.addListener(this);
        ExoPlayer r3 = this.mPlayer;
        if (r3 != null) goto L12;
        Intrinsics.XXO("mPlayer");
        r3 = null;
    L12:
        r3.setMediaItem(new MediaItem.Builder().setUri(r0).build());
        PlayerView r4 = getMPlayerView();
        ExoPlayer r5 = this.mPlayer;
        if (r5 != null) goto L15;
        Intrinsics.XXO("mPlayer");
        r5 = null;
    L15:
        r4.setPlayer(r5);
        getMPlayerView().setUseController(false);
        ExoPlayer r6 = this.mPlayer;
        if (r6 != null) goto L18;
        Intrinsics.XXO("mPlayer");
        r6 = null;
    L18:
        r6.prepare();
        ExoPlayer r7 = this.mPlayer;
        if (r7 != null) goto L21;
        Intrinsics.XXO("mPlayer");
    L22:
        r2.setPlayWhenReady(true);
        getMVideoReplay().setOnClickListener(new iw5(this));
        getMPlayerView().postDelayed(new jw5(this), 300);
        return;
    L21:
        r2 = r7;
        goto L22
    L5:
        r0 = this.GUIDE_VIDEO_EN;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_touch_repair;
    }

    public final void onBottomClick(@aa1 View r9) {
        Intrinsics.X0O(r9, "view");
        if (this.isFinishActivityType == false) goto L6;
        finish();
        return;
    L6:
        getMLoadPopup().dismiss();
        getMLoadPopup().IIX1OXO();
        BaseBleConnector.sendInt8$default(BleConnector.INSTANCE, BleKey.FACTORY_TEST, BleKeyFlag.UPDATE, FactoryTestType.ENTER.getType(), false, false, 24, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BleConnector r0 = BleConnector.INSTANCE;
        BaseBleConnector.sendInt8$default(r0, BleKey.FACTORY_TEST, BleKeyFlag.UPDATE, FactoryTestType.EXIT.getType(), false, false, 24, null);
        r0.removeHandleCallback(getMBleHandleCallback());
        ExoPlayer r1 = this.mPlayer;
        ExoPlayer r2 = null;
        if (r1 != null) goto L5;
        Intrinsics.XXO("mPlayer");
        r1 = null;
    L5:
        r1.removeListener(this);
        ExoPlayer r3 = this.mPlayer;
        if (r3 != null) goto L8;
        Intrinsics.XXO("mPlayer");
    L9:
        r2.release();
        return;
    L8:
        r2 = r3;
        goto L9
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity
    public void onHandleBackPressed() {
        if (getMLoadPopup().isShowing() == false) goto L6;
        ToastUtils.showLong(R.string.touch_repair__repairing_warn);
        return;
    L6:
        super.onHandleBackPressed();
    }

    @Override // androidx.media3.common.Player.Listener
    public void onIsPlayingChanged(boolean r1) {
        super.onIsPlayingChanged(r1);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getMPlayerView().onPause();
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlaybackStateChanged(int r4) {
        super.onPlaybackStateChanged(r4);
        Log.d(this.TAG, "onPlaybackStateChanged: playbackState = " + r4);
        if (r4 == 4) goto L5;
        return;
    L5:
        getMVideoReplay().setVisibility(0);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(@aa1 PlaybackException r2) {
        Intrinsics.X0O(r2, "error");
        super.onPlayerError(r2);
        r2.getCause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getMPlayerView().onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getMPlayerView().onPause();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }
}
