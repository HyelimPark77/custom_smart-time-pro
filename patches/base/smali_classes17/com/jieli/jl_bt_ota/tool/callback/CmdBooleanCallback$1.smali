.class Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult<",
        "Ljava/lang/Boolean;",
        "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
        "**>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "**>;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .line 2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic handleResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback$1;->handleResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public hasResult(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "**>;)I"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method
