.class Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$1;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$1;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->a(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$1;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->a(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x1122

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$1;->a:Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->a(Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;)Landroid/os/Handler;

    move-result-object p1

    invoke-static {}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask;->a()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/nfc/NfcSyncTask$1;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
