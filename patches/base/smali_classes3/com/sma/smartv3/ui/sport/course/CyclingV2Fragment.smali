.class public final Lcom/sma/smartv3/ui/sport/course/CyclingV2Fragment;
.super Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->setMSportMode(I)V

    return-void
.end method
