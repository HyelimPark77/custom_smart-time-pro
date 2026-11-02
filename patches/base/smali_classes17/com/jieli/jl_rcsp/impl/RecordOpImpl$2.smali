.class Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->stopRecord(Landroid/bluetooth/BluetoothDevice;IZZZLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

.field public final synthetic c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    iput p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->a:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->b:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;)V
    .locals 9

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;

    if-eqz v0, :cond_6

    .line 3
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v1

    if-nez v1, :cond_6

    .line 4
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isPlayTTS()Z

    move-result p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v8, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v8, v1

    .line 5
    :goto_1
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isSyncIatText()Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    move v6, v2

    goto :goto_3

    :cond_3
    :goto_2
    move v6, v1

    .line 6
    :goto_3
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/StopSpeechResponse;->isSyncNlpText()Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_4

    :cond_4
    move v7, v2

    goto :goto_5

    :cond_5
    :goto_4
    move v7, v1

    .line 7
    :goto_5
    iget-object v3, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    iget v5, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->a:I

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;IZZZ)V

    return-void

    :cond_6
    move-object v4, p1

    .line 8
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result p2

    const/16 v0, 0x3004

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, v4, p1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->b:Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p1, v1, p2}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    return-void
.end method
