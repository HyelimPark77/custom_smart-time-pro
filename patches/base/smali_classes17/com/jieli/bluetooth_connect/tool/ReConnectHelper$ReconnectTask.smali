.class public Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReconnectTask"
.end annotation


# static fields
.field public static final TASK_TYPE_DEVICE:I = 0x1

.field public static final TASK_TYPE_HISTORY:I = 0x2


# instance fields
.field private address:Ljava/lang/String;

.field private callback:Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;

.field private connectFailCount:I

.field private connectWay:I

.field private taskId:I

.field private taskTimeout:I

.field private taskType:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setAddress(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->address:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "o"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    iget v2, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskType:I

    iget v3, p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskType:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->address:Ljava/lang/String;

    iget-object p1, p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->address:Ljava/lang/String;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getCallback()Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->callback:Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;

    return-object v0
.end method

.method public getConnectFailCount()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->connectFailCount:I

    return v0
.end method

.method public getConnectWay()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->connectWay:I

    return v0
.end method

.method public getTaskId()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskId:I

    return v0
.end method

.method public getTaskTimeout()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskTimeout:I

    return v0
.end method

.method public getTaskType()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->address:Ljava/lang/String;

    iget v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->address:Ljava/lang/String;

    return-void
.end method

.method public setCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "callback"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->callback:Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;

    return-void
.end method

.method public setConnectFailCount(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "connectFailCount"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->connectFailCount:I

    return-void
.end method

.method public setConnectWay(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "connectWay"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->connectWay:I

    return-void
.end method

.method public setTaskId(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "taskId"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskId:I

    return-void
.end method

.method public setTaskTimeout(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "taskTimeout"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskTimeout:I

    return-void
.end method

.method public setTaskType(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "taskType"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReconnectTask{taskId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", address=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->address:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", connectWay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->connectWay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", taskType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", taskTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->taskTimeout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", connectFailCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->connectFailCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
