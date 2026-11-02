.class public Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback;
.super Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback<",
        "Ljava/lang/Boolean;",
        "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
        "**>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback$1;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback$1;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    return-void
.end method
