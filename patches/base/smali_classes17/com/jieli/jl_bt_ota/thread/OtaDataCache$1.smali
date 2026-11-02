.class Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

.field final synthetic b:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;->b:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;->b:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    const-string v2, "readFile"

    invoke-static {v0, v2, v1, p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->callbackError(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;->onSuccess([B)V

    return-void
.end method

.method public onSuccess([B)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;->b:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;[B)[B

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;->b:Lcom/jieli/jl_bt_ota/thread/OtaDataCache;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/thread/OtaDataCache;->a(Lcom/jieli/jl_bt_ota/thread/OtaDataCache;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSuccess, length = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    array-length p1, p1

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "readFile"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/thread/OtaDataCache$1;->a:Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;

    if-eqz p1, :cond_1

    .line 5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
