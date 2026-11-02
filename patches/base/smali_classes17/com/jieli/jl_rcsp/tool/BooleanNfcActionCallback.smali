.class public Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback;
.super Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback<",
        "Ljava/lang/Boolean;",
        "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/tool/BooleanNfcActionCallback$1;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    return-void
.end method
