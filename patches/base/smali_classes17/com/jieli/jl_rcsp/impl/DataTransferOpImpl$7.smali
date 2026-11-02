.class Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    new-instance p2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x2000

    const-string v1, "Device is not connected."

    invoke-direct {p2, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0, p2}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 3

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0x30

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onRcspCommand"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    instance-of v0, v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;

    invoke-static {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;)V

    return-void

    :cond_1
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    instance-of v0, v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;

    invoke-static {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;)V

    return-void

    :cond_2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    instance-of v0, v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;

    invoke-static {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;)V

    :cond_3
    :goto_0
    return-void
.end method
