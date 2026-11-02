.class public Lcom/jieli/jl_rcsp/model/command/data/DataCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParam<",
        "Lcom/jieli/jl_rcsp/model/parameter/DataParam;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/parameter/DataParam;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParam;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
