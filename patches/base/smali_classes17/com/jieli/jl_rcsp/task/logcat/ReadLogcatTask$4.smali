.class Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$4;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$4;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0x29

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$4;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_1

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;->getOp()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$4;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$4;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_1

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->getXmOpCode()I

    move-result p2

    const/16 v0, 0x29

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$4;->a:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;->getData()[B

    move-result-object p1

    invoke-static {p2, p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;[B)V

    :cond_1
    :goto_0
    return-void
.end method
