.class public Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:[B

.field protected size:I

.field protected type:B


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->type:B

    array-length p1, p2

    iput p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->c:[B

    const/4 p1, 0x0

    iput p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->a:I

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->b:I

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->b:I

    return p1
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)I
    .locals 0

    iget p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->a:I

    return p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)[B
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->c:[B

    return-object p0
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->c:[B

    return-object v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->a:I

    return v0
.end method

.method public getPacketSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->b:I

    return v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    return v0
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->type:B

    return v0
.end method

.method public setData([B)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->c:[B

    return-void
.end method

.method public setOffset(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->a:I

    return-void
.end method

.method public setPacketSize(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->b:I

    return-void
.end method

.method public setSize(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    return-void
.end method

.method public setType(B)V
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->type:B

    return-void
.end method
