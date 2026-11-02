.class public final Lcom/sma/smartv3/ui/device/TouchRepairActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Player$Listener;


# instance fields
.field private final GUIDE_VIDEO_EN:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final GUIDE_VIDEO_ZH:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isFinishActivityType:Z

.field private final mBleHandleCallback$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBtnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCvPlayerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLoadPopup$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

.field private final mPlayerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mVideoReplay$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "TouchRepairActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->TAG:Ljava/lang/String;

    const-string v0, "https://dev-oss.iot-solution.net/var-www/video/zh/ring/ring1-zh.mp4"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->GUIDE_VIDEO_ZH:Ljava/lang/String;

    const-string v0, "https://dev-oss.iot-solution.net/var-www/video/en/ring/ring1-en.mp4"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->GUIDE_VIDEO_EN:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mBtnBottom$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/lw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mVideoReplay$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mRootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ow5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ow5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mCvPlayerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mLoadPopup$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qw5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mBleHandleCallback$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mLoadPopup_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroidx/cardview/widget/CardView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mCvPlayerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroidx/cardview/widget/CardView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mBleHandleCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mBtnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mVideoReplay_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->initView$lambda$2(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mRootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/TouchRepairActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/TouchRepairActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    return-void
.end method

.method public static final synthetic access$getMBtnBottom(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/widget/Button;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMBtnBottom()Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLoadPopup(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMLoadPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setFinishActivityType$p(Lcom/sma/smartv3/ui/device/TouchRepairActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->isFinishActivityType:Z

    return-void
.end method

.method private final getMBleHandleCallback()Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mBleHandleCallback$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;

    return-object v0
.end method

.method private final getMBtnBottom()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mBtnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getMCvPlayerView()Landroidx/cardview/widget/CardView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mCvPlayerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    return-object v0
.end method

.method private final getMLoadPopup()Lcom/android/mltcode/paycertificationapi/uq;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mLoadPopup$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/uq;

    return-object v0
.end method

.method private final getMPlayerView()Landroidx/media3/ui/PlayerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/ui/PlayerView;

    return-object v0
.end method

.method private final getMRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mRootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMVideoReplay()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mVideoReplay$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroidx/media3/ui/PlayerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroidx/media3/ui/PlayerView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMCvPlayerView()Landroidx/cardview/widget/CardView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMCvPlayerView()Landroidx/cardview/widget/CardView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    mul-int/lit8 v1, v1, 0x9

    div-int/lit8 v1, v1, 0x10

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMCvPlayerView()Landroidx/cardview/widget/CardView;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/TouchRepairActivity;Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 v0, 0x0

    const-string v1, "mPlayer"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    const-wide/16 v2, 0x0

    invoke-interface {p1, v2, v3}, Landroidx/media3/common/Player;->seekTo(J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p1

    :goto_0
    const/4 p1, 0x1

    invoke-interface {v0, p1}, Landroidx/media3/common/Player;->setPlayWhenReady(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMVideoReplay()Landroid/view/View;

    move-result-object p0

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMRootView()Landroid/view/View;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final mBleHandleCallback_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    return-object v0
.end method

.method private static final mBtnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final mCvPlayerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroidx/cardview/widget/CardView;
    .locals 1

    const v0, 0x7f0a02c8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/cardview/widget/CardView;

    return-object p0
.end method

.method private static final mLoadPopup_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    const p0, 0x7f14136e

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/uq;->X01IiOiIi(I)V

    return-object v0
.end method

.method private static final mPlayerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroidx/media3/ui/PlayerView;
    .locals 1

    const v0, 0x7f0a0934

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/media3/ui/PlayerView;

    return-object p0
.end method

.method private static final mRootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09af

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mVideoReplay_delegate$lambda$0(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a18f8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMBleHandleCallback()Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 5

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f141370

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMCvPlayerView()Landroidx/cardview/widget/CardView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hw5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/hw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMVideoReplay()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-static {p0}, Lcom/sma/smartv3/util/UtilsKt;->IiiXiI0I(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->GUIDE_VIDEO_ZH:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->GUIDE_VIDEO_EN:Ljava/lang/String;

    :goto_0
    new-instance v1, Landroidx/media3/exoplayer/ExoPlayer$Builder;

    invoke-direct {v1, p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->build()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v1

    const-string v2, "build(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 v2, 0x0

    const-string v3, "mPlayer"

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-interface {v1, p0}, Landroidx/media3/common/Player;->addListener(Landroidx/media3/common/Player$Listener;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    new-instance v4, Landroidx/media3/common/MediaItem$Builder;

    invoke-direct {v4}, Landroidx/media3/common/MediaItem$Builder;-><init>()V

    invoke-virtual {v4, v0}, Landroidx/media3/common/MediaItem$Builder;->setUri(Ljava/lang/String;)Landroidx/media3/common/MediaItem$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/common/MediaItem$Builder;->build()Landroidx/media3/common/MediaItem;

    move-result-object v0

    invoke-interface {v1, v0}, Landroidx/media3/common/Player;->setMediaItem(Landroidx/media3/common/MediaItem;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v1, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerView;->setPlayer(Landroidx/media3/common/Player;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    invoke-interface {v0}, Landroidx/media3/common/Player;->prepare()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move-object v2, v0

    :goto_1
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Landroidx/media3/common/Player;->setPlayWhenReady(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMVideoReplay()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iw5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jw5;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/jw5;-><init>(Lcom/sma/smartv3/ui/device/TouchRepairActivity;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d012f

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->isFinishActivityType:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMLoadPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMLoadPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->FACTORY_TEST:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    sget-object p1, Lcom/szabh/smable3/entity/FactoryTestType;->ENTER:Lcom/szabh/smable3/entity/FactoryTestType;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/FactoryTestType;->getType()I

    move-result v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void
.end method

.method public onDestroy()V
    .locals 8

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->FACTORY_TEST:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    sget-object v3, Lcom/szabh/smable3/entity/FactoryTestType;->EXIT:Lcom/szabh/smable3/entity/FactoryTestType;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/FactoryTestType;->getType()I

    move-result v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMBleHandleCallback()Lcom/sma/smartv3/ui/device/TouchRepairActivity$mBleHandleCallback$2$1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 v1, 0x0

    const-string v2, "mPlayer"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {v0, p0}, Landroidx/media3/common/Player;->removeListener(Landroidx/media3/common/Player$Listener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-interface {v1}, Landroidx/media3/exoplayer/ExoPlayer;->release()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMLoadPopup()Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f14136f

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public onIsPlayingChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/media3/common/Player$Listener;->onIsPlayingChanged(Z)V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->onPause()V

    return-void
.end method

.method public onPlaybackStateChanged(I)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/media3/common/Player$Listener;->onPlaybackStateChanged(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPlaybackStateChanged: playbackState = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMVideoReplay()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onPlayerError(Landroidx/media3/common/PlaybackException;)V
    .locals 1
    .param p1    # Landroidx/media3/common/PlaybackException;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/media3/common/Player$Listener;->onPlayerError(Landroidx/media3/common/PlaybackException;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->onResume()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->onPause()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/TouchRepairActivity;->onHandleBackPressed()V

    return-void
.end method
