.class Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/RecordOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 10

    if-nez p2, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq v0, v1, :cond_9

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    goto/16 :goto_6

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z

    move-result v0

    if-eqz v0, :cond_b

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    if-nez v0, :cond_2

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isPlayTTS()Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    move v9, v2

    goto :goto_1

    :cond_4
    :goto_0
    move v9, v3

    :goto_1
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncIatText()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    move v7, v2

    goto :goto_3

    :cond_6
    :goto_2
    move v7, v3

    :goto_3
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->isSyncNlpText()Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    move v8, v2

    goto :goto_5

    :cond_8
    :goto_4
    move v8, v3

    :goto_5
    iget-object v4, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->getReason()B

    move-result v6

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;IZZZ)V

    new-instance p1, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;

    invoke-direct {p1, v7, v8, v9}, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd$ReplyParam;-><init>(ZZZ)V

    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    invoke-virtual {p2, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->f(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->e(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    invoke-virtual {p1, v5, p2, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    :cond_9
    move-object v5, p1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z

    move-result p1

    if-nez p1, :cond_b

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/speech/StartSpeechCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;

    if-nez p1, :cond_a

    goto :goto_6

    :cond_a
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/RecordParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->getType()B

    move-result v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->getFreq()B

    move-result v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;->getWay()B

    move-result p1

    invoke-direct {v1, v3, v4, p1}, Lcom/jieli/jl_rcsp/model/RecordParam;-><init>(III)V

    invoke-static {v0, v5, v1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordParam;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    invoke-virtual {p2, v2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->f(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->e(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    invoke-virtual {p1, v5, p2, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    :cond_b
    :goto_6
    return-void
.end method

.method public onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 5

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getType()I

    move-result v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    if-eqz v1, :cond_2

    move-object v0, p2

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/data/DataHasResponseCmd;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    goto :goto_1

    :cond_2
    move-object v0, p2

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->getXmOpCode()I

    move-result v2

    const/4 v4, 0x4

    if-ne v2, v4, :cond_3

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;->getData()[B

    move-result-object v0

    invoke-static {v2, p1, v0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;[B)V

    if-eqz v1, :cond_3

    move-object v0, p2

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/data/DataHasResponseCmd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    invoke-virtual {p2, v3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->f(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;->a:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->e(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    :cond_3
    :goto_2
    return-void
.end method
