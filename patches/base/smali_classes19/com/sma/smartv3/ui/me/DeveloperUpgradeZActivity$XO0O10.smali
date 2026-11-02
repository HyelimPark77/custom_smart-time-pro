.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bluetrum/fota/abota/ABOta$EventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceiveChannel(Z)V
    .locals 0

    return-void
.end method

.method public onReceiveTwsInfo(ZZ)V
    .locals 0

    return-void
.end method

.method public onReceiveVersion(I)V
    .locals 4

    shr-int/lit8 v0, p1, 0xc

    and-int/lit8 v0, v0, 0xf

    shr-int/lit8 v1, p1, 0x8

    and-int/lit8 v1, v1, 0xf

    shr-int/lit8 v2, p1, 0x4

    and-int/lit8 v2, v2, 0xf

    and-int/lit8 p1, p1, 0xf

    sget-object v3, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, v1, v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x4

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "V%d.%d.%d.%d"

    invoke-static {v3, v0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onReceiveVersion -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onStatusChanged(II)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStatusChanged -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$otaStatusFail(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;I)V

    return-void

    :pswitch_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$otaWaitFinish(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$otaFinish(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    return-void

    :pswitch_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$otaContinue(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    return-void

    :pswitch_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$otaPause(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    return-void

    :pswitch_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$otaUpdating(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;I)V

    return-void

    :pswitch_6
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$otaStart(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    return-void

    :pswitch_7
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$otaReady(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
