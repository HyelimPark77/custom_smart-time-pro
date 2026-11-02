.class Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyProgressListener"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final synthetic b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

.field public funcName:Ljava/lang/String;

.field public index:I

.field public taskPath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-class p1, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    return-void
.end method


# virtual methods
.method public onProgress(F)V
    .locals 4

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->funcName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "(%s) onProgress ---> %.1f."

    invoke-static {v3, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    iget v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->index:I

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->taskPath:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;ILjava/lang/String;F)V

    return-void
.end method

.method public onStart(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->funcName:Ljava/lang/String;

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "(%s) onStart ---> %s."

    invoke-static {v2, p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->index:I

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->taskPath:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;ILjava/lang/String;F)V

    return-void
.end method

.method public onStop(I)V
    .locals 4

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->funcName:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "(%s) onStop ---> %d."

    invoke-static {v3, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;I)I

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->index:I

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->taskPath:Ljava/lang/String;

    const/high16 v2, 0x42c80000    # 100.0f

    invoke-static {p1, v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;ILjava/lang/String;F)V

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    return-void
.end method
