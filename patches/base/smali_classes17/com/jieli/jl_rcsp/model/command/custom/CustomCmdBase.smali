.class Lcom/jieli/jl_rcsp/model/command/custom/CustomCmdBase;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/jieli/jl_rcsp/model/parameter/CustomCommonParam;",
        ">",
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParam<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/model/parameter/CustomCommonParam;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    const/16 v0, 0xf0

    invoke-direct {p0, v0, p1, p2}, Lcom/jieli/jl_rcsp/model/base/CommandWithParam;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
