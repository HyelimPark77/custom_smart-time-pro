.class public final Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment$OXO1;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(I)Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/v2fragment/AppNoGpsStartSportFragment;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "SPORT_MODE"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
