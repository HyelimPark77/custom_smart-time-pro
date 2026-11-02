.class public final Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public IO(Lcom/sma/smartv3/db/entity/SportData;)V
    .locals 1

    const-string v0, "sportData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->updateShowData(Lcom/sma/smartv3/db/entity/SportData;)V

    return-void
.end method

.method public O00(Z)V
    .locals 1

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/sport/XO0O10$OXO1;->O00(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->changeDeviceConnectStatus(Z)V

    return-void
.end method

.method public OIi0(Lcom/sma/smartv3/db/entity/Location;)V
    .locals 2

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->access$isInChinaMainland$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Z

    move-result v1

    invoke-static {v0, v1, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->access$updateMap(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;ZLcom/sma/smartv3/db/entity/Location;)V

    return-void
.end method

.method public XO0O10(Lcom/szabh/smable3/entity/BleAppSportState;)V
    .locals 1

    const-string v0, "sportState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleAppSportState;->getMState()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->handleSportState(I)V

    return-void
.end method

.method public iO(I)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showGoalDoneDialog(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BaseSportOnGoingActivity  onGoalDone  showGoalDoneDialog try Exception = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
