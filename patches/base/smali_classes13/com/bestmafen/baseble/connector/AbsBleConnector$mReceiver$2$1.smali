.class public final Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bestmafen/baseble/connector/AbsBleConnector;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;


# direct methods
.method public constructor <init>(Lcom/bestmafen/baseble/connector/AbsBleConnector;)V
    .locals 0

    iput-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "android.bluetooth.adapter.extra.STATE"

    const/4 v0, -0x1

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getLOG_HEADER()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onReceive BluetoothAdapter.ACTION_STATE_CHANGED -> state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/bestmafen/baseble/connector/AbsBleConnector;->Companion:Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;

    invoke-virtual {v1, p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector$OXO1;->OXO1(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XO0O10(Ljava/lang/String;)V

    const/16 p2, 0xa

    if-eq p1, p2, :cond_1

    const/16 p2, 0xc

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->isAutoReconnect()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setMConnectDirectly(Z)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1, p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleMessenger()Lcom/android/mltcode/paycertificationapi/iO00;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iO00;->reset()V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleParser()Lcom/android/mltcode/paycertificationapi/OIXOI;

    move-result-object p1

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/OIXOI;->reset()V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$getMNotified$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;)Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-static {p1, p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->access$setMNotified$p(Lcom/bestmafen/baseble/connector/AbsBleConnector;Z)V

    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBleGattCallback()Lcom/android/mltcode/paycertificationapi/XX0XO01i;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1, p2}, Lcom/android/mltcode/paycertificationapi/XX0XO01i;->onConnectionStateChange(Z)V

    :cond_2
    iget-object p1, p0, Lcom/bestmafen/baseble/connector/AbsBleConnector$mReceiver$2$1;->OXO1:Lcom/bestmafen/baseble/connector/AbsBleConnector;

    invoke-virtual {p1, p2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setConnecting(Z)V

    :cond_3
    :goto_0
    return-void
.end method
