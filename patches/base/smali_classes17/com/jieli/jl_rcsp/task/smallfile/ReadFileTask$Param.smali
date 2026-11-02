.class public Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public final a:B

.field public final b:S

.field public final c:I

.field public final d:I

.field public e:I


# direct methods
.method public constructor <init>(BSII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a:B

    iput-short p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->b:S

    iput p3, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->c:I

    iput p4, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->d:I

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->c:I

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->e:I

    return p1
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I
    .locals 0

    iget p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->e:I

    return p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)I
    .locals 0

    iget p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->d:I

    return p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)B
    .locals 0

    iget-byte p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a:B

    return p0
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)S
    .locals 0

    iget-short p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->b:S

    return p0
.end method


# virtual methods
.method public getId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->b:S

    return v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->d:I

    return v0
.end method

.method public getPacketSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->e:I

    return v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->c:I

    return v0
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->a:B

    return v0
.end method

.method public setPacketSize(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;->e:I

    return-void
.end method
