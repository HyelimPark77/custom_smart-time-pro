.class Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/IHandleResult<",
        "Ljava/lang/Boolean;",
        "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Boolean;
    .locals 0

    .line 2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback$1;->handleResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public hasResult(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)I
    .locals 0

    instance-of p1, p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    if-eqz p1, :cond_0

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Response;->getResult()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
