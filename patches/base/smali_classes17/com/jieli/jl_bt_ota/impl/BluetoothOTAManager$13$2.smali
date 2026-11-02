.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->onSuccess(Ljava/lang/Integer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 3

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/base/BaseError;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;->a:Ljava/lang/String;

    const/16 v2, 0x4ffe

    invoke-direct {v0, v2, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;-><init>(ILjava/lang/String;)V

    const-string v1, "upgradeStep05"

    const/4 v2, 0x1

    invoke-static {p1, v1, v0, v2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;Z)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
