.class public final Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/aliagentsdk/callback/IConnectCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AlipaySetActivity;->initAliAgent(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onIotConnectFailure(Ljava/lang/String;I)V
    .locals 3

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mAliAgent#onIotConnectFailure -> IOT server connection failed, code = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$setIOTServerConnect$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IOT server connection failed, code = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", msg = "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onIotConnected()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mAliAgent#onIotConnected >>> IOT server connected"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$setIOTServerConnect$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Z)V

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getMActiveCheckTimer$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/util/Timer;

    move-result-object v1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getMActiveCheckTask$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;

    move-result-object v2

    const-wide/16 v3, 0x1388

    const-wide/16 v5, 0x1388

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public onIotDisconnected()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mAliAgent#onIotDisconnected -> IOT server disconnected"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$setIOTServerConnect$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Z)V

    return-void
.end method
