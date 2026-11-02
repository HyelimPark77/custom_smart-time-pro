.class Lcom/jieli/jl_filebrowse/FileBrowseManager$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/OperatCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_filebrowse/bean/FileStruct;

.field public final synthetic b:Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Z

.field public final synthetic g:Lcom/jieli/jl_filebrowse/FileBrowseManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;ZLcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->g:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    iput-object p2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->a:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    iput-object p3, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->b:Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;

    iput-boolean p4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->c:Z

    iput-object p5, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->d:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iput-object p6, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->e:Ljava/util/List;

    iput-boolean p7, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(I)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->g:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-static {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->b:Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->a:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-interface {v0, p1, v1}, Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;->onError(ILcom/jieli/jl_filebrowse/bean/FileStruct;)V

    :cond_0
    iget-boolean p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->g:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->d:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->e:Ljava/util/List;

    iget-boolean v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->f:Z

    iget-object v3, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->b:Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;

    invoke-static {p1, v0, v1, v2, v3}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    return-void

    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->b:Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;->onFinish()V

    :cond_2
    return-void
.end method

.method public onSuccess()V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->g:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->a:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-static {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->g:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    invoke-static {v0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->b(Lcom/jieli/jl_filebrowse/FileBrowseManager;)V

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->b:Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->a:Lcom/jieli/jl_filebrowse/bean/FileStruct;

    invoke-interface {v0, v1}, Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;->onSuccess(Lcom/jieli/jl_filebrowse/bean/FileStruct;)V

    :cond_0
    iget-boolean v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->g:Lcom/jieli/jl_filebrowse/FileBrowseManager;

    iget-object v1, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->d:Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    iget-object v2, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->e:Ljava/util/List;

    iget-boolean v3, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->f:Z

    iget-object v4, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->b:Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->a(Lcom/jieli/jl_filebrowse/FileBrowseManager;Lcom/jieli/jl_filebrowse/bean/SDCardBean;Ljava/util/List;ZLcom/jieli/jl_filebrowse/interfaces/DeleteCallback;)I

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_filebrowse/FileBrowseManager$3;->b:Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;->onFinish()V

    :cond_2
    return-void
.end method
