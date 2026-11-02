.class Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->syncNfcMsg(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

.field public final synthetic b:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic c:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->c:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onFinish(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->c:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;Ljava/util/List;)Ljava/util/List;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;->onFinish(Ljava/util/List;)V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->c:Lcom/jieli/jl_rcsp/impl/NfcOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a(Lcom/jieli/jl_rcsp/impl/NfcOpImpl;)Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;->onNfcMsgChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFinish =  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "syncNfcMsg"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onStart()V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/NfcOpImpl;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "syncNfcMsg"

    const-string v2, "onStart >>>>>>"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/NfcOpImpl$1;->a:Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;->onStart()V

    :cond_0
    return-void
.end method
