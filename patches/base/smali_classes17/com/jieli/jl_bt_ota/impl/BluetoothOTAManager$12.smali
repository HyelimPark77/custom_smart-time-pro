.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;

.field final synthetic c:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;ILcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->c:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iput p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->a:I

    iput-object p3, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->b:Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->b:Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->b:Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getOpCodeSn()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->c:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const-string v1, "upgradeStep04"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->onSuccess([B)V

    return-void
.end method

.method public onSuccess([B)V
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    array-length v1, p1

    goto :goto_0

    :cond_0
    move v1, v0

    .line 3
    :goto_0
    iget v2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->a:I

    .line 4
    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    .line 5
    const-string v3, "read data, offset : %s, data len : %s."

    invoke-static {v3, v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 6
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->c:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v3, v3, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v4, "upgradeStep04"

    invoke-static {v3, v4, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-lez v1, :cond_1

    .line 7
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->b:Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;

    new-instance v2, Lcom/jieli/jl_bt_ota/model/parameter/FirmwareUpdateBlockResponseParam;

    invoke-direct {v2, p1}, Lcom/jieli/jl_bt_ota/model/parameter/FirmwareUpdateBlockResponseParam;-><init>([B)V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setParam(Lcom/jieli/jl_bt_ota/model/base/BaseParameter;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 8
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->b:Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->c:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->b:Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateBlockCmd;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    .line 10
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->c:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    return-void

    :cond_1
    const/16 p1, 0x4004

    .line 11
    invoke-static {p1, v2}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$12;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method
