.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;
.super Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "QueryResponse"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;
    }
.end annotation


# instance fields
.field private final files:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;",
            ">;"
        }
    .end annotation
.end field

.field private final version:B


# direct methods
.method public constructor <init>(B[B)V
    .locals 4

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;-><init>()V

    const/4 v0, 0x0

    aget-byte v0, p2, v0

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;->version:B

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;->files:Ljava/util/List;

    const/4 v0, 0x1

    :cond_0
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_1

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;->version:B

    if-nez v1, :cond_0

    aget-byte v1, p2, v0

    add-int/lit8 v2, v0, 0x1

    aget-byte v2, p2, v2

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v1

    add-int/lit8 v2, v0, 0x2

    aget-byte v2, p2, v2

    add-int/lit8 v3, v0, 0x3

    aget-byte v3, p2, v3

    invoke-static {v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v2

    new-instance v3, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;

    invoke-direct {v3, p1, v1, v2}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;-><init>(BSI)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;->files:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getFiles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;->files:Ljava/util/List;

    return-object v0
.end method
