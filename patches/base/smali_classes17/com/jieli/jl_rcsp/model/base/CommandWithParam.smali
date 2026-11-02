.class public Lcom/jieli/jl_rcsp/model/base/CommandWithParam;
.super Lcom/jieli/jl_rcsp/model/base/CommandBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Lcom/jieli/jl_rcsp/model/base/BaseParameter;",
        ">",
        "Lcom/jieli/jl_rcsp/model/base/CommandBase<",
        "TP;",
        "Lcom/jieli/jl_rcsp/model/base/CommonResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "TP;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;-><init>(ILjava/lang/String;I)V

    invoke-virtual {p0, p3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
