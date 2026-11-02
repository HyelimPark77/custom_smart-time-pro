.class public Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandBase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;,
        Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;,
        Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$NotifyParam;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandBase<",
        "Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Response;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;)V
    .locals 2

    const/16 v0, 0x31

    .line 2
    const-string v1, "QueryPhoneBtInfoCmd"

    invoke-direct {p0, v0, v1, p1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;-><init>(ILjava/lang/String;I)V

    .line 3
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd;-><init>(ILcom/jieli/jl_rcsp/model/command/double_connect/QueryPhoneBtInfoCmd$Param;)V

    return-void
.end method
