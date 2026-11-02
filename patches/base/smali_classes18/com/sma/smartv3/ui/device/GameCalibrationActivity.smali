.class public final Lcom/sma/smartv3/ui/device/GameCalibrationActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/common/Player$Listener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameCalibrationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameCalibrationActivity.kt\ncom/sma/smartv3/ui/device/GameCalibrationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n69#2,3:191\n72#2,5:195\n1#3:194\n*S KotlinDebug\n*F\n+ 1 GameCalibrationActivity.kt\ncom/sma/smartv3/ui/device/GameCalibrationActivity\n*L\n123#1:191,3\n123#1:195,5\n123#1:194\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameCalibrationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameCalibrationActivity.kt\ncom/sma/smartv3/ui/device/GameCalibrationActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n69#2,3:191\n72#2,5:195\n1#3:194\n*S KotlinDebug\n*F\n+ 1 GameCalibrationActivity.kt\ncom/sma/smartv3/ui/device/GameCalibrationActivity\n*L\n123#1:191,3\n123#1:195,5\n123#1:194\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/GameCalibrationActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCalibrationImage$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCalibrationTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCalibrationValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mManValue:I

.field private final mMinValue:I

.field private mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

.field private final mPlayerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mVideoLayout$delegate:Lkotlin/Lazy;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiX01IOIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiX01IOIX;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi110ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi110ii;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXX0ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXX0ii;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mVideoLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXiI0iOi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXiI0iOi;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mVideoReplay$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO0X1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO0X1;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mRootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O00iX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O00iX;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationImage$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1XiXi11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1XiXi11;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXX11;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXX11;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationValue$delegate:Lkotlin/Lazy;

    const/16 v0, 0x5d

    iput v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mMinValue:I

    const/16 v0, 0x6c

    iput v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mManValue:I

    new-instance v0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/GameCalibrationActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mRootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroidx/media3/ui/PlayerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroidx/media3/ui/PlayerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mVideoLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationImage_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationValue_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    return-void
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static final synthetic access$getMCalibrationImage(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMCalibrationImage()Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMCalibrationValue(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMCalibrationValue()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMManValue$p(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mManValue:I

    return p0
.end method

.method public static final synthetic access$getMMinValue$p(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mMinValue:I

    return p0
.end method

.method private final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMCalibrationImage()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationImage$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMCalibrationTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMCalibrationValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mCalibrationValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMPlayerView()Landroidx/media3/ui/PlayerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/media3/ui/PlayerView;

    return-object v0
.end method

.method private final getMRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mRootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMVideoLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mVideoLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMVideoReplay()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mVideoReplay$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mVideoReplay_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 v0, 0x0

    const-string v1, "mPlayer"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    const-wide/16 v2, 0x0

    invoke-interface {p1, v2, v3}, Landroidx/media3/common/Player;->seekTo(J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-interface {p1}, Landroidx/media3/common/Player;->prepare()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    invoke-interface {v0}, Landroidx/media3/common/Player;->play()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMVideoReplay()Landroid/view/View;

    move-result-object p0

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMRootView()Landroid/view/View;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final mCalibrationImage_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a03fe

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mCalibrationTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a03fd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mCalibrationValue_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a03ff

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mPlayerView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroidx/media3/ui/PlayerView;
    .locals 1

    const v0, 0x7f0a0934

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/media3/ui/PlayerView;

    return-object p0
.end method

.method private static final mRootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a18f5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mVideoLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a18f4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mVideoReplay_delegate$lambda$0(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a18f8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 10
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/GameCalibrationActivity$OXO1;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->GAME_CONTROL:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v3, Lcom/szabh/smable3/entity/BleGameControl;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/szabh/smable3/entity/BleGameControl;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    new-instance v3, Lcom/szabh/smable3/entity/BleGameControl;

    const/4 v4, 0x5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/szabh/smable3/entity/BleGameControl;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public initView()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMRootView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMVideoReplay()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMVideoLayout()Landroid/view/View;

    move-result-object v0

    const-string v2, "<get-mVideoLayout>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v0, v2}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f140c1e

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMCalibrationTip()Landroid/widget/TextView;

    move-result-object v0

    iget v2, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mMinValue:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mManValue:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f140c1c

    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Landroidx/media3/exoplayer/ExoPlayer$Builder;

    invoke-direct {v0, p0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/media3/exoplayer/ExoPlayer$Builder;->build()Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object v0

    const-string v2, "build(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 v2, 0x0

    const-string v3, "mPlayer"

    if-nez v0, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-interface {v0, p0}, Landroidx/media3/common/Player;->addListener(Landroidx/media3/common/Player$Listener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    new-instance v4, Landroidx/media3/common/MediaItem$Builder;

    invoke-direct {v4}, Landroidx/media3/common/MediaItem$Builder;-><init>()V

    const-string v5, "file:///android_asset/game_calibration.mp4"

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/media3/common/MediaItem$Builder;->setUri(Landroid/net/Uri;)Landroidx/media3/common/MediaItem$Builder;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/media3/common/MediaItem$Builder;->build()Landroidx/media3/common/MediaItem;

    move-result-object v4

    invoke-interface {v0, v4}, Landroidx/media3/common/Player;->setMediaItem(Landroidx/media3/common/MediaItem;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v4, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_2
    invoke-virtual {v0, v4}, Landroidx/media3/ui/PlayerView;->setPlayer(Landroidx/media3/common/Player;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    invoke-interface {v0}, Landroidx/media3/common/Player;->prepare()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v2, v0

    :goto_0
    invoke-interface {v2}, Landroidx/media3/common/Player;->play()V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    const-string v1, "#A9000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMVideoReplay()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMVideoReplay()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O00OXOI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O00OXOI;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1Iii001;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1Iii001;-><init>(Lcom/sma/smartv3/ui/device/GameCalibrationActivity;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x42000000    # 32.0f
        0x42000000    # 32.0f
    .end array-data
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00a4

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/device/GameStoreActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/GameCalibrationActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    const/4 v1, 0x0

    const-string v2, "mPlayer"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-interface {v0, p0}, Landroidx/media3/common/Player;->removeListener(Landroidx/media3/common/Player$Listener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->mPlayer:Landroidx/media3/exoplayer/ExoPlayer;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-interface {v1}, Landroidx/media3/exoplayer/ExoPlayer;->release()V

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->onPause()V

    return-void
.end method

.method public onPlaybackStateChanged(I)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/media3/common/Player$Listener;->onPlaybackStateChanged(I)V

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMVideoReplay()Landroid/view/View;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->onResume()V

    return-void
.end method

.method public onStop()V
    .locals 10

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->GAME_CONTROL:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v3, Lcom/szabh/smable3/entity/BleGameControl;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/szabh/smable3/entity/BleGameControl;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    new-instance v3, Lcom/szabh/smable3/entity/BleGameControl;

    const/4 v4, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/szabh/smable3/entity/BleGameControl;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GameCalibrationActivity;->getMPlayerView()Landroidx/media3/ui/PlayerView;

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

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
