.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->queryMandatoryUpdate(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

.field final synthetic b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    const-string v2, "queryMandatoryUpdate"

    invoke-static {v0, v2, v1, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->queryMandatoryUpdate(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$3;->onSuccess(Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V

    return-void
.end method
