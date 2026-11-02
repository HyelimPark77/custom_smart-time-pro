.class Lcom/jieli/jl_filebrowse/FileBrowseManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_filebrowse/bean/PathData;

.field public final synthetic b:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

.field public final synthetic c:Lcom/jieli/jl_filebrowse/FileBrowseManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/PathData;Lcom/jieli/jl_filebrowse/bean/SDCardBean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    iput-object p2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->a:Lcom/jieli/jl_filebrowse/bean/PathData;

    iput-object p3, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->b:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(I)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onError :: code = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", data = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->a:Lcom/jieli/jl_filebrowse/bean/PathData;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->b:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sendPathDataToDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->a:Lcom/jieli/jl_filebrowse/bean/PathData;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/PathData;->getType()B

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onFileReadFailed(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->OnFlayCallback(Z)V

    return-void
.end method

.method public onSuccess()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->a:Lcom/jieli/jl_filebrowse/bean/PathData;

    invoke-virtual {v1}, Lcom/jieli/jl_filebrowse/bean/PathData;->getType()B

    move-result v1

    invoke-static {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/FileBrowseManager;I)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->a:Lcom/jieli/jl_filebrowse/bean/PathData;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/bean/PathData;->getType()B

    move-result v0

    const-string v1, "sendPathDataToDevice"

    if-nez v0, :cond_0

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Ready to receive file data."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$4;->c:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-virtual {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onFileReadStart()V

    return-void

    :cond_0
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Ready to play music."

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
