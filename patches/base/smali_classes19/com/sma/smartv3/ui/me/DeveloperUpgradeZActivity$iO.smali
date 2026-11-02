.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bluetrum/abota/bluetooth/BluetoothEventListener;


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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->XIi00iiXO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V
    .locals 2

    const/4 v0, 0x1

    const-string v1, "disconnected"

    invoke-static {p0, v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onBluetoothReady()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onBluetoothReady"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$getMAbOta$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)Lcom/bluetrum/fota/abota/ABOta;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bluetrum/fota/abota/ABOta;->prepareToUpdate()V

    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    new-instance v2, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO$OXO1;

    invoke-direct {v2, v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO$OXO1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    const-wide/16 v3, 0x7d0

    invoke-virtual {v0, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 0

    if-nez p3, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " onConnectionStateChange -> disconnected"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/Oi0O1iOi;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/Oi0O1iOi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onReceive([B)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$getMAbOta$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)Lcom/bluetrum/fota/abota/ABOta;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/bluetrum/fota/abota/ABOta;->handleData([B)V

    :cond_0
    return-void
.end method

.method public onSend([B)V
    .locals 0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;->access$getMAbOta$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeZActivity;)Lcom/bluetrum/fota/abota/ABOta;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/bluetrum/fota/abota/ABOta;->nextRun()V

    :cond_0
    return-void
.end method
