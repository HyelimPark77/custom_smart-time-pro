.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;
.super Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileResponse;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$DeleteFileParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$UpdateFileParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;,
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse<",
        "Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;",
        "Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;",
        ">;"
    }
.end annotation


# static fields
.field public static final FLAG_FIRST_PACKET:B = 0x1t

.field public static final OP_ADD_FILE:B = 0x2t

.field public static final OP_DELETE_FILE:B = 0x4t

.field public static final OP_QUERY_BY_TYPE:B = 0x0t

.field public static final OP_READ_FILE:B = 0x1t

.field public static final OP_UPDATE_FILE:B = 0x3t

.field public static final TYPE_BLOOD_OXYGEN:B = 0x4t

.field public static final TYPE_CALL_LOG:B = 0x8t

.field public static final TYPE_CONTACTS:B = 0x1t

.field public static final TYPE_HEART_RATE:B = 0x3t

.field public static final TYPE_MESSAGE_SYNC:B = 0x6t

.field public static final TYPE_SLEEP:B = 0x5t

.field public static final TYPE_SPORTS_RECORD:B = 0x2t

.field public static final TYPE_STEP:B = 0x9t

.field public static final TYPE_WEATHER:B = 0x7t


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;)V
    .locals 2

    const-class v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x28

    invoke-direct {p0, v1, v0, p1}, Lcom/jieli/jl_rcsp/model/base/CommandWithParamAndResponse;-><init>(ILjava/lang/String;Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    return-void
.end method
