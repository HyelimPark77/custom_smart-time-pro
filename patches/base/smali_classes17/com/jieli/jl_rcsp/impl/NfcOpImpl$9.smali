.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$9;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$9;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0xa4

    if-ne v0, v1, :cond_0

    instance-of v0, p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$Param;

    instance-of v0, p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$NotifyDefaultNfcParam;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$NotifyDefaultNfcParam;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$9;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationNoResponseCmd$NotifyDefaultNfcParam;->getId()S

    move-result p2

    invoke-static {v0, p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;S)S

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$9;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    move-result-object p2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$9;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)S

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;->onDefaultNfc(Landroid/bluetooth/BluetoothDevice;S)V

    :cond_0
    return-void
.end method
