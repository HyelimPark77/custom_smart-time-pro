.class Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a(Landroid/bluetooth/BluetoothDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
        "Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl$1;->a:Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl$1;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;)V

    return-void
.end method

.method public onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;)V
    .locals 3

    .line 2
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;

    if-eqz p2, :cond_1

    .line 4
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->getAttrs()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->getAttrs()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 6
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getType()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 7
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl$1;->a:Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getAttrData()[B

    move-result-object v0

    invoke-static {v1, v0, p1}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->a(Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;[BLandroid/bluetooth/BluetoothDevice;)Ljava/util/List;

    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl$1;->a:Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/impl/OnFileBrowseCallbackImpl;->onSdCardChange(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    return-void
.end method
