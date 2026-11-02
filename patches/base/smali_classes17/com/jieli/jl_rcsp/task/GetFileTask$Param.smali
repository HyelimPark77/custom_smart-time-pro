.class Lcom/jieli/jl_rcsp/task/GetFileTask$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/GetFileTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public lastCrc:S

.field public lastOffset:I

.field public lastProgress:I

.field public totalSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastOffset:I

    .line 3
    iput-short v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastCrc:S

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastProgress:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/task/GetFileTask$1;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;-><init>()V

    return-void
.end method


# virtual methods
.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->totalSize:I

    iput v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastOffset:I

    iput-short v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastCrc:S

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/task/GetFileTask$Param;->lastProgress:I

    return-void
.end method
