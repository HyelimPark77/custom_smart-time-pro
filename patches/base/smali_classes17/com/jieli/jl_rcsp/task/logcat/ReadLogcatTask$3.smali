.class Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:S

.field public final synthetic c:S

.field public final synthetic d:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;ISS)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->d:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    iput p2, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->a:I

    iput-short p3, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->b:S

    iput-short p4, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->c:S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;)V
    .locals 1

    .line 2
    iget p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->a:I

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->d:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->c(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;)V

    return-void

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->d:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Check data crc error. firmware crc = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->b:S

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", data crc = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v0, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->c:S

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x3100

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;ILjava/lang/String;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask$3;->d:Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;->a(Lcom/jieli/jl_rcsp/task/logcat/ReadLogcatTask;ILjava/lang/String;)V

    return-void
.end method
