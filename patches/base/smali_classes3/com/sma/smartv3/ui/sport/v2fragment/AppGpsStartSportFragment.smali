.class public final Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment;
.super Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment$OXO1;
    }
.end annotation


# static fields
.field private static final ARG_SPORT_MODE:Ljava/lang/String; = "SPORT_MODE"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final Companion:Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment;->Companion:Lcom/sma/smartv3/ui/sport/v2fragment/AppGpsStartSportFragment$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;-><init>()V

    return-void
.end method


# virtual methods
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
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->getRoot_view()Landroid/widget/RelativeLayout;

    move-result-object v0

    const-string v1, "<get-root_view>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, 0x42200000    # 40.0f

    invoke-static {v0, v1}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

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
