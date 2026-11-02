.class public Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd$SetDevStorageParam;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd$SetDevStorageParam;",
        "Lcom/jieli/jl_rcsp/model/base/CommonResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd$SetDevStorageParam;

    invoke-direct {v1, p1}, Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd$SetDevStorageParam;-><init>(I)V

    const/16 p1, 0xd8

    invoke-direct {p0, p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
