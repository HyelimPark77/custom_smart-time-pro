.class Lcom/jieli/jl_filebrowse/FileBrowseManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_filebrowse/FileBrowseManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_filebrowse/FileBrowseManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$1;->a:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    const/16 v2, 0x1010

    const/4 v3, 0x1

    if-ne v1, v2, :cond_2

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$1;->a:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-static {v4}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/FileBrowseManager;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "MSG_WAITING_FOR_DATA_TIMEOUT"

    invoke-static {v1, v4, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$1;->a:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-static {v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V

    if-ne p1, v3, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$1;->a:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-static {p1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->c(Lcom/jieli/jl_filebrowse/FileBrowseManager;)Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;->OnFlayCallback(Z)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$1;->a:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    const/16 v0, 0x1003

    invoke-virtual {p1, v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->onFileReadFailed(I)V

    :cond_2
    :goto_0
    return v3
.end method
