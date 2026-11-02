.class Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

.field public final synthetic c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    iput p2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->a:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgress(F)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "replaceFatFile ---> onProgress : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "updateResource"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    iget v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->a:I

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    iget-object v2, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;F)V

    return-void
.end method

.method public onStart(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "replaceFatFile ---> onStart : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "updateResource"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->a:I

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;F)V

    return-void
.end method

.method public onStop(I)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "replaceFatFile ---> onStop : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "updateResource"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;I)I

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->b(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->a:I

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->b:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$UpdateTask;->filePath:Ljava/lang/String;

    const/high16 v2, 0x42c80000    # 100.0f

    invoke-static {p1, v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;ILjava/lang/String;F)V

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread$4;->c:Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;->a(Lcom/jieli/jl_rcsp/tool/UpdateResourceThread;)V

    return-void
.end method
