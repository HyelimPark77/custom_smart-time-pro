.class public Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$NotifyPrepareTransferLargeFileParam;,
        Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/base/CommonResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final ENV_DELETE_FILE:B = 0x1t

.field public static final ENV_FORMAT_DEVICE:B = 0x2t

.field public static final ENV_TRANSFER_LARGE_FILE:B


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x21

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
