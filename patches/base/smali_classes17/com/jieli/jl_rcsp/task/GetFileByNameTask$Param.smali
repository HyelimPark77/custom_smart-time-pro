.class public Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/task/GetFileByNameTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z

.field public c:I

.field public devHandler:I

.field public name:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->devHandler:I

    .line 4
    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->name:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->a:Ljava/lang/String;

    .line 6
    iput-boolean p4, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->b:Z

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)I
    .locals 0

    iget p0, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->c:I

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->b:Z

    return p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/task/GetFileByNameTask$Param;->a:Ljava/lang/String;

    return-object p0
.end method
