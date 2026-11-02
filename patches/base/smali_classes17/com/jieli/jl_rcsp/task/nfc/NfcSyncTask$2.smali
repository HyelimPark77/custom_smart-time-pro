.class Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$2;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$2;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$2;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p1

    const/16 v0, 0xa4

    if-ne p1, v0, :cond_1

    instance-of p1, p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;

    if-eqz p1, :cond_1

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$Param;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$Param;->getOp()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$2;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->b(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$2;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->getXmOpCode()I

    move-result p1

    const/16 v0, 0xa4

    if-eq p1, v0, :cond_2

    :goto_0
    return-void

    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$2;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;->getData()[B

    move-result-object p2

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->a(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;[B)V

    return-void
.end method
