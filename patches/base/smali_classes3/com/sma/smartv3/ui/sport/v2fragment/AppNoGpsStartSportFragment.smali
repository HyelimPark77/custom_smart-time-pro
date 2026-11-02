.class public final Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;
.super Lcom/sma/smartv3/ui/sport/course/BaseNoGpsSportV2Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;
    }
.end annotation


# static fields
.field private static final ARG_SPORT_MODE:Ljava/lang/String; = "SPORT_MODE"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final Companion:Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final mCurModeIcon$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;->Companion:Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseNoGpsSportV2Fragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOOIXX01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOOIXX01;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;->mCurModeIcon$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;->mCurModeIcon_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final mCurModeIcon_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02c0

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method


# virtual methods
.method public final getMCurModeIcon()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;->mCurModeIcon$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "SPORT_MODE"

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->setMSportMode(I)V

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->getMSportMode()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->setMSportMode(I)V

    :cond_1
    return-void
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/course/BaseNoGpsSportV2Fragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->getRoot_view()Landroid/widget/RelativeLayout;

    move-result-object v0

    const-string v1, "<get-root_view>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v0, v1}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->getIvBg()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08157e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;->getMCurModeIcon()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;->getMCurModeIcon()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v2}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->getMSportMode()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v1, v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e75

    return v0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "SPORT_MODE"

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->getMSportMode()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public startSport()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->startSport()V

    return-void

    :cond_0
    const v0, 0x7f140143

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
