.class public Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferResponse;,
        Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;,
        Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$ReadFileParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DeleteFileParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$FileTransferParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;",
        ">;"
    }
.end annotation


# static fields
.field public static final OP_DELETE_FILE:B = 0x1t

.field public static final OP_FILE_TRANSFER:B = 0x0t

.field public static final OP_READ_FILE:B = 0x2t


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x27

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
