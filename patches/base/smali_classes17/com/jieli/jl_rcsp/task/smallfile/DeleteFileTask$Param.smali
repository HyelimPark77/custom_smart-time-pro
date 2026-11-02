.class public Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public final a:B

.field public final b:S


# direct methods
.method public constructor <init>(BS)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-short p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;->b:S

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;->a:B

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;)B
    .locals 0

    iget-byte p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;->a:B

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;)S
    .locals 0

    iget-short p0, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;->b:S

    return p0
.end method


# virtual methods
.method public getId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;->b:S

    return v0
.end method

.method public getType()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;->a:B

    return v0
.end method
