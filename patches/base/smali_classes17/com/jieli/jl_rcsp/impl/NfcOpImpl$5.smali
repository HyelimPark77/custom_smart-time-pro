.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->getDefaultNfc(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
        "Ljava/lang/Short;",
        "Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;)Ljava/lang/Short;

    move-result-object p1

    return-object p1
.end method

.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;)Ljava/lang/Short;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcResponse;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcResponse;->getId()S

    move-result p2

    invoke-static {v0, p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;S)S

    .line 3
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    move-result-object p2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)S

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;->onDefaultNfc(Landroid/bluetooth/BluetoothDevice;S)V

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;->a:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->b(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$5;->hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;)I

    move-result p1

    return p1
.end method

.method public hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;)I
    .locals 1

    const/4 p1, 0x1

    if-nez p2, :cond_0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eq v0, p1, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p1

    return p1

    .line 3
    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v0

    if-nez v0, :cond_2

    return p1

    .line 4
    :cond_2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;->getResult()I

    move-result p1

    return p1
.end method
